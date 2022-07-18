package test10;

import java.util.Scanner;

import com.sun.glass.ui.CommonDialogs.Type;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

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
// 입력값을 한번에 리스트로 받아서.. 한번에 결과값들 출력하는걸로 해보고싶은데 이 경우 값을 한번에 입력받아
//출력하는 buffer을 이용하면 된다!!
//==> 15552에 답 적어놓음!
public class test10950 {

	public static void main(String[] args) {
//		scanner객체 생성(값 입력받기 위해)
//		값 입력 받기
		Scanner scan = new Scanner(System.in);
		String T1 = scan.next();
		int T = Integer.parseInt(T1);
		int A,B;
		for(int i=0; i<T; i++) {
			A = scan.nextInt();
			B = scan.nextInt();
			
			if(0 < A && B < 10) {
				System.out.println(A+B);
			}//if
		}//for
		
	}//public

}
