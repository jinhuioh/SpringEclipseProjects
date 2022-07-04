//코테 연습문제&기초문제 풀어보기!
package test10;

//import java.io.IOException;
//import java.io.InputStream;
import java.util.Scanner;

public class test1010 {

	public static void main(String[] args) {

//	두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
//	int A = 10;
//	int B = 20;

//InputStream으로 값 입력 받아서 해보기!
//	InputStream in = System.in;
//	int A, B;
//	A = in.read();
//	B = in.read();
	//콘솔창에 값을 입력받는 내장객체 생성	
	Scanner scan = new Scanner(System.in);
	//값 입력받는 객체 input1
	String input1 = scan.next();
	//값 입력받는 객체 input2
	String input2 = scan.next();
	//입력받은 input1을 A객체에 int 타입으로 변경해서 저장
	int A = Integer.parseInt(input1);
	//입력받은 input2을 B객체에 int 타입으로 변경해서 저장
	int B = Integer.parseInt(input2);
	if (A>= -10000 && B <= 10000){
		if (A > B) {
			System.out.print(">");
		}else if (A == B) { 
			System.out.print("=");
		}else {
			System.out.print("<");
		}//if
		
		}//public static void
	}
}
