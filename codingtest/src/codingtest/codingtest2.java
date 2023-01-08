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
//	문제
//	인류의 차세대 인공지능 자원 캐기 로봇인 WOOK은 인간 대신 자원을 캐는 로봇이다.
//	WOOK은 언제나 제한된 범위 내에서 자원을 탐색하며, 왼쪽 위 (1, 1)부터 오른쪽 아래 (N, M)까지 자원을 탐색한다. 
//	WOOK은 한 번에 오른쪽 또는 아래쪽으로 한 칸 이동할 수 있으며, 그 외의 방향으로 움직이는 것은 불가능하다. 
//	WOOK은 자신이 위치한 (x, y)에 자원이 있는 경우에만 해당 자원을 채취할 수 있다. WOOK이 탐사할 영역에 대한 정보가 주어질 때,
//	WOOK이 탐색할 수 있는 자원의 최대 숫자를 구해라!
//
//	입력
//	첫째 줄에 WOOK이 탐사할 영역의 세로길이 N(1≤N≤300)과 가로길이 M(1≤M≤300)이 주어진다. 그 다음 N행 M열에 걸쳐 탐사영역에 대한 정보가 주어진다. 숫자는 공백으로 구분된다. 
//	(자원은 1, 빈 땅은 0으로 표시된다)
//
//	출력
//	WOOK이 수집할 수 있는 최대 광석의 개수를 출력하라.
//
//	예제 입력 1 
//	5 4
//	0 1 0 0
//	0 0 1 0
//	1 1 0 0
//	1 0 1 0
//	1 1 0 0
//	예제 출력 1 
//	4
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] map = new int[n+1][m+1];

		//map 입력받기 1,1부터 입력받고 탐색할때 0인덱스 값과 비교 해야하기 때문에(0,0부터 입력받으면 아래 for문 돌때 -1값이 들어감)
		for(int i = 1; i<=n; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			for(int j = 1; j<=m; j++) {
				map[i][j] = Integer.parseInt(st1.nextToken());
//				System.out.println(map[i][j]);
			}//for
		}//for


		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=m; j++) {
				map[i][j] = Math.max(map[i-1][j], map[i][j-1]) + map[i][j]; 
//				System.out.println("i j map "+i+" "+j+" "+map[i][j]);
			}//for
		}//for
		
		System.out.println(map[n][m]);

	}

}
   