package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;
//입력
//첫 번째 줄에는 격자의 크기를 나타내는 두 정수 
//$R$과 
//$C$가 주어진다. (
//$1 \le R,C \le 1\,000$)
//
//다음 줄부터 
//$R$개의 줄에 걸쳐 격자의 정보가 주어진다. 각 줄은 
//$C$개의 알파벳 소문자로 이루어져 있으며, 위, 아래, 왼쪽 또는 오른쪽으로 인접해 있는 칸이 같은 문자라는 것은 두 칸이 같은 영역에 속해 있음을 의미한다.
//
//다음 줄에는 한별이가 이세계에 떨어진 위치를 나타내는 두 정수 
//$H_R$, 
//$H_C$가 주어진다. 이는 한별이가 위에서 
//$H_R$번째 줄, 왼쪽에서 
//$H_C$번째 칸에 떨어졌음을 의미한다. (
//$1 \le H_R \le R$, 
//$1 \le H_C \le C$)
//
//마지막 줄에는 한별이의 여행 기록을 나타내는 
//$200\,000$글자 이하의 문자열이 주어진다. 여행 기록의 각 문자는 U, D, L, R, W 중 하나로 이루어져 있으며, U, D, L, R은 각각 위, 아래, 왼쪽, 오른쪽으로 한 칸 이동했다는 뜻이고, W는 지금 있는 칸에 와드를 설치했다는 뜻이다. 한별이가 격자를 벗어나는 경우는 주어지지 않는다.
//
//출력
// 
//$R$개의 줄에 걸쳐 한별이의 시야를 출력한다. 각 줄은 
//$C$개의 문자로 되어 있어야 하며, 
//$R$번째 줄 
//$C$번째 문자가 .이라면 한별이의 시야에 해당 칸이 들어와 있다는 뜻이고 #이라면 그렇지 않다는 뜻이다.
//
//예제 입력 1 
//4 5
//aaabc
//dcbbc
//dccaa
//ddaaa
//3 4
//WLLLWUURRD
//예제 출력 1 
//##.##
//....#
//.#...
//.....

public class codingTest5 {
	static int n,m;
	static char[][] map, arr;
	static Queue<Character> d;//이동한거리
	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	static boolean[][] visited;
	//해당위치로부터 같은 알파벳까지 arr 전부 .로 표시
	private static void ward(int y, int x) {
		char alpa = map[y][x];//와드가 설치될 알파벳
		arr[y][x] = '.';
		
		visited = new boolean[n][m];
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {y,x});
		
		while(!q.isEmpty()) {
			int[] qp = q.poll();
			int qp_y = qp[0];
			int qp_x = qp[1];
			
			for(int i  = 0; i<4; i++) {
				int ny = qp_y + dy[i];
				int nx = qp_x + dx[i];
				
				if(ny>=0 && nx>=0 && ny<n && nx<m && map[ny][nx] == alpa && !visited[ny][nx]) {
					arr[ny][nx] ='.';
					visited[ny][nx] = true;
					q.add(new int[] {ny,nx});
				}
			}
		}//while
		
//		//확인-----------------------------
//		for(int i = 0; i<n; i++) {
//			for(int j = 0; j<m; j++) {
//				System.out.print(arr[i][j]);
//			}
//			System.out.println();
//		}//for
//		System.out.println();
//		//확인-----------------------------
		
	}
	
	// d를 이용하여 한별이를 이동시키면서 arr을 그려나갈 함수.
	private static void bfs(int start_y, int start_x) {
		//d의 값을 하나씩 빼서 한별이 이동시킨 후 w인경우 arr에 .그리기
		while(!d.isEmpty()) {
			char t = d.poll();
			if(t == 'W') {//와드설치이면
				ward(start_y, start_x);
			}//if
			else if(t == 'L') {
				start_x --;
			}
			else if(t == 'R') {
				start_x ++;
			}
			else if(t == 'U') {
				start_y --;
			}
			else{
				start_y ++;
			}//else
//			System.out.println(start_y+" "+start_x);
		}//while
		//마지막 한별이의 위치로부터 동서남북 arr을 .으로 바꾸기
		arr[start_y][start_x] = '.';
		for(int i = 0; i<4; i++) {
			int end_y = start_y + dy[i];
			int end_x = start_x + dx[i];
			if(end_y>=0 && end_x>=0 && end_y<n && end_x<m) {
				arr[end_y][end_x] ='.';
			}
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		map = new char[n][m];
		arr = new char[n][m];
		
		for(int i = 0; i<n; i++) {
			String s = br.readLine();
			for(int j = 0; j<m; j++) {
				map[i][j] = s.charAt(j);
				arr[i][j] = '#';
			} 
		}//for
		//현재위치 입력받기
		int start_y, start_x;
		st = new StringTokenizer(br.readLine());
		start_y = Integer.parseInt(st.nextToken());
		start_x = Integer.parseInt(st.nextToken());
		
		//이동거리
		String distance = br.readLine();
		d = new LinkedList<>();
		for(int i = 0; i<distance.length(); i++) {
			d.add(distance.charAt(i));
		}//for
//		System.out.print(d);
		bfs(start_y-1, start_x-1);
		
		//확인-----------------------------
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<m; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}//for
		//확인-----------------------------
	}

}
