package codingtest;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import javax.swing.plaf.SliderUI;
//	문제
//	N×M 크기의 공간에 아기 상어 여러 마리가 있다. 공간은 1×1 크기의 정사각형 칸으로 나누어져 있다. 한 칸에는 아기 상어가 최대 1마리 존재한다.
//
//	어떤 칸의 안전 거리는 그 칸과 가장 거리가 가까운 아기 상어와의 거리이다. 두 칸의 거리는 하나의 칸에서 다른 칸으로 가기 위해서 지나야 하는 칸의 수이고, 이동은 인접한 8방향(대각선 포함)이 가능하다.
//
//	안전 거리가 가장 큰 칸을 구해보자. 
//
//	입력
//	첫째 줄에 공간의 크기 N과 M(2 ≤ N, M ≤ 50)이 주어진다. 둘째 줄부터 N개의 줄에 공간의 상태가 주어지며, 0은 빈 칸, 1은 아기 상어가 있는 칸이다. 빈 칸과 상어의 수가 각각 한 개 이상인 입력만 주어진다.
//
//	출력
//	첫째 줄에 안전 거리의 최댓값을 출력한다.
//
//	예제 입력 1 
//	5 4
//	0 0 1 0
//	0 0 0 0
//	1 0 0 0
//	0 0 0 0
//	0 0 0 1
//	예제 출력 1 
//	2	
class node{
	int y;
	int x;
	node(int y, int x){
		this.y = y;
		this.x = x;
	}
}

public class codingTest3 {
	static int[] dy = {0,0,-1,-1,1,1,1,-1};
	static int[] dx = {1,-1,1,-1,1,-1,0,0};
	static int[][] map;
	static int[][] arr;
	static boolean[][] visited;
	static int n,m;
	
	private static int bfs(int i, int j) {
		visited = new boolean[n][m];
		arr = new int[n][m];
		Queue<node> q = new LinkedList<node>();
		int count = Integer.MAX_VALUE;//안전거리 계산 변수
		
		q.add(new node(i, j));
		visited[i][j] = true;
		
		while (!q.isEmpty()) {
			node qp = q.poll();
			for(int k = 0; k<8; k++) {
				int ny = qp.y + dy[k];
				int nx = qp.x + dx[k];
				if(ny<0 || nx<0 || ny>=n || nx>=m || visited[ny][nx]) continue;
				
				if(map[ny][nx] == 1) {
					count = Math.min(count, arr[qp.y][qp.x] + 1);
//					System.out.println(qp.y+" "+qp.x+"count!!>>"+ count);
					break;
				}
				arr[ny][nx] = arr[qp.y][qp.x] + 1;
//				System.out.println("qp.y>>"+qp.y + " qp.x>> "+qp.x +" nynx>>"+ ny+" "+nx+" "+" arrnynx>>" + arr[ny][nx]);
				visited[ny][nx] = true;
				q.add(new node(ny, nx));
			}
		}
		return count;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException, InterruptedException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		map = new int[n][m];

		//map입력받기
		for(int i = 0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j<m; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}//for
		}//for
		
		//첫번째 위치부터 가장 가까운 아기상어와의 거리 구하기
		int answer = 1;//초기값
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<m; j++) {
				if( map[i][j] != 1) {
					int answer_bfs = bfs(i,j); //해당 위치의 안전거리 값
					answer = Math.max(answer, answer_bfs);
				}//if
			}//for
		}//for
		System.out.println(answer);
	}

}