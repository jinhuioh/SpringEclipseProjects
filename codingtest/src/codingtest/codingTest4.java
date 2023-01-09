package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class codingTest4 {
//음식물 피하기
//	문제
//	코레스코 콘도미니엄 8층은 학생들이 3끼의 식사를 해결하는 공간이다. 그러나 몇몇 비양심적인 학생들의 만행으로 음식물이 통로 중간 중간에 떨어져 있다. 이러한 음식물들은 근처에 있는 것끼리 뭉치게 돼서 큰 음식물 쓰레기가 된다. 
//
//	이 문제를 출제한 선생님은 개인적으로 이러한 음식물을 실내화에 묻히는 것을 정말 진정으로 싫어한다. 참고로 우리가 구해야 할 답은 이 문제를 낸 조교를 맞추는 것이 아니다. 
//
//	통로에 떨어진 음식물을 피해가기란 쉬운 일이 아니다. 따라서 선생님은 떨어진 음식물 중에 제일 큰 음식물만은 피해 가려고 한다. 
//
//	선생님을 도와 제일 큰 음식물의 크기를 구해서 “10ra"를 외치지 않게 도와주자.
//
//	입력
//	첫째 줄에 통로의 세로 길이 N(1 ≤ N ≤ 100)과 가로 길이 M(1 ≤ M ≤ 100) 그리고 음식물 쓰레기의 개수 K(1 ≤ K ≤ N×M)이 주어진다.  그리고 다음 K개의 줄에 음식물이 떨어진 좌표 (r, c)가 주어진다.
//
//	좌표 (r, c)의 r은 위에서부터, c는 왼쪽에서부터가 기준이다. 입력으로 주어지는 좌표는 중복되지 않는다.
//
//	출력
//	첫째 줄에 음식물 중 가장 큰 음식물의 크기를 출력하라.
//
//	예제 입력 1 
//	3 4 5
//	3 2
//	2 2
//	3 1
//	2 3
//	1 1
//	예제 출력 1 
//	4
	static int[][] map;
	static boolean[][] visited;
	static int answer;//가장 큰 음쓰 크기가 들어갈 변수
	static int n,m,k;
	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	
	private static int bfs(int i, int j) {
		Queue<int[]> q = new LinkedList<int[]>();
		q.add(new int[] {i,j});
		visited[i][j] = true;
		int count = 1;//음식물 쓰레기 셀 변수
		while (!q.isEmpty()) {
			int y = q.peek()[0];
			int x = q.peek()[1];
			q.poll();
			
			for(int p=0; p<4; p++) {
				int ny = y + dy[p];
				int nx = x + dx[p];
				if(ny<1 || ny>n || nx<1 || nx>m) continue;
				if(map[ny][nx] !=1 || visited[ny][nx]) continue;
				
				q.add(new int[] {ny, nx});
				visited[ny][nx] = true;
				count++;
			}
		}//while
		return count;
	}//private
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		map = new int[n+1][m+1];
		visited = new boolean[n+1][m+1];
		//음쓰 자리 표시
		for(int i = 0; i<k; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			int p1 = Integer.parseInt(st1.nextToken());
			int p2 = Integer.parseInt(st1.nextToken());
			map[p1][p2] = 1;//음쓰 있는 자리 표시 
		}//for
		
		answer = 1;
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=m; j++) {
				if(visited[i][j] || map[i][j] != 1) continue;//이미 방문했거나 음식물이 있는 자리가 아니면 패스
				int answer_bfs = bfs(i,j);
				answer = Math.max(answer_bfs, answer);
			}//for
		}//for
		System.out.println(answer);
	}
}