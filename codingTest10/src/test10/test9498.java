package test10;

import java.util.Scanner;

//시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B,
//70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
//첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
public class test9498 {

	public static void main(String[] args) {
//	시험점수를 입력받아보자!
//		객체 생성
		Scanner scan = new Scanner(System.in);
//		입력받기
		String num1 = scan.next();
//		형변환
		int A = Integer.parseInt(num1);
		
		if(0 <= A && A <= 100) {
			if(60 <= A && A <= 69) {
				System.out.println("D");
			}else if(70 <= A && A <= 79) {
				System.out.println("C");
			}else if(80 <= A && A <= 89) {
				System.out.println("B");
			}else if(90 <= A && A <= 100) {
				System.out.println("A");
			}else {
				System.out.println("F");
			}
		}//if
	}

}
