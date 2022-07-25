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
		
		int N = 0;
		//값 입력
		String F = scan.next();
		String S = F;
		//값의 길이가 1자리수이면 앞에 0을 붙여준다.
		if(F.length()<2) {
			S = "0"+F;
		}//if
		while(true){
			//S1객체 생성
			int S1=0;
			//내가 입력한 값
			System.out.println("S는: "+S);
			//입력값이 26이면 2+6=8을 계산하는 과정
			S1 =((Integer.parseInt(S)/10) + (Integer.parseInt(S)%10));
			System.out.println("S1는: "+S1);
			
			//S의 두번째 자리수 6과 더한값 8을 연결해주는 부분 =>68을 만들어냄.
			//유니코드 오류를 피하기 위해 Integer.toString()을 사용
			//객체 S에 넣어줘야 while문을 돌면서 S가 계속 바뀌어 연결되어 돌아갈 수 있다.
			//처음에 S1,S2,S3로 잡고 해서 S에 새로운 값이 안들어가고 처음 입력한 값 그래도 있어서 안풀렸음.
			S = Integer.toString(Integer.parseInt(S)%10) + Integer.toString((S1)%10);
			System.out.println("두번째S는: "+S);
			N++;//카운트 +1
			//처음 입력값과 같으면 break
			if(F.equals(S) || S.equals("0"+F)) {
				break;
			}
		}//while
		//총 카운트  수 출력
		if(N>=0 && N<=99) {
			System.out.println(N);
		}
	}

}
