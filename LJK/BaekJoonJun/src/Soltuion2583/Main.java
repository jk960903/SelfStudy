package Soltuion2583;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static class dot {
		int x;
		int y;
		int day;

		dot(int x, int y, int day) {
			this.x = x;
			this.y = y;
			this.day = day;
		}
	}

	public static int[][] dir = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 },{0,0} };
	public static int[][] array;
	public static int N = 0;
	public static int M = 0;
	public static int squarenum = 0;
	public static boolean[][] visit;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		M = scan.nextInt();
		N = scan.nextInt();
		squarenum = scan.nextInt();
		array = new int[M][N];
		visit = new boolean[M][N];
		for (int i = 0; i < squarenum; i++) {
			int startx = scan.nextInt();
			int starty = scan.nextInt();
			int endx = scan.nextInt();
			int endy = scan.nextInt();
			for (int j = startx; j < endx; j++) {
				for (int k = starty; k < endy; k++) {
					array[k][j] = 1;
				}
			}
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (array[i][j] == 0) {
					list.add(BFS(i, j));
				}
			}
		}
		Collections.sort(list);
		System.out.println(list.size());
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
	}

	public static int BFS(int x, int y) {
		Queue<dot> Q = new LinkedList<dot>();
		int day = 1;
		Q.add(new dot(x, y, day));
		int count = 0;

		while (!Q.isEmpty()) {
			dot d = Q.poll();
			x = d.x;
			y = d.y;
			day = d.day;
			for (int i = 0; i < dir.length; i++) {
				int tempx = x + dir[i][0];
				int tempy = y + dir[i][1];
				if (inbound(tempx, tempy) && !visit[tempx][tempy] && array[tempx][tempy] == 0) {
					visit[tempx][tempy] = true;
					array[tempx][tempy] = day;
					count++;
					Q.add(new dot(tempx, tempy, day + 1));
				}
			}
		}
		return count;
	}

	private static boolean inbound(int tempx, int tempy) {
		if (tempx >= 0 && tempy >= 0 && tempx < array.length && tempy < array[0].length) {
			return true;
		} else
			return false;
	}
}
