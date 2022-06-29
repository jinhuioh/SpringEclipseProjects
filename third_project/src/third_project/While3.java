package third_project;

public class While3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		while(true) {	//정보를 계속 내뱉어라
			int num=(int)(Math.random()*6)+1;	//1~6까지를
			System.out.println(num);	//보내라
			
			if (num==6) {	//만약6이 나오면
				break;     //멈춰라.
			}
		}
		
		System.out.println("program finish"); //그리고 program finish 라고 적어라.
	}

}
