package pack02;
import java.util.Date;
import pack01.ReturnClass;
//F2 ,ctrl+shirf+o 임포트 단축키.

//알트+v 메인생성 단축키.
//ctrl+enter 여러 문장생성 단축키?
public class ReturnMain {

	public static void main(String[] args) {
		ReturnClass rc = new ReturnClass();
		System.out.println(rc);
		//자바에서는 객체지향형 언어이므로 
		//그 기능을 담당하는 부품이 있어서
		//반드시 부품을 사용해야하는데,
		//이때 꼭 부품의 주소가 필요하다. rc가 주소이므로 add(100); 으로만 쓰면 틀림.
		//(생성된 객체의 주소)
		//특정한 기능을 사용하고 싶으면 주소만 있으면 된다.
		rc.add(100);
		
		Date date2 = rc.add2();
		System.out.println(date2.getHours()+"시");
		
		int[] x2 = rc.add();
		System.out.println(x2+"는 배열의 주소이다.");
		System.out.println(x2[0]+"는 배열의 첫번째 .");
		System.out.println(x2[1]+"는 배열의 두번째 .");
		System.out.println(x2[2]+"는 배열의 세번째 .");
		//반환이 없는 경우에는 결과값을 변수에 넣을수도없고, 프린트 할 수도 없다.
//		int x = rc.add(100);	
//		System.out.println(rc.add(100));
		double sum1 = rc.add(22.1, 10);
		int sum2 = rc.add(22, 10);
		String sum3 = rc.add("나는", "프로그램");
		String sum4 = rc.add(10000, "나는");
		System.out.println(sum1+" "+sum2+" "+sum3+" "+sum4);
	}
}
