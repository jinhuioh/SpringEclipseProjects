package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class codingtest1 {

	public static void main(String[] args) throws IOException {
////		���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. ������ ���ĺ��� ���ؼ�, 
////		�ܾ ���ԵǾ� �ִ� ��쿡�� ó�� �����ϴ� ��ġ��, 
////		���ԵǾ� ���� ���� ��쿡�� -1�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////		���� �迭 �ϳ��� ���� ���� -1�� �ʱ�ȭ ��Ű��.
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
//			if(arr[ch - 'a'] == -1) {// arr ���Ұ��� -1�� ��쿡�� �ʱ�ȭ
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
