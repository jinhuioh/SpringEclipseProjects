package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//
public class codingtest2 {
	public static void main(String[] args) throws IOException {
//	BABBA dp방식
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int k = Integer.parseInt(br.readLine());
		//[0][n] : A
		//[1][n] : B
		int [][] dp =new int[2][46];
		System.out.println(dp);
		
//		한 번 눌렀을 때 B 1 개
		dp[1][1] = 1;
//		두 번눌렀을 때 A,B각 1개
		dp[0][2] = 1; //A
		dp[1][2] = 1; //B
		
//		A와 B가 각각 피보나치
		for(int i=3; i<=k; i++) {
			dp[0][i] = dp[0][i-2] + dp[0][i-1];//이전값들의 합이 다음 A의 값
			dp[1][i] = dp[1][i-2] + dp[1][i-1];//이전값들의 합이 다음 B의 값
		}//for
		
//		A,B의 개수를 출력
		System.out.println(dp[0][k]+" "+dp[1][k]);


	}
 
}
