package Practice412;

import java.util.Scanner;

class CurrencyConverter{
	private static double rate;
	public static double toDollar(double won) {
		return won/rate;
	}
	public static double toKWR(double dollar) {
		return dollar*rate;
		
	}
	public static void setRate(double r) {
		rate=r;
	}
}
public class StaticMember {
	public static void main(String[] args) {
		System.out.println("2015152030 ���ر�");
		Scanner scan=new Scanner(System.in);
		System.out.print("ȯ�� 1�޶�>>");
		double rate=scan.nextDouble();
		System.out.print("�� >>");
		int won=scan.nextInt();
		System.out.print("�޶�>>");
		int dollar=scan.nextInt();
		CurrencyConverter.setRate(rate);
		System.out.println(won+"���� "+CurrencyConverter.toDollar(won));
		System.out.println(dollar+"$�� "+CurrencyConverter.toKWR(dollar));
		scan.close();
	}
}
