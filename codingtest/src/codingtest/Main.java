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
//문제
//DNA란 어떤 유전물질을 구성하는 분자이다. 이 DNA는 서로 다른 4가지의 뉴클레오티드로 이루어져 있다(Adenine, Thymine, Guanine, Cytosine). 
//우리는 어떤 DNA의 물질을 표현할 때, 이 DNA를 이루는 뉴클레오티드의 첫글자를 따서 표현한다. 만약에 Thymine-Adenine-Adenine-Cytosine-Thymine-Guanine-Cytosine-Cytosine-Guanine-Adenine-Thymine로 이루어진 DNA가 있다고 하면, “TAACTGCCGAT”로 표현할 수 있다. 
//그리고 Hamming Distance란 길이가 같은 두 DNA가 있을 때, 각 위치의 뉴클오티드 문자가 다른 것의 개수이다. 만약에 “AGCAT"와 ”GGAAT"는 첫 번째 글자와 세 번째 글자가 다르므로 Hamming Distance는 2이다.
//
//우리가 할 일은 다음과 같다. N개의 길이 M인 DNA s1, s2, ..., sn가 주어져 있을 때 Hamming Distance의 합이 가장 작은 DNA s를 구하는 것이다. 즉, s와 s1의 Hamming Distance + s와 s2의 Hamming Distance + s와 s3의 Hamming Distance ... 의 합이 최소가 된다는 의미이다.
//
//입력
//첫 줄에 DNA의 수 N과 문자열의 길이 M이 주어진다. 그리고 둘째 줄부터 N+1번째 줄까지 N개의 DNA가 주어진다. N은 1,000보다 작거나 같은 자연수이고, M은 50보다 작거나 같은 자연수이다.
//
//출력
//첫째 줄에 Hamming Distance의 합이 가장 작은 DNA 를 출력하고, 둘째 줄에는 그 Hamming Distance의 합을 출력하시오. 그러한 DNA가 여러 개 있을 때에는 사전순으로 가장 앞서는 것을 출력한다.
//
//예제 입력 1 
//5 8
//TATGATAC
//TAAGCTAC
//AAAGATCC
//TGAGATAC
//TAAGATGT
//예제 출력 1 
//TAAGATAC
//7

public class Main {
	public static void main(String[] args)throws Exception {

	}
}


//public class Main {
//	static boolean[] visited;
//	static int[] arr, change_arr;
//	static int n, max_sum, sum;//숫자의 개수 
//	//만들함수: 1. sum() : change_arr 순서대로 연산하며 합한 값 구하는 함수
//	//		 2. dfs(int x) : change_arr 을 만드는 함수. 즉 arr에 들어있는 숫자 순서 바꾸는 dfs
//	
//	private static int sum() {
//		int abs_sum = 0;
//		for(int i = 1; i<n; i++) {
//			abs_sum += Math.abs(change_arr[i] - change_arr[i-1]);
//		}
//		
//		return abs_sum;
//	}
//	private static void dfs(int x) {
//		if(x == n) {
//			max_sum = Math.max(max_sum, sum());
//		}
//		for(int i = 0; i<n; i++) {
//			if(!visited[i]) {
//				change_arr[x] = arr[i];
//				visited[i] = true;
//				dfs(x+1);
//				visited[i] = false;
//			}
//		}
//	}
//	
//	public static void main(String[] args)throws Exception {
//		Scanner sc = new Scanner(System.in);
//		n = sc.nextInt();
//		arr = new int[n];
//		change_arr = new int[n];
//		visited = new boolean[n];
//		for(int i = 0; i<n; i++) {
//			arr[i] = sc.nextInt();
//		}//for
//		
//		dfs(0);
//		System.out.println(max_sum);
//	}
//}
