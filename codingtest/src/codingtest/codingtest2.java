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

//특정 거리의 도시 찾기

//문제
//어떤 나라에는 1번부터 N번까지의 도시와 M개의 단방향 도로가 존재한다. 모든 도로의 거리는 1이다.
//
//이 때 특정한 도시 X로부터 출발하여 도달할 수 있는 모든 도시 중에서, 최단 거리가 정확히 K인 모든 도시들의 번호를 출력하는 프로그램을 작성하시오.
//또한 출발 도시 X에서 출발 도시 X로 가는 최단 거리는 항상 0이라고 가정한다.
//

//입력
//첫째 줄에 도시의 개수 N, 도로의 개수 M, 거리 정보 K, 출발 도시의 번호 X가 주어진다. 
//(2 ≤ N ≤ 300,000, 1 ≤ M ≤ 1,000,000, 1 ≤ K ≤ 300,000, 1 ≤ X ≤ N) 둘째 줄부터 M개의 줄에 걸쳐서 두 개의 자연수 A, B가 공백을 기준으로 구분되어 주어진다.
//
//출력
//X로부터 출발하여 도달할 수 있는 도시 중에서, 최단 거리가 K인 모든 도시의 번호를 한 줄에 하나씩 오름차순으로 출력한다.
//
//이 때 도달할 수 있는 도시 중에서, 최단 거리가 K인 도시가 하나도 존재하지 않으면 -1을 출력한다.

//예제 입력 1 
//4 4 2 1
//1 2
//1 3
//2 3
//2 4
//예제 출력 1 
//4
public class codingtest2 {
	static int n,m,k,x;
	static List<ArrayList<Integer>> map;
	static int[] k_arr;//거리정보를 넣을 배열(시작부터 얼만큼 떨어져있는지)
	
	private static int[] bfs(int x, int k) {//거리 정보 K, 출발 도시의 번호 X
		//	    거리정보를 넣을 배열
	    	k_arr = new int[n+1];
		//		   찾던 도시넣을 배열
		    int[] answer_bfs = new int[n+1];
		    boolean[] visited = new boolean[n+1];//방문했는지 표시할 변수
				visited[0] = true;
				visited[x] = true;
				Queue<Integer> q = new LinkedList<Integer>();
				q.add(x);
				//k_arr초기값
				k_arr[x] = 0;
				while (!q.isEmpty()) {
					int qp = q.poll();
					for(int qpnum: map.get(qp)) {
						if(visited[qpnum]) {
							continue;
						}
						k_arr[qpnum] = k_arr[qp]+1;
						
						//k거리에 있는 도시이면 배열에 1로 표시!!
						if(k_arr[qpnum] == k) {
//							System.out.println("qpnum>  "+qpnum+" k_arr[qpnum]>  "+k_arr[qpnum]);
							answer_bfs[qpnum]=1;
						}
						
						visited[qpnum] = true;
						q.add(qpnum);
					}
				}//while
	
				return answer_bfs;
	}//private
	
	
	public static void main(String[] args) throws IOException {

      BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine()," ");
//      도시의 개수 N, 도로의 개수 M, 거리 정보 K, 출발 도시의 번호 X
      n = Integer.parseInt(st.nextToken());
      m = Integer.parseInt(st.nextToken());
      k = Integer.parseInt(st.nextToken());
      x = Integer.parseInt(st.nextToken());
      
      
      map = new ArrayList<ArrayList<Integer>>();
      //해당 도시에 연결된 도시들을 넣을 리스트
      for(int i=0; i<=n; i++) {
    	  map.add(new ArrayList<Integer>());
      }
      
      for(int i=0; i<m; i++) {
//    	  A번 도시에서 B번 도시로 이동하는 단방향 도로가 존재한다는 의미.
    	  StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
    	  int a = Integer.parseInt(st1.nextToken());
    	  int b = Integer.parseInt(st1.nextToken());
    	  map.get(a).add(b);//단방향 add
      }//for
      
//      System.out.println(map);
     
   
    int[] answer =  bfs(x, k);//return answer_bfs값을 answer변수에 넣어준다.
    
      int count = 0;
      //최단거리가 k인 도시 찾기 출발 도시 x
      for(int i=1; i<answer.length; i++) {
    	  if(answer[i]==1) {
    		  count=1;
    		  System.out.println(i);
    	  }
      }//for
      if(count==0) {
    	  System.out.println(-1);
      }
	}

}
   