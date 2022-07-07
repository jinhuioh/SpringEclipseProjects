package test10;

import java.util.Scanner;

//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
//첫째 줄에 A+B를 출력한다.
public class test1000 {

	public static void main(String[] args) {
//		객체 생성
		Scanner scan = new Scanner(System.in);
//      값 입력받기		
		String sum1 = scan.next();
		String sum2 = scan.next();
//		입력받은 값을 int로 변환
		int A = Integer.parseInt(sum1);
		int B = Integer.parseInt(sum2);
		
		if (0<A && B<10) {
			System.out.println(A+B);
		}
		
	}

}
