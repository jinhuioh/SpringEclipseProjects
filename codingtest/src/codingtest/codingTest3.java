package codingtest;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import javax.swing.plaf.SliderUI;
public class codingTest3 {
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
	static int[][] map;
	static boolean visited[][];
	static int[] dx = {-1, -1, -1, 0, 1, 1, 1, 0};
	static int[] dy = {-1, 0, 1, 1, 1, 0, -1, -1};
	public static void main(String[] args) throws NumberFormatException, IOException, InterruptedException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];

		Queue<int[]> q = new LinkedList<>();
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
                // 상어가 있는 위치 큐에 add
				if (map[i][j] == 1) {
					q.add(new int[] {i, j});
				}
			}
		}
		// 입력 종료
		
        // 거리 시작이 2부터 시작이여서 1을 빼주고 출력
		System.out.println(BFS(N, M, q) - 1);
		
//			// 출력
//			System.out.println("*******");
//			StringBuilder sb = new StringBuilder();
//			for (int i = 0; i < N; i++) {
//				for (int j = 0; j < M; j++) {
//					sb.append(map[i][j] + " ");
//				}
//				sb.append("\n");
//			}
//			
//			System.out.println(sb);
		
	}

	public static int BFS(int N, int M, Queue<int[]> q) {
		
		visited = new boolean[N][M];
		int check = 2;
		
		while (!q.isEmpty()) {
			
			int[] now = q.poll();
			
            // 좌상, 상, 우상, 우, 우하, 하, 좌하, 좌 순으로 8방향 탐색
			for (int i = 0; i < 8; i++) {
				
				int nextX = now[0] + dx[i];
				int nextY = now[1] + dy[i];
				
				if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) {
					continue;
				}
				
                // 1보다 크다는 것은 이미 값이 들어간 경우이면서 현재 값보다 큰 경우임
				if (map[nextX][nextY] >= 1) {
					continue;
				}
				
				visited[nextX][nextY] = true;
				map[nextX][nextY] = map[now[0]][now[1]] + 1;
				q.add(new int[] {nextX, nextY});
                // 최대거리
				check = map[nextX][nextY] > check ? map[nextX][nextY] : check;
			}
		
		}
		
		return check;
	}

}