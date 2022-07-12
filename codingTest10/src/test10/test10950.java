package test10;

import java.util.Scanner;

import com.sun.glass.ui.CommonDialogs.Type;

//문제
//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 테스트 케이스의 개수 T가 주어진다.
//
//각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
//
//출력
//각 테스트 케이스마다 A+B를 출력한다.
public class test10950 {

	public static void main(String[] args) {
//	 	scanner객체 생성(값 입력받기 위해)
//		값 입력 받기
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int x=1; x=T; x++){
			int A = scan.nextInt();
			int B = scan.nextInt();

			if (0 < A && B < 10) {
				System.out.println(A+B);
			}//for
		}//if
		
	}


}
