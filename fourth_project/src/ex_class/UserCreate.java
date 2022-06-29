package ex_class;

public class UserCreate {

	public static void main(String[] args) {
		User user = new User();
		user. setIdx(1);	
		user.setId("icarus");	
		user.setPassword("12345");	
		user.setBirth("2000-01-23");
		user.setEmail("icarus@@naver.com");
		user.setPhone("01046935721");	
		user.setRgstdate("2021-12-31");
				
				
		User[] users=new User[3];
				
		System.out.println("idx:"+user.getIdx());	
		System.out.println("id:"+user.getId());	
		System.out.println("password:"+user.getPassword());	
		System.out.println("birth:"+user.getBirth());	
		System.out.println("email:"+user.getEmail());	
		System.out.println("phone:"+user.getPhone());	
		System.out.println("rgstdate:"+user.getRgstdate());	
		
		
		User user2 = new User();	
		user2. setIdx(1);	
		user2.setId("jinhui");	
		user2.setPassword("22225");	
		user2.setBirth("1997-01-23");
		user2.setEmail("aaa779979@@naver.com");
		user2.setPhone("0100009841");		
		
		User[] users2 = new User[2];	
		users[0]=user;	
		users[1]=user2;	
			
		for(int i=0;i<users.length;i++) {	
			System.out.println("idx:"+users[i].getIdx());	
			System.out.println("id:"+users[i].getId());	
			System.out.println("password:"+users[i].getPassword());	
			System.out.println("birth:"+users[i].getBirth());	
			System.out.println("email:"+users[i].getEmail());	
			System.out.println("phone:"+users[i].getPhone());	
			System.out.println("rgstdate:"+users[i].getRgstdate());
		}
			
			
	}

}
