package codingtest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.StringTokenizer;
import java.util.*;
//�Է�
//ù° �ٿ� ���� ���� ���� ���� N�� �������� ���� L�� �־�����. ��° �ٿ��� ���� ���� ���� ��ġ�� �־�����. 
//N�� L�� 1,000���� �۰ų� ���� �ڿ����̰�, ���� ���� ���� ��ġ�� 1,000���� �۰ų� ���� �ڿ����̴�.
//
//���
//ù° �ٿ� �׽��̰� �ʿ��� �������� ������ ����Ѵ�.
//
//���� �Է� 1 
//4 2
//1 2 100 101
//���� ��� 1 
//2
public class codingtest1 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int[] water = new int[n];
		for(int i = 0; i<n; i++) {
			water[i] = sc.nextInt();
		}

		Arrays.sort(water);
		int cnt = 0;
		
		int now = (int) (water[0]-0.5);
		for(int i = 0; i<n; i++) {
			if(now+l < water[i]) {
				cnt++;
				now = (int) (water[i]-0.5);
			}
		}
		System.out.println(cnt+1);
	}
}
