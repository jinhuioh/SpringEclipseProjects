package codingtest;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import javax.swing.plaf.SliderUI;
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
class node{
	int y;
	int x;
	node(int y, int x){
		this.y = y;
		this.x = x;
	}
}

public class codingTest3 {
	static int[] dy = {0,0,-1,-1,1,1,1,-1};
	static int[] dx = {1,-1,1,-1,1,-1,0,0};
	static int[][] map;
	static int[][] arr;
	static boolean[][] visited;
	static int n,m;
	
	private static int bfs(int i, int j) {
		visited = new boolean[n][m];
		arr = new int[n][m];
		Queue<node> q = new LinkedList<node>();
		int count = Integer.MAX_VALUE;//�����Ÿ� ��� ����
		
		q.add(new node(i, j));
		visited[i][j] = true;
		
		while (!q.isEmpty()) {
			node qp = q.poll();
			for(int k = 0; k<8; k++) {
				int ny = qp.y + dy[k];
				int nx = qp.x + dx[k];
				if(ny<0 || nx<0 || ny>=n || nx>=m || visited[ny][nx]) continue;
				
				if(map[ny][nx] == 1) {
					count = Math.min(count, arr[qp.y][qp.x] + 1);
//					System.out.println(qp.y+" "+qp.x+"count!!>>"+ count);
					break;
				}
				arr[ny][nx] = arr[qp.y][qp.x] + 1;
//				System.out.println("qp.y>>"+qp.y + " qp.x>> "+qp.x +" nynx>>"+ ny+" "+nx+" "+" arrnynx>>" + arr[ny][nx]);
				visited[ny][nx] = true;
				q.add(new node(ny, nx));
			}
		}
		return count;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException, InterruptedException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		map = new int[n][m];

		//map�Է¹ޱ�
		for(int i = 0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j<m; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}//for
		}//for
		
		//ù��° ��ġ���� ���� ����� �Ʊ������ �Ÿ� ���ϱ�
		int answer = 1;//�ʱⰪ
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<m; j++) {
				if( map[i][j] != 1) {
					int answer_bfs = bfs(i,j); //�ش� ��ġ�� �����Ÿ� ��
					answer = Math.max(answer, answer_bfs);
				}//if
			}//for
		}//for
		System.out.println(answer);
	}

}