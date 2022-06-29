package third_project;

import java.util.Scanner;

public class while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
			
		Scanner scanner=new Scanner(System.in);	
			
		//while(true)를 붙여야 콘솔창에서 무한대로 계산기처럼 사용가능. 계속 값을 내뱉도록 만드는 명령문.
	while(true) {	
		int sum=0;	
		int init=Integer.parseInt(scanner.nextLine());	//int init=Integer.parseInt(scanner.nextLine()); 말구int init=scanner.nextInt();도 가능.
		int i=init;	
		int end=Integer.parseInt(scanner.nextLine());
		
		while(i<=end) {	
			sum+=i;		
			if(i==end) {	
				break;
			}
			i++;
				
		}
		
		System.out.println("1~"+(i)+"합:"+sum);
	}
	}

}
//어렵다..........허어엉
//브레이크(break)는 프로그래밍 언어에서 for 또는 while 등의 반복문(Loop)을 벗어날 때 사용하는 명령어이다.
//조건문인 switch문에서 벗어날 때도 사용한다. return문이 결과값을 반환하는 반면, break문은 어떤 결과값도 반환하지 않는다.