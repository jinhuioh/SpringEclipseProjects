package second_project;

import java.io.IOException;
import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		//블럭지정하구 쉬프트 텝하면 라인 앞으로 댕길수있다. 

		Scanner scanner=new Scanner(System.in);
	    String inputData;
		while(true) {
			inputData=scanner.nextLine();
			System.out.println("입력된 문자열:\""+inputData+"\"");
			if (inputData.equals('q')){
				break;
			}
		}
		System.out.println("종료"); 
	}
	
}