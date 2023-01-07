package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class codingTest4 {
//	����
//	������
//	n���� ������ �̷���� ������ ������ �־�����. �츮�� �� �� ���ӵ� �� ���� ���� �����ؼ� ���� �� �ִ� �� �� ���� ū ���� ���Ϸ��� �Ѵ�. ��, ���� �� �� �̻� �����ؾ� �Ѵ�.
//
//	���� �� 10, -4, 3, 1, 5, 6, -35, 12, 21, -1 �̶�� ������ �־����ٰ� ����. ���⼭ ������ 12+21�� 33�� ������ �ȴ�.
//
//	�Է�
//	ù° �ٿ� ���� n(1 �� n �� 100,000)�� �־����� ��° �ٿ��� n���� ������ �̷���� ������ �־�����. ���� -1,000���� ũ�ų� ����, 1,000���� �۰ų� ���� �����̴�.
//
//	���
//	ù° �ٿ� ���� ����Ѵ�.
	
//	���� �Է� 1 
//	10
//	10 3 1 5 6 -35 12 21 -1
//	���� ��� 1 
//	33
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] map = new int[n];
		int[] dp = new int[n];
		for(int i = 0; i<n; i++) {
			map[i] = Integer.parseInt(st.nextToken());
		}//for
		
		dp[0] = map[0];
		int answer = map[0];//���� �ʱⰪ ������ i=1���� �ϹǷ� map[0]�� �ʱⰪ���� �־��ش�.
		for(int i = 1; i<n; i++) {
			dp[i] = Math.max(dp[i-1]+map[i], map[i]);
			answer = Math.max(answer, dp[i]);
		}//for
		System.out.println(answer);
	}
}