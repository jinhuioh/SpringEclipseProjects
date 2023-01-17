package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;



class bfsq {
	int y;
	int x;
	bfsq(int y, int x){
		this.y = y;
		this.x = x;
	}
}

public class codingTest4 {
//ȸ�� �̱�
//	�Է�
//	�Է��� ù° �ٿ��� ȸ���� ���� �ִ�. ��, ȸ���� ���� 50���� ���� �ʴ´�. ��° �� ���ķδ� �� �ٿ� �� ���� ȸ����ȣ�� �ִµ�, �̰��� �� ȸ���� ���� ģ������ ��Ÿ����. ȸ����ȣ�� 1���� ȸ���� ����ŭ �پ� �ִ�. ������ �ٿ��� -1�� �� �� ����ִ�.
//
//	���
//	ù° �ٿ��� ȸ�� �ĺ��� ������ �ĺ��� ���� ����ϰ�, �� ��° �ٿ��� ȸ�� �ĺ��� ������������ ��� ����Ѵ�.
//	���� �Է� 1 
//	5
//	1 2
//	2 3
//	3 4
//	4 5
//	2 4
//	5 3
//	-1 -1
//	���� ��� 1 
//	2 3
//	2 3 4
	
	static int[][] map,arr;
	static boolean[][] visited;
	static int n;
	static Queue<bfsq> q;
	static List<Integer> answer_list;
	//i��° ����� �ĺ� ���� ���ϱ�
	private static int bfs(int i) {
		//�ĺ����� �ʱⰪ
		int result = 1;
		//q�� ģ�� ��ġ �־ Ž�� ����
		q = new LinkedList<bfsq>();
		
		for(int j = 1; j<=n; j++) {//i��° �� 1���� n���� Ž��
			if(map[i][j] == 1) {//ģ����
				arr[i][j] = 1; 
				visited[i][j] = true;//�湮ǥ��
				q.add(new bfsq(i, j));
			}//if
		}//for
		
		while (!q.isEmpty()) {
			bfsq qp = q.poll();
			int y = qp.y;
			int x = qp.x;
//			System.out.println("y>  "+y);
			//for�� �����鼭 ģ���� �湮�� �� ������ (1�̸�) ť�� �ֱ�
			for(int k = 1; k<=n; k++) {
				if(map[x][k] == 1 && !visited[x][k]) {
					arr[x][k] = arr[y][x] + 1;//�� ����
					visited[x][k] = true;//�湮ǥ�� 
					q.add(new bfsq(x, k));
					result = Math.max(result, arr[x][k]);
				}//if
			}//for
		}//while
		return result;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		map = new int[n+1][n+1];
		//map �Է¹ޱ�//ģ���� 1�� ǥ��
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());
			if(n1 == -1 && n2 == -1) break;
			map[n1][n2] = 1; 
			map[n2][n1] = 1; 
		}
		answer_list = new ArrayList<Integer>();
		answer_list.add(Integer.MAX_VALUE);//1���� �����ϹǷ� 0��° �ε����� �ʿ���� ���� �־��ش�.
		for(int i = 1; i<=n; i++) {
			arr = new int[n+1][n+1];
			visited = new boolean[n+1][n+1];
			//1���� n���� ȸ�� �ĺ��� ���� ���ϱ�
//			System.out.println(i+" �Լ�����!!");
			int result = bfs(i);
			answer_list.add(result);
		}//for
		int count = 0;
		int list_min = Collections.min(answer_list);
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<answer_list.size(); i++) {
			if(list_min == answer_list.get(i)) {
				sb.append(i).append(" ");
				count++;
			}
		}
		sb.setLength(sb.length()-1);
		System.out.println((list_min-1)+" "+count);
		System.out.println(sb);
	}
}