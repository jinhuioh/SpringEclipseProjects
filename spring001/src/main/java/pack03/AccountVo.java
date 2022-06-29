package pack03;

public class AccountVo {
	private String name;
	private String title;
	private int price;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String bal) {
		this.title = bal;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int money) {
		this.price = money;
	}
	@Override
	public String toString() {
		return "BalanceVo [이름은=" + name + ", 잔고는=" + title + ", 가격은=" + price + "]";
	}

}
