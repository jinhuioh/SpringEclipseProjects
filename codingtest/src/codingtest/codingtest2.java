package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//
public class codingtest2 {
	public static void main(String[] args) throws IOException {
//	BABBA
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int num = Integer.parseInt(br.readLine());
	int a0 = 1;
	int b0 = 0;
	
	int a1 = 0;
	int b1 = 1;
	
	int a = 0;
	int b = 0;
	
	if(num ==1) {
		System.out.println(a1+" "+b1);
	}
	
	else {
	
		for(int i=2; i<num+1; i++) {
			a = a0 + a1;
			b = b0 + b1;
	//		°»½Å
			a0 = a1;
			b0 = b1;
			
			a1 = a;
			b1 = b;
		}
		System.out.println(a+" "+b);
		
		}//else

	}
 
}
