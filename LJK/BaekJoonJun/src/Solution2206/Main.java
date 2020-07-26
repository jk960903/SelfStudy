package Solution2206;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static class dot {
		int x;
		int y;
		int day;

		dot(int x, int y, int day) {
			this.x = x;
			this.y = y;
			this.day = day;
		}
	}

	public static int[][] dir = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
	public static int[][] map;
	public static int min = 9999999;
	public static int N;
	public static int M;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		M = scan.nextInt();
		map = new int[N][M];
		scan.nextLine();
		for (int i = 0; i < N; i++) {
			String s = scan.nextLine();
			char[] temp = s.toCharArray();
			for (int j = 0; j < M; j++) {
				map[i][j] = temp[j] - '0';
			}
		}
		boolean check = false;
		BFS(0, 0);
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] == 1) {
					map[i][j] = 0;
					check = true;
					BFS(0, 0);
				}
				if (check) {
					map[i][j] = 1;
					check = false;
				}
			}
		}
		if (min == 9999999) {
			System.out.println(-1);
		} else {
			System.out.println(min+1);
		}
	}

	protected static void BFS(int x, int y) {
		Queue<dot> q = new LinkedList<dot>();
		boolean[][] visit = new boolean[N][M];
		int day = 1;
		q.add(new dot(x, y, day));
		visit[0][0] = true;
		while (!q.isEmpty()) {
			dot d = q.poll();
			x = d.x;
			y = d.y;
			day = d.day;
			for (int i = 0; i < dir.length; i++) {
				int tempx = x + dir[i][0];
				int tempy = y + dir[i][1];
				if (inbound(tempx, tempy) && !visit[tempx][tempy] &&map[tempx][tempy]==0) {
					q.add(new dot(tempx, tempy, day + 1));
					visit[tempx][tempy] = true;
				}
			}
			if(visit[N-1][M-1]||day>min) {
				break;
			}
		}
		if (visit[N - 1][M - 1]) {
			if (min > day) {
				min = day;
			}
		}
	}

	protected static boolean inbound(int tempx, int tempy) {
		if (tempx >= 0 && tempy >= 0 && tempx < map.length && tempy < map[0].length) {
			return true;
		} else {
			return false;
		}
	}
}
