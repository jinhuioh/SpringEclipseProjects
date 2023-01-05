package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class codingTest4 {
//	문제
//	정육면체 모양의 상자가 일렬로 늘어서 있다. 상자마다 크기가 주어져 있는데, 앞에 있는 상자의 크기가 뒤에 있는 상자의 크기보다 작으면, 앞에 있는 상자를 뒤에 있는 상자 안에 넣을 수가 있다. 
//	예를 들어 앞에서부터 순서대로 크기가 (1, 5, 2, 3, 7)인 5개의 상자가 있다면, 크기 1인 상자를 크기 5인 상자에 넣고, 다시 이 상자를 크기 7인 상자 안에 넣을 수 있다. 
//	하지만 이렇게 상자를 넣을 수 있는 방법은 여러 가지가 있을 수 있다. 앞의 예에서 차례대로 크기가 1, 2, 3, 7인 상자를 선택하면 총 4개의 상자가 한 개의 상자에 들어가게 된다.
//
//	상자의 크기가 주어질 때, 한 번에 넣을 수 있는 최대의 상자 개수를 출력하는 프로그램을 작성하시오.
//
//	입력
//	파일의 첫 번째 줄은 상자의 개수 n (1 ≤ n ≤ 1000)을 나타낸다. 두 번째 줄에는 각 상자의 크기가 순서대로 주어진다. 상자의 크기는 1,000을 넘지 않는 자연수이다.
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] map = new int[n];
		int[] dp = new int[n];// st의 마지막 숫자부터 앞으로 넘어오면서 앞 숫자를 넣었을 때의 max값을 math함수로 비교!!
		
		for(int i=0; i<n; i++) {
			map[i] = Integer.parseInt(st.nextToken());
		}//for
		//초기값을 1로 전부 초기화
		Arrays.fill(dp, 1);
		//정답변수
		int answer = 0;
		for(int i=1; i<n; i++) {
			for(int j=0; j<i; j++) {
				//현재값이 이전 값들보다 크면 갱신
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