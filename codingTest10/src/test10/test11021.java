package test10;

import java.util.Scanner;

//문제
//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 테스트 케이스의 개수 T가 주어진다.
//
//각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
//
//출력
//각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
public class test11021 {

	public static void main(String[] args) {

		//값을 입력받을 객체 생성
		Scanner scan = new Scanner(System.in);
		String T = scan.nextLine();
		int t = Integer.parseInt(T);
		//for문을 돌려 2개의 값을 입력받고 출력하자
		for (int i=1; i<t+1; i++) {
			//배열 생성하여 scan.nextLine()의 값을 공백 제거 후 넣어준다.
			String[] strs = scan.nextLine().split(" ");
			//넣을 두 값 생성
			int A = Integer.parseInt(strs[0]);
			int B = Integer.parseInt(strs[1]);
			if(0 < A && B < 10) {
				//Case #1: 2 이런식으로 출력되어야 함.
				System.out.println("Case #"+i+": "+(A+B));
			}
		}
	}

}
