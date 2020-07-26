package Solution3190;

import java.util.Scanner;

public class Main {
	static class cell {
		int life;
		int data;
		int condition;

		// -1 죽음 0 빈칸 1 활성 2비활성
		cell(int life, int data, int condition) {
			this.life = life;
			this.data = data;
			this.condition = condition;

		}
	}

	public static int testcase;
	public static int N, M, K;
	public static int[][] array;
	public static cell[][] board;
	public static int[][] dir = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
	public static cell[][] result;
	public static cell[][] temp;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		testcase = scan.nextInt();
		for (int i = 0; i < testcase; i++) {
			N = scan.nextInt();
			M = scan.nextInt();
			K = scan.nextInt();
			array = new int[N][M];
			board = new cell[N][M];
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < M; k++) {
					array[j][k] = scan.nextInt();
					if (array[j][k] == 0)
						board[j][k] = new cell(0, 0, 0);
					else
						board[j][k] = new cell(array[j][k] - 1, array[j][k], 2);
				}
			}
			temp = new cell[N + 1][M + 1];
			result = temp;
			for (int j = 1; j < temp.length; j++) {
				for (int k = 1; k < temp[j].length; k++) {
					temp[j][k] = board[j - 1][k - 1];
				}
			}
			for (int j = 1; j < K; j++) {
				result = new cell[temp.length + 2][temp[0].length + 2];
				for (int k = 0; k < temp.length; k++) {
					for (int l = 0; l < temp[0].length; l++) {
						result[k + 1][l + 1] = temp[k][l];
					}
				}
				for (int k = 0; k < result.length; k++) {
					for (int l = 0; l < result[0].length; l++) {
						if (result[k][l] != null && result[k][l].life == 0) {
							if (result[k][l].condition == 2) {
								result[k][l].condition = 1;
								result[k][l].life = result[k][l].data;
								for (int p = 0; p < dir.length; p++) {
									int tempx = k + dir[i][0];
									int tempy = l + dir[i][1];
									if (result[tempx][tempy].condition == 0||result[tempx][tempy]==null) {
										result[tempx][tempy].data = result[k][l].data;
										result[tempx][tempy].life = result[tempx][tempy].data;
										result[tempx][tempy].condition=2;
									} else if (result[tempx][tempy].condition == 2) {
										if (result[tempx][tempy].life == result[tempx][tempy].data) {
											if (result[k][l].data > result[tempx][tempy].data) {
												result[tempx][tempy].data = result[k][l].data;
												result[tempx][tempy].life = result[tempx][tempy].data;
											}
										}
									}
								}
							} else if (result[k][l].condition == 1) {
								if (result[k][l].life == 0) {
									result[k][l].condition = -1;
								}
							}
						}
					}
				}
				temp = new cell[result.length][result[0].length];
				for (int k = 0; k < temp.length; k++) {
					for (int l = 0; l < temp[0].length; l++) {
						if (temp[k][l] != null) {
							temp[k][l].life = result[k][l].life - 1;
						}
					}
				}
			}
			int count = 0;
			for (int j = 0; j < result.length; j++) {
				for (int k = 0; k < result[0].length; k++) {
					if (result[j][k]!=null&&result[j][k].condition > 0) {
						count++;
					}
				}
			}
			System.out.println("#" + (i + 1) + " " + count);
		}
	}
}
