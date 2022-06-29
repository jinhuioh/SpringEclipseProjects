package pack03;

import javax.swing.JOptionPane;

public class BasicProcess3 {

	public static void main(String[] args) {
//		2.id가 root라고 입력하면 맞아요! id가 root이외의 값이면 틀려요! 출력
		String id = JOptionPane.showInputDialog("id를입력");
		//비교처리해봅시다.//기본형이아니기때문에 ==사용불가능
		if(id.equals("root")) {	
			JOptionPane.showMessageDialog(null, "동일~");

		} else {	
			JOptionPane.showMessageDialog(null, "동일안함~");

		}

	}

}
