package codingtest;

import java.util.List;
import java.util.Queue;
import java.util.Scanner;
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
//문제
//게임을 좋아하는 큐브러버는 체스에서 사용할 새로운 말 "데스 나이트"를 만들었다. 
//데스 나이트가 있는 곳이 (r, c)라면, (r-2, c-1), (r-2, c+1), (r, c-2), (r, c+2), (r+2, c-1), (r+2, c+1)로 이동할 수 있다.
//
//크기가 N×N인 체스판과 두 칸 (r1, c1), (r2, c2)가 주어진다. 데스 나이트가 (r1, c1)에서 (r2, c2)로 이동하는 최소 이동 횟수를 구해보자.
//체스판의 행과 열은 0번부터 시작한다.
//
//데스 나이트는 체스판 밖으로 벗어날 수 없다.
//
//입력
//첫째 줄에 체스판의 크기 N(5 ≤ N ≤ 200)이 주어진다. 둘째 줄에 r1, c1, r2, c2가 주어진다.
//
//출력
//첫째 줄에 데스 나이트가 (r1, c1)에서 (r2, c2)로 이동하는 최소 이동 횟수를 출력한다. 이동할 수 없는 경우에는 -1을 출력한다.
//
//예제 입력 1 
//7
//6 6 0 1
//예제 출력 1 
//4
//예제 입력 2 
//6
//5 1 0 5
//예제 출력 2 
//-1
class node {
	int y;
	int x;
	node(int y, int x){
		this.y = y;
		this.x = x;
	}
}

public class codingtest2 {
	static int n, start_y, start_x, end_y, end_x, count;
	static int[] dy = {-2,-2,0,0,2,2};
	static int[] dx = {-1,1,-2,2,-1,1};
	static Queue<node> q;
	static int[][] map;
	static boolean[][] visited;
	
	private static int bfs(int start_y, int start_x) {
		int answer = 0;//만약 원하는 위치에 도달하면 1로 바꿈
		q = new LinkedList<node>();
		q.add(new node(start_y, start_x));
		visited[start_y][start_x] = true;
		
		while (!q.isEmpty()) {
			node qp = q.poll();
			for(int k = 0; k<6; k++) {
				int ny = qp.y + dy[k];
				int nx = qp.x + dx[k];
				
				if(ny>=0 && nx>=0 && ny<n && nx<n && !visited[ny][nx]) {
					if(ny==end_y && nx==end_x) {
						map[end_y][end_x] = Math.min(map[qp.y][qp.x] + 1, map[end_y][end_x]); 
						answer = 1;
					}
					visited[ny][nx] = true;
					map[ny][nx] = map[qp.y][qp.x] + 1; 
					q.add(new node(ny, nx));
				}
			}
		}//while
		return answer;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		map = new int[n][n];
		visited = new boolean[n][n];
		
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<n; j++) {
//				map[i][j] = Integer.MAX_VALUE;
//			}
//		}
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		start_y = Integer.parseInt(st.nextToken());
		start_x = Integer.parseInt(st.nextToken());
		end_y = Integer.parseInt(st.nextToken());
		end_x = Integer.parseInt(st.nextToken());
		
		map[end_y][end_x] = Integer.MAX_VALUE;//마지막값 초기 값. 채스판으로 부터 마지막 값까지 오는 이동의 수가 여러가지 이므로 최소값만 뽑기 위해서 max value로 지정. 
		int answer = bfs(start_y, start_x);
		if(answer == 1) {
			System.out.println(map[end_y][end_x]);
		}
		else {
			System.out.println(-1);
		}
	}
}
