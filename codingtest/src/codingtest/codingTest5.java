package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class codingTest5 {
//	����
//	�ȳ�
//	�����̴� ���������� �� �Ŀ� ������ �ʹ� ���� �Կ��� �־���. ���� �����̰� ������ �Կ��� ���� �ڱ⸦ �������� ����鿡�� �����ϴٰ� ���� �����̴�.
//
//	�����̸� �������� ����� �� N���� �ִ�. ����� ��ȣ�� 1������ N������ �ִ�. �����̰� i�� ������� �λ縦 �ϸ� L[i]��ŭ�� ü���� �Ұ�, J[i]��ŭ�� ����� ��´�. �����̴� ������ ������� �ִ� 1���� ���� �� �ִ�.
//
//	�������� ��ǥ�� �־��� ü�³����� �ִ����� ����� ������ ���̴�. �������� ü���� 100�̰�, ����� 0�̴�. ���� �������� ü���� 0�̳� ������ �Ǹ�, �׾ �ƹ��� ����� �� ���� ���� �ȴ�. �����̰� ���� �� �ִ� �ִ� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//	�Է�
//	ù° �ٿ� ����� �� N(�� 20)�� ���´�. ��° �ٿ��� ������ ������� �λ縦 �� ��, �Ҵ� ü���� 1�� ������� ������� ������, ��° �ٿ��� ������ ������� �λ縦 �� ��, ��� ����� 1�� ������� ������� ���´�. ü�°� ����� 100���� �۰ų� ���� �ڿ��� �Ǵ� 0�̴�.
//
//	���
//	ù° �ٿ� �����̰� ���� �� �ִ� �ִ� ����� ����Ѵ�.
//
//	���� �Է� 1 
//	3
//	1 21 79
//	20 30 25
//	���� ��� 1 
//	50
	
	static final Scanner sc = new Scanner(System.in);
	static int n; // ����� ��
	static int[] health;// ü�� �Ҵ� ��
	static int[] pleasure;// ��� ��� ��
	public static void main(String[] args) throws NumberFormatException, IOException {
		n = sc.nextInt();
		health = new int[n];
		pleasure = new int[n];
	
		for(int i = 0; i<n; i++) {
			health[i] = sc.nextInt();
		}//for
		for(int i = 0; i<n; i++) {
			pleasure[i] = sc.nextInt();
		}//for
		System.out.println(go(0,0,0));
	}
	
	//��͸� �̿��Ͽ� ��� ���� ���� ���ϵ��� ����
	public static int go(int index, int now_life, int sum) {
		if(now_life >= 100) {
			return 0;
		}
		if(index == n) {
			return sum;
		}
		int answer = 0;
		
		answer = Math.max(answer, go(index+1,now_life+health[index], sum+pleasure[index]));//���� �ε��� ��ġ �� ���Ѱſ� answer�� �ִ밪 ����
		
		answer = Math.max(answer, go(index+1, now_life, sum));//���� �ε��� ��ġ �� �ȴ��ϰ� �н��ѰŶ� answer�� �ִ밪
		return answer;
	}

}
