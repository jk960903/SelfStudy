package Solution8189;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	public static int testcase, N, A, B;
	public static int[] array;
	public static int present;
	public static int presenttime;
	public static int resulttime;
	public static int[] checktime;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		testcase = scan.nextInt();
		for (int i = 0; i < testcase; i++) {
			N = scan.nextInt();
			A = scan.nextInt();
			B = scan.nextInt();
			array = new int[N];
			checktime = new int[N];
			for (int j = 0; j < N; j++) {
				array[j] = scan.nextInt();
			}
			LinkedList<Integer> Q = new LinkedList<Integer>();
			int index = 0;
			int temp = 0;
			int finishtime = array[array.length - 1] + B;
			presenttime=0;
			while (true) {
				if (temp < array.length) {
					if (presenttime == array[temp]) {
						Q.add(array[temp]);
						temp++;
					}
				}
				if (Q.size() >= A) {
					int tempsize = Q.size();
					if (tempsize % 2 == 0) {
						for (int j = 0; j < tempsize / 2; j++) {
							checktime[index] = presenttime;
							Q.remove(0);
							index++;
						}
					} else if (tempsize % 2 == 1) {
						for (int j = 0; j < (tempsize / 2) + 1; j++) {
							checktime[index] = presenttime;
							Q.remove(0);
							index++;
						}
					}
				}
				if (Q.size() != 0) {
					if (presenttime - Q.get(0) == B) {
						int tempsize = Q.size();
						if (tempsize % 2 == 0) {
							for (int j = 0; j < tempsize / 2; j++) {
								checktime[index] = presenttime;
								Q.remove(0);
								index++;
							}
						} else if (tempsize % 2 == 1) {
							for (int j = 0; j < (tempsize / 2) + 1; j++) {
								checktime[index] = presenttime;
								Q.remove(0);
								index++;
							}
						}
					}

				}
				if (finishtime == presenttime) {
					break;
				}
				presenttime++;

			}
			System.out.print("#" + (i + 1) + " ");
			for (int j = 0; j < checktime.length; j++) {
				System.out.print(checktime[j] + " ");
			}
			System.out.println();
		}
	}
}
