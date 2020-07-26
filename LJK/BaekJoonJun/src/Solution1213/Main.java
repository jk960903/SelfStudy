package Solution1213;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static String s;
	public static char[] array;
	public static int[] index = new int[26];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		s = scan.nextLine();
		array = new char[s.length()];
		array = s.toCharArray();
		int pre=0;
		for (int i = 0; i < array.length; i++) {
			int temp = array[i] - 'A';
			index[temp]++;
			if(temp>pre) {
				pre=temp;
			}
		}
		Arrays.sort(array);
		boolean hi = true;
		for (int i = 0; i < 26; i++) {
			if (index[i] % 2 == 1 && i<pre) {
				System.out.println("I'm Sorry Hansoo");
				hi = false;
				break;
			}
		}
		if (hi) {
			ArrayList<Character> list = new ArrayList<Character>();
			int start=0;
			for (int i = 0; i < 26; i++) {
				if (index[i] % 2 == 1) {
					start=i;

				}
					for (int j = 0; j < index[i] / 2; j++) {
						list.add((char) (i + 'A'));
						start=i;
					}
				
			}
			if(index[start]%2==1) {
				list.add((char)(start+'A'));
			}
			for (int i = start; i >= 0; i--) {
				for (int j = 0; j < index[i] / 2; j++) {
					list.add((char) (i + 'A'));
				}
			}
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i));
			}
		}
	}

}
