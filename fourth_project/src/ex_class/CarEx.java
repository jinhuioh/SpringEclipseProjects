package ex_class;

public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1=new Car();	
			
		System.out.println("car1.company:"+car1.company);	
		System.out.println("car1.model:"+car1.model);	
		System.out.println("car1.color:"+car1.color);	
		System.out.println("car1.maxspeed:"+car1.maxSpeed);	
		
		
		Car car2=new Car("Ä«´Ï¹ß","Èò»ö",20);	
		System.out.println("car2.model:"+car2.company);	
		System.out.println("car2.model:"+car2.model);	
		System.out.println("car2.color:"+car2.color);	
		System.out.println("car2.maxspeed:"+car2.maxSpeed);	
		
		
		Car car3=new Car("º¥Ã÷","»¡°­",100);	
		System.out.println("car3.model:"+car3.company);	
		System.out.println("car3.model:"+car3.model);	
		System.out.println("car3.color:"+car3.color);	
		System.out.println("car3.maxspeed:"+car3.maxSpeed);	
			
		
		
	}

}
