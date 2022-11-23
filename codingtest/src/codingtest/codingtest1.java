package codingtest;

import java.awt.Window.Type;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class codingtest1 {

	public static void main(String[] args) throws IOException {

//		문제
//		N개의 정수가 주어지면, 이 정수들의 합 S의 부호를 구하는 프로그램을 작성하시오.
//
//		입력
//		총 3개의 테스트 셋이 주어진다. 각 테스트 셋의 첫째 줄에는 N(1 ≤ N ≤ 100,000)이 주어지고, 둘째 줄부터 N개의 줄에 걸쳐 각 정수가 주어진다. 
//		주어지는 정수의 절댓값은 9223372036854775807보다 작거나 같다.
//
//		출력
//		총 3개의 줄에 걸쳐 각 테스트 셋에 대해 N개의 정수들의 합 S의 부호를 출력한다. S=0이면 "0"을, S>0이면 "+"를, S<0이면 "-"를 출력하면 된다.
	
//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	for(int i=0; i < 3; i++) {
////		n을 입력받음!
//		BigInteger S = new BigInteger("0");// biginteger은 꼭 문자열 값을 넘겨주어야한다.
//		int num = Integer.parseInt(br.readLine());
//		for(int j=0; j < num; j++ ) {
//			BigInteger one = new BigInteger(br.readLine());
//			S = S.add(one);
//			
//		}//for
//		
//		//compareTo(0)이 -1이면 음수,1이면 양수,0이면0 출력
//		if(S.compareTo(BigInteger.ZERO)== -1) {
//			System.out.println("-");
//			
//		}
//		else if (S.compareTo(BigInteger.ZERO)==1) {
//			System.out.println("+");
//			
//		}
//		else {
//			System.out.println("0");
//			
//		}
//	}//for
		
//		
//		동호는 새악대로 T 통신사의 새 핸드폰 옴머나를 샀다. 새악대로 T 통신사는 동호에게 다음 두 가지 요금제 중 하나를 선택하라고 했다.
//
//		영식 요금제
//		민식 요금제
//		영식 요금제는 30초마다 10원씩 청구된다. 이 말은 만약 29초 또는 그 보다 적은 시간 통화를 했으면 10원이 청구된다. 
//		만약 30초부터 59초 사이로 통화를 했으면 20원이 청구된다.
//
//		민식 요금제는 60초마다 15원씩 청구된다. 이 말은 만약 59초 또는 그 보다 적은 시간 통화를 했으면 15원이 청구된다. 
//		만약 60초부터 119초 사이로 통화를 했으면 30원이 청구된다.
//
//		동호가 저번 달에 새악대로 T 통신사를 이용할 때 통화 시간 목록이 주어지면 어느 요금제를 사용 하는 것이 저렴한지 출력하는 프로그램을 작성하시오.
//
//		입력
//		동호가 저번 달에 이용한 통화의 개수 N이 주어진다. N은 20보다 작거나 같은 자연수이다. 둘째 줄에 통화 시간 N개가 주어진다.
//		통화 시간은 10,000보다 작거나 같은 자연수이다.
//
//		출력
//		첫째 줄에 싼 요금제의 이름을 출력한다. 그 후에 공백을 사이에 두고 요금이 몇 원 나오는지 출력한다. 
//		만약 두 요금제의 요금이 모두 같으면 영식을 먼저 쓰고 민식을 그 다음에 쓴다.
//
//		영식은 Y로, 민식은 M으로 출력한다.
//
//		예제 입력 1 
//		3
//		40 40 40
//		예제 출력 1 
//		M 45
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int count1 = 0;//영식요금제
//		int count2 = 0;//민식요금제
//		
//		int num1 = Integer.parseInt(br.readLine());
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//		
//		for(int i =0; i<num1; i++) {
//			int one = Integer.parseInt(st.nextToken());
////			영식요금제
//			int youn = 1+one/30;
//			count1 += youn*10;
////			민식요금제
//			int minsik = 1+one/60; 
//			count2 += minsik*15;
//		}//for
////		System.out.println(count1+" "+count2);
//		if(count1 >count2) {
//			System.out.println("M "+count2);
//		}
//		else if(count1 == count2) {
//			System.out.println("Y M "+count1);
//			
//		}
//		else {
//			System.out.println("Y "+count1);
//			
//		}
//		int count =0;
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int a = Integer.parseInt(br.readLine());
//		String b = br.readLine();
//		for(int i =2; i>=0; i--) {
//			int bone = b.charAt(i) - '0';
//			int mul = bone*a;
//			System.out.println(mul);
//			if(i==1) {
//				mul = mul*10;
//			}
//			else if(i==0) {
//				mul = mul*100;
//			}
//			count +=mul;
//		
//		}
//		System.out.println(count);

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		if(b-a > c-b) {
			System.out.println((b-a-1));
		}
		else {
			System.out.println((c-b-1));
		}
	}

}
