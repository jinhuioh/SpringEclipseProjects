package codingtest;

import java.util.List;
import java.util.Queue;
import java.util.Scanner;
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
//	토마토 2(3차원)
//입력
//첫 줄에는 상자의 크기를 나타내는 두 정수 M,N과 쌓아올려지는 상자의 수를 나타내는 H가 주어진다. M은 상자의 가로 칸의 수, N은 상자의 세로 칸의 수를 나타낸다. 단, 2 ≤ M ≤ 100, 2 ≤ N ≤ 100, 1 ≤ H ≤ 100 이다. 
//둘째 줄부터는 가장 밑의 상자부터 가장 위의 상자까지에 저장된 토마토들의 정보가 주어진다. 즉, 둘째 줄부터 N개의 줄에는 하나의 상자에 담긴 토마토의 정보가 주어진다. 각 줄에는 상자 가로줄에 들어있는 토마토들의 상태가 M개의 정수로 주어진다. 
//정수 1은 익은 토마토, 정수 0 은 익지 않은 토마토, 정수 -1은 토마토가 들어있지 않은 칸을 나타낸다. 이러한 N개의 줄이 H번 반복하여 주어진다.
//
//토마토가 하나 이상 있는 경우만 입력으로 주어진다.
//
//출력
//여러분은 토마토가 모두 익을 때까지 최소 며칠이 걸리는지를 계산해서 출력해야 한다. 만약, 저장될 때부터 모든 토마토가 익어있는 상태이면 0을 출력해야 하고, 토마토가 모두 익지는 못하는 상황이면 -1을 출력해야 한다.
//
//예제 입력 1 
//5 3 1
//0 -1 0 0 0
//-1 -1 0 1 1
//0 0 0 1 1
//예제 출력 1 
//-1
	
	
//구현순서
//	1. map입력받기
//	2. 입력받으면서 1인 부분 큐에 넣기
//	3. 큐 없어질때까지 while문 돌리면서 상하좌우위아래 전부 for문 돌기(큐애 add) && 위치값 이전위치+1해줌
//  4. 최종적으로 전체 for문 돌면서 0이있으면 -1 출력, 전부 익었으면 최대 일수 값 찾기!! 	
	
//큐에 넣을 (y,x) 
class tomato{
	int x;
	int y;
	int z;
	tomato(int z, int x, int y){
		this.z = z;
		this.x = x;
		this.y = y;
	}
}
public class codingtest2 {
	static int n,m,h;
	static int[][][] board;
	static Queue<tomato> q;
	static int[] dx = {0,0,-1,1,0,0};
	static int[] dy = {-1,1,0,0,0,0};
	static int[] dz = {0,0,0,0,-1,1};
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		n = sc.nextInt();
		h = sc.nextInt();
		board = new int[h][n][m];
		
		q = new LinkedList<tomato>();
		
		for(int i = 0; i<h; i++) {
			for(int j = 0; j<n; j++) {
				for(int k = 0; k<m; k++) {
					board[i][j][k] = sc.nextInt();
					
					if(board[i][j][k]==1) q.add(new tomato(i, j, k));
				}
			}
		}
		System.out.println(bfs());
		
	}
	
	public static int bfs() {
		while (!q.isEmpty()) {
			tomato t = q.remove();
			
			int z = t.z;
			int x = t.x;
			int y = t.y;
			
			for(int i = 0; i<6; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				int nz = z + dz[i];
				
				if(nx >=0 && ny>=0 && nz >=0&& nx<n&& ny<m&& nz<h) {
					if(board[nz][nx][ny]==0) {
						q.add(new tomato(nz, nx, ny));
						
						board[nz][nx][ny] = board[z][x][y]+1;
					}
				}
			}
		}
		int result = Integer.MIN_VALUE;
		
		for(int i = 0; i<h; i++) {
			for(int j = 0; j<n; j++) {
				for(int k = 0; k<m; k++) {
					if(board[i][j][k]==0) return -1;
					
					result = Math.max(result, board[i][j][k]);
				}
			}
		}//for
		if(result==1) return 0;
		else return result-1;
	}
}
