package codingtest;

import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
//
public class codingtest2 {
	public static void main(String[] args) throws IOException {
//	BABBA dp���
	
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int k = Integer.parseInt(br.readLine());
//		//[0][n] : A
//		//[1][n] : B
//		int [][] dp =new int[2][46];
//		System.out.println(dp);
//		
////		�� �� ������ �� B 1 ��
//		dp[1][1] = 1;
////		�� �������� �� A,B�� 1��
//		dp[0][2] = 1; //A
//		dp[1][2] = 1; //B
//		
////		A�� B�� ���� �Ǻ���ġ
//		for(int i=3; i<=k; i++) {
//			dp[0][i] = dp[0][i-2] + dp[0][i-1];//���������� ���� ���� A�� ��
//			dp[1][i] = dp[1][i-2] + dp[1][i-1];//���������� ���� ���� B�� ��
//		}//for
//		
////		A,B�� ������ ���
//		System.out.println(dp[0][k]+" "+dp[1][k]);


		
//		�� ���� 2
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int num = Integer.parseInt(br.readLine());
//		if(num %2 ==1) {
//			System.out.println("CY");
//		}
//		else {
//			System.out.println("SK");
			
//		��ģ��
//		��ģ���� 0���� �������� �ʴ´�.
//		��ģ�������� 1�� �� �� �������� ��Ÿ���� �ʴ´�. ��, 11�� �κ� ���ڿ��� ���� �ʴ´�.
		
//		n�� �־����� �� n�ڸ� ��ģ���� ������ ���غ���. n�� ������ 1����90
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int n = Integer.parseInt(br.readLine());
//		
////		dp�� Ǯ��� // long���� �ؾ� ��! int�� �ϸ� 21�� �ڸ����� �Ѿ�� ����������. 
//		long[] dp = new long[91];
//		dp[0] = 0;
//		dp[1] = 1;
//		dp[2] = 1;
//		
//		for(int i=0; i<n-2; i++) {
//			dp[i+3] = dp[i+1] + dp[i+2];
//		}
//		
//		System.out.println(dp[n]);
//		
		
//		�Ǽ�
//		������ �ڸ��� ���
//		dp�� Ǯ���
		
//		������
//		int [] dp = new int[3];
//		dp[0] = 10022;
//		dp[1] = 20000;
//		dp[2] = 20000;
//		if(dp[2]>10000) {
//			String dpWord = Integer.toString(dp[2]);
//			System.out.println(dpWord);
//			int chardp = (dpWord.charAt(dpWord.length()-1)-'0');
//			System.out.println(chardp);
//		}
		
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int num = Integer.parseInt(br.readLine());
//		
////		����Ʈ����
//		int [] dp = new int[10000001];
//		dp[1] = 0;
//		dp[2] = 2;
//		dp[3] = 3;
//		for(int i=0; i<num-3; i++) {
//			dp[i+4] = dp[i+3] + dp[i+2];
//			if(dp[i+4]>10000) {
//				String dpWord = Integer.toString(dp[i+4]);
//				int chardp = (dpWord.charAt(dpWord.length()-1)-'0');
//				dp[i+4] = chardp;
//			}
//		}
//		String dpAnswer = Integer.toString(dp[num]);
//		int answer = (dpAnswer.charAt(dpAnswer.length()-1)-'0');
//		System.out.println(answer);
 
	
//	�Ǻ���ġ�� ���ܿ�~
//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	int n = Integer.parseInt(br.readLine());
//
//	//	dp�� Ǯ���!
//	//	������ 1,000,000,007�� ���� ������ ���
//	int[] dp = new int[51];
//	
//	dp[0] = 1;
//	dp[1] = 1;
//	for(int i=0; i<n-1; i++) {
//		dp[i+2] = dp[i] + dp[i+1] + 1;
//		// ���ڰ� �ʹ� Ŀ���� ���� ������ ���Ƿ� �̸� ������ ���������� �������ش�.	
//		if(dp[i+2] >= 1000000007) {
//			dp[i+2] = dp[i+2] % 1000000007;
//		}
//	}
//	System.out.println(dp[n]);
	

	//������
//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	String s = br.readLine();
//	
//	StringTokenizer st1 = new StringTokenizer(s,"0");
//	StringTokenizer st0 = new StringTokenizer(s,"1");
//	System.out.println(Math.min(st1.countTokens(), st0.countTokens()));
	

	//��Ÿ��
//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	String[] nums = br.readLine().split(" ");
//	int jull = Integer.parseInt(nums[0]);
//	int num = Integer.parseInt(nums[1]);
//	
//	//����Ʈ����
//	List<Integer> alllist = new ArrayList<Integer>(); 
//	List<Integer> onelist = new ArrayList<Integer>(); 
//	
//	for(int i = 0; i < num; i++) {
//		String[] price = br.readLine().split(" ");
//		int all = Integer.parseInt(price[0]);
//		int one = Integer.parseInt(price[1]);
//		
//		alllist.add(all);
//		onelist.add(one);
//	}//for
//	int allMin = Collections.min(alllist);
//	int oneMin = Collections.min(onelist);
//	
//	int answer = 0;
//	
//	//���� ���ǰ����� 6�� ����� (jull/6)*allMin + (jull%6)*oneMin ���� �������� 0�̹Ƿ� ������ �ȴ�.
//	answer = Math.min(((jull/6)+1)*allMin, (jull/6)*allMin + (jull%6)*oneMin);
//	answer = Math.min(jull*oneMin, answer);
//	System.out.println(answer);
		
		
//	������ �׽�
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String[] nums = br.readLine().split(" ");
	
	int n = Integer.parseInt(nums[0]);//���峭 ������ ����
	int l = Integer.parseInt(nums[1]);//����������
	
	int answer = 0;
//	���峭 ������ �Է¹ޱ�
	String[] pipes = br.readLine().split(" ");
	Arrays.sort(pipes);
//	System.out.println(pipes);
	float pnum = 0;//������
	
	for(String p: pipes) {
		float pint = Integer.parseInt(p);
		// �������� �ٿ����ϸ�
		if(pnum < pint + 0.5) {
			answer +=1;
			//pnum����
			
			pnum = (float) (pint+l-(0.5));
//			System.out.println("pnum>> "+pnum);
		}else {
			continue;
		}//else
		
	}//for
	System.out.println(answer);
	}
}
