package Solution2504;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int round = 0;
		int square = 0;
		Stack<String> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push("(");
				round++;
			} else if (s.charAt(i) == ')') {
				round--;
				if (round > -1) {
					if (stack.peek().equals("(")) {
						stack.pop();
						stack.push("2");
					} else {
						int roundresult = 0;
						while (!stack.isEmpty()) {
							if (stack.peek().equals("[")) {
								System.out.println(0);
								return;
							} else if (stack.peek().equals("(")) {
								stack.pop();
								roundresult *= 2;
								stack.push(String.valueOf(roundresult));
								break;
							} else {
								roundresult += Integer.parseInt(stack.pop());
							}
						}
					}
				}
			} else if (s.charAt(i) == '[') {
				stack.push("[");
				square++;
			} else if (s.charAt(i) == ']') {
				square--;
				if (square > -1) {
					if (stack.peek().equals("[")) {
						stack.pop();
						stack.push("3");
					} else {
						int squareresult = 0;

						while (!stack.isEmpty()) {
							if (stack.peek().equals("(")) {
								System.out.println(0);
								return;
							} else if (stack.peek().equals("[")) {
								stack.pop();
								squareresult *= 3;
								stack.push(String.valueOf(squareresult));
								break;
							} else
								squareresult += Integer.parseInt(stack.pop());
						}
					}
				}
			}
			if (square < 0 || round < 0) {
				System.out.println(0);
				return;
			}
		}
		if (square != 0 || round != 0) {
			System.out.println(0);
			return;
		}
		int output = 0;
		while (!stack.isEmpty()) {
			output += Integer.parseInt(stack.pop());
		}
		System.out.println(output);
		return;
	}
}
