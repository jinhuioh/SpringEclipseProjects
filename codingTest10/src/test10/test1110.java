package test10;

import java.util.Scanner;
import java.util.StringTokenizer;

//문제
//0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다. 
//먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다.
//그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다.다음 예를 보자.
//
//26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다.
//새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.
//
//위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
//
//N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 N이 주어진다. N은 0보다 크거나 같고, 99보다 작거나 같은 정수이다.
//
//출력
//첫째 줄에 N의 사이클 길이를 출력한다.
public class test1110 {

	public static void main(String[] args) {
		//값을 입력받기 위해 객체 생성
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {//hasNext객체로 null값이 들어오면 while문 끝냄.
			//입력이 들어오면 strs에 넣음
			String[] strs = scan.nextLine().split("");
//			첫번째 값은 A1, 두번째 값은 B1으로 지정
			int A1 = Integer.parseInt(strs[0]);
			int B1 = Integer.parseInt(strs[1]);
			int C = A1+B1;
			
			if(A1<99 && A1>0 && B1<99 && B1>0) {
				if(C<10) {
					String c1 = Integer.toString(B1)+ Integer.toString(C);
					if((Integer.toString(A1)+Integer.toString(B1)) == c1) {
						
					}
				}else {
					//나머지 연산자 %로 C의 나머지(두번째 자리수)를 추출
					int C1 = C % 10;
					String c2 = Integer.toString(B1)+ Integer.toString(C1);

					if((Integer.toString(A1)+Integer.toString(B1)) == c2) {
						
					}
				}//if
			}//if
		}//while
	}

}
