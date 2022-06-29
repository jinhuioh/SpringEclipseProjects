package pack03;

public class AccountDAO {
	//CRUD
	
	//create 기능만 호출해보자. vo만들어서 넣어서 전달.확인까지.
	public void create(AccountVo vo) {	
		System.out.println("AccountVo에서 전달 받은 값"+ vo);
		String name2 = vo.getName();
		String title2 = vo.getTitle();
		int price2 = vo.getPrice();
		
		System.out.println("전달받은 이름은"+name2);
		System.out.println("전달받은 계좌는"+title2);
		System.out.println("전달받은 잔고는"+price2);
		
	}
}
