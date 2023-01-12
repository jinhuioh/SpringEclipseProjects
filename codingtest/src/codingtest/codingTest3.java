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
//�α��̵�
//�Է�
//ù° �ٿ� N, L, R�� �־�����. (1 �� N �� 50, 1 �� L �� R �� 100)
//
//��° �ٺ��� N���� �ٿ� �� ������ �α����� �־�����. r�� c���� �־����� ������ A[r][c]�� ���̴�. (0 �� A[r][c] �� 100)
//
//�α� �̵��� �߻��ϴ� �ϼ��� 2,000�� ���� �۰ų� ���� �Է¸� �־�����.
//
//���
//�α� �̵��� ��ĥ ���� �߻��ϴ��� ù° �ٿ� ����Ѵ�.
import java.util.StringTokenizer;

import org.omg.CORBA.PUBLIC_MEMBER;

//���� �Է� 1 
//2 20 50
//50 30
//20 40
//���� ��� 1 
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
		//map�Է�
		Queue<int[]> q = new LinkedList<int[]>();
		for(int i = 0; i<n; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			for(int j = 0; j<n; j++) {
				 int one = Integer.parseInt(st1.nextToken());
				 map[i][j] = one;
				 if(one>=l && one<=r) {
					 q.add(new int[] {i,j});//�α��̵��� �Ͼ�� �ϴ� ��ġ�̸� q�� �ֱ�
				 }//if
			}//for
		}//for

		while(!q.isEmpty()) {
			//�α��̵��� �Ͼ�� �ϴ� ��ġ�̸�(���� ��ȭ�� �ְ� �����ȿ� ������) q�� �ֱ�
			int y = q.peek()[0];
			int x = q.peek()[1];
			q.poll();
			//���� ����. �̵� ù°��
			arr[y][x] = 1;
		}//while
		
		
		visited = new boolean[n][n];//�ʱ�ȭ �������
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

