package second_project;

public class OperrationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte 끼리의 합산은 불가능. +는int로 해야함.(아래에byte bytevalue3=bytevalue1+bytevalue2; 이거 연산 실행하면 오류뜸.
		byte bytevalue1=10;
		byte bytevalue2=20;
		//byte bytevalue3=bytevalue1+bytevalue2;
		int bytevalue3=bytevalue1+bytevalue2;
		System.out.println(bytevalue3);
		
		char charvalue1='A';
		char charvalue2=1;
		//char charvalue3=charvalue1+charvalue2;   이것도 위에처럼 합산은int로 해야함 char로 하면 오류뜸	
		int intvalue2=charvalue1+charvalue2;
		System.out.println("유니코드:"+intvalue2);
		System.out.println("문자:"+(char)intvalue2);
		
		int intvalue3=10;
		int intvalue4=intvalue3/4;
		System.out.println(intvalue4);
		
		int intvalue5=10;
		//int intvalue6=10/4.0;
		double doublevalue=intvalue5/4.0;
		System.out.println(doublevalue);

		int x=1;
		int y=2;
		double result=(double)x/y;
		//double result=x/y; 라고만 하면 int 값은 정수이기 때문에 소수점 자리가 없어져서 실행값이 0.0이 나온다.
		//그래서 소수점 자리까지 나오는 double 값으로 보내달라는 신호를 위에처럼 적어야함.
		System.out.println(result);
		
		
	}

}
