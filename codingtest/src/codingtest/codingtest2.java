package codingtest;

import java.util.List;
import java.util.Queue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

import javax.management.Query;
import javax.swing.JPopupMenu.Separator;
public class codingtest2 {
//	문제
//	체스판 위에 한 나이트가 놓여져 있다. 나이트가 한 번에 이동할 수 있는 칸은 아래 그림에 나와있다. 나이트가 이동하려고 하는 칸이 주어진다. 나이트는 몇 번 움직이면 이 칸으로 이동할 수 있을까?
//	입력
//	입력의 첫째 줄에는 테스트 케이스의 개수가 주어진다.
//
//	각 테스트 케이스는 세 줄로 이루어져 있다. 첫째 줄에는 체스판의 한 변의 길이 l(4 ≤ l ≤ 300)이 주어진다. 체스판의 크기는 l × l이다. 체스판의 각 칸은 두 수의 쌍 {0, ..., l-1} × {0, ..., l-1}로 나타낼 수 있다. 둘째 줄과 셋째 줄에는 나이트가 현재 있는 칸, 나이트가 이동하려고 하는 칸이 주어진다.
//
//	출력
//	각 테스트 케이스마다 나이트가 최소 몇 번만에 이동할 수 있는지 출력한다.
//
//	예제 입력 1 
//	3
//	8
//	0 0
//	7 0
//	100
//	0 0
//	30 50
//	10
//	1 1
//	1 1
//	예제 출력 1 
//	5
//	28
//	0
	static int n,m;
	static int[][] map;
	static boolean[][] visited;
	static int[] answer_arr;//정답 넣을 배열
	static int[] dx = {2,2,-2,-2,1,1,-1,-1};//채스판 이동
	static int[] dy = {1,-1,1,-1,2,-2,2,-2};
	
	private static int bfs(int s1, int s2, int e1, int e2) {
		Queue<int[]> q = new LinkedList<int[]>();
		//시작점 넣기
		q.add(new int[] {s1,s2});
		visited[s1][s2] = true;
		while (!q.isEmpty()) {
			int y = q.peek()[0];
			int x = q.peek()[1];
			q.poll();
			for(int i = 0; i < 8; i++) {
				int ny = y + dy[i];
				int nx = x + dx[i];
				
				//범위가 넘어가면 continue
				if(ny<0 || ny>=m || nx<0 || nx>=m) continue;
				//이미 방문했으면 continue
				if(visited[ny][nx]) continue;
				//위치 값 증가
				map[ny][nx] = map[y][x] + 1;
				//q.add
				q.add(new int[] {ny, nx});
				visited[ny][nx] = true;
			}//for
		}//while
		return map[e1][e2];
	}
	
	public static void main(String[] args) throws IOException {
      BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
      n = Integer.parseInt(br.readLine());
      answer_arr = new int[n];
      for(int i = 0; i<n; i++) {
    	  m = Integer.parseInt(br.readLine());
    	  map = new int[m][m];
    	  visited = new boolean[m][m];
    	  StringTokenizer st = new StringTokenizer(br.readLine()," ");
    	  //시작점
    	  int s1 = Integer.parseInt(st.nextToken());
    	  int s2 = Integer.parseInt(st.nextToken());
    	  StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
    	  //끝점
    	  int e1 = Integer.parseInt(st1.nextToken());
    	  int e2 = Integer.parseInt(st1.nextToken());
    	  //시작점 끝 점 넣기.
    	  int answer = bfs(s1, s2, e1, e2);
    	  answer_arr[i] = answer;
//    	  System.out.println(i+" "+answer);
      }//for
//      System.out.println("n>>"+n);
      for(int k = 0; k<n; k++) {
    	  System.out.println(answer_arr[k]);
      }//for
	}

}
   