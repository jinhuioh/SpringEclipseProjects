package codingtest;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import javax.swing.plaf.SliderUI;

//����
//N�� �־����� ��, 1���� N������ ���� �̷���� ������ ���������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//�Է�
//ù° �ٿ� N(1 �� N �� 8)�� �־�����. 
//
//���
//ù° �ٺ��� N!���� �ٿ� ���ļ� ��� ������ ���������� ����Ѵ�.
//
//���� �Է� 1 
//3
//���� ��� 1 
//1 2 3
//1 3 2
//2 1 3
//2 3 1
//3 1 2
//3 2 1

public class codingTest3 {
	static int n;
	static int[] arr, change_arr;
	static boolean[] visited;
	private static void dfs(int index) {
		if(index == n) {
			for(int i = 0; i < n; i++) {
				System.out.print(change_arr[i]+" ");
			}
			System.out.println();
		}//if
		for(int i = 0; i < n; i++) {
			if(!visited[i]) {
				
				visited[i] = true;
				change_arr[index] = arr[i];
				dfs(index+1);
				visited[i] = false;
				
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		visited = new boolean[n];
		arr = new int[n];
		change_arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = i+1; 
		}
		dfs(0);
		
	}
}