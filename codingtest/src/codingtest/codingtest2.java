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

//Ư�� �Ÿ��� ���� ã��

//����
//� ���󿡴� 1������ N�������� ���ÿ� M���� �ܹ��� ���ΰ� �����Ѵ�. ��� ������ �Ÿ��� 1�̴�.
//
//�� �� Ư���� ���� X�κ��� ����Ͽ� ������ �� �ִ� ��� ���� �߿���, �ִ� �Ÿ��� ��Ȯ�� K�� ��� ���õ��� ��ȣ�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//���� ��� ���� X���� ��� ���� X�� ���� �ִ� �Ÿ��� �׻� 0�̶�� �����Ѵ�.
//

//�Է�
//ù° �ٿ� ������ ���� N, ������ ���� M, �Ÿ� ���� K, ��� ������ ��ȣ X�� �־�����. 
//(2 �� N �� 300,000, 1 �� M �� 1,000,000, 1 �� K �� 300,000, 1 �� X �� N) ��° �ٺ��� M���� �ٿ� ���ļ� �� ���� �ڿ��� A, B�� ������ �������� ���еǾ� �־�����.
//
//���
//X�κ��� ����Ͽ� ������ �� �ִ� ���� �߿���, �ִ� �Ÿ��� K�� ��� ������ ��ȣ�� �� �ٿ� �ϳ��� ������������ ����Ѵ�.
//
//�� �� ������ �� �ִ� ���� �߿���, �ִ� �Ÿ��� K�� ���ð� �ϳ��� �������� ������ -1�� ����Ѵ�.

//���� �Է� 1 
//4 4 2 1
//1 2
//1 3
//2 3
//2 4
//���� ��� 1 
//4
public class codingtest2 {
	static int n,m,k,x;
	static List<ArrayList<Integer>> map;
	static int[] k_arr;//�Ÿ������� ���� �迭(���ۺ��� ��ŭ �������ִ���)
	
	private static int[] bfs(int x, int k) {//�Ÿ� ���� K, ��� ������ ��ȣ X
		//	    �Ÿ������� ���� �迭
	    	k_arr = new int[n+1];
		//		   ã�� ���ó��� �迭
		    int[] answer_bfs = new int[n+1];
		    boolean[] visited = new boolean[n+1];//�湮�ߴ��� ǥ���� ����
				visited[0] = true;
				visited[x] = true;
				Queue<Integer> q = new LinkedList<Integer>();
				q.add(x);
				//k_arr�ʱⰪ
				k_arr[x] = 0;
				while (!q.isEmpty()) {
					int qp = q.poll();
					for(int qpnum: map.get(qp)) {
						if(visited[qpnum]) {
							continue;
						}
						k_arr[qpnum] = k_arr[qp]+1;
						
						//k�Ÿ��� �ִ� �����̸� �迭�� 1�� ǥ��!!
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
//      ������ ���� N, ������ ���� M, �Ÿ� ���� K, ��� ������ ��ȣ X
      n = Integer.parseInt(st.nextToken());
      m = Integer.parseInt(st.nextToken());
      k = Integer.parseInt(st.nextToken());
      x = Integer.parseInt(st.nextToken());
      
      
      map = new ArrayList<ArrayList<Integer>>();
      //�ش� ���ÿ� ����� ���õ��� ���� ����Ʈ
      for(int i=0; i<=n; i++) {
    	  map.add(new ArrayList<Integer>());
      }
      
      for(int i=0; i<m; i++) {
//    	  A�� ���ÿ��� B�� ���÷� �̵��ϴ� �ܹ��� ���ΰ� �����Ѵٴ� �ǹ�.
    	  StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
    	  int a = Integer.parseInt(st1.nextToken());
    	  int b = Integer.parseInt(st1.nextToken());
    	  map.get(a).add(b);//�ܹ��� add
      }//for
      
//      System.out.println(map);
     
   
    int[] answer =  bfs(x, k);//return answer_bfs���� answer������ �־��ش�.
    
      int count = 0;
      //�ִܰŸ��� k�� ���� ã�� ��� ���� x
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
   