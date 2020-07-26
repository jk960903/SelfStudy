package Solution17142;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static int N;
	public static int M;
	public static int[][] array;
	public static int[] combix;
	public static boolean check = false;
	public static int Min = 9999;
	public static int count = 0;
	public static int countwall = 0;
	public static int countvirus=0;
	public static Set<Integer> list = new HashSet<Integer>();

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

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		M = scan.nextInt();
		array = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				array[i][j] = scan.nextInt();
				if (array[i][j] == 1) {
					countwall++;
				}
				else if(array[i][j]==2) {
					countvirus++;
				}
			}
		}
		combix = new int[M];
		Combination(0, 0);
		LinkedList<Integer> setlist = new LinkedList<Integer>(list);
		Collections.sort(setlist);
		if (list.size() == 0) {
			System.out.println(-1);
		} else {
			System.out.println(setlist.get(0));
		}
	}

	public static void Combination(int start, int depth) {
		if (depth == M) {
			// 실행
			int[][] copyarray = new int[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					copyarray[i][j] = array[i][j];
					if (copyarray[i][j] == 2) {
						copyarray[i][j] = -2;// 비활성화
					} else if (copyarray[i][j] == 1) {
						copyarray[i][j] = -1;// 벽
					}
				}

			}
			for (int i = 0; i < M; i++) {
				copyarray[combix[i] / N][combix[i] % N] = 1;// 활성화
			}
			count=countvirus;
			BFS(copyarray);
		} else {
			for (int i = start; i < N * N; i++) {
				if (array[i / N][i % N] == 2) {
					combix[depth] = i;
					Combination(i + 1, depth + 1);
				}
			}
		}
	}

	public static int BFS(int[][] copyarray) {
		Queue<dot> Q = new LinkedList<dot>();
		boolean[][] visit = new boolean[N][N];
		int day = 1;
		for (int i = 0; i < M; i++) {
			visit[combix[i] / N][combix[i] % N] = true;
			Q.add(new dot(combix[i] / N, combix[i] % N, day));
		}
		while (!Q.isEmpty()) {
			if(N*N-countwall==count) {
				day=day-1;
				list.add(day);
				break;
			}
			dot d = Q.poll();
			int x = d.x;
			int y = d.y;
			day = d.day;
			visit[x][y] = true;
			for (int i = 0; i < dir.length; i++) {
				int tempx = x + dir[i][0];
				int tempy = y + dir[i][1];
				if (inbound(tempx, tempy) && !visit[tempx][tempy] && copyarray[tempx][tempy] != -1) {
					if (copyarray[tempx][tempy] == -2) {
						Q.add(new dot(tempx, tempy, day + 1));
						visit[tempx][tempy] = true;
						copyarray[tempx][tempy] = day;
					} else if (copyarray[tempx][tempy] == 0) {
						Q.add(new dot(tempx, tempy, day + 1));
						visit[tempx][tempy] = true;
						copyarray[tempx][tempy] = day;
						count++;
					}
				}

			}
			if(day>Min) {
				break;
			}
			if (count == N*N-countwall) {
				list.add(day);
				if(Min>day) {
					Min=day;
				}
				break;
			}
		}

		return day;
	}

	private static boolean inbound(int tempx, int tempy) {
		if (tempx >= 0 && tempy >= 0 && tempx < array.length && tempy < array[0].length) {
			return true;
		} else
			return false;
	}
}