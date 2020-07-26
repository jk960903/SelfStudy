package Solution3055;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static int R, C;
	public static char[][] array;
	public static String s;
	public static int[][] dir = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

	public static class dot {
		int x;
		int y;
		int day;
		char type;

		dot(int x, int y, int day, char type) {
			this.x = x;
			this.y = y;
			this.day = day;
			this.type = type;
		}
	}

	public static boolean success = false;
	public static int sx = 0;
	public static int sy = 0;
	public static int wx = 0;
	public static int wy = 0;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		R = scan.nextInt();
		C = scan.nextInt();
		scan.nextLine();
		array = new char[R][C];
		for (int i = 0; i < R; i++) {
			s = scan.nextLine();
			array[i] = s.toCharArray();
		}
		LinkedList <Integer> wx=new LinkedList<Integer>();
		LinkedList <Integer> wy=new LinkedList<Integer>();
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if (array[i][j] == 'S') {
					sx = i;
					sy = j;
				} else if (array[i][j] == '*') {
					wx.add(i);
					wy.add(j);
				}
			}
		}
		int day=BFS(sx, sy, wx, wy);
		if(success==true) {
			System.out.println(day);
		}
		else if(success==false) {
			System.out.println("KAKTUS");
		}
	}

	public static int BFS(int sx, int sy,LinkedList<Integer> wx,LinkedList<Integer> wy) {
		Queue<dot> Q = new LinkedList<dot>();
		int day = 0;
		boolean[][] visit = new boolean[R][C];
		for(int i=0; i<wx.size(); i++) {
			Q.add(new dot(wx.get(i),wy.get(i),day,array[wx.get(i)][wy.get(i)]));
			visit[wx.get(i)][wy.get(i)]=true;
		}
		Q.add(new dot(sx, sy, day, array[sx][sy]));
		visit[sx][sy]=true;

		while (!Q.isEmpty()) {
			dot d = Q.poll();
			int x = d.x;
			int y = d.y;
			char type = d.type;
			day = d.day;
			for (int i = 0; i < dir.length; i++) {
				int tempx = x + dir[i][0];
				int tempy = y + dir[i][1];
				if (inbound(tempx, tempy) && !visit[tempx][tempy] && array[tempx][tempy] != 'X') {
					if (type == 'S'&&array[tempx][tempy]!='*') {
						visit[tempx][tempy] = true;
						if(array[tempx][tempy]=='D') {
							success=true;
							day=day+1;
							break;
						}
						Q.add(new dot(tempx, tempy, day + 1, type));
						array[tempx][tempy]=type;
					} else if (type == '*') {
						if (array[tempx][tempy] != 'D') {
							Q.add(new dot(tempx, tempy, day + 1, type));
							array[tempx][tempy]=type;
							visit[tempx][tempy] = true;
						}
					}
				}
			}
			if(success==true) {
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
