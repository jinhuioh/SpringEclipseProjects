package codingtest;

import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//
public class codingtest2 {
	public static void main(String[] args) throws IOException {
//	BABBA dp���
	
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int k = Integer.parseInt(br.readLine());
//		//[0][n] : A
//		//[1][n] : B
//		int [][] dp =new int[2][46];
//		System.out.println(dp);
//		
////		�� �� ������ �� B 1 ��
//		dp[1][1] = 1;
////		�� �������� �� A,B�� 1��
//		dp[0][2] = 1; //A
//		dp[1][2] = 1; //B
//		
////		A�� B�� ���� �Ǻ���ġ
//		for(int i=3; i<=k; i++) {
//			dp[0][i] = dp[0][i-2] + dp[0][i-1];//���������� ���� ���� A�� ��
//			dp[1][i] = dp[1][i-2] + dp[1][i-1];//���������� ���� ���� B�� ��
//		}//for
//		
////		A,B�� ������ ���
//		System.out.println(dp[0][k]+" "+dp[1][k]);


		
//		�� ���� 2
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int num = Integer.parseInt(br.readLine());
//		if(num %2 ==1) {
//			System.out.println("CY");
//		}
//		else {
//			System.out.println("SK");
			
//		��ģ��
//		��ģ���� 0���� �������� �ʴ´�.
//		��ģ�������� 1�� �� �� �������� ��Ÿ���� �ʴ´�. ��, 11�� �κ� ���ڿ��� ���� �ʴ´�.
		
//		n�� �־����� �� n�ڸ� ��ģ���� ������ ���غ���. n�� ������ 1����90
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int n = Integer.parseInt(br.readLine());
//		
////		dp�� Ǯ��� // long���� �ؾ� ��! int�� �ϸ� 21�� �ڸ����� �Ѿ�� ����������. 
//		long[] dp = new long[91];
//		dp[0] = 0;
//		dp[1] = 1;
//		dp[2] = 1;
//		
//		for(int i=0; i<n-2; i++) {
//			dp[i+3] = dp[i+1] + dp[i+2];
//		}
//		
//		System.out.println(dp[n]);
//		
		
//		�Ǽ�
//		������ �ڸ��� ���
//		dp�� Ǯ���
		
//		������
//		int [] dp = new int[3];
//		dp[0] = 10022;
//		dp[1] = 20000;
//		dp[2] = 20000;
//		if(dp[2]>10000) {
//			String dpWord = Integer.toString(dp[2]);
//			System.out.println(dpWord);
//			int chardp = (dpWord.charAt(dpWord.length()-1)-'0');
//			System.out.println(chardp);
//		}
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
//		����Ʈ����
		int [] dp = new int[10000001];
		dp[1] = 0;
		dp[2] = 2;
		dp[3] = 3;
		for(int i=0; i<num-3; i++) {
			dp[i+4] = dp[i+3] + dp[i+2];
			if(dp[i+4]>10000) {
				String dpWord = Integer.toString(dp[i+4]);
				int chardp = (dpWord.charAt(dpWord.length()-1)-'0');
				dp[i+4] = chardp;
			}
		}
		String dpAnswer = Integer.toString(dp[num]);
		int answer = (dpAnswer.charAt(dpAnswer.length()-1)-'0');
		System.out.println(answer);
	}
 
}
