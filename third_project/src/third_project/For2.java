package third_project;

public class For2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		int sum=0;
			
		for(int i=1;i<=100;i++) {	
			sum=sum+i;	
			System.out.println(sum);	
			
		}
		
		System.out.println("1~100합:"+sum);	
			
		
		System.out.println("1~100까지 정수중 홀수");	
		for(int i=1;i<=100;i++) {	
			if(i%2==0) {	
				System.out.println(i);		
			}		
		}	

		
		System.out.println("1~100까지 정수중 짝수");	
		for(int i=1;i<=100;i++) {	
			if(i%2==1) {	
		
				System.out.println(i);	
				
			}
		}

			
			
		System.out.println("1~100까지 정수중 3의배수");	
		for(int i=1;i<=100;i++) {	
			if(i%3==0) {	//%는 나머지값이3인수 구하는거.
				System.out.println(i);	
			}
		}

		
			//&& 이게 and 뜻하는거라서 조건이 두가지일때는 아래처럼 &&를 이용해서 이으면 된다.
		System.out.println("1~100까지 정수중"+ "3의배수이면서 2의배수");	
		for(int i=1;i<=100;i++) {	
			if(i%2==0 && i%3==0){	
				System.out.println(i);	
					
			}
		}
		
		
		//또는 일때는||를 사용한다.
		System.out.println("1~100까지 정수중"+ "3의배수 또는 2의배수");	
		for(int i=1;i<=100;i++) {	
			if(i%2==0 || i%3==0){	
				System.out.println(i);	
						
			}
		}
			
		
		System.out.println("1~100까지 정수중"+"2씩증가하는데"+ "3의배수 또는 2의배수");	//1씩증가 i++,1씩 감소i=,2씩증가i+=2
		for(int i=1;i<=100;i+=2) {	
			if(i%2==0 || i%3==0){	
				System.out.println(i);	
						
			}
		}
		
		
		
		
	}	
}
