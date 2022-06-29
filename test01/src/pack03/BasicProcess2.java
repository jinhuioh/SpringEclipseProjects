package pack03;

import javax.swing.JOptionPane;

public class BasicProcess2 {

	public static void main(String[] args) {
		//두 수를 입력받아서 동일하면 동일해요! 동일하지 않으면 달라요! 출력해봅시다.

		String n1 = JOptionPane.showInputDialog("수를입력");
		String n2 = JOptionPane.showInputDialog("수를입력");

		int n11 = Integer.parseInt(n1); //String을 int로 바꿔주는 함수.
		int n22 = Integer.parseInt(n2);

		//비교처리해봅시다.
		//기본데이터인경우, 비교연산자(boolean(true,false,if,else))를 써서 비교 가능.
		if(n11 == n22) {	
			JOptionPane.showMessageDialog(null, "동일~");

		} else {	
			JOptionPane.showMessageDialog(null, "동일안함~");

		}

	}

}
