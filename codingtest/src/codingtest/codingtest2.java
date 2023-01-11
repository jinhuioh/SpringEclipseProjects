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
//	����: �����³�ȭ
//	Ǫ���� �Ƹ��ٿ� ���ؿ��� ���� ���� ����� �̷�� �ִ�. �׸��� �ƴϸ� �� �� ���� �� ���� �Ƹ��ٿ� ����� ������ �� �� �ִ� �ٵ��ط� ����̴� ������ ������.
//
//	�ٵ��ؿ� ������ ����̴� ���￡�� ���� �Ͱ��� �ٸ� ǳ�濡 ū ����� �޾Ҵ�. ���� �³�ȭ�� ���� �ؼ����� ����� ���� �Ϻΰ� �ٴٿ� ��ܹ��ȴ�.
//
//	����� �ٽ� ���ƿ� ����̴� �̷��� ���� �³�ȭ�� ��� �� ��� ������ ������ ��� �ٲ��� �ñ�������.
//
//	�ٵ����� ������ R*C ũ���� �׸���� ��Ÿ�� �� �ִ�. 'X'�� ���� ��Ÿ����, '.'�� �ٴٸ� ��Ÿ����.
//
//	50���� ������, ������ �� ĭ �Ǵ� �� ĭ�� �ٴٰ� �ִ� ���� ��� ��ܹ����ٴ� ����� �˾Ҵ�.
//
//	����̴� 50�� �� ������ �׷������ �ߴ�. ���� ������ ���ó����� ������ ���̱� ������, ������ ũ�⵵ �۾����� �Ѵ�. ������ ũ��� ��� ���� �����ϴ� ���� ���� ���簢���̴�. 50���� ���� �Ŀ��� ���� ��� �� �� �ִ�. ��, ������ ���� ��, ������ ������ ����� ĭ�� ��� �ٴ��̴�.
//
//	�Է�
//	ù° �ٿ� ������ ũ�� R�� C (1 �� R, C �� 10)�� �־�����. ���� R�� �ٿ��� ���� ������ �־�����.
//
//	���
//	50�� ���� ������ ����Ѵ�.
//
//	���� �Է� 1 
//	5 3
//	...
//	.X.
//	.X.
//	.X.
//	...
//	���� ��� 1 
//	X
//	���� �Է� 2 
//	3 10
//	..........
//	..XXX.XXX.
//	XXX.......
//	���� ��� 2 
//	.XX...X
//	XX.....
	static char[][] map;
	static char[][] arr;
	static int[] dx = {0,0,-1,1};
	static int[] dy = {-1,1,0,0};
	static int n,m;
	
	private static int bfs(int i, int j, char[][] map) {
		int count = 0;
		for(int k = 0; k<4; k++) {
			int ny = i + dy[k];
			int nx = j + dx[k];
			if(ny<0 || ny>=n || nx<0 || nx>=m) {
				continue;
			}
			if(map[ny][nx]=='.') { 
				continue;
			}
			count++;
		}//for
		return count;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
	    m = Integer.parseInt(st.nextToken());
		map = new char[n][m];
		arr = new char[n][m];
		//������ ���� ������ ����Ʈ
		List<List<String>> answer_list = new ArrayList<List<String>>();
//		for(int j = 0; j < n; j++) {
//			answer_list.add(new ArrayList<String>());
//		}
		
		//�迭�� �� �Է¹ޱ�
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			for(int j = 0; j < m; j++) {
				map[i][j] = s.charAt(j);
				arr[i][j] = s.charAt(j);
			}//for
		}//for
		
		//���� ��¹���
		int mini = n;
		int minj = m;
		int maxi = 0;
		int maxj = 0;
		//x�� ��ó 2���� x�� �����ϸ� �н� �ƴϸ� ������ �ٲٱ�
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(map[i][j]=='.') continue;
				int count_bfs = bfs(i, j, map);
				if(count_bfs<2) {
					arr[i][j] = '.';
				}//if
				else {
					//���� ��� ���� ����
					mini = Math.min(mini, i);
					minj = Math.min(minj, j);
					maxi = Math.max(maxi, i);
					maxj = Math.max(maxj, j);
				}
				
			}//for
		}//for

		for(int i1 = mini; i1 <= maxi; i1++) {
			for(int j1 = minj; j1 <= maxj; j1++) {
				System.out.print(arr[i1][j1]);
			}//for
			System.out.println();
		}//for
		

		
	}

}
   