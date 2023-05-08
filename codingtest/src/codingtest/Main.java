package codingtest;


import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
//어떤 큰 도화지에 그림이 그려져 있을 때, 그 그림의 개수와, 그 그림 중 넓이가 가장 넓은 것의 넓이를 출력하여라. 
//단, 그림이라는 것은 1로 연결된 것을 한 그림이라고 정의하자. 
//가로나 세로로 연결된 것은 연결이 된 것이고 대각선으로 연결이 된 것은 떨어진 그림이다. 
//그림의 넓이란 그림에 포함된 1의 개수이다.
//
//입력
//첫째 줄에 도화지의 세로 크기 n(1 ≤ n ≤ 500)과 가로 크기 m(1 ≤ m ≤ 500)이 차례로 주어진다. 
//두 번째 줄부터 n+1 줄 까지 그림의 정보가 주어진다. (단 그림의 정보는 0과 1이 공백을 두고 주어지며, 
//		0은 색칠이 안된 부분, 1은 색칠이 된 부분을 의미한다)
//
//출력
//첫째 줄에는 그림의 개수, 둘째 줄에는 그 중 가장 넓은 그림의 넓이를 출력하여라. 
//단, 그림이 하나도 없는 경우에는 가장 넓은 그림의 넓이는 0이다.
//
//예제 입력 1 
//6 5
//1 1 0 1 1
//0 1 1 0 0
//0 0 0 0 0
//1 0 1 1 1
//0 0 1 1 1
//0 0 1 1 1
//예제 출력 1 
//4
//9

class node {
	int y;
	int x;
	node(int y, int x){
		this.y = y;
		this.x = x;
	}
}
public class Main {
	static int[][] arr;
	static int count, n, m, max_size;
	static boolean[][] visited;
	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	static Queue<node> q = new LinkedList<node>();
	
	
	private static int bfs(int i, int j) {//static이 붙어야 생성자 없이 main에서 함수 사용 가능.
		//그림 크기
		int size = 1;
		q.add(new node(i,j));
		visited[i][j] = true;
		while(!q.isEmpty()) {
			node qp = q.poll();
			int y = qp.y;
			int x = qp.x;
			
			for(int k=0; k<4; k++) {
				int ny = y + dy[k];
				int nx = x + dx[k];
				if(ny>=0 && ny<n && nx>=0 && nx<m && !visited[ny][nx] && arr[ny][nx] == 1) {
					q.add(new node(ny,nx));
					visited[ny][nx] = true;
					size++;
				}
			}//for
		}//while
		return size;
	}
	
    public static void main(String[] args)throws Exception {
//    	행렬입력받기
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	n = Integer.parseInt(st.nextToken());
    	m = Integer.parseInt(st.nextToken());
    	arr = new int[n][m];
    	
    	for(int i = 0; i < n; i++) {
    		st = new StringTokenizer(br.readLine());
    		for(int j = 0; j < m; j++) {
    			arr[i][j] = Integer.parseInt(st.nextToken());
    		}//for
    	}//for

//		확인
//    	for(int i = 0; i < n; i++) {
//    		for(int j = 0; j < m; j++) {
//    			System.out.print(arr[i][j]);
//    		}//for
//    		System.out.println();
//    	}//for
    	
    	visited = new boolean[n][m];
    	max_size = 0;
    	for(int i = 0; i<n; i++) {
    		for(int j = 0; j<m; j++) {
    			if(!visited[i][j] && arr[i][j]==1) {
    				//함수실행
    				int bfs_size = bfs(i, j);
    				max_size = Math.max(max_size, bfs_size);
    				count++;//그림 개수
    			}
    		}
    	}//for
    	System.out.println(count);
    	System.out.println(max_size);
    }
}
