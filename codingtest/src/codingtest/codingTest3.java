package codingtest;

import java.util.*;
//인구이동
//입력
//첫째 줄에 N, L, R이 주어진다. (1 ≤ N ≤ 50, 1 ≤ L ≤ R ≤ 100)
//
//둘째 줄부터 N개의 줄에 각 나라의 인구수가 주어진다. r행 c열에 주어지는 정수는 A[r][c]의 값이다. (0 ≤ A[r][c] ≤ 100)
//
//인구 이동이 발생하는 일수가 2,000번 보다 작거나 같은 입력만 주어진다.
//
//출력
//인구 이동이 며칠 동안 발생하는지 첫째 줄에 출력한다.

//예제 입력 1 
//2 20 50
//50 30
//20 40
//예제 출력 1 
//1
public class codingTest3 {
	
	static int n,l,r;
	static int[][] map;
	static boolean[][] visited;
	static int[] dy = {0,0,-1,1};
	static int[] dx = {-1,1,0,0};
	static ArrayList<Node> list;//인구이동하는 위치값(x,y)를 넣을 리스트
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		l = sc.nextInt();
		r = sc.nextInt();
		
		map = new int[n][n];
		//map입력
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				 map[i][j] = sc.nextInt();
			}//for
		}//for
		System.out.println(move());
	
	}//public
	public static int move() {
		//인구이동이 없을때까지 반복. 인구이동이 있으면 m변수를 true로 바꿔주어서 while문이 실행되도록 한다.
		int answer = 0;//인구이동한 날 수
		while (true) {
			boolean m = false;
			visited = new boolean[n][n];//while문 돌 때마다 초기화
			
			for(int i = 0; i<n; i++) {
				for(int j = 0; j<n; j++) {
					if(!visited[i][j]) {//이미 탐색한 나라면  패스
						//인구이동하는 총인구수 반환(해당 위치 값을 list에 넣기)
						int sum = bfs(i, j);
						if(list.size()>1) {//국경이동하는 나라가 있으면 그 평균 구하고 인구수 갱신
							c_bfs(sum);
							m = true;
						}
					}//for
				}//for
			}
			if(!m) return answer;
			answer++;//이동했으므로 날짜 수 증가
		}
	}
	//인구이동하는 총인구수 반환
	public static int bfs(int i, int j) {
		visited[i][j] = true;
		//이동할 국가 위치 넣을 큐
		Queue<Node> q = new LinkedList<>();
		//이동한 국가 위치 넣어서 반환할 리스트(리스트 길이가 1이상이면 국가이동이 일어난 것이므로 main class에서 while문이 계속 돌게된다.)
		list = new ArrayList<>();//초기화(국가 이동할 때마다 list초기화 해주어야 함)
		
		q.offer(new Node(i, j));
		list.add(new Node(i, j));
		
		int sum = map[i][j];//초기값
		while (!q.isEmpty()) {
			Node c = q.poll();//q에 있는 (i,j)값 c에 넣기
			
			for(int i1 = 0; i1<4; i1++) {
				int nx = c.x + dx[i1]; 
				int ny = c.y + dy[i1];
				if(ny >=0 && ny <n && nx>=0 && nx<n && !visited[ny][nx]) {
					int diff = Math.abs(map[c.x][c.y] - map[ny][nx]);
					if(l <= diff && r >= diff) {
						q.offer(new Node(nx, ny));//q에 값 넣기
						list.add(new Node(nx, ny));
						sum += map[nx][ny];// 이동 가능 국가의 인구수 sum에 누적
						visited[nx][ny] = true; 
					}
				}
			}
			
		}//while
		return sum;
	}
	
	//국경이동하는 나라가 있으면 그 평균 구하고 인구수 갱신
	public static void c_bfs(int sum) {
		int avg = sum / list.size();
		for(Node n: list) {
			map[n.x][n.y] = avg;// 인구 이동 갱신
		}
	}
	
	public static class Node{
		int x; 
		int y;
		public Node(int x , int y) {
			this.x = x;
			this.y = y;
		}
	}
}

