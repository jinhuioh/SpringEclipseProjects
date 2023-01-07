package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class codingTest5 {
//	문제
//	안녕
//	세준이는 성형수술을 한 후에 병원에 너무 오래 입원해 있었다. 이제 세준이가 병원에 입원한 동안 자기를 생각해준 사람들에게 감사하다고 말할 차례이다.
//
//	세준이를 생각해준 사람은 총 N명이 있다. 사람의 번호는 1번부터 N번까지 있다. 세준이가 i번 사람에게 인사를 하면 L[i]만큼의 체력을 잃고, J[i]만큼의 기쁨을 얻는다. 세준이는 각각의 사람에게 최대 1번만 말할 수 있다.
//
//	세준이의 목표는 주어진 체력내에서 최대한의 기쁨을 느끼는 것이다. 세준이의 체력은 100이고, 기쁨은 0이다. 만약 세준이의 체력이 0이나 음수가 되면, 죽어서 아무런 기쁨을 못 느낀 것이 된다. 세준이가 얻을 수 있는 최대 기쁨을 출력하는 프로그램을 작성하시오.
//
//	입력
//	첫째 줄에 사람의 수 N(≤ 20)이 들어온다. 둘째 줄에는 각각의 사람에게 인사를 할 때, 잃는 체력이 1번 사람부터 순서대로 들어오고, 셋째 줄에는 각각의 사람에게 인사를 할 때, 얻는 기쁨이 1번 사람부터 순서대로 들어온다. 체력과 기쁨은 100보다 작거나 같은 자연수 또는 0이다.
//
//	출력
//	첫째 줄에 세준이가 얻을 수 있는 최대 기쁨을 출력한다.
//
//	예제 입력 1 
//	3
//	1 21 79
//	20 30 25
//	예제 출력 1 
//	50
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		
		int k = 99;
		int[][] dp = new int[n+1][k+1];//[n번째 사람][n번째 사람의 채력을 뺀 남은 생명력] = 기쁨. 인 배열
		int[] people = new int[n+1];
		int[] pre = new int[n+1];
		
		for(int i = 1; i <= n; i++) {
			people[i] = Integer.parseInt(st.nextToken());
			pre[i] = Integer.parseInt(st1.nextToken());
		}//for
		
		//초기값
		 
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
