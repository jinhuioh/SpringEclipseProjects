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
//입력은 여러 개의 테스트 케이스로 이루어져 있다.
//
//각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
//
//출력
//각 테스트 케이스마다 A+B를 출력한다.
public class test10951 {

	public static void main(String[] args) throws IOException {

		//두 값을 입력하고 더한값을 출력하기 위해 객체 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while ((br.readLine()) != null && !br.readLine().isEmpty()) {//무한루프 돌리기 while(true) 또는 if(;;)
			//배열로 값을 받아보자
			
			String strs = br.readLine();
			int A = Integer.parseInt(strs.split(" ")[0]);
			int B = Integer.parseInt(strs.split(" ")[1]);
			
			bw.write(Integer.toString(A+B)+"\n");
		}//while
		bw.flush();
		bw.close();
		
	}

}
