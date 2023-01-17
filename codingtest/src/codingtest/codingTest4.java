package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;



class bfsq {
	int y;
	int x;
	bfsq(int y, int x){
		this.y = y;
		this.x = x;
	}
}

public class codingTest4 {
//회장 뽑기
//	입력
//	입력의 첫째 줄에는 회원의 수가 있다. 단, 회원의 수는 50명을 넘지 않는다. 둘째 줄 이후로는 한 줄에 두 개의 회원번호가 있는데, 이것은 두 회원이 서로 친구임을 나타낸다. 회원번호는 1부터 회원의 수만큼 붙어 있다. 마지막 줄에는 -1이 두 개 들어있다.
//
//	출력
//	첫째 줄에는 회장 후보의 점수와 후보의 수를 출력하고, 두 번째 줄에는 회장 후보를 오름차순으로 모두 출력한다.
//	예제 입력 1 
//	5
//	1 2
//	2 3
//	3 4
//	4 5
//	2 4
//	5 3
//	-1 -1
//	예제 출력 1 
//	2 3
//	2 3 4
	
	static int[][] map,arr;
	static boolean[][] visited;
	static int n;
	static Queue<bfsq> q;
	static List<Integer> answer_list;
	//i번째 사람의 후보 점수 구하기
	private static int bfs(int i) {
		//후보점수 초기값
		int result = 1;
		//q에 친구 위치 넣어서 탐색 시작
		q = new LinkedList<bfsq>();
		
		for(int j = 1; j<=n; j++) {//i번째 행 1부터 n까지 탐색
			if(map[i][j] == 1) {//친구면
				arr[i][j] = 1; 
				visited[i][j] = true;//방문표시
				q.add(new bfsq(i, j));
			}//if
		}//for
		
		while (!q.isEmpty()) {
			bfsq qp = q.poll();
			int y = qp.y;
			int x = qp.x;
//			System.out.println("y>  "+y);
			//for문 돌리면서 친구고 방문한 적 없으면 (1이면) 큐에 넣기
			for(int k = 1; k<=n; k++) {
				if(map[x][k] == 1 && !visited[x][k]) {
					arr[x][k] = arr[y][x] + 1;//값 증가
					visited[x][k] = true;//방문표시 
					q.add(new bfsq(x, k));
					result = Math.max(result, arr[x][k]);
				}//if
			}//for
		}//while
		return result;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		map = new int[n+1][n+1];
		//map 입력받기//친구면 1로 표기
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());
			if(n1 == -1 && n2 == -1) break;
			map[n1][n2] = 1; 
			map[n2][n1] = 1; 
		}
		answer_list = new ArrayList<Integer>();
		answer_list.add(Integer.MAX_VALUE);//1부터 시작하므로 0번째 인덱스에 필요없는 값을 넣어준다.
		for(int i = 1; i<=n; i++) {
			arr = new int[n+1][n+1];
			visited = new boolean[n+1][n+1];
			//1부터 n까지 회장 후보의 점수 구하기
//			System.out.println(i+" 함수실행!!");
			int result = bfs(i);
			answer_list.add(result);
		}//for
		int count = 0;
		int list_min = Collections.min(answer_list);
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<answer_list.size(); i++) {
			if(list_min == answer_list.get(i)) {
				sb.append(i).append(" ");
				count++;
			}
		}
		sb.setLength(sb.length()-1);
		System.out.println((list_min-1)+" "+count);
		System.out.println(sb);
	}
}