package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class codingTest5 {
	
//	문제
//	어떤 큰 도화지에 그림이 그려져 있을 때, 그 그림의 개수와, 그 그림 중 넓이가 가장 넓은 것의 넓이를 출력하여라. 단, 그림이라는 것은 1로 연결된 것을 한 그림이라고 정의하자. 가로나 세로로 연결된 것은 연결이 된 것이고 대각선으로 연결이 된 것은 떨어진 그림이다. 그림의 넓이란 그림에 포함된 1의 개수이다.
//
//	입력
//	첫째 줄에 도화지의 세로 크기 n(1 ≤ n ≤ 500)과 가로 크기 m(1 ≤ m ≤ 500)이 차례로 주어진다. 두 번째 줄부터 n+1 줄 까지 그림의 정보가 주어진다. (단 그림의 정보는 0과 1이 공백을 두고 주어지며, 0은 색칠이 안된 부분, 1은 색칠이 된 부분을 의미한다)
//
//	출력
//	첫째 줄에는 그림의 개수, 둘째 줄에는 그 중 가장 넓은 그림의 넓이를 출력하여라. 단, 그림이 하나도 없는 경우에는 가장 넓은 그림의 넓이는 0이다.
//
//	예제 입력 1 
//	6 5
//	1 1 0 1 1
//	0 1 1 0 0
//	0 0 0 0 0
//	1 0 1 1 1
//	0 0 1 1 1
//	0 0 1 1 1
//	예제 출력 1 
//	4
//	9
	static int[][] map;
	static boolean[][] visited;
	static int n,m;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	//탐색한 그림의 크기 리턴
	private static int bfs(int i, int j) {
		Queue<int[]> q = new LinkedList<int[]>();
		q.add(new int[] {i,j});
		visited[i][j] = true;
		int artMax = 1;
		while (!q.isEmpty()) {
			int y = q.peek()[0];
			int x = q.peek()[1];
			q.poll();
			for(int k = 0; k<4; k++) {
				int ny = y + dy[k];
				int nx = x + dx[k];
				if(ny<0 || ny>=n || nx<0 || nx>=m) continue;
				if(visited[ny][nx] || map[ny][nx]==0) continue;
				visited[ny][nx] = true;
				q.add(new int[] {ny, nx});
				artMax++;
			}
		}
		
		return artMax;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		map = new int[n][m];
		visited = new boolean[n][m];
		for(int i = 0; i<n; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			for(int j = 0; j<m; j++) {
				map[i][j] = Integer.parseInt(st1.nextToken());
			}//for
		}//for
		
		//탐색시작
		int count = 0;
		int artMax = 0;
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<m; j++) {
				if(visited[i][j] || map[i][j]==0) continue;
				int artSize = bfs(i, j);
				artMax = Math.max(artMax, artSize);//가장 큰 그림의 개수
				count++;
			}//for
		}//for
		System.out.println(count);
		System.out.println(artMax);
	}

}
