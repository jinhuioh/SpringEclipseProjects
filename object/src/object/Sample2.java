package object;

class Animal{	
	String name;
	void setName(String name) {	
		this.name = name; /*this 는 String name 을 의미*/
	}
}

class Dog extends Animal{	
	//여기클레스에는 name에 대한 내용이 없지만 부모클래스=Animal클래스에 있는 내용을 상속받아서(extends)
	//System.out.println(dog.name);으로 값을 받아올 수 있다.
	void sleep() {	
		System.out.println(this.name+"는 잔다.");
	}
}
public class Sample2 {

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.setName("멍멍이");
		System.out.println(dog.name);
		dog.sleep();//부모에게는 없지만 자식에게는 있는 sleep값 가져오기.
		/*IS - A관계
		개는 동물이다↓라는 의미*/
		Animal dog2=new Dog();
		//Object java 최상위 객체(모든것을 상속받는 객체)(class)
		Object obj=new Dog();
	
	
	}

}
