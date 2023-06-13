package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class codingTest5 {
//	https://st-lab.tistory.com/141
		
	//dp
//	입력
//	첫 줄에 물품의 수 N(1 ≤ N ≤ 100)과 준서가 버틸 수 있는 무게 K(1 ≤ K ≤ 100,000)가 주어진다. 
//	두 번째 줄부터 N개의 줄에 거쳐 각 물건의 무게 W(1 ≤ W ≤ 100,000)와 해당 물건의 가치 V(0 ≤ V ≤ 1,000)가 주어진다.
//	입력으로 주어지는 모든 수는 정수이다.
//
//	출력
//	한 줄에 배낭에 넣을 수 있는 물건들의 가치합의 최댓값을 출력한다.
//
//	예제 입력 1 
//	4 7
//	6 13
//	4 8
//	3 6
//	5 12
//	예제 출력 1 
//	14
	static Integer[][] dp;
	static int[] w;
	static int[] v;
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
 
		int[] W = new int[N + 1]; // 무게
		int[] V = new int[N + 1]; // 가치
		int[] dp = new int[K + 1];
 
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			W[i] = Integer.parseInt(st.nextToken());
			V[i] = Integer.parseInt(st.nextToken());
		}
 
		for (int i = 1; i <= N; i++) {
			// K부터 탐색하여(마지막부터 탐색하여) 담을 수 있는 무게 한계치가 넘지 않을 때까지 반복 
			for (int j = K; j - W[i] >= 0; j--) {
				dp[j] = Math.max(dp[j], dp[j - W[i]] + V[i]);
			}
		}
		System.out.println(dp[K]);
	}
}