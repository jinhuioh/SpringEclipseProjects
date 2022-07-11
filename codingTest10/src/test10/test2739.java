package test10;

import java.util.Scanner;

//문제
//N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
//
//입력
//첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
//
//출력
//출력형식과 같게 N*1부터 N*9까지 출력한다.
public class test2739 {
//for문 사용
	public static void main(String[] args) {
//		값을 입력받는 내장객체 scanner 생성. 
		Scanner scan = new Scanner(System.in);
//		int 객체 생성
		int i = scan.nextInt();
//		입력받은 값i에 대해  1부터 9까지 곱하기 연산을 출력 
		for(int x=1; x<=9; x++) {
			System.out.println(i + " * " + x + " = " + (i*x));
		}
	}

}
