package second_project;

public class CastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int 값을 char값으로 강제 형변환 하는방법 ()안에 형변환 할 거 입력하구 아래처럼 적으면 됨. 근데 int 값이 char값으로 변환할 수 없을 크기일때는 불가능.
		int intvalue=44032;
		char charvalue=(char)intvalue;
		System.out.println(charvalue);
		
		long longvalue=500L;
		intvalue=(int)intvalue;
		System.out.println(intvalue);
		
		double doublevalue=3.14;
		intvalue=(int)doublevalue;
		System.out.println(intvalue);
		
		//....아래가 가장 많이 쓰는 형변환 형태
		String str="1000000";
		int str_int=Integer.parseInt(str);
		System.out.println("str_int:"+str_int);
		
		
		
	}

}
