package pack03;

import javax.swing.JOptionPane;

public class BasicProcess1 {

	public static void main(String[] args) {
		//기본 입출력
		String age = JOptionPane.showInputDialog("나이를입력해보세요~~");
		int age2 = Integer.parseInt(age); //String을 int로 바꿔주는 함수.
		//기호를 연산자로
		//산술연산자,비교연산자(int),논리연산자
		System.out.println("내년 나이는"+(age2+1));
	//	System.out.println("내년 나이는"+age2+1); //내년나이는101로 보임
		JOptionPane.showMessageDialog(null, "내년 나이는"+(age2+1));
	}

}
