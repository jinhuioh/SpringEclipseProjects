package codingtest;

import java.awt.Window.Type;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class codingTest3 {
//	문제
//	<그림 1>과 같이 정사각형 모양의 지도가 있다. 1은 집이 있는 곳을, 0은 집이 없는 곳을 나타낸다. 철수는 이 지도를 가지고 연결된 집의 모임인 단지를 정의하고, 
//	단지에 번호를 붙이려 한다. 여기서 연결되었다는 것은 어떤 집이 좌우, 혹은 아래위로 다른 집이 있는 경우를 말한다. 대각선상에 집이 있는 경우는 연결된 것이 아니다.
//	<그림 2>는 <그림 1>을 단지별로 번호를 붙인 것이다. 지도를 입력하여 단지수를 출력하고, 각 단지에 속하는 집의 수를 오름차순으로 정렬하여 출력하는 프로그램을 작성하시오.
//	입력
//	첫 번째 줄에는 지도의 크기 N(정사각형이므로 가로와 세로의 크기는 같으며 5≤N≤25)이 입력되고, 그 다음 N줄에는 각각 N개의 자료(0혹은 1)가 입력된다.
//
//	출력
//	첫 번째 줄에는 총 단지수를 출력하시오. 그리고 각 단지내 집의 수를 오름차순으로 정렬하여 한 줄에 하나씩 출력하시오.
//
//	예제 입력 1 
//	7
//	0110100
//	0110101
//	1110101
//	0000111
//	0100000
//	0111110
//	0111000
//	예제 출력 1 
//	3
//	7
//	8
//	9
	static LinkedList<Integer> answer_list = new LinkedList<Integer>();//정답을 넣을 리스트
	static int[][] map;
	static boolean[][] visited;//방문했는지 탐색할 배열
	static int n;//단지수
	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	
	private static int bfs(int i, int j) {
		
		Queue<int[]> q = new LinkedList<int[]>();
		
		int answer = 0;
		visited[i][j] = true;
		q.add(new int[] {i,j});
		
		while (!q.isEmpty()) {
			answer++;//개수 세기
			visited[i][j] = true;
			int y = q.peek()[0];
			int x = q.peek()[1];
//					System.out.println("y x>> "+y+" "+x);
			q.poll();
			for(int k = 0; k<4; k++) {
				int ny = y + dy[k];
				int nx = x + dx[k];
				
				//범위를 벗어나면 continue
				if(ny<0 || ny>=n || nx<0 || nx>=n) continue;
				if(map[ny][nx]==0 || visited[ny][nx]) continue;//집이 없는 곳이면continue
				
				visited[ny][nx] = true;
//						System.out.println("nynx>>> "+ny+" "+ny);
				q.add(new int[] {ny, nx});
//						System.out.println("answer>> "+answer);
			}//for
		}//while
		return answer;
	}//private
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		map = new int[n][n];
		visited = new boolean[n][n];
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			for(int j = 0; j < n; j++) {
				map[i][j] =  s.charAt(j)-'0';
//				System.out.println("map[i][j]>> "+map[i][j]);
				
			}//for
		}//for
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(map[i][j]==0 || visited[i][j])continue;
				
					int answerbfs = bfs(i,j);
					answer_list.add(answerbfs);
//					System.out.println(answer_list);
			}//for
		}//for
		
		Collections.sort(answer_list);
		System.out.println(answer_list.size());
		for(int one: answer_list) {
			System.out.println(one);
		}//for
		
	}

}

