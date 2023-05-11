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
//첫째 줄에 Hamming Distance의 합이 가장 작은 DNA 를 출력하고, 둘째 줄에는 그 Hamming Distance의 합을 출력하시오. 
//그러한 DNA가 여러 개 있을 때에는 사전순으로 가장 앞서는 것을 출력한다.
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
	static int n, m, b_answer, f_answer;
	static String[] b_arr, f_arr;
	static int[] b_count_arr, f_count_arr;
	
	//Hamming Distance의 합 구하기.
	private static int dna(int index, String[] arr) {
		String mid_dna = arr[index];
		int sum = 0;
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<m/2; j++) {
				if(mid_dna.charAt(j) != arr[i].charAt(j)) {
					sum++;
				}
				
			}
				
		}
		
		return sum;
	}
	
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		b_arr = new String[n];
		f_arr = new String[n];
		
		for(int i = 0; i<n; i++) {
			String s = br.readLine();
			f_arr[i] = s.substring(0,m/2);//string 슬라이싱.
			b_arr[i] = s.substring(m/2);
		}//for
	
		//정렬
		Arrays.sort(f_arr);
		Arrays.sort(b_arr);
		
		f_count_arr = new int[n];
		b_count_arr = new int[n];
		for(int i = 0; i<n; i++) {
			int f_count = dna(i, f_arr);
			f_count_arr[i] = f_count;
			int b_count = dna(i, b_arr);
			b_count_arr[i] = b_count;
		}
		//답
		f_answer = Integer.MAX_VALUE;
		b_answer = Integer.MAX_VALUE;
		String f_answer_dna = null;
		String b_answer_dna = null;
		for(int i = 0; i<n; i++) {
			if(f_count_arr[i] < f_answer) {
				f_answer = f_count_arr[i];
				f_answer_dna = f_arr[i];
			}
			if(b_count_arr[i] < b_answer) {
				b_answer = b_count_arr[i];
				b_answer_dna = b_arr[i];
			}
			
		}
		System.out.println(f_answer_dna + b_answer_dna);
		System.out.println(f_answer + b_answer);
		
	}
}


