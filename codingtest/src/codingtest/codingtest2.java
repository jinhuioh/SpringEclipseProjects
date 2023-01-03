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
//
public class codingtest2 {
	public static void main(String[] args) throws IOException {

   //�Ÿ��� k������ Ʈ�� ��忡�� ��� ��Ȯ�ϱ�
      BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine()," ");
      int n = Integer.parseInt(st.nextToken());
      int k = Integer.parseInt(st.nextToken());
      
      List<ArrayList<Integer>> map = new ArrayList<ArrayList<Integer>>();
      for(int j=0; j<n; j++) {
         map.add(new ArrayList<Integer>());
      }
      for(int i=0; i<n-1; i++) {
        StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
         int p1 = Integer.parseInt(st1.nextToken());
         int p2 = Integer.parseInt(st1.nextToken());
         map.get(p1).add(p2);//�θ� ����� �ڽ� �ֱ�
      }//for
      
      //��� ���� �Է�
      StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
      int[] arr = new int[n];
      for(int i=0; i<n; i++) {
         arr[i] = Integer.parseInt(st2.nextToken());
      }//for

      //�� ������ Ʈ���� ���°���� �迭------------------------
      //�湮�Ѱ� äũ�� �迭
      boolean[] visitedtr = new boolean[n];
      Queue<Integer> q1 = new LinkedList<Integer>();
      q1.add(0);
      //Ʈ�� ���� �ֱ�
      int[] indexarr = new int[n];
      indexarr[0] = 0;//�ʱⰪ
      visitedtr[0] = true;//�ʱⰪ
     
      while(!q1.isEmpty()) {
         int q1poll = q1.poll();
         visitedtr[q1poll] = true;
         for(int nums : map.get(q1poll)) {
        	 //�̹�true�̸� continue
        	 if(visitedtr[nums]) continue;
        	 indexarr[nums] = indexarr[q1poll] + 1;
//        	 System.out.println(nums+"��° ������ Ʈ����"+ (indexarr[q1poll] + 1) +"��°�Դϴ�.");
        	 q1.add(nums);
         }
      }//while
      
      //�湮�ߴ��� äũ
      boolean[] visited = new boolean[n];
      
      //0���� Ž�� ����!!!
      int answer = arr[0];//��� ������ �ʱⰪ 0��° ��Ʈ���� ����.
      Queue<Integer> q = new LinkedList<Integer>();
      q.add(0);
      visited[0] = true;
      
      //Ʈ����k������ ���ڸ� while�� ����
      while(!q.isEmpty()) {
         
         int qpoll = q.poll();
         visited[qpoll] = true;
         for(int num: map.get(qpoll)) {//���� ��ġ�� ��� ���ڵ�
            if(visited[num] || indexarr[num]>k) {//�̹� �湮�߰ų� Ʈ����ġ�� k������ �� ��� �н�
               continue;
            }
            //��� ���� ����
            answer += arr[num];
            visited[num] = true;
//            System.out.println("num>> "+num);
//            System.out.println("answer>> "+answer);
            q.add(num);
         }//for
      }//for
      System.out.println(answer);
   }

}
   