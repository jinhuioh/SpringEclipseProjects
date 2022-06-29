package third_project;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		int[] scores= {83,90,87,45,56,67,23,89};	
		
	//	System.out.println("scores[0]:"+scores[0]);	
	//	System.out.println("scores[1]:"+scores[1]);	
	//	System.out.println("scores[2]:"+scores[2]);	
		
		int sum=0;	
	//	for(int i=0;i<3;i++) 이 방법으로 해도 되고 아래처럼 i<scores.length로 해도 된다.다뤄야하는 수가 많을때는 length가 나음.	
			for(int i=0;i<scores.length;i++) {	
				System.out.println("scores["+i+"]:"+scores[i]);	
				sum+=scores[i];
		}
		System.out.println("총합:"+sum);	
		double avg=(double)sum/scores.length;	
		System.out.println("평균:"+avg);
		
	}

}
