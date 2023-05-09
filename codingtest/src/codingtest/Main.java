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
//차이를 최대로
//입력
//첫째 줄에 N (3 ≤ N ≤ 8)이 주어진다. 둘째 줄에는 배열 A에 들어있는 정수가 주어진다. 배열에 들어있는 정수는 -100보다 크거나 같고, 100보다 작거나 같다.
//
//출력
//첫째 줄에 배열에 들어있는 수의 순서를 적절히 바꿔서 얻을 수 있는 식의 최댓값을 출력한다.

//예제 입력 1 
//6
//20 1 15 8 4 10
//예제 출력 1 
//62

public class Main {
	static boolean[] visited;
	static int[] arr, change_arr;
	static int n, max_sum, sum;//숫자의 개수 
	//만들함수: 1. sum() : change_arr 순서대로 연산하며 합한 값 구하는 함수
	//		 2. dfs(int x) : change_arr 을 만드는 함수. 즉 arr에 들어있는 숫자 순서 바꾸는 dfs
	
	private static int sum() {
		int abs_sum = 0;
		for(int i = 1; i<n; i++) {
			abs_sum += Math.abs(change_arr[i] - change_arr[i-1]);
		}
		
		return abs_sum;
	}
	private static void dfs(int x) {
		if(x == n) {
			max_sum = Math.max(max_sum, sum());
		}
		for(int i = 0; i<n; i++) {
			if(!visited[i]) {
				change_arr[x] = arr[i];
				visited[i] = true;
				dfs(x+1);
				visited[i] = false;
			}
		}
	}
	
	public static void main(String[] args)throws Exception {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n];
		change_arr = new int[n];
		visited = new boolean[n];
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}//for
		
		dfs(0);
		System.out.println(max_sum);
	}
}
