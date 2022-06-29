package pack03;

import javax.swing.JOptionPane;

public class BasicProcess4 {

	public static void main(String[] args) {
//		3.id가 root, pw가 123라고 입력하면 맞아요! 이외의 값이면 틀려요! 출력
		String id = JOptionPane.showInputDialog("id를입력");
		String pw = JOptionPane.showInputDialog("pw를입력");

		//비교처리해봅시다.//기본형이아니기때문에 ==사용불가능
		if(id.equals("root") && pw.equals("12345")) {	// && and연산자., || or 연산자.
			JOptionPane.showMessageDialog(null, "로그인성공~");

		} else {	
			JOptionPane.showMessageDialog(null, "로그인실패~");

		}

	}

}
