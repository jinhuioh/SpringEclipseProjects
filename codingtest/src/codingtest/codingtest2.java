package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codingtest2 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
		long num = Long.parseLong(br.readLine());
		int answer = 0;
		int i = 1;
		int count = 0;
		while(true) {
			if(answer > num) {
				break;
			}
			
			answer += i;
			i++;
			count++;
		}//while
		System.out.println(count-1);
		
	}
}
