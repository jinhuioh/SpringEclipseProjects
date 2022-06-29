package second_project;

public class LogicOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int charCode='a';//65
		System.out.println("charCode:"+charCode);
		
		if((charCode >=65)&(charCode<=90)) {
			System.out.println("대문자 이군요.");	
		}
		if((charCode >=97)&&(charCode<=122)) {
			System.out.println("소문자 이군요.");	
		}
//&& 왼쪽식 오른쪽식 중에 뭐가 맞는지 둘다 보는거.&한쪽만 보는거. && 이렇게 두개 쓰는거 추천.
		if((charCode >=48)&!(charCode<=57)) {
			System.out.println("0~9숫자 이군요.");	
		}
	}

}
