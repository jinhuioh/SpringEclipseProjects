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
	
//	����
//	� ū ��ȭ���� �׸��� �׷��� ���� ��, �� �׸��� ������, �� �׸� �� ���̰� ���� ���� ���� ���̸� ����Ͽ���. ��, �׸��̶�� ���� 1�� ����� ���� �� �׸��̶�� ��������. ���γ� ���η� ����� ���� ������ �� ���̰� �밢������ ������ �� ���� ������ �׸��̴�. �׸��� ���̶� �׸��� ���Ե� 1�� �����̴�.
//
//	�Է�
//	ù° �ٿ� ��ȭ���� ���� ũ�� n(1 �� n �� 500)�� ���� ũ�� m(1 �� m �� 500)�� ���ʷ� �־�����. �� ��° �ٺ��� n+1 �� ���� �׸��� ������ �־�����. (�� �׸��� ������ 0�� 1�� ������ �ΰ� �־�����, 0�� ��ĥ�� �ȵ� �κ�, 1�� ��ĥ�� �� �κ��� �ǹ��Ѵ�)
//
//	���
//	ù° �ٿ��� �׸��� ����, ��° �ٿ��� �� �� ���� ���� �׸��� ���̸� ����Ͽ���. ��, �׸��� �ϳ��� ���� ��쿡�� ���� ���� �׸��� ���̴� 0�̴�.
//
//	���� �Է� 1 
//	6 5
//	1 1 0 1 1
//	0 1 1 0 0
//	0 0 0 0 0
//	1 0 1 1 1
//	0 0 1 1 1
//	0 0 1 1 1
//	���� ��� 1 
//	4
//	9
	static int[][] map;
	static boolean[][] visited;
	static int n,m;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	//Ž���� �׸��� ũ�� ����
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
		
		//Ž������
		int count = 0;
		int artMax = 0;
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<m; j++) {
				if(visited[i][j] || map[i][j]==0) continue;
				int artSize = bfs(i, j);
				artMax = Math.max(artMax, artSize);//���� ū �׸��� ����
				count++;
			}//for
		}//for
		System.out.println(count);
		System.out.println(artMax);
	}

}
