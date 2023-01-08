package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class codingTest4 {
//문제
//안전지역
//	입력
//	첫째 줄에는 어떤 지역을 나타내는 2차원 배열의 행과 열의 개수를 나타내는 수 N이 입력된다. N은 2 이상 100 이하의 정수이다. 둘째 줄부터 N개의 각 줄에는 2차원 배열의 첫 번째 행부터 N번째 행까지 순서대로 한 행씩 높이 정보가 입력된다. 각 줄에는 각 행의 첫 번째 열부터 N번째 열까지 N개의 높이 정보를 나타내는 자연수가 빈 칸을 사이에 두고 입력된다. 높이는 1이상 100 이하의 정수이다.
//
//	출력
//	첫째 줄에 장마철에 물에 잠기지 않는 안전한 영역의 최대 개수를 출력한다.
//
//	예제 입력 1 
//	5
//	6 8 2 6 2
//	3 2 3 4 6
//	6 7 3 3 2
//	7 2 5 3 6
//	8 9 5 2 7
//	예제 출력 1 
//	5
	
	static int[][] map;
	static int n,m;
	static boolean[][] visited;
	static int[] dx = {0,0,-1,1};
	static int[] dy = {-1,1,0,0};
	
	private static void bfs(int i, int j, int k) {
		visited[i][j] = true;//초기값 방문처리
		Queue<int[]> q = new LinkedList<int[]>();
		q.add(new int[] {i,j});
		
		while (!q.isEmpty()) {
			int y = q.peek()[0];
			int x = q.peek()[1];
			q.poll();
			for(int i1 = 0; i1<4; i1++) {
				int ny = y + dy[i1];
				int nx = x + dx[i1];
				if(ny<0 || ny>=n || nx<0 || nx>=n) continue;//범위 벗어나면 패스
				if(visited[ny][nx] || map[ny][nx] <= k) continue;//이미 방문했거나 k보다 작으면 패스
				q.add(new int[] {ny,nx});
				visited[ny][nx] = true;
//				System.out.println("qadd>>> "+ny+" "+nx);
			}//for
		}//while
	}
	
	private static int bfs_answer(int k) {
		//한줄씩 탐색하면서 물에 잠기지 않은 지역의 개수 세기
		int count = 0;
		visited = new boolean[n][n];//k가 바뀔때마다 초기화
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				//물에 잠기는 지역이거나 이미 방문했으면 패스
				if(k >= map[i][j] || visited[i][j]) continue;
				bfs(i, j, k);
				count++;
			}//for
		}//for
		return count;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		map = new int[n][n];
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken()); 
			}
		}//for
		int max_answer = 1;//안전지대의 최대값
		for(int k = 1; k<100; k++) {//k이하의 숫자는 물에 잠긴다.
			int answer = bfs_answer(k);
//			if(answer == 0) {//안잠긴 마을이 하나도 없으면 for문을 멈춘다.
//				break;
//			}
			max_answer = Math.max(max_answer, answer);
			
		}//for
		System.out.println(max_answer);
	}
}