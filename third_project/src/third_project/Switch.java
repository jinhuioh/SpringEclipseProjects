package third_project;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub/// break 를 꼭써야 안겹침.안쓰면 전부다 실행되어서 나옴.
		
		int num=(int)(Math.random()*6)+1;		
		System.out.println("숫자는?"+num);
			
			
		switch(num) {	
		case 1:	
			System.out.println("1번이 나왔습니다.");	
			break;
		case 2:	
			System.out.println("2번이 나왔습니다.");	
			break;
		case 3:	
			System.out.println("3번이 나왔습니다.");	
			break;
		case 4:	
			System.out.println("4번이 나왔습니다.");	
			break;
		case 5:	
			System.out.println("5번이 나왔습니다.");	
			break;
		case 6:	
			System.out.println("6번이 나왔습니다.");
			break;
			
			default:	
			System.out.println("숫자가 안나왔습니다.");
			break;
		}
	}

}
