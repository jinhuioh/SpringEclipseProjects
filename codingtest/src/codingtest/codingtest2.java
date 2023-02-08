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
//����
//������ �����ϴ� ť�귯���� ü������ ����� ���ο� �� "���� ����Ʈ"�� �������. 
//���� ����Ʈ�� �ִ� ���� (r, c)���, (r-2, c-1), (r-2, c+1), (r, c-2), (r, c+2), (r+2, c-1), (r+2, c+1)�� �̵��� �� �ִ�.
//
//ũ�Ⱑ N��N�� ü���ǰ� �� ĭ (r1, c1), (r2, c2)�� �־�����. ���� ����Ʈ�� (r1, c1)���� (r2, c2)�� �̵��ϴ� �ּ� �̵� Ƚ���� ���غ���.
//ü������ ��� ���� 0������ �����Ѵ�.
//
//���� ����Ʈ�� ü���� ������ ��� �� ����.
//
//�Է�
//ù° �ٿ� ü������ ũ�� N(5 �� N �� 200)�� �־�����. ��° �ٿ� r1, c1, r2, c2�� �־�����.
//
//���
//ù° �ٿ� ���� ����Ʈ�� (r1, c1)���� (r2, c2)�� �̵��ϴ� �ּ� �̵� Ƚ���� ����Ѵ�. �̵��� �� ���� ��쿡�� -1�� ����Ѵ�.
//
//���� �Է� 1 
//7
//6 6 0 1
//���� ��� 1 
//4
//���� �Է� 2 
//6
//5 1 0 5
//���� ��� 2 
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
		int answer = 0;//���� ���ϴ� ��ġ�� �����ϸ� 1�� �ٲ�
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
		
		map[end_y][end_x] = Integer.MAX_VALUE;//�������� �ʱ� ��. ä�������� ���� ������ ������ ���� �̵��� ���� �������� �̹Ƿ� �ּҰ��� �̱� ���ؼ� max value�� ����. 
		int answer = bfs(start_y, start_x);
		if(answer == 1) {
			System.out.println(map[end_y][end_x]);
		}
		else {
			System.out.println(-1);
		}
	}
}
