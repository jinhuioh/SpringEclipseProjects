package third_project;

public class Outter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outter:	
			for(char upper='A';upper<='Z';upper++) {	
				for(char lower='a';lower<='z';lower++) {	
					
					System.out.println(upper+'-'+lower);	
					if(lower=='g') {	
						break Outter;	
					//	break;
					}
				}
				
			}
	}

}
//upper+'-'+lower 이렇게 쓰면 숫자가 나와여.이유는: ''는 문자열의 유니코드 합을 구하는 식이기 때문에 문자열을 적으려면 ""로 써야한다.