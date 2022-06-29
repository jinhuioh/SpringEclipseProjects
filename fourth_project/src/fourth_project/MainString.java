package fourth_project;

public class MainString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		//이거 그냥 실행하면 안되는데 Run as->Run configurations들어가서 Arguments들어가서 program arguments
		//창에서 숫자 10 20 789이런식으로 띄어쓰기해서 입력하면 값나옴.
		
		String strNum1=args[0];	
		String strNum2=args[1];	
		String strNum3=args[2];
		
		int num1 = Integer.parseInt(strNum1);	
		int num2 = Integer.parseInt(strNum2);		
		int num3 = Integer.parseInt(strNum3);	
			
		int result = num1+num2+num3;	
		System.out.println(result);
	}

}
