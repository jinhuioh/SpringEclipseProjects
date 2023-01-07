package codingtest;

import java.awt.Window.Type;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class codingTest3 {
//	����
//	<�׸� 1>�� ���� ���簢�� ����� ������ �ִ�. 1�� ���� �ִ� ����, 0�� ���� ���� ���� ��Ÿ����. ö���� �� ������ ������ ����� ���� ������ ������ �����ϰ�, 
//	������ ��ȣ�� ���̷� �Ѵ�. ���⼭ ����Ǿ��ٴ� ���� � ���� �¿�, Ȥ�� �Ʒ����� �ٸ� ���� �ִ� ��츦 ���Ѵ�. �밢���� ���� �ִ� ���� ����� ���� �ƴϴ�.
//	<�׸� 2>�� <�׸� 1>�� �������� ��ȣ�� ���� ���̴�. ������ �Է��Ͽ� �������� ����ϰ�, �� ������ ���ϴ� ���� ���� ������������ �����Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//	�Է�
//	ù ��° �ٿ��� ������ ũ�� N(���簢���̹Ƿ� ���ο� ������ ũ��� ������ 5��N��25)�� �Էµǰ�, �� ���� N�ٿ��� ���� N���� �ڷ�(0Ȥ�� 1)�� �Էµȴ�.
//
//	���
//	ù ��° �ٿ��� �� �������� ����Ͻÿ�. �׸��� �� ������ ���� ���� ������������ �����Ͽ� �� �ٿ� �ϳ��� ����Ͻÿ�.
//
//	���� �Է� 1 
//	7
//	0110100
//	0110101
//	1110101
//	0000111
//	0100000
//	0111110
//	0111000
//	���� ��� 1 
//	3
//	7
//	8
//	9
	static LinkedList<Integer> answer_list = new LinkedList<Integer>();//������ ���� ����Ʈ
	static int[][] map;
	static boolean[][] visited;//�湮�ߴ��� Ž���� �迭
	static int n;//������
	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	
	private static int bfs(int i, int j) {
		
		Queue<int[]> q = new LinkedList<int[]>();
		
		int answer = 0;
		visited[i][j] = true;
		q.add(new int[] {i,j});
		
		while (!q.isEmpty()) {
			answer++;//���� ����
			visited[i][j] = true;
			int y = q.peek()[0];
			int x = q.peek()[1];
//					System.out.println("y x>> "+y+" "+x);
			q.poll();
			for(int k = 0; k<4; k++) {
				int ny = y + dy[k];
				int nx = x + dx[k];
				
				//������ ����� continue
				if(ny<0 || ny>=n || nx<0 || nx>=n) continue;
				if(map[ny][nx]==0 || visited[ny][nx]) continue;//���� ���� ���̸�continue
				
				visited[ny][nx] = true;
//						System.out.println("nynx>>> "+ny+" "+ny);
				q.add(new int[] {ny, nx});
//						System.out.println("answer>> "+answer);
			}//for
		}//while
		return answer;
	}//private
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		map = new int[n][n];
		visited = new boolean[n][n];
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			for(int j = 0; j < n; j++) {
				map[i][j] =  s.charAt(j)-'0';
//				System.out.println("map[i][j]>> "+map[i][j]);
				
			}//for
		}//for
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(map[i][j]==0 || visited[i][j])continue;
				
					int answerbfs = bfs(i,j);
					answer_list.add(answerbfs);
//					System.out.println(answer_list);
			}//for
		}//for
		
		Collections.sort(answer_list);
		System.out.println(answer_list.size());
		for(int one: answer_list) {
			System.out.println(one);
		}//for
		
	}

}

