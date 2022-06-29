package second_project;

import java.io.IOException;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/**
		 * 1.Scanner를 사용해서 아이디 패스워드를 입력받아
		 * 아이디가:users
		 * 패스워드가:19876일때 로그인 성공이라고 프린트
		 * 아이디가 틀렸을경우 : 아이디가 존재하지 않습니다.
		 * 패스워드가 틀렸을경우: 로그인 실패로 각각 콘솔장애로 감.
		 *
		 */

		Scanner scanner=new Scanner(System.in);
		
		System.out.print("ID:");
		String name=scanner.nextLine();
		
		System.out.print("PW:");
 	    String strPassword=scanner.nextLine();
		
 	    int password=Integer.parseInt(strPassword);
 	    
 	    if(name.equals("users")) {
 	    	if(password==19876) {
 	    		System.out.println("로그인성공했습니다.");
 	    	}else {
 	    		System.out.println("로그인 실패:패스워드가 틀림");
 	    	}
 	    } else {
 	    	System.out.println("로그인 실패:아이디가 존재하지 않습니다.");
 	    	
 	    }
		
		
	}

	}
