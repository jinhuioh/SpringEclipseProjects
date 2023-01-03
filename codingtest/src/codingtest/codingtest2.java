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

   //거리가 k이하인 트리 노드에서 사과 수확하기
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
         map.get(p1).add(p2);//부모에 연결된 자식 넣기
      }//for
      
      //사과 개수 입력
      StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
      int[] arr = new int[n];
      for(int i=0; i<n; i++) {
         arr[i] = Integer.parseInt(st2.nextToken());
      }//for

      //각 숫자의 트리가 몇번째인지 배열------------------------
      //방문한거 채크할 배열
      boolean[] visitedtr = new boolean[n];
      Queue<Integer> q1 = new LinkedList<Integer>();
      q1.add(0);
      //트리 순서 넣기
      int[] indexarr = new int[n];
      indexarr[0] = 0;//초기값
      visitedtr[0] = true;//초기값
     
      while(!q1.isEmpty()) {
         int q1poll = q1.poll();
         visitedtr[q1poll] = true;
         for(int nums : map.get(q1poll)) {
        	 //이미true이면 continue
        	 if(visitedtr[nums]) continue;
        	 indexarr[nums] = indexarr[q1poll] + 1;
//        	 System.out.println(nums+"번째 숫자의 트리는"+ (indexarr[q1poll] + 1) +"번째입니다.");
        	 q1.add(nums);
         }
      }//while
      
      //방문했는지 채크
      boolean[] visited = new boolean[n];
      
      //0부터 탐색 시작!!!
      int answer = arr[0];//사과 개수의 초기값 0번째 루트부터 센다.
      Queue<Integer> q = new LinkedList<Integer>();
      q.add(0);
      visited[0] = true;
      
      //트리가k이하인 숫자만 while문 돌림
      while(!q.isEmpty()) {
         
         int qpoll = q.poll();
         visited[qpoll] = true;
         for(int num: map.get(qpoll)) {//현재 위치에 담긴 숫자들
            if(visited[num] || indexarr[num]>k) {//이미 방문했거나 트리위치가 k번보다 먼 경우 패스
               continue;
            }
            //사과 개수 세기
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
   