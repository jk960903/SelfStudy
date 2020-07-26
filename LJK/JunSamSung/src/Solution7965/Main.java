package Solution7965;

import java.util.Scanner;

public class Main {
	public static int testcase = 0;
	public static int N = 0;
	public static long result = 0;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		testcase = scan.nextInt();
		for (int i = 0; i < testcase; i++) {
			N = scan.nextInt();
			result = 0;
			long temp = 1;
			for (int j = 1; j <= N; j++) {
				temp = (long) Math.pow((int) j, (int) j) % 1000000007;
				result=(temp+result)%1000000007;
			}
			System.out.println("#" + (i + 1) + " " + result);
		}
	}
}
