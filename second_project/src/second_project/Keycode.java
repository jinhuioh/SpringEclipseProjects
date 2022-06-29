package second_project;

import java.io.IOException;

public class Keycode {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub.  위에처럼  throws IOException  이거붙이면 예외처리 가능.
		
		//그리고 실행시키면 아무것도 안뜨는데 실행된 창에 (consloe창에) a나 뭐 치면 숫자나옴.

		int keycode; 
		//system.in.read는 1byte씩 글자 하나를 읽는거.예를들어A를입력하면 그걸읽고 해당값이 나옴.
		keycode=System.in.read();
		System.out.println("keycode1:"+keycode);
		
		keycode=System.in.read();
		System.out.println("keycode2:"+keycode);
		
		keycode=System.in.read();
		System.out.println("keycode3:"+keycode);
		
	}

}
