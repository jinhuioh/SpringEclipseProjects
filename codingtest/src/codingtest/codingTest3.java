package codingtest;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import javax.swing.plaf.SliderUI;

//문제
//N이 주어졌을 때, 1부터 N까지의 수로 이루어진 순열을 사전순으로 출력하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 N(1 ≤ N ≤ 8)이 주어진다. 
//
//출력
//첫째 줄부터 N!개의 줄에 걸쳐서 모든 순열을 사전순으로 출력한다.
//
//예제 입력 1 
//3
//예제 출력 1 
//1 2 3
//1 3 2
//2 1 3
//2 3 1
//3 1 2
//3 2 1

public class codingTest3 {
	static int n;
	static int[] arr, change_arr;
	static boolean[] visited;
	private static void dfs(int index) {
		if(index == n) {
			for(int i = 0; i < n; i++) {
				System.out.print(change_arr[i]+" ");
			}
			System.out.println();
		}//if
		for(int i = 0; i < n; i++) {
			if(!visited[i]) {
				
				visited[i] = true;
				change_arr[index] = arr[i];
				dfs(index+1);
				visited[i] = false;
				
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		visited = new boolean[n];
		arr = new int[n];
		change_arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = i+1; 
		}
		dfs(0);
		
	}
}