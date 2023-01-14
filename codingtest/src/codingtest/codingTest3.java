package codingtest;

import java.util.*;
//�α��̵�
//�Է�
//ù° �ٿ� N, L, R�� �־�����. (1 �� N �� 50, 1 �� L �� R �� 100)
//
//��° �ٺ��� N���� �ٿ� �� ������ �α����� �־�����. r�� c���� �־����� ������ A[r][c]�� ���̴�. (0 �� A[r][c] �� 100)
//
//�α� �̵��� �߻��ϴ� �ϼ��� 2,000�� ���� �۰ų� ���� �Է¸� �־�����.
//
//���
//�α� �̵��� ��ĥ ���� �߻��ϴ��� ù° �ٿ� ����Ѵ�.

//���� �Է� 1 
//2 20 50
//50 30
//20 40
//���� ��� 1 
//1
public class codingTest3 {
	
	static int n,l,r;
	static int[][] map;
	static boolean[][] visited;
	static int[] dy = {0,0,-1,1};
	static int[] dx = {-1,1,0,0};
	static ArrayList<Node> list;//�α��̵��ϴ� ��ġ��(x,y)�� ���� ����Ʈ
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		l = sc.nextInt();
		r = sc.nextInt();
		
		map = new int[n][n];
		//map�Է�
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				 map[i][j] = sc.nextInt();
			}//for
		}//for
		System.out.println(move());
	
	}//public
	public static int move() {
		//�α��̵��� ���������� �ݺ�. �α��̵��� ������ m������ true�� �ٲ��־ while���� ����ǵ��� �Ѵ�.
		int answer = 0;//�α��̵��� �� ��
		while (true) {
			boolean m = false;
			visited = new boolean[n][n];//while�� �� ������ �ʱ�ȭ
			
			for(int i = 0; i<n; i++) {
				for(int j = 0; j<n; j++) {
					if(!visited[i][j]) {//�̹� Ž���� �����  �н�
						//�α��̵��ϴ� ���α��� ��ȯ(�ش� ��ġ ���� list�� �ֱ�)
						int sum = bfs(i, j);
						if(list.size()>1) {//�����̵��ϴ� ���� ������ �� ��� ���ϰ� �α��� ����
							c_bfs(sum);
							m = true;
						}
					}//for
				}//for
			}
			if(!m) return answer;
			answer++;//�̵������Ƿ� ��¥ �� ����
		}
	}
	//�α��̵��ϴ� ���α��� ��ȯ
	public static int bfs(int i, int j) {
		visited[i][j] = true;
		//�̵��� ���� ��ġ ���� ť
		Queue<Node> q = new LinkedList<>();
		//�̵��� ���� ��ġ �־ ��ȯ�� ����Ʈ(����Ʈ ���̰� 1�̻��̸� �����̵��� �Ͼ ���̹Ƿ� main class���� while���� ��� ���Եȴ�.)
		list = new ArrayList<>();//�ʱ�ȭ(���� �̵��� ������ list�ʱ�ȭ ���־�� ��)
		
		q.offer(new Node(i, j));
		list.add(new Node(i, j));
		
		int sum = map[i][j];//�ʱⰪ
		while (!q.isEmpty()) {
			Node c = q.poll();//q�� �ִ� (i,j)�� c�� �ֱ�
			
			for(int i1 = 0; i1<4; i1++) {
				int nx = c.x + dx[i1]; 
				int ny = c.y + dy[i1];
				if(ny >=0 && ny <n && nx>=0 && nx<n && !visited[ny][nx]) {
					int diff = Math.abs(map[c.x][c.y] - map[ny][nx]);
					if(l <= diff && r >= diff) {
						q.offer(new Node(nx, ny));//q�� �� �ֱ�
						list.add(new Node(nx, ny));
						sum += map[nx][ny];// �̵� ���� ������ �α��� sum�� ����
						visited[nx][ny] = true; 
					}
				}
			}
			
		}//while
		return sum;
	}
	
	//�����̵��ϴ� ���� ������ �� ��� ���ϰ� �α��� ����
	public static void c_bfs(int sum) {
		int avg = sum / list.size();
		for(Node n: list) {
			map[n.x][n.y] = avg;// �α� �̵� ����
		}
	}
	
	public static class Node{
		int x; 
		int y;
		public Node(int x , int y) {
			this.x = x;
			this.y = y;
		}
	}
}

