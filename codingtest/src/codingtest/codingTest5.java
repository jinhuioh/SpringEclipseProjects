package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class codingTest5 {
//	����
//	�ȳ�
//	�����̴� ���������� �� �Ŀ� ������ �ʹ� ���� �Կ��� �־���. ���� �����̰� ������ �Կ��� ���� �ڱ⸦ �������� ����鿡�� �����ϴٰ� ���� �����̴�.
//
//	�����̸� �������� ����� �� N���� �ִ�. ����� ��ȣ�� 1������ N������ �ִ�. �����̰� i�� ������� �λ縦 �ϸ� L[i]��ŭ�� ü���� �Ұ�, J[i]��ŭ�� ����� ��´�. �����̴� ������ ������� �ִ� 1���� ���� �� �ִ�.
//
//	�������� ��ǥ�� �־��� ü�³����� �ִ����� ����� ������ ���̴�. �������� ü���� 100�̰�, ����� 0�̴�. ���� �������� ü���� 0�̳� ������ �Ǹ�, �׾ �ƹ��� ����� �� ���� ���� �ȴ�. �����̰� ���� �� �ִ� �ִ� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//	�Է�
//	ù° �ٿ� ����� �� N(�� 20)�� ���´�. ��° �ٿ��� ������ ������� �λ縦 �� ��, �Ҵ� ü���� 1�� ������� ������� ������, ��° �ٿ��� ������ ������� �λ縦 �� ��, ��� ����� 1�� ������� ������� ���´�. ü�°� ����� 100���� �۰ų� ���� �ڿ��� �Ǵ� 0�̴�.
//
//	���
//	ù° �ٿ� �����̰� ���� �� �ִ� �ִ� ����� ����Ѵ�.
//
//	���� �Է� 1 
//	3
//	1 21 79
//	20 30 25
//	���� ��� 1 
//	50
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		
		int k = 99;
		int[][] dp = new int[n+1][k+1];//[n��° ���][n��° ����� ä���� �� ���� �����] = ���. �� �迭
		int[] people = new int[n+1];
		int[] pre = new int[n+1];
		
		for(int i = 1; i <= n; i++) {
			people[i] = Integer.parseInt(st.nextToken());
			pre[i] = Integer.parseInt(st1.nextToken());
		}//for
		
		//�ʱⰪ
		 
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= k; j++) {
				if(people[i] <= j) {
					dp[i][j] = Math.max(dp[i-1][j-people[i]]+pre[i], dp[i-1][j]);
				} else {
					dp[i][j] = dp[i-1][j];
				}
			}//for
		}//for
		System.out.println(dp[n][k]);
	}

}
