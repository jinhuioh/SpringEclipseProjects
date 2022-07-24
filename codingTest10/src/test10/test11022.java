package test10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//문제
//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 테스트 케이스의 개수 T가 주어진다.
//
//각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
//
//출력
//각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
public class test11022 {

	public static void main(String[] args) throws IOException {

		//테스트개수를 입력받기 위해 객체 생성
		//한번에 값을 입력받고 한번에 리턴해주기 위해 + 큰 T값들에 효율적인 버퍼사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
//		Integer.toString(T)의 타입 확인
		System.out.println(Integer.toString(T).getClass().getName());
		for(int i=1; i<T+1; i++) {
			//배열생성
			String[] strs = br.readLine().split(" ");
			int A = Integer.parseInt(strs[0]);
			int B = Integer.parseInt(strs[1]);
			
			if(0 < A && B < 10) {
//			출력: Case #1: 1 + 1 = 2
				bw.write("Case #"+ i + ": " + A + " + " + B + " = " + Integer.toString(A+B) + "\n");
			}//if
		}//for
		bw.flush();
	}

}
