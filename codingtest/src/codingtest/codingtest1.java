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
//입력
//첫째 줄에 물이 새는 곳의 개수 N과 테이프의 길이 L이 주어진다. 둘째 줄에는 물이 새는 곳의 위치가 주어진다. 
//N과 L은 1,000보다 작거나 같은 자연수이고, 물이 새는 곳의 위치는 1,000보다 작거나 같은 자연수이다.
//
//출력
//첫째 줄에 항승이가 필요한 테이프의 개수를 출력한다.
//
//예제 입력 1 
//4 2
//1 2 100 101
//예제 출력 1 
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
