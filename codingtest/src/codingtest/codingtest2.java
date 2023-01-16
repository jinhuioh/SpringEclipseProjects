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
//	�丶�� 2(3����)
//�Է�
//ù �ٿ��� ������ ũ�⸦ ��Ÿ���� �� ���� M,N�� �׾ƿ÷����� ������ ���� ��Ÿ���� H�� �־�����. M�� ������ ���� ĭ�� ��, N�� ������ ���� ĭ�� ���� ��Ÿ����. ��, 2 �� M �� 100, 2 �� N �� 100, 1 �� H �� 100 �̴�. 
//��° �ٺ��ʹ� ���� ���� ���ں��� ���� ���� ���ڱ����� ����� �丶����� ������ �־�����. ��, ��° �ٺ��� N���� �ٿ��� �ϳ��� ���ڿ� ��� �丶���� ������ �־�����. �� �ٿ��� ���� �����ٿ� ����ִ� �丶����� ���°� M���� ������ �־�����. 
//���� 1�� ���� �丶��, ���� 0 �� ���� ���� �丶��, ���� -1�� �丶�䰡 ������� ���� ĭ�� ��Ÿ����. �̷��� N���� ���� H�� �ݺ��Ͽ� �־�����.
//
//�丶�䰡 �ϳ� �̻� �ִ� ��츸 �Է����� �־�����.
//
//���
//�������� �丶�䰡 ��� ���� ������ �ּ� ��ĥ�� �ɸ������� ����ؼ� ����ؾ� �Ѵ�. ����, ����� ������ ��� �丶�䰡 �;��ִ� �����̸� 0�� ����ؾ� �ϰ�, �丶�䰡 ��� ������ ���ϴ� ��Ȳ�̸� -1�� ����ؾ� �Ѵ�.
//
//���� �Է� 1 
//5 3 1
//0 -1 0 0 0
//-1 -1 0 1 1
//0 0 0 1 1
//���� ��� 1 
//-1
	
	
//��������
//	1. map�Է¹ޱ�
//	2. �Է¹����鼭 1�� �κ� ť�� �ֱ�
//	3. ť ������������ while�� �����鼭 �����¿����Ʒ� ���� for�� ����(ť�� add) && ��ġ�� ������ġ+1����
//  4. ���������� ��ü for�� ���鼭 0�������� -1 ���, ���� �;����� �ִ� �ϼ� �� ã��!! 	
	
//ť�� ���� (y,x) 
class tomato{
	int x;
	int y;
	int z;
	tomato(int z, int x, int y){
		this.z = z;
		this.x = x;
		this.y = y;
	}
}
public class codingtest2 {
	static int n,m,h;
	static int[][][] board;
	static Queue<tomato> q;
	static int[] dx = {0,0,-1,1,0,0};
	static int[] dy = {-1,1,0,0,0,0};
	static int[] dz = {0,0,0,0,-1,1};
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		n = sc.nextInt();
		h = sc.nextInt();
		board = new int[h][n][m];
		
		q = new LinkedList<tomato>();
		
		for(int i = 0; i<h; i++) {
			for(int j = 0; j<n; j++) {
				for(int k = 0; k<m; k++) {
					board[i][j][k] = sc.nextInt();
					
					if(board[i][j][k]==1) q.add(new tomato(i, j, k));
				}
			}
		}
		System.out.println(bfs());
		
	}
	
	public static int bfs() {
		while (!q.isEmpty()) {
			tomato t = q.remove();
			
			int z = t.z;
			int x = t.x;
			int y = t.y;
			
			for(int i = 0; i<6; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				int nz = z + dz[i];
				
				if(nx >=0 && ny>=0 && nz >=0&& nx<n&& ny<m&& nz<h) {
					if(board[nz][nx][ny]==0) {
						q.add(new tomato(nz, nx, ny));
						
						board[nz][nx][ny] = board[z][x][y]+1;
					}
				}
			}
		}
		int result = Integer.MIN_VALUE;
		
		for(int i = 0; i<h; i++) {
			for(int j = 0; j<n; j++) {
				for(int k = 0; k<m; k++) {
					if(board[i][j][k]==0) return -1;
					
					result = Math.max(result, board[i][j][k]);
				}
			}
		}//for
		if(result==1) return 0;
		else return result-1;
	}
}
