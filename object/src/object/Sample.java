package object;
class calculator{	
	
	//버스:641번,사람들을 태운다,
	//영등포에서 강남을 지나 다시 영등포로 오는 순환경로.
	//저기 641번 버스는 영등포에서 출발해서 
	//강남을 지나 영등포로 다시 돌아오는 순환버스이다.

	//static일때
	//	static int result=0;
//	static int add(int num)
	int result=0;
	int add(int num) {	
		result +=num;
		return result;
	}
}
public class Sample {

	public static void main(String[] args) {
		
		//static인 경우
//		System.out.println(calculator.add(10));
//		System.out.println(calculator.add(20));
		
		
		//static이 아닌경우
//		calculator cal=new calculator();
//		System.out.println(cal.add(10));
//		System.out.println(cal.add(20));
		
		
		calculator cal1=new calculator();
		calculator cal2=new calculator();
		
		//static을 없애면 계산기를 2개 만들 수있다.
		System.out.println(cal1.add(10));
		System.out.println(cal1.add(20));
		
		System.out.println("=====");
		
		System.out.println(cal2.add(10));
		System.out.println(cal2.add(40));
		

	}

}
