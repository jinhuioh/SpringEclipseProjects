package test10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

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

	public static void main(String[] args) {

		try {
//			 BufferedReader은 지정된 파일의 입력을 버퍼링한다.
//			 버퍼링이 없으면 read() 또는 readLine()을 호출할 때마다 파일에서 바이트를 읽고
//			 문자로 변환한 다음 반환할 수 있으므로 매우 비효율적일 수 있다.
			BufferedReader in = new BufferedReader(new FileReader("foo.in"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
