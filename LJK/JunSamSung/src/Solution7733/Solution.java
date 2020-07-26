package Solution7733;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	public static int testcase = 0;
	public static int N = 0;
	public static int[][] array;
	public static int[][] copy;
	public static int[][] dir = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 }};

	static class dot {
		int x;
		int y;

		dot(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		testcase = scan.nextInt();
		for (int i = 0; i < testcase; i++) {
			N = scan.nextInt();
			array = new int[N][N];
			copy = new int[N][N];
			int max = 0;
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					array[j][k] = scan.nextInt();
					copy[j][k] = array[j][k];
					if (max < array[j][k]) {
						max = array[j][k];
					}
				}
			}
			int[] day=new int[max];
			int realmax=0;
			for (int j = 0; j < max; j++) {
				int count=0;
				for (int k = 0; k < N; k++) {
					for (int l = 0; l < N; l++) {
						if (array[k][l] == j) {
							copy[k][l] = 0;
						}
					}
				}
				boolean[][] visit = new boolean[N][N];
				for (int k = 0; k < N; k++) {
					for (int l = 0; l < N; l++) {
						if (copy[k][l] !=0&&!visit[k][l]) {
							BFS(k,l,visit);
							count++;
						}
					}
					if(realmax<count) {
						realmax=count;
					}
				}
			}
			System.out.println("#"+(i+1)+" "+realmax);
		}
	}

	public static void BFS(int x, int y,boolean[][] visit) {
		Queue<dot> Q = new LinkedList<dot>();
		Q.add(new dot(x, y));
		while (!Q.isEmpty()) {
			dot d = Q.poll();
			x = d.x;
			y = d.y;
			visit[x][y] = true;
			for (int i = 0; i < dir.length; i++) {
				int tempx=x+dir[i][0];
				int tempy=y+dir[i][1];
				if(inbound(tempx,tempy)&&!visit[tempx][tempy]&&copy[tempx][tempy]!=0) {
					Q.add(new dot(tempx,tempy));
					visit[tempx][tempy]=true;
				}
			}
		}

	}
	private static boolean inbound(int tempx,int tempy) {
		if(tempx>=0 && tempy>=0&&tempx<array.length&&tempy<array[0].length) {
			return true;
		}
		else return false;
	}
}
