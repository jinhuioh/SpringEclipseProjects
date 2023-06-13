package codingtest;

import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;
import javax.management.Query;
import javax.swing.JPopupMenu.Separator;

//피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.
//
//이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n ≥ 2)가 된다.
//
//n=17일때 까지 피보나치 수를 써보면 다음과 같다.
//
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
//
//n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 n이 주어진다. n은 20보다 작거나 같은 자연수 또는 0이다.
//
//출력
//첫째 줄에 n번째 피보나치 수를 출력한다.

//1. 재귀를 사용한 방법
//2. dp를 사용한 방법

public class Main {
	public static void main(String[] args)throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[n+2];
		dp[0] = 0;
		dp[1] = 1;
		if(n>=2) {
			for(int i=2; i<=n+1; i++) {
				dp[i] = dp[i-1]+dp[i-2];
//				System.out.println(dp[i]);
			}//for
		}
		System.out.println(dp[n]);
	}
}


