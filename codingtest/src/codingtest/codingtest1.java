package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class codingtest1 {

	public static void main(String[] args) throws IOException {
//		=========================================================================
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
		
//		=========================================================================
//		스트림으로부터 한 문자를 읽어서 int형으로 리턴 ('3' -> (int)'3' -> 51) 하기때문에 버퍼로 2를 입력하면 '2'의 숫자값을 리턴해줌
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
		
//		int n = br.read();
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//	
//		for(int i=1; i<10; i++) {
//			System.out.println(n+" "+"*"+" "+i+" "+"="+" "+n*i);
//		}
//		
		
		
//		=========================================================================
		//문제
		//세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
		//
		//예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고, 계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
		//
		//입력
		//첫째 줄에 A, 둘째 줄에 B, 셋째 줄에 C가 주어진다. A, B, C는 모두 100보다 크거나 같고, 1,000보다 작은 자연수이다.
		Scanner in = new Scanner(System.in);
		
		int value = (in.nextInt() * in.nextInt() * in.nextInt());
		String str = Integer.toString(value);
		in.close();
		
		for(int i = 0; i < 10; i++) {
			int count = 0;
			for(int j = 0; j < str.length(); j++) {
				if((str.charAt(j)-'0')==i) {
					count++;
				}
			}
			System.out.println(count);
		}
	
	}

}
