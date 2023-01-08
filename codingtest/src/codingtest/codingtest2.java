package codingtest;

import java.util.List;
import java.util.Queue;
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
public class codingtest2 {
//	����
//	�η��� ������ �ΰ����� �ڿ� ĳ�� �κ��� WOOK�� �ΰ� ��� �ڿ��� ĳ�� �κ��̴�.
//	WOOK�� ������ ���ѵ� ���� ������ �ڿ��� Ž���ϸ�, ���� �� (1, 1)���� ������ �Ʒ� (N, M)���� �ڿ��� Ž���Ѵ�. 
//	WOOK�� �� ���� ������ �Ǵ� �Ʒ������� �� ĭ �̵��� �� ������, �� ���� �������� �����̴� ���� �Ұ����ϴ�. 
//	WOOK�� �ڽ��� ��ġ�� (x, y)�� �ڿ��� �ִ� ��쿡�� �ش� �ڿ��� ä���� �� �ִ�. WOOK�� Ž���� ������ ���� ������ �־��� ��,
//	WOOK�� Ž���� �� �ִ� �ڿ��� �ִ� ���ڸ� ���ض�!
//
//	�Է�
//	ù° �ٿ� WOOK�� Ž���� ������ ���α��� N(1��N��300)�� ���α��� M(1��M��300)�� �־�����. �� ���� N�� M���� ���� Ž�翵���� ���� ������ �־�����. ���ڴ� �������� ���еȴ�. 
//	(�ڿ��� 1, �� ���� 0���� ǥ�õȴ�)
//
//	���
//	WOOK�� ������ �� �ִ� �ִ� ������ ������ ����϶�.
//
//	���� �Է� 1 
//	5 4
//	0 1 0 0
//	0 0 1 0
//	1 1 0 0
//	1 0 1 0
//	1 1 0 0
//	���� ��� 1 
//	4
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] map = new int[n+1][m+1];

		//map �Է¹ޱ� 1,1���� �Է¹ް� Ž���Ҷ� 0�ε��� ���� �� �ؾ��ϱ� ������(0,0���� �Է¹����� �Ʒ� for�� ���� -1���� ��)
		for(int i = 1; i<=n; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			for(int j = 1; j<=m; j++) {
				map[i][j] = Integer.parseInt(st1.nextToken());
//				System.out.println(map[i][j]);
			}//for
		}//for


		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=m; j++) {
				map[i][j] = Math.max(map[i-1][j], map[i][j-1]) + map[i][j]; 
//				System.out.println("i j map "+i+" "+j+" "+map[i][j]);
			}//for
		}//for
		
		System.out.println(map[n][m]);

	}

}
   