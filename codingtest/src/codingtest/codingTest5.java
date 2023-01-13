package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;
//��
//����
//��Ű�� �޸��翡�� Ư�� ���� ���� �ִ�. �װ� ǫ ��� ���̿� ����� ����� ���翡 ���� ���� �����ߴ�.
//
//������ ��� ���� �̷���� ���簢�� ����̴�. ���� '.' (��)�� �� �ʵ带 �ǹ��ϸ�, ���� '#'�� ��Ÿ����, 'o'�� ��, 'v'�� ���븦 �ǹ��Ѵ�.
//
//�� ĭ���� ����, ���������� �̵��ϸ� ��Ÿ���� ������ �ʰ� �ٸ� ĭ���� �̵��� �� �ִٸ�, �� ĭ�� ���� ���� �ȿ� ���� �ִٰ� �Ѵ�. ���翡�� "Ż��"�� �� �ִ� ĭ�� � �������� ������ �ʴ´ٰ� �����Ѵ�.
//
//������ �츮�� ���� ���뿡�� �ο��� �� �� �ְ� ���� ���� ���� ���� ������ ������ ���ٸ� �̱��, ���븦 �츮���� �ѾƳ���. �׷��� �ʴٸ� ���밡 �� ���� ���� ��� ���� �Դ´�.
//
//�� ó�� ��� ��� ����� ���� �� ������ �����Ѵ�.
//
//��ħ�� �������� �� ��Ƴ��� ��� ������ ���� ����ϴ� ���α׷��� �ۼ��϶�.
//
//�Է�
//ù �ٿ��� �� ���� R�� C�� �־�����(3 �� R, C �� 250), �� ���� ������ ��� ���� ���� �ǹ��Ѵ�.
//
//���� R���� ���� C���� ���ڸ� ������. �̵��� ������ ����(��Ÿ��, ��, ������ ��ġ)�� �ǹ��Ѵ�.
//
//���
//�ϳ��� �ٿ� ��ħ���� ����ִ� ��� ������ ���� �ǹ��ϴ� �� ������ ����Ѵ�.
//
//���� �Է� 1 
//6 6
//...#..
//.##v#.
//#v.#.#
//#.o#.#
//.###.#
//...###
//���� ��� 1 
//0 2

public class codingTest5 {
	static char[][] map;
	static boolean[][] visited;
	static int n,m;
	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	
	private static Queue<int[]> bfs(int i, int j) {
		int sheep = 0;
		int wolf = 0;
		if(map[i][j] == 'v') {
			wolf = 1;
		}
		if(map[i][j] == 'o') {
			sheep = 1;
		}
		visited[i][j] = true;
		Queue<int[]> q = new LinkedList<int[]>();
		q.add(new int[] {i,j});
		while (!q.isEmpty()) {
			int y = q.peek()[0];
			int x = q.peek()[1];
			q.poll();
			for(int k = 0; k<4; k++) {
				int ny = y + dy[k];
				int nx = x + dx[k];
				if(ny<0 || ny>=n || nx<0 || nx>=m) continue;
				if(visited[ny][nx] || map[ny][nx] == '#') continue;
				visited[ny][nx] = true;
				q.add(new int[] {ny,nx});
				if(map[ny][nx] == 'o') {
//					System.out.println("o���� "+ny+" "+nx);
					sheep++;
				}
				if(map[ny][nx] == 'v') {
//					System.out.println("v���� "+ny+" "+nx);
					wolf++;
				}//if
			}//for
		}//while
		Queue<int[]> q1 = new LinkedList<int[]>();
		q1.add(new int[] {sheep, wolf});
		return q1;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		map = new char[n][m];
		visited = new boolean[n][m];
		for(int i = 0; i<n; i++) {
			String s = br.readLine();
			for(int j = 0; j<m; j++) {
				map[i][j] = s.charAt(j); 
			}//for
		}//for
		int sheep = 0;
		int wolf = 0;
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<m; j++) {
				//#�̰ų� �̹� �湮������ �н�
				if(visited[i][j] || map[i][j] == '#') continue;
				Queue<int[]> sheep_wolf = bfs(i, j);
				int sheep0 = sheep_wolf.peek()[0];
				int wolf0 = sheep_wolf.peek()[1];
				sheep_wolf.poll();
				if(sheep0>wolf0) {
					sheep += sheep0;
				}
				else {
					wolf += wolf0;
				}
				
			}//for
		}//for
		System.out.println(sheep+" "+wolf);		
	}

}
