package pack01;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow {

	public static void main(String[] args) {
		// static:cpu가 lam에 바로접근해서 함수 사용 가능하게 하는 객체. 만드는ㄴ건.cpu 부품을 저장하는건 램이한다.

		//필요한 부품들
		//1.전체틀-벽돌
		JFrame f = new JFrame();
		//2.버튼두개-벽돌
		JButton b1 =new JButton();
		JButton b2 =new JButton();
		//3.글자 -망치.static으로사용(언제든지 쓸 수 있게 준비해둬야함.)
		//4.색상 -망치.static으로사용
		b1.setText("카카오 크롤링");
		b1.setForeground(Color.pink);//글자 색상을 나타냄
		b1.setBackground(Color.black);
		f.add(b1);
		f.setSize(300,300);
		f.setVisible(true);//버튼이 보여지게하는방법 setVisible은 boolean을 이용해 true면 버튼 보이게 false면 안보이게함.
	}

}
