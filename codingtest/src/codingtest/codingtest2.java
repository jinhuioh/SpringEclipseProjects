package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//
public class codingtest2 {
	public static void main(String[] args) throws IOException {
//	BABBA dp���
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int k = Integer.parseInt(br.readLine());
		//[0][n] : A
		//[1][n] : B
		int [][] dp =new int[2][46];
		System.out.println(dp);
		
//		�� �� ������ �� B 1 ��
		dp[1][1] = 1;
//		�� �������� �� A,B�� 1��
		dp[0][2] = 1; //A
		dp[1][2] = 1; //B
		
//		A�� B�� ���� �Ǻ���ġ
		for(int i=3; i<=k; i++) {
			dp[0][i] = dp[0][i-2] + dp[0][i-1];//���������� ���� ���� A�� ��
			dp[1][i] = dp[1][i-2] + dp[1][i-1];//���������� ���� ���� B�� ��
		}//for
		
//		A,B�� ������ ���
		System.out.println(dp[0][k]+" "+dp[1][k]);


	}
 
}
