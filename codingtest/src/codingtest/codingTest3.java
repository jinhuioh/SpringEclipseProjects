package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codingTest3 {
//	문제
//	어떤 자연수 N은 그보다 작거나 같은 제곱수들의 합으로 나타낼 수 있다. 예를 들어 11=32+12+12(3개 항)이다. 이런 표현방법은 여러 가지가 될 수 있는데, 
//	11의 경우 11=22+22+12+12+12(5개 항)도 가능하다. 이 경우, 수학자 숌크라테스는 “11은 3개 항의 제곱수 합으로 표현할 수 있다.”라고 말한다.
//	또한 11은 그보다 적은 항의 제곱수 합으로 표현할 수 없으므로, 11을 그 합으로써 표현할 수 있는 제곱수 항의 최소 개수는 3이다.
//
//	주어진 자연수 N을 이렇게 제곱수들의 합으로 표현할 때에 그 항의 최소개수를 구하는 프로그램을 작성하시오.
//
//	입력
//	첫째 줄에 자연수 N이 주어진다. (1 ≤ N ≤ 100,000)
//
//	출력
//	주어진 자연수를 제곱수의 합으로 나타낼 때에 그 제곱수 항의 최소 개수를 출력한다.
	public static void main(String[] args) throws NumberFormatException, IOException {
//		System.out.println(Math.floor(Math.sqrt(7)));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		//정답변수
		int[] dp = new int[100001];
		dp[1]=1;//초기값
		
		//2부터 채우기 시작!!
		for(int i = 2; i<=num; i++) {
			dp[i]=i;//일단 자기 자신으로 초기화
//			System.out.println("for문시작~~ dp[i]>>"+dp[i]);
			for(int j=1; j*j<=i; j++) {
				//최소항의 개수를 찾기 위해서 저장 된 값과 점화식값을 비교하여 최솟값을 구한다.
//				System.out.println("i와 j>> "+i+" "+j+" dp[i]>>> "+dp[i]+" (dp[i-(j*j)]+1)>>> "+(dp[i-(j*j)]+1));
				dp[i] = Math.min(dp[i-(j*j)]+1,dp[i]);
//				System.out.println("dp[i]는 이걸로 당첨! "+dp[i]);
			}
		}
		System.out.println(dp[num]);
	}

}

