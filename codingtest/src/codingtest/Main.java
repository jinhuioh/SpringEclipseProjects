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

//입력
//첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스의 첫째 줄에는 n (1 ≤ n ≤ 100,000)이 주어진다. 
//다음 두 줄에는 n개의 정수가 주어지며, 각 정수는 그 위치에 해당하는 스티커의 점수이다. 연속하는 두 정수 사이에는 빈 칸이 하나 있다. 
//점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다. 
//
//출력
//각 테스트 케이스 마다, 2n개의 스티커 중에서 두 변을 공유하지 않는 스티커 점수의 최댓값을 출력한다.
//
//예제 입력 1 
//2
//5
//50 10 100 20 40
//30 50 70 10 60
//7
//10 30 10 50 100 20 40
//20 40 30 50 60 20 80
//예제 출력 1 
//260
//290

public class Main {
	public static void main(String[] args)throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//테스트케이스 개수
		for(int i = 0; i < n; i++) {
			int d = sc.nextInt();//스티커 개수
			int[][] dp = new int[2][d+1];
			
			for(int k = 0; k<2; k++) {
				for(int j = 1; j<d+1; j++) {
					dp[k][j] = sc.nextInt();
				}
			}//for
			for(int k = 2; k<d+1; k++) {
					dp[0][k] = Math.max(dp[1][k-2], dp[1][k-1])+dp[0][k];
					dp[1][k] = Math.max(dp[0][k-2], dp[0][k-1])+ dp[1][k];
					
//					for(int p = 0; p<2; p++) {
//						for(int l = 0; l<d; l++) {
//							System.out.print(dp[p][l]+" ");
//						}
//						System.out.println();
//					}
//					System.out.println();
			}//for
			int max_num = Math.max(dp[0][d], dp[1][d]);
			System.out.println(max_num);
		}//for
		
		
	}
}


