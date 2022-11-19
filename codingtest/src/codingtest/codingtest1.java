package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

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
//		Scanner in = new Scanner(System.in);
//		
//		int value = (in.nextInt() * in.nextInt() * in.nextInt());
//		String str = Integer.toString(value);
//		in.close();
//		
//		for(int i = 0; i < 10; i++) {
//			int count = 0;
//			for(int j = 0; j < str.length(); j++) {
//				if((str.charAt(j)-'0')==i) {
//					count++;
//				}
//			}
//			System.out.println(count);
//		}
		
//		=========================================================================
//		나머지
//		(A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
//
//				(A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
//
//				세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
//
//				입력
//				첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)
//
//				출력
//				첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
		

//		풀이:
//			BufferedReader 을 쓰는 방식이다.
//			readLine() 을 통해 입력 받아 연산하는 방법 두 가지를 설명할 것이다.
//			앞서 말했듯이 readLine() 은 한 행을 전부 읽기 때문에 공백단위로 입력해 준 문자열을 공백단위로 분리해주어야 문제를 풀 수 있을 것이다.
//			문자열 분리 방법 두 가지로 풀어보자.
//			1. StringTokenizer 클래스를 이용하여 분리해주는 방법
//			2. split() 을 이용하는 방법
//			그리고 반드시 자료형 타입을 잘 보아야 한다.
//			st.nextToken() 은 문자열을 반환하니 Integer.parseInt()로 int 형으로 변환시켜준다.
//			(double 형으로 풀면 나머지가 정수로 나와도 소수점까지 같이 출력되어 오답으로 처리된다.)

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		//str변수에 입력받고 공백으로 문자열 분리
//		String str = br.readLine();
//		StringTokenizer st = new StringTokenizer(str," ");
//		
//		//공백으로 분리한 문자를 a,b,c객체에 하나씩 할당.
//		int a = Integer.parseInt(st.nextToken());
//		int b = Integer.parseInt(st.nextToken());
//		int c = Integer.parseInt(st.nextToken());
//		
//		System.out.println((a+b)%c);
//		System.out.println((a%c + b%c)%c);
//		System.out.println((a*b)%c);
//		System.out.println((a%c * b%c)%c);
		
//		=========================================================================
//		문제
//		정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
//
//		입력
//		첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
//
//		둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
//
//		출력
//		X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.
//
//		예제 입력 1 
//		10 5
//		1 10 4 9 2 3 8 5 7 6
//		예제 출력 1 
//		1 4 2 3
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
//		첫째줄입력
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		
//		둘째줄 입력
		st = new StringTokenizer(br.readLine()," ");
		
//		b보다 작은 값 담는 객체
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<a; i++){
			int value = Integer.parseInt(st.nextToken());
			
			if(value < b) {
				sb.append(value).append(" ");
			}
		}
		System.out.println(sb);
	}

}
