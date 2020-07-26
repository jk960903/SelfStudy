package Solution14503;

import java.util.Scanner;

public class Main {
	public static int N = 0;
	public static int M = 0;
	public static int[][] array;

	static class direction {
		direction left;
		direction right;
		int[][] dir;

		direction(int[][] dir) {
			this.dir = dir;
		}
		direction(){
			
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		M = scan.nextInt();
		array = new int[N][M];
		int[][] dir0 = { { 0,-1 }, { 1, 0 }, { 1, 0 }, { 0, -1 } };
		int[][] dir1 = { { -1,0 }, { 0, -1 }, { 0, -1 }, { 0, -1 } };
		int[][] dir2 = { { 0,1 }, { -1, 0 }, { -1, 0 }, { 1, 0 } };
		int[][] dir3 = { { 1,0 }, { 0, 1 }, { 0, 1 }, { 0, -1 } };
		direction North = new direction(dir0);
		direction West = new direction(dir3);
		direction South = new direction(dir2);
		direction East = new direction(dir1);
		North.left = West;
		North.right = East;
		West.left = South;
		West.right = North;
		South.left = East;
		South.right =West;
		East.left = North;
		East.right = South;
		int x = scan.nextInt();
		int y = scan.nextInt();
		int tempdir = scan.nextInt();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				array[i][j] = scan.nextInt();
			}
		}
		direction d=new direction();

		int count = 0;
		if (tempdir == 0) {
			d = North;
		} else if (tempdir == 1) {
			d = East;
		} else if (tempdir == 2) {
			d = South;
		} else if (tempdir == 3) {
			d = West;
		}
		loop:while (true) {
			if (array[x][y] == 0) {
				array[x][y] = 2;
				count++;
			}
			direction temp=d;
			for(int i=0; i<4; i++) {
				int tempx=x+temp.dir[0][0];
				int tempy=y+temp.dir[0][1];
				if(inbound(tempx,tempy)&&array[tempx][tempy]==0) {
					d=temp.left;
					x=tempx;
					y=tempy;
					continue loop;
				}
				temp=temp.left;
			}
			x=x+temp.dir[2][0];
			y=y+temp.dir[2][1];
			if(!inbound(x,y)||array[x][y]==1) {
				break;
			}
			
		}
		System.out.println(count);
	}

	private static boolean inbound(int tempx, int tempy) {
		if (tempx >= 0 && tempy >= 0 && tempx < array.length && tempy < array[0].length) {
			return true;
		} else {
			return false;
		}
	}
}
