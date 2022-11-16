package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class codingtest1 {

	public static void main(String[] args) throws IOException {
////		알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 
////		단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 
////		포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
//
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////		먼저 배열 하나를 만들어서 전부 -1로 초기화 시키자.
//		int[] arr = new int[26];
//		for(int i=0; i< arr.length; i++) {
//			arr[i] = -1;
//		}
//		
//		String S = br.readLine();
//		
//		for(int i = 0; i<S.length(); i++) {
//			char ch = S.charAt(i);
//			
//			if(arr[ch - 'a'] == -1) {// arr 원소값이 -1인 경우에만 초기화
//				arr[ch - 'a'] = i;
//			}
//		}
//		for(int val : arr) {
//			System.out.print(val+" ");
//		}
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n = br.read();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	
		for(int i=1; i<10; i++) {
			System.out.println(n+" "+"*"+" "+i+" "+"="+" "+n*i);
		}
	}

}
