package codingtest;

import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;
import javax.management.Query;
import javax.swing.JPopupMenu.Separator;
//����
//�۵��� ��� ����̿� ģ������ �۵����� ������ ��Ÿ��Ʈ �� �佺Ƽ���� ������ �Ѵ�. ���ش� ���ָ� ���ø鼭 �ɾ��� �ߴ�. ����� ����̳� ������ �ϰ�, ���� �� �ڽ��� ��� ����Ѵ�. ���� �� �ڽ����� ���ְ� 20�� ����ִ�. ���� ������ �ȵǱ� ������ 50���Ϳ� �� ���� ���÷��� �Ѵ�. ��, 50���͸� ������ �� ������ ���� �� ���� ���ž� �Ѵ�.
//
//������� ������ �佺Ƽ���� ������ ���� �ſ� �� �Ÿ��̴�. ����, ���ָ� �� �����ؾ� �� ���� �ִ�. �̸� ���ͳ����� ���縦 �غ��� �������� ���ָ� �Ĵ� �������� �ִ�. �������� ����� ��, �� ���� ������ �� ���� ���� �� �� �ִ�. ������, �ڽ��� ����ִ� ���ִ� 20���� ���� �� ����. �������� ���� ���Ŀ��� 50���͸� ���� ���� ���� �� ���� ���ž� �Ѵ�.
//
//������, ����̳� ��, ��Ÿ��Ʈ �� �佺Ƽ���� ��ǥ�� �־�����. ����̿� ģ������ �ູ�ϰ� �佺Ƽ���� ������ �� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//�Է�
//ù° �ٿ� �׽�Ʈ ���̽��� ���� t�� �־�����. (t �� 50)
//
//�� �׽�Ʈ ���̽��� ù° �ٿ��� ���ָ� �Ĵ� �������� ���� n�� �־�����. (0 �� n �� 100).
//
//���� n+2�� �ٿ��� ����̳� ��, ������, ��Ÿ��Ʈ �� �佺Ƽ�� ��ǥ�� �־�����. �� ��ǥ�� �� ���� x�� y�� �̷���� �ִ�. (�� �� ��� ����, -32768 �� x, y �� 32767)
//
//�۵��� ���簢�� ������� ���� �����̴�. �� ��ǥ ������ �Ÿ��� x ��ǥ�� ���� + y ��ǥ�� ���� �̴�. (����ư �Ÿ�)
//
//���
//�� �׽�Ʈ ���̽��� ���ؼ� ����̿� ģ������ �ູ�ϰ� �佺Ƽ���� �� �� ������ "happy", �߰��� ���ְ� �ٴڳ��� �� �̵��� �� ������ "sad"�� ����Ѵ�. 
public class codingtest2 {
	static int n,sx,sy,dx,dy;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;

		int t = Integer.parseInt(br.readLine());//�׽�Ʈ ���̽��� ����
		for(int tc=0; tc<t; tc++) {
			n = Integer.parseInt(br.readLine());//������ ����
			List<int[]> list = new ArrayList<>();//������ ��ǥ�� �� ����Ʈ
			for(int i=0; i<n+2; i++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				if(i==0) {//������ġ
					sx = x;
					sy = y;
				}else if(i==n+1) {//������ġ
					dx = x;
					dy = y;
				}else {
					list.add(new int[]{x,y});
				}
			}

			bw.write(bfs(list)? "happy\n" : "sad\n");//bfs�� true�̸� happy���
		}

		bw.flush();
		bw.close();
	}
	static boolean bfs(List<int[]> list) {
		Queue<int[]> q = new LinkedList<>();
		boolean[] visited = new boolean[n];
		q.add(new int[] {sx,sy});
		while(!q.isEmpty()) {
			int[] pos = q.poll();
			int px = pos[0], py = pos[1];//q������ x,y��ǥ
			if(Math.abs(px-dx) + Math.abs(py-dy) <= 1000) {//������ġ���� �Ÿ��� 1000���ϸ� ���� true
				return true;
			}

			for(int i=0; i<n; i++) {
				if(!visited[i]) {//i��° �������� x,y��ǥ
					int nx = list.get(i)[0], ny = list.get(i)[1];
					int dis = Math.abs(px - nx) + Math.abs(py - ny);//������ġ�� i��° ������ ��ġ�� ����ư �Ÿ�
					if(dis <= 1000) {//�� �Ÿ��� 1000���ϸ�
						visited[i] = true;//visited�� 
						q.add(new int[]{nx,ny});//ť�� �ش� ������ ��ġ�� �־��ش�.
					}
				}
			}
		}
		return false; 
	}

}