package codingtest;

import java.awt.Window.Type;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class codingtest1 {

	public static void main(String[] args) throws IOException {

//		����
//		N���� ������ �־�����, �� �������� �� S�� ��ȣ�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//		�Է�
//		�� 3���� �׽�Ʈ ���� �־�����. �� �׽�Ʈ ���� ù° �ٿ��� N(1 �� N �� 100,000)�� �־�����, ��° �ٺ��� N���� �ٿ� ���� �� ������ �־�����. 
//		�־����� ������ ������ 9223372036854775807���� �۰ų� ����.
//
//		���
//		�� 3���� �ٿ� ���� �� �׽�Ʈ �¿� ���� N���� �������� �� S�� ��ȣ�� ����Ѵ�. S=0�̸� "0"��, S>0�̸� "+"��, S<0�̸� "-"�� ����ϸ� �ȴ�.
	
//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	for(int i=0; i < 3; i++) {
////		n�� �Է¹���!
//		BigInteger S = new BigInteger("0");// biginteger�� �� ���ڿ� ���� �Ѱ��־���Ѵ�.
//		int num = Integer.parseInt(br.readLine());
//		for(int j=0; j < num; j++ ) {
//			BigInteger one = new BigInteger(br.readLine());
//			S = S.add(one);
//			
//		}//for
//		
//		//compareTo(0)�� -1�̸� ����,1�̸� ���,0�̸�0 ���
//		if(S.compareTo(BigInteger.ZERO)== -1) {
//			System.out.println("-");
//			
//		}
//		else if (S.compareTo(BigInteger.ZERO)==1) {
//			System.out.println("+");
//			
//		}
//		else {
//			System.out.println("0");
//			
//		}
//	}//for
		
//		
//		��ȣ�� ���Ǵ�� T ��Ż��� �� �ڵ��� �ȸӳ��� ���. ���Ǵ�� T ��Ż�� ��ȣ���� ���� �� ���� ����� �� �ϳ��� �����϶�� �ߴ�.
//
//		���� �����
//		�ν� �����
//		���� ������� 30�ʸ��� 10���� û���ȴ�. �� ���� ���� 29�� �Ǵ� �� ���� ���� �ð� ��ȭ�� ������ 10���� û���ȴ�. 
//		���� 30�ʺ��� 59�� ���̷� ��ȭ�� ������ 20���� û���ȴ�.
//
//		�ν� ������� 60�ʸ��� 15���� û���ȴ�. �� ���� ���� 59�� �Ǵ� �� ���� ���� �ð� ��ȭ�� ������ 15���� û���ȴ�. 
//		���� 60�ʺ��� 119�� ���̷� ��ȭ�� ������ 30���� û���ȴ�.
//
//		��ȣ�� ���� �޿� ���Ǵ�� T ��Ż縦 �̿��� �� ��ȭ �ð� ����� �־����� ��� ������� ��� �ϴ� ���� �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//		�Է�
//		��ȣ�� ���� �޿� �̿��� ��ȭ�� ���� N�� �־�����. N�� 20���� �۰ų� ���� �ڿ����̴�. ��° �ٿ� ��ȭ �ð� N���� �־�����.
//		��ȭ �ð��� 10,000���� �۰ų� ���� �ڿ����̴�.
//
//		���
//		ù° �ٿ� �� ������� �̸��� ����Ѵ�. �� �Ŀ� ������ ���̿� �ΰ� ����� �� �� �������� ����Ѵ�. 
//		���� �� ������� ����� ��� ������ ������ ���� ���� �ν��� �� ������ ����.
//
//		������ Y��, �ν��� M���� ����Ѵ�.
//
//		���� �Է� 1 
//		3
//		40 40 40
//		���� ��� 1 
//		M 45
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int count1 = 0;//���Ŀ����
//		int count2 = 0;//�νĿ����
//		
//		int num1 = Integer.parseInt(br.readLine());
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//		
//		for(int i =0; i<num1; i++) {
//			int one = Integer.parseInt(st.nextToken());
////			���Ŀ����
//			int youn = 1+one/30;
//			count1 += youn*10;
////			�νĿ����
//			int minsik = 1+one/60; 
//			count2 += minsik*15;
//		}//for
////		System.out.println(count1+" "+count2);
//		if(count1 >count2) {
//			System.out.println("M "+count2);
//		}
//		else if(count1 == count2) {
//			System.out.println("Y M "+count1);
//			
//		}
//		else {
//			System.out.println("Y "+count1);
//			
//		}
//		int count =0;
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int a = Integer.parseInt(br.readLine());
//		String b = br.readLine();
//		for(int i =2; i>=0; i--) {
//			int bone = b.charAt(i) - '0';
//			int mul = bone*a;
//			System.out.println(mul);
//			if(i==1) {
//				mul = mul*10;
//			}
//			else if(i==0) {
//				mul = mul*100;
//			}
//			count +=mul;
//		
//		}
//		System.out.println(count);

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		if(b-a > c-b) {
			System.out.println((b-a-1));
		}
		else {
			System.out.println((c-b-1));
		}
	}

}
