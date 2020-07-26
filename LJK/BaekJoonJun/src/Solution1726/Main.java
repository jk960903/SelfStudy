package Solution1726;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	// 1234 동서남북 순서
	public static class dot {
		int x;
		int y;
		int day;
		int dir;

		dot(int x, int y, int day,int dir) {
			this.x = x;
			this.y = y;
			this.day = day;
			this.dir=dir;
		}
	}

	public static int N, M;
	public static int[][] array;
	public static int startx, starty, startdir;
	public static int endx, endy, enddir;
	static int count=0;
	public static int[][] dir = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		M = scan.nextInt();
		array = new int[N][M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				array[i][j] = scan.nextInt();
				if(array[i][j]==1) {
					array[i][j]=-1;
				}
			}
		}
		startx = scan.nextInt();
		starty = scan.nextInt();
		startdir = scan.nextInt();
		endx = scan.nextInt();
		endy = scan.nextInt();
		enddir = scan.nextInt();
		BFS(startx-1,starty-1,startdir);
		System.out.println(count);
		int day=0;
	}

	public static void BFS(int x, int y,int startdir) {
		Queue<dot> q = new LinkedList<dot>();
		int day = 0;
		boolean[][] visit = new boolean[N][M];
		visit[x][y] = true;
		q.add(new dot(x, y, day,startdir));
		while (!q.isEmpty()) {
			dot d = q.poll();
			x = d.x;
			y = d.y;
			day = d.day;
			startdir=d.dir;
			for (int i = 0; i < dir.length; i++) {
				int tempx = x + dir[i][0];
				int tempy = y + dir[i][1];
				if (inbound(tempx, tempy) && !visit[tempx][tempy] && array[tempx][tempy] == 0) {
					q.add(new dot(tempx,tempy,day+1,i+1));
					if(startdir!=i+1) {
						count++;
					}
					visit[tempx][tempy]=true;
					array[tempx][tempy]=day+1;
				}
			}
		}
	}
	private static boolean inbound(int tempx, int tempy) {
		if (tempx >= 0 && tempy >= 0 && tempx < array.length && tempy < array[0].length) {
			return true;
		} else
			return false;
	}
}
