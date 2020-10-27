package practice314;
import java.util.Scanner;
public class DivideByZero {
	public static void main(String[] args) {
		System.out.println("2015152030 이준규");
		Scanner scan=new Scanner(System.in);
		int diveded;
		int divide;
		System.out.print("나뉨수를 입력하시오.");
		diveded=scan.nextInt();
		System.out.print("나눗수를 입력하시오.");
		divide=scan.nextInt();
		System.out.println(diveded+"를 "+divide+"로 나누면 몫은 " + diveded/divide+"입니다.");
		scan.close();
		
	}
}
