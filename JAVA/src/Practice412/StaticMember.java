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
		System.out.println("2015152030 이준규");
		Scanner scan=new Scanner(System.in);
		System.out.print("환율 1달라>>");
		double rate=scan.nextDouble();
		System.out.print("원 >>");
		int won=scan.nextInt();
		System.out.print("달라>>");
		int dollar=scan.nextInt();
		CurrencyConverter.setRate(rate);
		System.out.println(won+"원은 "+CurrencyConverter.toDollar(won));
		System.out.println(dollar+"$는 "+CurrencyConverter.toKWR(dollar));
		scan.close();
	}
}
