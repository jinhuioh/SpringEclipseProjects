package pack03;

import javax.swing.JOptionPane;

public class AccountView {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("이름을 입력");
		String title = JOptionPane.showInputDialog("계좌를입력");
		int price = Integer.parseInt(JOptionPane.showInputDialog("잔고를입력"));
	
		AccountVo bag =new AccountVo();
		bag.setName(name);
		bag.setPrice(price);
		bag.setTitle(title);
		
		AccountDAO dao =new AccountDAO();
		dao.create(bag);
	}

}
