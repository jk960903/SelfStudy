package Solution13548;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] human = new int[N];
		for (int i = 0; i < N; i++) {
			human[i] = scan.nextInt();
		}
		int B = scan.nextInt();
		int C = scan.nextInt();
		long result = 0;
		for (int i = 0; i < N; i++) {
			int temp = human[i] - B;
			result++;
			if (temp > 0) {
				if (temp % C == 0) {
					temp = temp / C;
					result=result+temp;
				}
				else {
					temp=temp/C;
					result=result+temp+1;
				}
			}
		}
		System.out.println(result);

	}
}
