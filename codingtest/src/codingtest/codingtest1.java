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

		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		StringTokenizer st = new StringTokenizer(br.readLine()," ");
//		int a = Integer.parseInt(st.nextToken());
//		int b = Integer.parseInt(st.nextToken());
//		int c = Integer.parseInt(st.nextToken());
//		if(b-a > c-b) {
//			System.out.println((b-a-1));
//		}
//		else {
//			System.out.println((c-b-1));
//		}//else
		
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int a = Integer.parseInt(br.readLine());
//		int sum = 0;
//		for(int i=0; i<=a; i++) {
//			for(int j=i; j<=a; j++) {
//				sum = sum + i + j;
//			}
//		}
//		System.out.println(sum);
//		

		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int a = Integer.parseInt(br.readLine());
//		for(int i =0; i<a; i++) {
//			int sum = 0;
////			���ڿ�����Ʈ �Է�
//			String[] num = (br.readLine().split(" "));
////			¦���� ���� ����Ʈ ����
//			ArrayList nums = new ArrayList();
//
//			//¦���� ���
//			for(int i1=0; i1<num.length; i1++) {
//			
//				int one = Integer.parseInt(num[i1]);
//				
//				if(one %2 ==0) {
////					¦���� ���� �� ���ϱ�.
//					sum = sum + one; 	
////					¦���� ����Ʈ�� ���.
//					nums.add(one);
//				}//if
//			}
//	
////			¦���� �ּҰ�
//			int mins = (int) Collections.min(nums);
////			���� ���
//			System.out.println(sum+" "+mins);
//		}//for

		
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////		���۷� ��Ʈ�� �迭 �Է�
//		String [] nums = br.readLine().split(" ");
//
//		
//		//		��Ʈ�� �迭�� int�� �ٲ�
//		int arr[] = new int[3];
//		
//		for(int i=0; i<3; i++) arr[i] = Integer.parseInt(nums[i]);
//		
////		����
//		Arrays.sort(arr);
//		
////		�ι�° �� �Է�
//		String [] nums2 = br.readLine().split("");
//		
////		nums2�� i��° �ܾ��� ù��°(charAt(0))�� ������ �ƽ�Ű�ڵ��̹Ƿ� -'A'�� ���ش�. �ش� �ε����� arr���� �����ָ� 
////		A�� 0��° arr�ε��� ���ڰ��� ������ C�̸� 2��° �ε��� ���� ����..
//		for(int i=0; i<3; i++) bw.write(arr[nums2[i].charAt(0) - 'A']+" ");
//		bw.flush();

	
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		
//		boolean[] arr = new boolean[31];
//		
//		for(int i = 0; i<28; i++) {
//			int n = Integer.parseInt(br.readLine());
//			arr[n]=true;
//			
//		}
//		for(int i = 1; i<=30; i++) {
//			if (!arr[i]) {
//				System.out.println(i);
//			}
//		}
		
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////		HashSet�� collection�� set�� �Ļ�Ŭ������ �ߺ�������,�����������(sort��� �Ұ���)
//		HashSet<Integer> hs = new HashSet<Integer>();
//		for(int i = 0; i<10; i++) {
//			hs.add(Integer.parseInt(br.readLine()) % 42);
//		}//for
//		
//		br.close();
//		System.out.println(hs.size());
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int[] arr = new int[10];
//		boolean bl;
//		int cnt = 0;
//		
//		for(int i = 0; i<arr.length; i++) {
//			arr[i] = Integer.parseInt(br.readLine()) % 42;
//		
//		}
//		for(int i=0; i<10; i++) {
//			bl = false;
//			for(int k = i+1; k< arr.length; k++) {
//				if(arr[i] == arr[k]) {
//				bl = true;
//				break;
//			}
//		}
//		if(bl == false) {
//			cnt++;
//		}
//		}//for
//		System.out.println(cnt);
	
		
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int num = Integer.parseInt(br.readLine());	
//		for(int i=0; i<num; i++) {
//			String[] arr = br.readLine().split(" ");
//			arr[0] = "0";
//			double sum = 0;
//			double avg = 0;
//			double count = 0;
//			Double answer;
//			for(int j=0; j<arr.length; j++) {
//				sum += (Integer.parseInt(arr[j]));
//				avg = sum/(arr.length-1);
//			}//for
//			for(int j1=0; j1<arr.length; j1++) {
//				if (Integer.parseInt(arr[j1])>avg) {
//					count +=1;
//					
//				}//if
//				
//			}//for
//			answer= (double) ((100*count)/(arr.length-1));
//			String result = String.format("%.3f", answer);
//			System.out.println(result+"%");
//		}//for

		
		
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String[] nums = br.readLine().split(" ");
//		int num = Integer.parseInt(nums[1]);
////		�� �ʱⰪ
//		int answer = 0;
//		String[] arr = br.readLine().split(" ");
//		
//		for(int i=0; i<arr.length-2; i++) {
//			int one1 = Integer.parseInt(arr[i]);
//			
//			for(int j=i+1; j<arr.length-1; j++) {
//				int one2 = Integer.parseInt(arr[j]);
//				
//				for(int k=j+1; k<arr.length; k++) {
//					int one3 = Integer.parseInt(arr[k]);
//					int one = one1 + one2 + one3;
//					
//					if(one<= num && one > answer) {
//						answer = one;
//					}//if
//				}
//			}
//		}//for
//	System.out.println(answer); 
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int high = 0;
		int number = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i< num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int h = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int one = Integer.parseInt(st.nextToken());
			
		
		
		if(one % h == 0) {
			sb.append((h*100)+(one/h)).append('\n');
		}else {
			sb.append(((one % h)*100)+((one/h)+1)).append('\n');
			
		}
		}//for
		System.out.println(sb);
	}

}
