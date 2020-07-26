package Solution7812;

import java.util.Scanner;

public class Solution {
	public static int testcase;
	public static int N = 0;
	public static int Money;
	public static int[] land;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		testcase = scan.nextInt();
		for (int i = 0; i < testcase; i++) {
			N = scan.nextInt();
			Money = scan.nextInt();
			land = new int[N];
			int start = 0;
			int end = 0;
			for (int j = 0; j < N; j++) {
				land[j] = scan.nextInt();
			}
			int temp = land[start];
			int A4 = 0;
			while (start != N) {
				if (temp == Money) {
					A4++;
					start++;
					end = start;
					if(start==N) break;
					temp = land[start];
				} else if (temp > Money) {
					start++;
					end = start;
					if(start==N)break;
					temp = land[start];
				} else if (temp < Money) {
					end++;
					if (end > N - 1) {
						break;
					}
					temp = temp + land[end];
				}
			}
			System.out.println("#" + (i + 1) + " " + A4);
		}
	}
}
