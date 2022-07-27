package test10;

//정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.
//Java: long sum(int[] a); (클래스 이름: Test)
//a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
//리턴값: a에 포함되어 있는 정수 n개의 합
public class test15596 {

	//long과 int의 차이점
	//int범위:4바이트 -2,147,483,648부터 2,147,483,647
	//long범위:8바이트로 int보다 훨-씬 넓다. 
	//	int[] a는 합을 구해야하는 정수n개가 저장되어 있는 배열.
	long sum(int[] a) {
	    long ans = 0;
	    for(int val : a) {
	    	ans += val;
	    }
    return ans;
	    }
	}
