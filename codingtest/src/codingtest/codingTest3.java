package codingtest;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import javax.swing.plaf.SliderUI;
public class codingTest3 {
//	����
//	N��M ũ���� ������ �Ʊ� ��� ���� ������ �ִ�. ������ 1��1 ũ���� ���簢�� ĭ���� �������� �ִ�. �� ĭ���� �Ʊ� �� �ִ� 1���� �����Ѵ�.
//
//	� ĭ�� ���� �Ÿ��� �� ĭ�� ���� �Ÿ��� ����� �Ʊ� ������ �Ÿ��̴�. �� ĭ�� �Ÿ��� �ϳ��� ĭ���� �ٸ� ĭ���� ���� ���ؼ� ������ �ϴ� ĭ�� ���̰�, �̵��� ������ 8����(�밢�� ����)�� �����ϴ�.
//
//	���� �Ÿ��� ���� ū ĭ�� ���غ���. 
//
//	�Է�
//	ù° �ٿ� ������ ũ�� N�� M(2 �� N, M �� 50)�� �־�����. ��° �ٺ��� N���� �ٿ� ������ ���°� �־�����, 0�� �� ĭ, 1�� �Ʊ� �� �ִ� ĭ�̴�. �� ĭ�� ����� ���� ���� �� �� �̻��� �Է¸� �־�����.
//
//	���
//	ù° �ٿ� ���� �Ÿ��� �ִ��� ����Ѵ�.
//
//	���� �Է� 1 
//	5 4
//	0 0 1 0
//	0 0 0 0
//	1 0 0 0
//	0 0 0 0
//	0 0 0 1
//	���� ��� 1 
//	2	
	static int[][] map;
	static boolean visited[][];
	static int[] dx = {-1, -1, -1, 0, 1, 1, 1, 0};
	static int[] dy = {-1, 0, 1, 1, 1, 0, -1, -1};
	public static void main(String[] args) throws NumberFormatException, IOException, InterruptedException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];

		Queue<int[]> q = new LinkedList<>();
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
                // �� �ִ� ��ġ ť�� add
				if (map[i][j] == 1) {
					q.add(new int[] {i, j});
				}
			}
		}
		// �Է� ����
		
        // �Ÿ� ������ 2���� �����̿��� 1�� ���ְ� ���
		System.out.println(BFS(N, M, q) - 1);
		
//			// ���
//			System.out.println("*******");
//			StringBuilder sb = new StringBuilder();
//			for (int i = 0; i < N; i++) {
//				for (int j = 0; j < M; j++) {
//					sb.append(map[i][j] + " ");
//				}
//				sb.append("\n");
//			}
//			
//			System.out.println(sb);
		
	}

	public static int BFS(int N, int M, Queue<int[]> q) {
		
		visited = new boolean[N][M];
		int check = 2;
		
		while (!q.isEmpty()) {
			
			int[] now = q.poll();
			
            // �»�, ��, ���, ��, ����, ��, ����, �� ������ 8���� Ž��
			for (int i = 0; i < 8; i++) {
				
				int nextX = now[0] + dx[i];
				int nextY = now[1] + dy[i];
				
				if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) {
					continue;
				}
				
                // 1���� ũ�ٴ� ���� �̹� ���� �� ����̸鼭 ���� ������ ū �����
				if (map[nextX][nextY] >= 1) {
					continue;
				}
				
				visited[nextX][nextY] = true;
				map[nextX][nextY] = map[now[0]][now[1]] + 1;
				q.add(new int[] {nextX, nextY});
                // �ִ�Ÿ�
				check = map[nextX][nextY] > check ? map[nextX][nextY] : check;
			}
		
		}
		
		return check;
	}

}