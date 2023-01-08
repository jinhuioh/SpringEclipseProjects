package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class codingTest4 {
//����
//��������
//	�Է�
//	ù° �ٿ��� � ������ ��Ÿ���� 2���� �迭�� ��� ���� ������ ��Ÿ���� �� N�� �Էµȴ�. N�� 2 �̻� 100 ������ �����̴�. ��° �ٺ��� N���� �� �ٿ��� 2���� �迭�� ù ��° ����� N��° ����� ������� �� �྿ ���� ������ �Էµȴ�. �� �ٿ��� �� ���� ù ��° ������ N��° ������ N���� ���� ������ ��Ÿ���� �ڿ����� �� ĭ�� ���̿� �ΰ� �Էµȴ�. ���̴� 1�̻� 100 ������ �����̴�.
//
//	���
//	ù° �ٿ� �帶ö�� ���� ����� �ʴ� ������ ������ �ִ� ������ ����Ѵ�.
//
//	���� �Է� 1 
//	5
//	6 8 2 6 2
//	3 2 3 4 6
//	6 7 3 3 2
//	7 2 5 3 6
//	8 9 5 2 7
//	���� ��� 1 
//	5
	
	static int[][] map;
	static int n,m;
	static boolean[][] visited;
	static int[] dx = {0,0,-1,1};
	static int[] dy = {-1,1,0,0};
	
	private static void bfs(int i, int j, int k) {
		visited[i][j] = true;//�ʱⰪ �湮ó��
		Queue<int[]> q = new LinkedList<int[]>();
		q.add(new int[] {i,j});
		
		while (!q.isEmpty()) {
			int y = q.peek()[0];
			int x = q.peek()[1];
			q.poll();
			for(int i1 = 0; i1<4; i1++) {
				int ny = y + dy[i1];
				int nx = x + dx[i1];
				if(ny<0 || ny>=n || nx<0 || nx>=n) continue;//���� ����� �н�
				if(visited[ny][nx] || map[ny][nx] <= k) continue;//�̹� �湮�߰ų� k���� ������ �н�
				q.add(new int[] {ny,nx});
				visited[ny][nx] = true;
//				System.out.println("qadd>>> "+ny+" "+nx);
			}//for
		}//while
	}
	
	private static int bfs_answer(int k) {
		//���پ� Ž���ϸ鼭 ���� ����� ���� ������ ���� ����
		int count = 0;
		visited = new boolean[n][n];//k�� �ٲ𶧸��� �ʱ�ȭ
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				//���� ���� �����̰ų� �̹� �湮������ �н�
				if(k >= map[i][j] || visited[i][j]) continue;
				bfs(i, j, k);
				count++;
			}//for
		}//for
		return count;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		map = new int[n][n];
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken()); 
			}
		}//for
		int max_answer = 1;//���������� �ִ밪
		for(int k = 1; k<100; k++) {//k������ ���ڴ� ���� ����.
			int answer = bfs_answer(k);
//			if(answer == 0) {//����� ������ �ϳ��� ������ for���� �����.
//				break;
//			}
			max_answer = Math.max(max_answer, answer);
			
		}//for
		System.out.println(max_answer);
	}
}