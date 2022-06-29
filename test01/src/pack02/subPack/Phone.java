package pack02.subPack;

public class Phone extends Object {
	//멤버변수 3개
	String color; //선언하기.전역변수(클레스 전체영역에서 쓰여지는 함수.),변수의 자동 초기화기능이 있다.(null로 초기화)
	//멤버메서드 2개
	//toString()오버라이드 하기.
	int size;//변수의 자동 초기화기능이 있다.0으로 초기화된다.(null아님)
	int price = 0;
	
	
	public void tel(String no) {	
		System.out.println(no +"로 전화를 걸어요");
	}
	
	public void kakao(String name) {	
		System.out.println(name +"와 카톡해요~");

	}
//상단에 source누르고 Generate toString s누르기
	@Override
	public String toString() {
		return "휴대폰 [색=" + color + ", 크기=" + size + ", 가격=" + price + "]";
	}
}
