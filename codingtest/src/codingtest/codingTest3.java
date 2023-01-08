package codingtest;

import java.awt.Window.Type;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class codingTest3 {
//	����
//	�����ֽý�
//	ȿ�ִ� ������ �ý�ȸ�� ����. �� ���� ������, ���̺� ���� �پ��� �����ְ� ����ִ� ������ ���� �Ϸķ� ���� �־���. ȿ�ִ� ������ �ý��� �Ϸ��� �ϴµ�, ���⿡�� ������ ���� �� ���� ��Ģ�� �ִ�.
//
//	������ ���� �����ϸ� �� �ܿ� ����ִ� �����ִ� ��� ���ž� �ϰ�, ���� �Ŀ��� ���� ��ġ�� �ٽ� ���ƾ� �Ѵ�.
//	�������� ���� �ִ� 3���� ��� ���� ���� ����.
//	ȿ�ִ� �� �� �ִ� ��� ���� ���� �����ָ� ������ ���ؼ� � ������ ���� �����ؾ� ���� ����ϰ� �ִ�. 1���� n������ ��ȣ�� �پ� �ִ� n���� ������ ���� ������� ���̺� ���� ���� �ְ�, �� ������ �ܿ� ����ִ� �������� ���� �־����� ��, ȿ�ָ� ���� ���� ���� ���� �����ָ� ���� �� �ֵ��� �ϴ� ���α׷��� �ۼ��Ͻÿ�. 
//
//	���� ��� 6���� ������ ���� �ְ�, ������ �ܿ� ������� 6, 10, 13, 9, 8, 1 ��ŭ�� �����ְ� ��� ���� ��, ù ��°, �� ��°, �� ��°, �ټ� ��° ������ ���� �����ϸ� �� ������ ���� 33���� �ִ�� ���� �� �ִ�.
//
//	�Է�
//	ù° �ٿ� ������ ���� ���� n�� �־�����. (1 �� n �� 10,000) ��° �ٺ��� n+1��° �ٱ��� ������ �ܿ� ����ִ� �������� ���� ������� �־�����. �������� ���� 1,000 ������ ���� �ƴ� �����̴�.
//
//	���
//	ù° �ٿ� �ִ�� ���� �� �ִ� �������� ���� ����Ѵ�.
//	���� �Է�1
//	6
//	6
//	10
//	13
//	9
//	8
//	1
//	���� ��� 1 
//	33
	
	static int n;
	static int[] map,arr;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		map = new int[n+1];
		arr = new int[n+1];
		//map�Է�
		for(int i = 1; i <= n; i++) {
			int m = Integer.parseInt(br.readLine());
			map[i] = m;
		}//for
		
		arr[1] = map[1];
		if(n>1) {
			arr[2] = map[1]+map[2];
		}
		for(int i = 3; i <= n; i++) {
			arr[i] = Math.max(arr[i-1], Math.max(map[i]+map[i-1]+arr[i-3], arr[i-2]+map[i]));
//			System.out.println(i+" "+arr[i]);
		}//for
		System.out.println(arr[n]);
	}

}

