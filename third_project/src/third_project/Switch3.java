package third_project;

public class Switch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char grade='B';
			
		switch(grade) {	
			case 'A':	
			case 'a':	
				
				System.out.println("우수회원입니다.");	
				break;
				
			case 'B':	
			case 'b':	
				
				System.out.println("일반회원입니다.");	
				break;	
				
			default:	
				System.out.println("손님입니다.");	
				
		}	
			
		String upper="    aBcdE ";	
				System.out.println(upper.toUpperCase());	//전부대문자로
				System.out.println(upper.toLowerCase());	//전부소문자로
				System.out.println(upper.trim()); //앞뒤공백만 없애주시오	
				System.out.println(upper.replace("","")); //앞""문자를 뒤""로 치환해주시오.
	}

}
