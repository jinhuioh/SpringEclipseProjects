package third_project;

public class Switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
			//random이 0부터 0.9999까지여서 아래 처럼 4곱하고 8더하면 범위가 8이상12미만이 된다. (0일때 8시이고 3.xxx일때 11.xxx시)	
		//Math.random:0~0.9999...
		int time=(int)(Math.random()*4)+8;	
		System.out.println("[현재시간:"+time+"시]");	
			
		switch(time) {	
		case 8:	
			System.out.println("출근합니다.");	
		case 9:	
			System.out.println("회의를 합니다.");	
		case 10:	
			System.out.println("업무를 봅니다.");
		default:	
			System.out.println("외근을합니다.");
		
		}

	}

}
