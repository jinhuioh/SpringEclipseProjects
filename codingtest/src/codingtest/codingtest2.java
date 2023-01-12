package codingtest;

import java.util.List;
import java.util.Queue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

import javax.management.Query;
import javax.swing.JPopupMenu.Separator;
public class codingtest2 {
//	�Է�
//	ù° �ٿ� �α԰� �����Ϸ��� �ϴ� ī���� ���� N�� �־�����. (1 �� N �� 1,000)
//
//	��° �ٿ��� Pi�� P1���� PN���� ������� �־�����. (1 �� Pi �� 10,000)
//
//	���
//	ù° �ٿ� �α԰� ī�� N���� ���� ���� �����ؾ� �ϴ� �ݾ��� �ִ��� ����Ѵ�.
//
//	���� �Է� 1 
//	4
//	1 5 6 7
//	���� ��� 1 
//	10
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] map = new int[n+1];
		int[] dp = new int[n+1];//������ ���� �迭
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i =1; i<=n; i++) {
			int one = Integer.parseInt(st.nextToken());
			map[i] = one;
		}//for
		dp[1] = map[1];
		dp[2] = Math.max(map[1]*2, map[2]);
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				dp[i] = Math.max(dp[i], dp[i-j]+map[j]);
			}
		}//for
		System.out.println(dp[n]);
	}

}
   