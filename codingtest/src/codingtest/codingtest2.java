package codingtest;

import java.util.List;
import java.util.Queue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

import javax.management.Query;
//
public class codingtest2 {
	public static void main(String[] args) throws IOException {
//	BABBA dp방식
	
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int k = Integer.parseInt(br.readLine());
//		//[0][n] : A
//		//[1][n] : B
//		int [][] dp =new int[2][46];
//		System.out.println(dp);
//		
////		한 번 눌렀을 때 B 1 개
//		dp[1][1] = 1;
////		두 번눌렀을 때 A,B각 1개
//		dp[0][2] = 1; //A
//		dp[1][2] = 1; //B
//		
////		A와 B가 각각 피보나치
//		for(int i=3; i<=k; i++) {
//			dp[0][i] = dp[0][i-2] + dp[0][i-1];//이전값들의 합이 다음 A의 값
//			dp[1][i] = dp[1][i-2] + dp[1][i-1];//이전값들의 합이 다음 B의 값
//		}//for
//		
////		A,B의 개수를 출력
//		System.out.println(dp[0][k]+" "+dp[1][k]);


		
//		돌 게임 2
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int num = Integer.parseInt(br.readLine());
//		if(num %2 ==1) {
//			System.out.println("CY");
//		}
//		else {
//			System.out.println("SK");
			
//		이친수
//		이친수는 0으로 시작하지 않는다.
//		이친수에서는 1이 두 번 연속으로 나타나지 않는다. 즉, 11을 부분 문자열로 갖지 않는다.
		
//		n이 주어졌을 때 n자리 이친수의 개수를 구해보자. n의 범위는 1부터90
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int n = Integer.parseInt(br.readLine());
//		
////		dp로 풀어보자 // long으로 해야 함! int로 하면 21억 자리수가 넘어가서 오류가난다. 
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
		
//		악수
//		마지막 자리만 출력
//		dp로 풀어보자
		
//		연습용
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
////		리스트생성
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
 
	
//	피보나치는 지겨웡~
//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	int n = Integer.parseInt(br.readLine());
//
//	//	dp로 풀어보자!
//	//	정답을 1,000,000,007로 나눈 나머지 출력
//	int[] dp = new int[51];
//	
//	dp[0] = 1;
//	dp[1] = 1;
//	for(int i=0; i<n-1; i++) {
//		dp[i+2] = dp[i] + dp[i+1] + 1;
//		// 숫자가 너무 커지면 연산 오류가 나므로 미리 나눠서 나머지끼리 연산해준다.	
//		if(dp[i+2] >= 1000000007) {
//			dp[i+2] = dp[i+2] % 1000000007;
//		}
//	}
//	System.out.println(dp[n]);
	

	//뒤집기
//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	String s = br.readLine();
//	
//	StringTokenizer st1 = new StringTokenizer(s,"0");
//	StringTokenizer st0 = new StringTokenizer(s,"1");
//	System.out.println(Math.min(st1.countTokens(), st0.countTokens()));
	

	//기타줄
//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	String[] nums = br.readLine().split(" ");
//	int jull = Integer.parseInt(nums[0]);
//	int num = Integer.parseInt(nums[1]);
//	
//	//리스트생성
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
//	//만약 줄의개수가 6의 배수면 (jull/6)*allMin + (jull%6)*oneMin 에서 나머지가 0이므로 연산이 된다.
//	answer = Math.min(((jull/6)+1)*allMin, (jull/6)*allMin + (jull%6)*oneMin);
//	answer = Math.min(jull*oneMin, answer);
//	System.out.println(answer);
		
		
//	수리공 항승
//	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//      StringTokenizer st = new StringTokenizer(br.readLine());
//      int n = Integer.parseInt(st.nextToken());//물 새는 곳 개수
//      int l = Integer.parseInt(st.nextToken());//테이프길이
//      
//      //답이 될 변수
//      int answer = 0;
//      
////	      고장난 파이프 입력받기
//      int[] pipes = new int[n];
////	      토큰으로 한줄입력받아서 한개씩 끊어서 int로 형변환 후 저장
//      st = new StringTokenizer(br.readLine());
//      for(int i=0; i<pipes.length; i++) {
//         pipes[i] = Integer.parseInt(st.nextToken());
//      }
//      //sort로 작은수부터 리스트에 담기도록 한다
//      Arrays.sort(pipes);
////	      System.out.println("pipes>> "+pipes);
//      
//      
//      float pnum = 0;//테이프
//      
//      for(int j=0; j<pipes.length; j++) {
////	         리스트에 있는 원소 하나씩 꺼내서  pint 에 담기
//         int pint = (int) pipes[j];
////	         System.out.println("pint"+pint);
////	         System.out.println(pipes.length+" "+j);
//         // 리스트에서 꺼 낸 원소가 짧아서 테이프를 붙어야하는 경우
//         if(pnum < pint + 0.5) {
//            answer +=1;
//            //붙인 테이프의 마지막위치 pnum 갱신
//            pnum = (float) (pint+l-(0.5));
////	            System.out.println("pnum>> "+pnum);
//         }else {
//            // 리스트에서 꺼 낸 원소가 길어서 테이프를 붙이지않아도 되는 경우
//            continue;
//         }//else
//      }//for
//      System.out.println(answer);
		
		
		
		//등수 매기기
//		입력
//		첫째 줄에 자연수 N이 주어진다. (1 ≤ N ≤ 500,000) 둘째 줄부터 N개의 줄에 걸쳐 각 사람의 예상 등수가 순서대로 주어진다. 예상 등수는 500,000 이하의 자연수이다.
//
//		출력
//		첫째 줄에 불만도의 합을 최소로 할 때, 그 불만도를 출력한다.
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int n = Integer.parseInt(br.readLine());
//		
//		//예상등수를 넣을 리스트
//		List<Integer> nums = new ArrayList<Integer>();
//		
//		for (int i=0; i<n; i++) {
//			//예상등수 입력받기
//			int one = Integer.parseInt(br.readLine());
//			//예상등수 add
//			nums.add(one);
//		}//for
//		
//		//sort
//		Collections.sort(nums);
//		
//		//불만도의 합 구하기
//		long answer = 0;
//		for(int j=1; j<=n; j++) {
//			int num = nums.get(j-1);
//			answer += Math.abs(num-j);
//		}
//		System.out.println(answer);
//	

		
		//햄버거 분배
//		입력
//		첫 줄에 두 정수 $N$과 $K$가 있다. 그리고 다음 줄에 사람과 햄버거의 위치가 문자 P(사람)와 H(햄버거)로 이루어지는 길이 $N$인 문자열로 주어진다.
//
//		출력
//		첫 줄에 햄버거를 먹을 수 있는 최대 사람 수를 나타낸다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//문자열 n입력
		int n = Integer.parseInt(st.nextToken());
		//k입력
		int k = Integer.parseInt(st.nextToken());
		
		//사람인 경우만 넣는 리스트
		Queue<Integer> p_list = new LinkedList<Integer>();
		
		//햄버거, 사람 배열
		char[] arr = new char[n];
		
		//햄버거와 사람입력
		String temp = br.readLine();
		
		for(int i=0; i<n; i++) {
			arr[i] = temp.charAt(i);
			//사람인 경우 add
			if(arr[i] =='P'){
				p_list.add(i);
			}
		}//for
		
		//정답 변수
		int answer = 0;
		
		boolean already = false;
//		poll로 queue에 있는 p를 하나씩 꺼내서 하나도 없으면 while문 멈춤
		while(!p_list.isEmpty()) {
			//poll : 해당 큐의 맨 앞에 있는(제일 먼저 저장된) 요소를 반환하고, 해당 요소를 큐에서 제거
			int t = p_list.poll();
			
			//사람을 기준으로 왼쪽에 있는 햄버거를 찾는다.
			for(int i=k; i>0; i--) {
				if(t-i>=0 && arr[t-i]=='H'){//음수 인덱스를 제외. 
					//햄버거를 선택한 경우 값을 바꿔준다.
					arr[t-i]='P';
					answer ++;
					already=true;
					break;
				}//if
			}//for
			
			//이미 true이면 break. 즉 왼쪽 햄버거를 선택한 경우 break;해준다.
			for(int i=1; i<=k; i++) {
				if(already) break;
				
				if(t+i<n && arr[t+i]=='H') {
					arr[t+i]='P';
					answer++;
					break;
				}//if
			}//for
			//다음 p계산을 위해 값 false로 갱신
			already = false;
			
		}
		System.out.println(answer);
		
	}

}
	