package codingtest;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import javax.swing.plaf.SliderUI;
public class codingTest3 {
//	����� ��
//	cap	n	deliveries	pickups	result
//	4	5	[1, 0, 3, 1, 2]	[0, 3, 0, 4, 0]	16
//	2	7	[1, 0, 2, 0, 1, 0, 2]	[0, 2, 0, 1, 0, 2, 0]	30
	//�ù�� ��� �����ϱ�
	// ������ ��ġ���� ���ʴ�� ���
	// cap-���������� ��ް��� + �������ù� ����<= cap �̸� ����.
	
	// ���� ��ġ ����! ������Ѵ�.
	
	public static void main(String[] args) throws NumberFormatException, IOException, InterruptedException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 7;
		int cap = 2;
        int[] deliveries = new int[] {1, 0, 2, 0, 1, 0, 2};
        int[] pickups = new int[] {0, 2, 0, 1, 0, 2, 0};
        Solution s = new Solution();
		System.out.println(s.solution(cap, n, deliveries, pickups));
	
	}
}
	// deliveries_len�� �迭 deliveries�� �����Դϴ�.
	// pickups_len�� �迭 pickups�� �����Դϴ�.
	class Solution {
		public long solution(int cap, int n, int[] deliveries, int[] pickups) throws InterruptedException {
	        long answer = 0;
	        int start = 0;
	        int n2 = n;
	        while (true) {
	        	int c = 0;
//	        	for(int i = 0; i<n; i++) {
//	        		System.out.print(deliveries[i]+" ");
//	        	}
//	        	System.out.println();
//	        	for(int i = 0; i<n; i++) {
//	        		System.out.print(pickups[i]+" ");
//	        	}
//	        	System.out.println();
				for(int i = n-1; i>=0; i--) {
					if(deliveries[i] != 0 || pickups[i] != 0) {
						c=1;
						start = i;
						break;
					}
				}//for
				
				if(c==0) {//���� 0 �̹Ƿ�
					return answer;
				}//if
				
				//����
				int pick = 0;
				int deli = 0;
			
				for(int i = start; i>=0; i--) {
					if(deli + deliveries[i] > cap) continue;
					if(pick + pickups[i] > cap) continue;
					deli += deliveries[i];
					pick += pickups[i];
					
					if(deli-pick <= cap && deli <= cap && pick <= cap) {
//						System.out.println("i>> "+ i);
//						System.out.println("0���� ������");
						deliveries[i] = 0;
						pickups[i] = 0;
					}
				}//for
				answer += (start+1)*2;
//				System.out.println(answer);
//				Thread.sleep(1000);
//				System.out.println();
			}//while
	        
	    }//public long     
	}
