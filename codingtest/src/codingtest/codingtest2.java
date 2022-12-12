package codingtest;

import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//
public class codingtest2 {
	public static void main(String[] args) throws IOException {
//	BABBA dp방식
	
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int k = Integer.parseInt(br.readLine());
//		//[0][n] : A
//		//[1][n] : B
//		int [][] dp =new int[2][46];
//		System.out.println(dp);
//		
////		한 번 눌렀을 때 B 1 개
//		dp[1][1] = 1;
////		두 번눌렀을 때 A,B각 1개
//		dp[0][2] = 1; //A
//		dp[1][2] = 1; //B
//		
////		A와 B가 각각 피보나치
//		for(int i=3; i<=k; i++) {
//			dp[0][i] = dp[0][i-2] + dp[0][i-1];//이전값들의 합이 다음 A의 값
//			dp[1][i] = dp[1][i-2] + dp[1][i-1];//이전값들의 합이 다음 B의 값
//		}//for
//		
////		A,B의 개수를 출력
//		System.out.println(dp[0][k]+" "+dp[1][k]);


		
//		돌 게임 2
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int num = Integer.parseInt(br.readLine());
//		if(num %2 ==1) {
//			System.out.println("CY");
//		}
//		else {
//			System.out.println("SK");
			
//		이친수
//		이친수는 0으로 시작하지 않는다.
//		이친수에서는 1이 두 번 연속으로 나타나지 않는다. 즉, 11을 부분 문자열로 갖지 않는다.
		
//		n이 주어졌을 때 n자리 이친수의 개수를 구해보자. n의 범위는 1부터90
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int n = Integer.parseInt(br.readLine());
//		
////		dp로 풀어보자 // long으로 해야 함! int로 하면 21억 자리수가 넘어가서 오류가난다. 
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
		
//		악수
//		마지막 자리만 출력
//		dp로 풀어보자
		
//		연습용
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
		
//		리스트생성
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
