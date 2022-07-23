package test10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

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
//	EOF란 End Of File의 약자로 파일의 끝을 알려주는 일종의 마크
public class test10951 {
	public static void main(String[] args) {

		//두 값을 입력하고 더한값을 출력하기 위해 객체 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			// 문자열을 사용자가 지정한 구분자(delim)로 쪼개주는 클래스
			StringTokenizer st;
			//비어있는 n생성
			String n = "";
			//n=br.readLine()으로 읽어와 값이 있는경우 wile문 돌림=> 입력한 한 줄 읽어옴
			while((n=br.readLine()) != null) {
				//입력한 n의 값을 분해하기 위한 객체
				st = new StringTokenizer(n);
				//토큰이 있는경우 더해줘서 출력, 없는경우 break;로 while문 스탑
				if(st.hasMoreTokens()) {
					bw.write(Integer.parseInt(st.nextToken())+
							Integer.parseInt(st.nextToken())+"\n");
				} else {
					break;
				}
			}
			bw.flush();
			bw.close();
			br.close();
		}catch (IOException e) {
			//메소드가 내부적으로 예외 결과를 화면에 출력
			e.printStackTrace();
		}
		
	}
}
