package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class codingTest4 {
//	����
//	������ü ����� ���ڰ� �Ϸķ� �þ �ִ�. ���ڸ��� ũ�Ⱑ �־��� �ִµ�, �տ� �ִ� ������ ũ�Ⱑ �ڿ� �ִ� ������ ũ�⺸�� ������, �տ� �ִ� ���ڸ� �ڿ� �ִ� ���� �ȿ� ���� ���� �ִ�. 
//	���� ��� �տ������� ������� ũ�Ⱑ (1, 5, 2, 3, 7)�� 5���� ���ڰ� �ִٸ�, ũ�� 1�� ���ڸ� ũ�� 5�� ���ڿ� �ְ�, �ٽ� �� ���ڸ� ũ�� 7�� ���� �ȿ� ���� �� �ִ�. 
//	������ �̷��� ���ڸ� ���� �� �ִ� ����� ���� ������ ���� �� �ִ�. ���� ������ ���ʴ�� ũ�Ⱑ 1, 2, 3, 7�� ���ڸ� �����ϸ� �� 4���� ���ڰ� �� ���� ���ڿ� ���� �ȴ�.
//
//	������ ũ�Ⱑ �־��� ��, �� ���� ���� �� �ִ� �ִ��� ���� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//	�Է�
//	������ ù ��° ���� ������ ���� n (1 �� n �� 1000)�� ��Ÿ����. �� ��° �ٿ��� �� ������ ũ�Ⱑ ������� �־�����. ������ ũ��� 1,000�� ���� �ʴ� �ڿ����̴�.
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] map = new int[n];
		int[] dp = new int[n];// st�� ������ ���ں��� ������ �Ѿ���鼭 �� ���ڸ� �־��� ���� max���� math�Լ��� ��!!
		
		for(int i=0; i<n; i++) {
			map[i] = Integer.parseInt(st.nextToken());
		}//for
		//�ʱⰪ�� 1�� ���� �ʱ�ȭ
		Arrays.fill(dp, 1);
		//���亯��
		int answer = 0;
		for(int i=1; i<n; i++) {
			for(int j=0; j<i; j++) {
				//���簪�� ���� ���麸�� ũ�� ����
				if(map[i] > map[j]) {
					dp[i] = Math.max(dp[i], dp[j]+1);
//				System.out.println("i> "+i+" "+"J> "+j+"dp[i]> "+dp[i]+"dp[j]+1> "+(dp[j]+1));
				}//if
			}//for
			answer = Math.max(answer, dp[i]);
		}//for
		System.out.println(answer);

	}
}