package Solution2112;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static int testcase = 0;
	public static int D = 0;
	public static int W = 0;
	public static int K = 0;
	public static int result = 0;
	public static int[][] array;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		testcase = scan.nextInt();
		for (int i = 0; i < testcase; i++) {
			D = scan.nextInt();
			W = scan.nextInt();
			K = scan.nextInt();
			array = new int[D][W];
			for (int j = 0; j < D; j++) {
				for (int k = 0; k < W; k++) {
					array[j][k] = scan.nextInt();
				}
			}
			result=-1;
			for(int j=0; j<K; j++) {
				DFS(array,j,0,0);
				if(result==j) {
					break;
				}
			}
			System.out.println("#"+(i+1)+" "+result);
		}
	}

	public static void DFS(int[][] map, int count, int start, int depth) {
		if (count == depth) {
			boolean check = true;
			for (int i = 0; i < W; i++) {
				for (int j = 0; j <= D - K; j++) {
					int clone = map[j][i];
					check = true;
					for (int k = 1; k < K; k++) {
						if (clone != map[j + k][i]) {
							check = false;
							break;
						}
					}
					if (check) {
						break;
					}
				}
				if (!check) {
					break;
				}
			}
			if (check) {
				result = depth;
			}
		} else {
			if (count < depth) {
				return;
			}
			for (int i = start; i < D; i++) {
				int[] temp = map[i].clone();
				Arrays.fill(map[i], 0);
				DFS(map, count, i + 1, depth + 1);
				Arrays.fill(map[i], 1);
				DFS(map, count, i + 1, depth + 1);
				map[i] = temp;
			}

		}
	}
}
