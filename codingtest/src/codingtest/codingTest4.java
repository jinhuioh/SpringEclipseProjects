package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class codingTest4 {
//���Ĺ� ���ϱ�
//	����
//	�ڷ����� �ܵ��̴Ͼ� 8���� �л����� 3���� �Ļ縦 �ذ��ϴ� �����̴�. �׷��� ��� �������� �л����� �������� ���Ĺ��� ��� �߰� �߰��� ������ �ִ�. �̷��� ���Ĺ����� ��ó�� �ִ� �ͳ��� ��ġ�� �ż� ū ���Ĺ� �����Ⱑ �ȴ�. 
//
//	�� ������ ������ �������� ���������� �̷��� ���Ĺ��� �ǳ�ȭ�� ������ ���� ���� �������� �Ⱦ��Ѵ�. ����� �츮�� ���ؾ� �� ���� �� ������ �� ������ ���ߴ� ���� �ƴϴ�. 
//
//	��ο� ������ ���Ĺ��� ���ذ���� ���� ���� �ƴϴ�. ���� �������� ������ ���Ĺ� �߿� ���� ū ���Ĺ����� ���� ������ �Ѵ�. 
//
//	�������� ���� ���� ū ���Ĺ��� ũ�⸦ ���ؼ� ��10ra"�� ��ġ�� �ʰ� ��������.
//
//	�Է�
//	ù° �ٿ� ����� ���� ���� N(1 �� N �� 100)�� ���� ���� M(1 �� M �� 100) �׸��� ���Ĺ� �������� ���� K(1 �� K �� N��M)�� �־�����.  �׸��� ���� K���� �ٿ� ���Ĺ��� ������ ��ǥ (r, c)�� �־�����.
//
//	��ǥ (r, c)�� r�� ����������, c�� ���ʿ������Ͱ� �����̴�. �Է����� �־����� ��ǥ�� �ߺ����� �ʴ´�.
//
//	���
//	ù° �ٿ� ���Ĺ� �� ���� ū ���Ĺ��� ũ�⸦ ����϶�.
//
//	���� �Է� 1 
//	3 4 5
//	3 2
//	2 2
//	3 1
//	2 3
//	1 1
//	���� ��� 1 
//	4
	static int[][] map;
	static boolean[][] visited;
	static int answer;//���� ū ���� ũ�Ⱑ �� ����
	static int n,m,k;
	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	
	private static int bfs(int i, int j) {
		Queue<int[]> q = new LinkedList<int[]>();
		q.add(new int[] {i,j});
		visited[i][j] = true;
		int count = 1;//���Ĺ� ������ �� ����
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
		//���� �ڸ� ǥ��
		for(int i = 0; i<k; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			int p1 = Integer.parseInt(st1.nextToken());
			int p2 = Integer.parseInt(st1.nextToken());
			map[p1][p2] = 1;//���� �ִ� �ڸ� ǥ�� 
		}//for
		
		answer = 1;
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=m; j++) {
				if(visited[i][j] || map[i][j] != 1) continue;//�̹� �湮�߰ų� ���Ĺ��� �ִ� �ڸ��� �ƴϸ� �н�
				int answer_bfs = bfs(i,j);
				answer = Math.max(answer_bfs, answer);
			}//for
		}//for
		System.out.println(answer);
	}
}