package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codingTest3 {
//	����
//	� �ڿ��� N�� �׺��� �۰ų� ���� ���������� ������ ��Ÿ�� �� �ִ�. ���� ��� 11=32+12+12(3�� ��)�̴�. �̷� ǥ������� ���� ������ �� �� �ִµ�, 
//	11�� ��� 11=22+22+12+12+12(5�� ��)�� �����ϴ�. �� ���, ������ ��ũ���׽��� ��11�� 3�� ���� ������ ������ ǥ���� �� �ִ�.����� ���Ѵ�.
//	���� 11�� �׺��� ���� ���� ������ ������ ǥ���� �� �����Ƿ�, 11�� �� �����ν� ǥ���� �� �ִ� ������ ���� �ּ� ������ 3�̴�.
//
//	�־��� �ڿ��� N�� �̷��� ���������� ������ ǥ���� ���� �� ���� �ּҰ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//	�Է�
//	ù° �ٿ� �ڿ��� N�� �־�����. (1 �� N �� 100,000)
//
//	���
//	�־��� �ڿ����� �������� ������ ��Ÿ�� ���� �� ������ ���� �ּ� ������ ����Ѵ�.
	public static void main(String[] args) throws NumberFormatException, IOException {
//		System.out.println(Math.floor(Math.sqrt(7)));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		//���亯��
		int[] dp = new int[100001];
		dp[1]=1;//�ʱⰪ
		
		//2���� ä��� ����!!
		for(int i = 2; i<=num; i++) {
			dp[i]=i;//�ϴ� �ڱ� �ڽ����� �ʱ�ȭ
//			System.out.println("for������~~ dp[i]>>"+dp[i]);
			for(int j=1; j*j<=i; j++) {
				//�ּ����� ������ ã�� ���ؼ� ���� �� ���� ��ȭ�İ��� ���Ͽ� �ּڰ��� ���Ѵ�.
//				System.out.println("i�� j>> "+i+" "+j+" dp[i]>>> "+dp[i]+" (dp[i-(j*j)]+1)>>> "+(dp[i-(j*j)]+1));
				dp[i] = Math.min(dp[i-(j*j)]+1,dp[i]);
//				System.out.println("dp[i]�� �̰ɷ� ��÷! "+dp[i]);
			}
		}
		System.out.println(dp[num]);
	}

}

