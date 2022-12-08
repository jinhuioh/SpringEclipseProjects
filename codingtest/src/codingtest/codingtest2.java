package codingtest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;
//
public class codingtest2 {
//	//�Լ�����
//	static int solve(long n) {
//	    long sum = 0;
//	    int addNum = 0;
//	    while(n >= sum) {
//	        sum += (++addNum);
//	    }
//
//	    return sum == n ? addNum : addNum - 1;
//	}
//	
	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		long n = Long.parseLong(br.readLine());
//
//	    System.out.println(solve(n));
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String nstr = br.readLine();
		int sum = 0;

//		�ش� ���� ���ġ ����
		char[] charArr = nstr.toCharArray();
		Arrays.sort(charArr);//�������� ����
		int len = charArr.length;
		
		StringBuilder sb = new StringBuilder();
		
//		�������� �����̹Ƿ�, �� �� ���Һ��� �ݴ�� Ž��
		for(int i= len-1; i>= 0; i--) {
			int num = charArr[i] - '0';
//			�� �ڸ����� ������ �� 3�� ����̸� �ش� ���ڰ� 3�� ����̹Ƿ� sum������ �� �ڸ����� ���� ����
			sum +=num;
//			StringBuilder�� ��Ʈ�� �� �Ѱ��� ����
			sb.append(num);
			
		}
		
//		30�� ������� �Ǵ��ϱ� ���� ���� ����
		
		if(charArr[0] != '0' || sum % 3 != 0) {//���� 3�� ����� �ƴ϶��
//			-1�� ���
			System.out.println(-1);
			return;
		}
		
		System.out.println(sb.toString());
	}
 
}
