package practice315;

import java.util.Scanner;

public class DividedbyZeroHandling {
	public static void main(String[] args) {
		System.out.println("2015152030 이준규");
		Scanner scan=new Scanner(System.in);
		while (true) {
			System.out.print("나뉨수를 입력하시오.");
			int diveded=scan.nextInt();
			System.out.print("나눗수를 입력하시오.");
			int divide=scan.nextInt();
			try {
				System.out.println(diveded+"를 "+divide+"로 나누면 몫은 " + diveded/divide+"입니다.");
				break;
			}
			catch(ArithmeticException e) {
				System.out.println("0으로 나눌수 없습니다. 다시 입력하세요");
			}
		}
		scan.close();
	}
	
}
