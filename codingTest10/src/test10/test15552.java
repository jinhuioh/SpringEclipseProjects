package test10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//BufferedReader란?
//버퍼는 데이터를 한 곳에서 다른 한 곳으로 전송하는 동안 일시적으로 그 데이터를 보관하는 메모리의 영역
//버퍼는 컴퓨터 안의 프로세스 사이에서 데이터를 이동시킬 때 사용된다.
//버퍼 I/O가 없으면 각 읽기 또는 쓰기 요청이 기본 OS에서 직접 처리됨을 의미한다. 
//이건 각각의 그러한 요청이 종종 디스크 액세스,네트워크 활동 또는 
//상대적으로 비용이 많이 드는 기타 작업을 트리거하기 때문에 프로그램을 훨씬 덜 효율적으로 만들 수 있다. 
//버퍼를 써서 얻을 수 있는 장점은 2개다.
//1. 문자를 묶어서 한 번에 전달하므로 전송시간이 적게 걸려 성능이 향상된다
//2. 사용자가 문자를 잘못 입력했을 경우 수정할 수 있다.

//입력
//첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 
//다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
//
//출력
//각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
public class test15552 {

	public static void main(String[] args) throws Exception{

		
//		BufferedReader은 지정된 파일의 입력을 버퍼링한다.
//		버퍼링이 없으면 read() 또는 readLine()을 호출할 때마다 파일에서 바이트를 읽고
//		문자로 변환한 다음 반환할 수 있으므로 매우 비효율적일 수 있다.
//		객체 생성
		//입력한 것 저장
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//입력 저장한 것 출력
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());//해당 행을 실행시키기 위해 throw Exception을 해준다.
	
		for(int i=0; i<T; i++) {
			//리스트 strs를 생성(int A,B의 값을 담는다. 공백은 제거)
			String[] strs = br.readLine().split(" ");
			//아래 행을 실행시키기 위해 main에 throw Exception을 해준다.
			//list의 0번째에 A, 1번째에 B를 넣어준다. T번 실행.
			int A = Integer.parseInt(strs[0]);
			int B = Integer.parseInt(strs[1]);
				if(T<=1000000 && 1<=A && A<=1000 && 1<=B && B<=1000) {

				//System.out.println(A+B);
				//system.out.println()대신 bw.write를 쓰는 이유는
				//bw.write가 속도가 빠르고 더 효율적이기 때문이다.
				//"\n"으로 답 1개당 한 줄씩 띄어서 출력되도록 함.
				
//				toString():객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드
//				설명=>  https://jamesdreaming.tistory.com/142
				bw.write(Integer.toString(A + B) + "\n");
	//			해설: 이렇게 하면 A + B를 계산한 결과를 바로 출력하는 대신에, 버퍼에 출력할 데이터를 버퍼에 담을 수 있습니다.
	//			이 때 버퍼에는 문자열을 담아야 하므로, Integer.toString()을 이용해 계산한 A + B의 결과를 문자열로 형변환하였고,
	//			BufferedWriter는 줄바꿈 문자를 자동으로 넣어주지 않으므로, 직접 '\n' 을 넣었습니다.
			}//if
		}//for
//		bw.flush():버퍼에 모아뒀던 데이터들을 한꺼번에 출력하는 코드.
//		지금까지 모아둔 데이터를 출력.
//		이렇게 수정하면 시간 초과를 피할 수 있다!
		bw.flush();
	}

}
