package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class codingtest1 {

	public static void main(String[] args) throws IOException {
//		=========================================================================
////		���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. ������ ���ĺ��� ���ؼ�, 
////		�ܾ ���ԵǾ� �ִ� ��쿡�� ó�� �����ϴ� ��ġ��, 
////		���ԵǾ� ���� ���� ��쿡�� -1�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////		���� �迭 �ϳ��� ���� ���� -1�� �ʱ�ȭ ��Ű��.
//		int[] arr = new int[26];
//		for(int i=0; i< arr.length; i++) {
//			arr[i] = -1;
//		}
//		
//		String S = br.readLine();
//		
//		for(int i = 0; i<S.length(); i++) {
//			char ch = S.charAt(i);
//			
//			if(arr[ch - 'a'] == -1) {// arr ���Ұ��� -1�� ��쿡�� �ʱ�ȭ
//				arr[ch - 'a'] = i;
//			}
//		}
//		for(int val : arr) {
//			System.out.print(val+" ");
//		}
		
//		=========================================================================
//		��Ʈ�����κ��� �� ���ڸ� �о int������ ���� ('3' -> (int)'3' -> 51) �ϱ⶧���� ���۷� 2�� �Է��ϸ� '2'�� ���ڰ��� ��������
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
		
//		int n = br.read();
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//	
//		for(int i=1; i<10; i++) {
//			System.out.println(n+" "+"*"+" "+i+" "+"="+" "+n*i);
//		}
//		
		
		
//		=========================================================================
		//����
		//�� ���� �ڿ��� A, B, C�� �־��� �� A �� B �� C�� ����� ����� 0���� 9���� ������ ���ڰ� �� ���� ���������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//
		//���� ��� A = 150, B = 266, C = 427 �̶�� A �� B �� C = 150 �� 266 �� 427 = 17037300 �� �ǰ�, ����� ��� 17037300 ���� 0�� 3��, 1�� 1��, 3�� 2��, 7�� 2�� ������.
		//
		//�Է�
		//ù° �ٿ� A, ��° �ٿ� B, ��° �ٿ� C�� �־�����. A, B, C�� ��� 100���� ũ�ų� ����, 1,000���� ���� �ڿ����̴�.
//		Scanner in = new Scanner(System.in);
//		
//		int value = (in.nextInt() * in.nextInt() * in.nextInt());
//		String str = Integer.toString(value);
//		in.close();
//		
//		for(int i = 0; i < 10; i++) {
//			int count = 0;
//			for(int j = 0; j < str.length(); j++) {
//				if((str.charAt(j)-'0')==i) {
//					count++;
//				}
//			}
//			System.out.println(count);
//		}
		
//		=========================================================================
//		������
//		(A+B)%C�� ((A%C) + (B%C))%C �� ������?
//
//				(A��B)%C�� ((A%C) �� (B%C))%C �� ������?
//
//				�� �� A, B, C�� �־����� ��, ���� �� ���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//				�Է�
//				ù° �ٿ� A, B, C�� ������� �־�����. (2 �� A, B, C �� 10000)
//
//				���
//				ù° �ٿ� (A+B)%C, ��° �ٿ� ((A%C) + (B%C))%C, ��° �ٿ� (A��B)%C, ��° �ٿ� ((A%C) �� (B%C))%C�� ����Ѵ�.
		

//		Ǯ��:
//			BufferedReader �� ���� ����̴�.
//			readLine() �� ���� �Է� �޾� �����ϴ� ��� �� ������ ������ ���̴�.
//			�ռ� ���ߵ��� readLine() �� �� ���� ���� �б� ������ ��������� �Է��� �� ���ڿ��� ��������� �и����־�� ������ Ǯ �� ���� ���̴�.
//			���ڿ� �и� ��� �� ������ Ǯ���.
//			1. StringTokenizer Ŭ������ �̿��Ͽ� �и����ִ� ���
//			2. split() �� �̿��ϴ� ���
//			�׸��� �ݵ�� �ڷ��� Ÿ���� �� ���ƾ� �Ѵ�.
//			st.nextToken() �� ���ڿ��� ��ȯ�ϴ� Integer.parseInt()�� int ������ ��ȯ�����ش�.
//			(double ������ Ǯ�� �������� ������ ���͵� �Ҽ������� ���� ��µǾ� �������� ó���ȴ�.)

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		//str������ �Է¹ް� �������� ���ڿ� �и�
//		String str = br.readLine();
//		StringTokenizer st = new StringTokenizer(str," ");
//		
//		//�������� �и��� ���ڸ� a,b,c��ü�� �ϳ��� �Ҵ�.
//		int a = Integer.parseInt(st.nextToken());
//		int b = Integer.parseInt(st.nextToken());
//		int c = Integer.parseInt(st.nextToken());
//		
//		System.out.println((a+b)%c);
//		System.out.println((a%c + b%c)%c);
//		System.out.println((a*b)%c);
//		System.out.println((a%c * b%c)%c);
		
//		=========================================================================
//		����
//		���� N���� �̷���� ���� A�� ���� X�� �־�����. �̶�, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//		�Է�
//		ù° �ٿ� N�� X�� �־�����. (1 �� N, X �� 10,000)
//
//		��° �ٿ� ���� A�� �̷�� ���� N���� �־�����. �־����� ������ ��� 1���� ũ�ų� ����, 10,000���� �۰ų� ���� �����̴�.
//
//		���
//		X���� ���� ���� �Է¹��� ������� �������� ������ ����Ѵ�. X���� ���� ���� ��� �ϳ� �����Ѵ�.
//
//		���� �Է� 1 
//		10 5
//		1 10 4 9 2 3 8 5 7 6
//		���� ��� 1 
//		1 4 2 3
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
//		ù°���Է�
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		
//		��°�� �Է�
		st = new StringTokenizer(br.readLine()," ");
		
//		b���� ���� �� ��� ��ü
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<a; i++){
			int value = Integer.parseInt(st.nextToken());
			
			if(value < b) {
				sb.append(value).append(" ");
			}
		}
		System.out.println(sb);
	}

}
