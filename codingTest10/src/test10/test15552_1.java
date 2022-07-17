package test10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class test15552_1 {

	public static void main(String[] args) throws IOException {
		//내가 입력한 값 저장
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//저장된 값 출력
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//값 입력받기. 내가 몇 줄 입력할지 값 입력받는 부분
		int T = Integer.parseInt(br.readLine());
		//for문 돌려서 2개의 값 입력받기
		for (int i=0; i<T; i++) {
			//생성한 배열에 두개의 값 입력받은 것을 담기.
			String[] strs = br.readLine().split(" ");
			int A = Integer.parseInt(strs[0]);
			int B = Integer.parseInt(strs[1]);
			
			if(T<=1000000 && 1<=A && A<=1000 && 1<=B && B<=1000) {
				//출력
				bw.write(Integer.toString(A + B) +"\n");
			}//if
		}//for
		bw.flush();
		
		
		
	}

}
