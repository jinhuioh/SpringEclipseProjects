package pack02.subPack;

public class RoomMain {

	public static void main(String[] args) {
		//필요한 tv 2대 가져다 놔주세요.
		TV myTV = new TV();
		TV yourTV = new TV();
		myTV.ch = 7;
		myTV.vol = 9;
		myTV.onOff=true;
		//첫번째 tv에 ch,vol,onOff값 넣어주세요
		//그림과 비교해주세요.
		
		//전체 변수가 몇 개 생겼을까요? 맴버 변수3개
		System.out.println(myTV);
		
		//생성된 객체의 주소를 가지고 멤버메서드를 호출 할 수 있다.
		myTV.on(10); //=주소.on(int값); 주소가 있어야 on 사용가능.
		//2번째 tv에 멤버 변수값을 넣어보고,멤버변수를 프린트해보세요.
		//System.out.println(yourTV.ch);
		//그림을 그려보세요.
		//(자동완성기능 컨트롤 스페이스바)
		Phone p = new Phone();
		p.color = "pink";
		p.price = 0;
		p.size= 20;
		System.out.println(p);
	}

}