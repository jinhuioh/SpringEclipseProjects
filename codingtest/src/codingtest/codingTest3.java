package codingtest;

import java.awt.Window.Type;
import java.beans.Visibility;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
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
import java.util.StringTokenizer;

import org.omg.CORBA.PUBLIC_MEMBER;

//예제 입력 1 
//2 20 50
//50 30
//20 40
//예제 출력 1 
//1
public class codingTest3 {
	
	static int n,l,r;
	static int[][] map,arr;
	static boolean[][] visited;
	static int[] dy = {0,0,-1,1};
	static int[] dx = {-1,1,0,0};
	static ArrayList<Node> list;


	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		l = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		
		map = new int[n][n];
		arr = new int[n][n];
		//map입력
		Queue<int[]> q = new LinkedList<int[]>();
		for(int i = 0; i<n; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			for(int j = 0; j<n; j++) {
				 int one = Integer.parseInt(st1.nextToken());
				 map[i][j] = one;
				 if(one>=l && one<=r) {
					 q.add(new int[] {i,j});//인구이동이 일어나야 하는 위치이면 q에 넣기
				 }//if
			}//for
		}//for

		while(!q.isEmpty()) {
			//인구이동이 일어나야 하는 위치이면(값에 변화가 있고 범위안에 있으면) q에 넣기
			int y = q.peek()[0];
			int x = q.peek()[1];
			q.poll();
			//국경 열음. 이동 첫째날
			arr[y][x] = 1;
		}//while
		
		
		visited = new boolean[n][n];//초기화 해줘야함
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				
				if(arr[i][j] !=0 && !visited[i][j]) {
					bfs(i,j);
				}
			}//for
		}//for
	
	}
	public static class Node {
		int x;
		int y;
		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}

