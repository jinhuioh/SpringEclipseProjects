package first_project;

import java.time.LocalDate;

public class Date {

	public static void main(String[] args) {
		
		
		LocalDate localdate=LocalDate.now();
		System.out.println("년:"+localdate.getYear());	
		System.out.println("월:"+localdate.getMonth());	
		System.out.println("월:"+localdate.getMonthValue());	
		System.out.println("월:"+localdate.getDayOfWeek());
		
	
//	localdate localdate2=LocalDate.of(2022,1,24);
//	System.out.println("요일:"+localdate2.getDayOftWeek());	
	}

}
