package fourth_project;

public class Fourth_project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int sum=add(new int[] {83,45,76,23,65});	
		System.out.println("총합:"+sum);	
		
		int[] array={83,45,76,23,65};	
		System.out.println("총합:"+add(array));
		
	}
	/**	이렇게 주석 달아서 설명을 써놔야 보기 좋다.
	 * 	받은 배열의 합을 구하는 함수.
	 * @param scores
	 * @return
	 */
	
	public static int add(int[] scores) {	
		int sum=0;	
		for(int i=0;i<scores.length;i++) {	
			sum+=scores[i];
		}	
		return sum;
		
	}
}
