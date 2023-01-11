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
//	문제: 지구온난화
//	푸르고 아름다운 남해에는 많은 섬이 장관을 이루고 있다. 그림이 아니면 볼 수 없을 것 같은 아름다운 장관을 실제로 볼 수 있는 다도해로 상근이는 여행을 떠났다.
//
//	다도해에 도착한 상근이는 서울에서 보던 것과는 다른 풍경에 큰 충격을 받았다. 지구 온난화로 인해 해수면이 상승해 섬의 일부가 바다에 잠겨버렸다.
//
//	서울로 다시 돌아온 상근이는 이렇게 지구 온난화가 계속 될 경우 남해의 지도는 어떻게 바뀔지 궁금해졌다.
//
//	다도해의 지도는 R*C 크기의 그리드로 나타낼 수 있다. 'X'는 땅을 나타내고, '.'는 바다를 나타낸다.
//
//	50년이 지나면, 인접한 세 칸 또는 네 칸에 바다가 있는 땅은 모두 잠겨버린다는 사실을 알았다.
//
//	상근이는 50년 후 지도를 그려보기로 했다. 섬의 개수가 오늘날보다 적어질 것이기 때문에, 지도의 크기도 작아져야 한다. 지도의 크기는 모든 섬을 포함하는 가장 작은 직사각형이다. 50년이 지난 후에도 섬은 적어도 한 개 있다. 또, 지도에 없는 곳, 지도의 범위를 벗어나는 칸은 모두 바다이다.
//
//	입력
//	첫째 줄에 지도의 크기 R과 C (1 ≤ R, C ≤ 10)가 주어진다. 다음 R개 줄에는 현재 지도가 주어진다.
//
//	출력
//	50년 후의 지도를 출력한다.
//
//	예제 입력 1 
//	5 3
//	...
//	.X.
//	.X.
//	.X.
//	...
//	예제 출력 1 
//	X
//	예제 입력 2 
//	3 10
//	..........
//	..XXX.XXX.
//	XXX.......
//	예제 출력 2 
//	.XX...X
//	XX.....
	static char[][] map;
	static char[][] arr;
	static int[] dx = {0,0,-1,1};
	static int[] dy = {-1,1,0,0};
	static int n,m;
	
	private static int bfs(int i, int j, char[][] map) {
		int count = 0;
		for(int k = 0; k<4; k++) {
			int ny = i + dy[k];
			int nx = j + dx[k];
			if(ny<0 || ny>=n || nx<0 || nx>=m) {
				continue;
			}
			if(map[ny][nx]=='.') { 
				continue;
			}
			count++;
		}//for
		return count;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
	    m = Integer.parseInt(st.nextToken());
		map = new char[n][m];
		arr = new char[n][m];
		//정답을 넣을 이차원 리스트
		List<List<String>> answer_list = new ArrayList<List<String>>();
//		for(int j = 0; j < n; j++) {
//			answer_list.add(new ArrayList<String>());
//		}
		
		//배열에 값 입력받기
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			for(int j = 0; j < m; j++) {
				map[i][j] = s.charAt(j);
				arr[i][j] = s.charAt(j);
			}//for
		}//for
		
		//지도 출력범위
		int mini = n;
		int minj = m;
		int maxi = 0;
		int maxj = 0;
		//x가 근처 2개의 x와 인접하면 패스 아니면 점으로 바꾸기
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(map[i][j]=='.') continue;
				int count_bfs = bfs(i, j, map);
				if(count_bfs<2) {
					arr[i][j] = '.';
				}//if
				else {
					//지도 출력 범위 갱신
					mini = Math.min(mini, i);
					minj = Math.min(minj, j);
					maxi = Math.max(maxi, i);
					maxj = Math.max(maxj, j);
				}
				
			}//for
		}//for

		for(int i1 = mini; i1 <= maxi; i1++) {
			for(int j1 = minj; j1 <= maxj; j1++) {
				System.out.print(arr[i1][j1]);
			}//for
			System.out.println();
		}//for
		

		
	}

}
   