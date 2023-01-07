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
//�رԴ� N��M ũ���� �̷ο� �����ִ�. �̷δ� 1��1ũ���� ������ �������� �ְ�, �� �濡�� ������ ������ �ִ�. �̷��� ���� ���� �� ���� (1, 1)�̰�, ���� ������ �Ʒ� ���� (N, M)�̴�.
//
//�رԴ� ���� (1, 1)�� �ְ�, (N, M)���� �̵��Ϸ��� �Ѵ�. �ر԰� (r, c)�� ������, (r+1, c), (r, c+1), (r+1, c+1)�� �̵��� �� �ְ�, �� ���� �湮�� ������ �濡 �������ִ� ������ ��� ������ �� �ִ�. ��, �̷� ������ ���� ���� ����.
//
//�ر԰� (N, M)���� �̵��� ��, ������ �� �ִ� ���� ������ �ִ��� ���Ͻÿ�.
//
//�Է�
//ù° �ٿ� �̷��� ũ�� N, M�� �־�����. (1 �� N, M �� 1,000)
//
//��° �ٺ��� N�� �ٿ��� �� M���� ���ڰ� �־�����, r��° ���� c��° ���� (r, c)�� ������ �ִ� ������ �����̴�. ������ ������ 0���� ũ�ų� ����, 100���� �۰ų� ����.
//
//���
//ù° �ٿ� �ر԰� (N, M)���� �̵��� ��, ������ �� �ִ� ���� ������ ����Ѵ�.
//
//���� �Է� 1 
//3 4
//1 2 3 4
//0 0 0 5
//9 8 7 6
//���� ��� 1 
//31
	static int[][] map;
	static int n,m;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		map = new int[n+1][m+1];
		int answer = 0;
		for(int i = 1; i <= n; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			for(int j = 1; j <= m; j++) {
				map[i][j] = Integer.parseInt(st1.nextToken());
				answer = Math.max(map[i][j-1], Math.max(map[i-1][j], map[i-1][j-1]));
				map[i][j] += answer; 
			}//for
		}//for
		System.out.println(map[n][m]);
	}
}