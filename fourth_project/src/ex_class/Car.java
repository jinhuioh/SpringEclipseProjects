package ex_class;

public class Car {	
	
	String company = "현대자동차";	
	String model;	
	String color;	
	int maxSpeed;	
	
	Car() {	
		
	}
	
	Car(String model) {	
		this.model= model;	
	}
	
	Car(String model, String color) {	
		this.model= model;	
		this.color= color;	//this는 맨위에있는 String model1을 말하는것이다. 중간에 있는model1말고
		
	}
	
	Car(String model, String color,int maxSpeed) {	
		this.model= model;	
		this.color= color;	
		this.maxSpeed=maxSpeed;	
		
	}
}
