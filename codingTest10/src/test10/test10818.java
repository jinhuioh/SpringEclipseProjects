package test10;

import java.util.Scanner;

//문제
//N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 
//모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
//
//출력
//첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
public class test10818 {

	public static void main(String[] args) {
		//입력받을 객체 생성
		Scanner scan = new Scanner(System.in);
		//값 입력
		int N=1;
		if(1 <= N && N<= 1000000) {
		N = scan.nextInt();
		}
		//배열 A의 길이를 N으로 지정
		int[] A = new int[N];
		for(int i=0; i<N; i++) {
//			i번째 값 입력 받아서 배열에 저장.
//			A[0]=2, A[1]=3,...이런식으로 N번 값 입력 받아서 배열에 저장
			if(A[i]<1000000 && A[i]>-1000000) {
			A[i] = Integer.parseInt(scan.next());
//			System.out.println("A[i]: "+A[i]);
			}
		}//for
		//최대 최소 값을 담을 변수 선언하고 배열의 인덱스0값 참조하기
		int min = A[0];
		int max = A[0];
		for(int i=1; i<A.length; i++) {
			//최대값인경우
			if(A[i]>max) {
				max = A[i];
			}
			//최소값인 경우
			if(A[i]<min) {
				min = A[i];
			}
		}//for
		System.out.println(min+" "+max);
	}

}
