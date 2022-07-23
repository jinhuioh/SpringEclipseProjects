package test10;
//해결!!
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class test10951_1 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
       //hasNextInt(): bool값으로 while문에 true가 아닌값이 들어오는경우 false를 반환하여 프로세스 종료시킴.
		while (scan.hasNextInt()) {
        	int A = scan.nextInt();
        	int B = scan.nextInt();
        	if(0 < A && B < 10) {
        		System.out.println(A+B);
        	}
        }
    }
}