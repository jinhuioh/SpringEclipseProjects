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
//	ü���� ���� �� ����Ʈ�� ������ �ִ�. ����Ʈ�� �� ���� �̵��� �� �ִ� ĭ�� �Ʒ� �׸��� �����ִ�. ����Ʈ�� �̵��Ϸ��� �ϴ� ĭ�� �־�����. ����Ʈ�� �� �� �����̸� �� ĭ���� �̵��� �� ������?
//	�Է�
//	�Է��� ù° �ٿ��� �׽�Ʈ ���̽��� ������ �־�����.
//
//	�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ִ�. ù° �ٿ��� ü������ �� ���� ���� l(4 �� l �� 300)�� �־�����. ü������ ũ��� l �� l�̴�. ü������ �� ĭ�� �� ���� �� {0, ..., l-1} �� {0, ..., l-1}�� ��Ÿ�� �� �ִ�. ��° �ٰ� ��° �ٿ��� ����Ʈ�� ���� �ִ� ĭ, ����Ʈ�� �̵��Ϸ��� �ϴ� ĭ�� �־�����.
//
//	���
//	�� �׽�Ʈ ���̽����� ����Ʈ�� �ּ� �� ������ �̵��� �� �ִ��� ����Ѵ�.
//
//	���� �Է� 1 
//	3
//	8
//	0 0
//	7 0
//	100
//	0 0
//	30 50
//	10
//	1 1
//	1 1
//	���� ��� 1 
//	5
//	28
//	0
	static int n,m;
	static int[][] map;
	static boolean[][] visited;
	static int[] answer_arr;//���� ���� �迭
	static int[] dx = {2,2,-2,-2,1,1,-1,-1};//ä���� �̵�
	static int[] dy = {1,-1,1,-1,2,-2,2,-2};
	
	private static int bfs(int s1, int s2, int e1, int e2) {
		Queue<int[]> q = new LinkedList<int[]>();
		//������ �ֱ�
		q.add(new int[] {s1,s2});
		visited[s1][s2] = true;
		while (!q.isEmpty()) {
			int y = q.peek()[0];
			int x = q.peek()[1];
			q.poll();
			for(int i = 0; i < 8; i++) {
				int ny = y + dy[i];
				int nx = x + dx[i];
				
				//������ �Ѿ�� continue
				if(ny<0 || ny>=m || nx<0 || nx>=m) continue;
				//�̹� �湮������ continue
				if(visited[ny][nx]) continue;
				//��ġ �� ����
				map[ny][nx] = map[y][x] + 1;
				//q.add
				q.add(new int[] {ny, nx});
				visited[ny][nx] = true;
			}//for
		}//while
		return map[e1][e2];
	}
	
	public static void main(String[] args) throws IOException {
      BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
      n = Integer.parseInt(br.readLine());
      answer_arr = new int[n];
      for(int i = 0; i<n; i++) {
    	  m = Integer.parseInt(br.readLine());
    	  map = new int[m][m];
    	  visited = new boolean[m][m];
    	  StringTokenizer st = new StringTokenizer(br.readLine()," ");
    	  //������
    	  int s1 = Integer.parseInt(st.nextToken());
    	  int s2 = Integer.parseInt(st.nextToken());
    	  StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
    	  //����
    	  int e1 = Integer.parseInt(st1.nextToken());
    	  int e2 = Integer.parseInt(st1.nextToken());
    	  //������ �� �� �ֱ�.
    	  int answer = bfs(s1, s2, e1, e2);
    	  answer_arr[i] = answer;
//    	  System.out.println(i+" "+answer);
      }//for
//      System.out.println("n>>"+n);
      for(int k = 0; k<n; k++) {
    	  System.out.println(answer_arr[k]);
      }//for
	}

}
   