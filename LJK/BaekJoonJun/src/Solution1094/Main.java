package Solution1094;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static int X;
	public static int init = 64;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		X = scan.nextInt();
		int temp=X;
		ArrayList list = new ArrayList<Integer>();
		loop: while (true) {
			if(temp==0) {
				break;
			}
			for (int i = 1; i <= 128; i *= 2) {
				if (temp / i == 0) {
					list.add(i / 2);
					temp=temp-(i/2);
					continue loop;
				}
			}
			
		}
		System.out.println(list.size());
	}
}
