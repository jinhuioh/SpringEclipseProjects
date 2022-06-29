package fourth_project;

public class Ex1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		//배열에 임의의 숫자 5개를 넣고 최대값 찾기.	
		//선생님 답.
		int max = 0;
		int[] intarr= {30,20,40,54,23};	
		
		for(int intar: intarr) {	
			if(max<intar) {	
				max=intar;
			}
		}
		
		System.out.println("max:"+max);
	}

}
