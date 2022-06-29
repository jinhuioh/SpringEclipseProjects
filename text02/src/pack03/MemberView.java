package pack03;

import javax.swing.JOptionPane;

public class MemberView {
//창을띄어서 실행시켜야하기때문에 메인dlTdjdigka
	public static void main(String[] args) throws Exception {
		//입력화면부분(mvc에서view부분)
		String id = JOptionPane.showInputDialog("id입력");
		String pw = JOptionPane.showInputDialog("pw입력");
		String name = JOptionPane.showInputDialog("name입력");
		String tel = JOptionPane.showInputDialog("tel입력");
		
		//제어부분(mvc에서 contral부분).가방을 만들어서 입력데이터를 가방에 넣어주자.
		MemberVo bag =new MemberVo();
		bag.setId(id);
		bag.setPw(pw);
		bag.setName(name);
		bag.setTel(tel);
		
		//db에 넣는 처리.가 마지막단계-DAO에게 가방에 넣어서 전달.
		MemberDAO dao = new MemberDAO();
		dao.create(bag);
	}

}
