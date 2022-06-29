package second_project;

public class Promotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 상단에 window->preferences들어가면 글꼴색상, 설정 바꿀 수 있음
		//Ctrl + A 표 전체선택
		//Ctrl + Shift + → 표에서 행 전체선택
		//Ctrl + Shift + ↓ 표에서 열 전체선택
		
		byte bytevalue=10;
		int intvalue=bytevalue;
		System.out.println("intvalue"+intvalue);
		

		char charvalue='가';
		intvalue=charvalue;
		System.out.println("유니코드"+intvalue);
		
		intvalue=50;
		long longvalue=intvalue;
		System.out.println("longvalue:"+longvalue);
		
		longvalue=100;
		float floatvalue=longvalue;
		System.out.println("floatvalue:"+floatvalue);
		
		floatvalue=100.5F;
		double doublevalue=floatvalue;
		System.out.println("doublevalue:"+doublevalue);
		
	}

}
