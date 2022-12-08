package codingtest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;
//
public class codingtest2 {
//	//함수선언
//	static int solve(long n) {
//	    long sum = 0;
//	    int addNum = 0;
//	    while(n >= sum) {
//	        sum += (++addNum);
//	    }
//
//	    return sum == n ? addNum : addNum - 1;
//	}
//	
	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		long n = Long.parseLong(br.readLine());
//
//	    System.out.println(solve(n));
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String nstr = br.readLine();
		int sum = 0;

//		해당 숫자 재배치 시작
		char[] charArr = nstr.toCharArray();
		Arrays.sort(charArr);//오름차순 정렬
		int len = charArr.length;
		
		StringBuilder sb = new StringBuilder();
		
//		오름차순 정렬이므로, 맨 끝 원소부터 반대로 탐색
		for(int i= len-1; i>= 0; i--) {
			int num = charArr[i] - '0';
//			각 자리수를 더했을 때 3의 배수이면 해당 숫자가 3의 배수이므로 sum변수에 각 자리수의 합을 담음
			sum +=num;
//			StringBuilder로 스트링 값 한개씩 붙임
			sb.append(num);
			
		}
		
//		30의 배수인지 판단하기 위한 조건 생성
		
		if(charArr[0] != '0' || sum % 3 != 0) {//만약 3의 배수가 아니라면
//			-1을 출력
			System.out.println(-1);
			return;
		}
		
		System.out.println(sb.toString());
	}
 
}
