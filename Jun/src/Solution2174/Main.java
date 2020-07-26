package Solution2174;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static class robot {
		int x;
		int y;
		int direction;

		robot(int x, int y, int direction) {
			this.x = x;
			this.y = y;
			this.direction = direction;
		}
	}


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();// x
		int B = scan.nextInt();// y
		int N = scan.nextInt();// 로봇의 개수
		int M = scan.nextInt();// 명령의 개수
		robot[] robot = new robot[N];
		int [][] map = new int[B][A];
		for (int i = 0; i < N; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			String temp = scan.next();
			int dir = 0;
			if (temp.equals("E")) {
				dir = 0;
			} else if (temp.equals("S")) {
				dir = 1;
			} else if (temp.equals("W")) {
				dir = 2;
			} else if (temp.equals("N")) {
				dir = 3;
			}
			robot[i] = new robot(b - 1, a - 1, dir);
			map[b - 1][a - 1] = i + 1;
		}
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<String> order = new ArrayList<>();
		ArrayList<Integer> re = new ArrayList<>();
		for (int i = 0; i < M; i++) {
			a.add(scan.nextInt());
			order.add(scan.next());
			re.add(scan.nextInt());
		}
		for (int j = 0; j < re.size(); j++) {
			for (int i = 0; i < re.get(j); i++) {
				int tempx = robot[a.get(j) - 1].x;
				int tempy = robot[a.get(j) - 1].y;
				int temp = robot[a.get(j) - 1].direction;
				if (order.get(j).equals("F")) {
					if (temp == 0) {
						tempy = tempy + 1;
						if (inbound(tempx, tempy,map) == 2) {
							System.out.println("Robot" + " " + a.get(j) + " " + "crashes into the wall");
							return;
						} else if (inbound(tempx, tempy,map) == 1) {
							System.out.println(
									("Robot" + " " + a.get(j) + " " + "crashes into robot" + " " + map[tempx][tempy]));
							return;
						}
						map[tempx][tempy] = map[tempx][tempy - 1];
						map[tempx][tempy - 1] = 0;
						robot[a.get(j) - 1].x = tempx;
						robot[a.get(j) - 1].y = tempy;
					} else if (temp == 2) {
						tempy = tempy - 1;
						if (inbound(tempx, tempy,map) == 2) {
							System.out.println("Robot" + " " + a.get(j) + " " + "crashes into the wall");
							return;
						} else if (inbound(tempx, tempy,map) == 1) {

							System.out.println(
									("Robot" + " " + a.get(j) + " " + "crashes into robot" + " " + map[tempx][tempy]));
							return;
						}
						map[tempx][tempy] = map[tempx][tempy + 1];
						map[tempx][tempy + 1] = 0;
						robot[a.get(j) - 1].x = tempx;
						robot[a.get(j) - 1].y = tempy;
					} else if (temp == 1) {
						tempx = tempx - 1;
						if (inbound(tempx, tempy,map) == 2) {
							System.out.println("Robot" + " " + a.get(j) + " " + "crashes into the wall");
							return;
						} else if (inbound(tempx, tempy,map) == 1) {
							System.out.println(
									("Robot" + " " + a.get(j) + " " + "crashes into robot" + " " + map[tempx][tempy]));
							return;
						}
						map[tempx][tempy] = map[tempx + 1][tempy];
						map[tempx + 1][tempy] = 0;
						robot[a.get(j) - 1].x = tempx;
						robot[a.get(j) - 1].y = tempy;
					} else if (temp == 3) {
						tempx = tempx + 1;
						if (inbound(tempx, tempy,map) == 2) {
							System.out.println("Robot" + " " + a.get(j) + " " + "crashes into the wall");
							return;
						} else if (inbound(tempx, tempy,map) == 1) {
							System.out.println(
									("Robot" + " " + a.get(j) + " " + "crashes into robot" + " " + map[tempx][tempy]));
							return;
						}
						map[tempx][tempy] = map[tempx - 1][tempy];
						map[tempx - 1][tempy] = 0;
						robot[a.get(j) - 1].x = tempx;
						robot[a.get(j) - 1].y = tempy;
					}

				} else if (order.get(j).equals("L")) {
					robot[a.get(j) - 1].direction = robot[a.get(j) - 1].direction - 1;
					if (robot[a.get(j) - 1].direction < 0) {
						robot[a.get(j) - 1].direction = 3;
					}
				} else if (order.get(j).equals("R")) {
					robot[a.get(j) - 1].direction = (robot[a.get(j) - 1].direction + 1) % 4;
				}
			}
		}
		System.out.println("OK");
	}

	

	private static int inbound(int tempx, int tempy,int [][] map) {
		if (tempx >= 0 && tempy >= 0 && tempx < map.length && tempy < map[0].length && map[tempx][tempy] == 0) {
			return 0;
		} else if (tempx >= 0 && tempy >= 0 && tempx < map.length && tempy < map[0].length && map[tempx][tempy] != 0) {
			return 1;
		} else {
			return 2;
		}
	}
}
