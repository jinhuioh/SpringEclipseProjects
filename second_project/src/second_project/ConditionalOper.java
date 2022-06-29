package second_project;

public class ConditionalOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//쉬프트 누르면 바 위아래 지정가능.컨트롤쉬프트는 작게 이동함 .
		int score=85;
		char grade=(score>90)?'A':'B';
//위에식 풀어서 쓰면 아래와 같다.
		// if(score.90){
//		    grade='A';
	//	}else {
	//		grade='B';
//		}
		System.out.println(score+"점은"+grade+"학점입니다.");
		

	}

}
