package pack02.subPack;

public class TV extends Object{
	//틀(부품)을 만들 때 구성 요소
	//멤버 변수를 만들어보자.(내가 선택해서 만들은 변수들)나중에 생성되는 객체의 속성값 저장
	//객체가 생성할 때 아래 3개의 변수가 복사
	int ch;
	int vol;
	boolean onOff;
	
	//tv를 가지고 할 동작(기능을 정의)
	public String on(int time) { //void=return값(반응값) 없다는 의미. 
		System.out.println(time+"시에 tv를 킴!");
		return "ok";
	}
	
	//to하고 컨트롤 스페이스바 누르고 엔터누르면 public String toString()나옴.
	//생성된 객체의 변수 저장된것을 스트링으로 반환
	public String toString() {
		return ch + ","+vol+","+onOff;
		
	}
	
}
