package second_project;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2.3개의 숫자를 입력받아 가장 큰 숫자를 찾으시오.답.
		//뭐 적을때 텝 엔터로 라인꼭 맞춰서 적기.그래야 오류 찾기 쉬움
		//window,preferences,general,editor,texteditor,(중간쯤에)show whitespace charactors 누르면 라인맞추기 쉬움
		
		Scanner input=new Scanner(System.in);
		int num1,num2,num3;
		int max;
		
		num1=input.nextInt();
		num2=input.nextInt();
		num3=input.nextInt();

		if(num1>=num2&&num1>=num3) {
			max=num1;
		}else if(num2>=num1&&num2>=num3) {
			max=num2;
		} else {
			max=num3;
		}
		System.out.println("가장큰 수는"+max+"입니다.");
		input.close();	
	}

}

//선생님방법
//Scanner input=new Scanner(System.in);
//System.out.print("값1:");
//int value1=Integer.parseInt(scanner.nextLine());
//System.out.print("값2:");
/**
 * int value2=Integer.parseInt(scanner.nextLine());
 */
//System.out.print("값3:");
//int value3=Integer.parseInt(scanner.nextLine());

//if(value1>value2) {
//	if(value)
//}
//