package ScannerEx;
import java.util.Scanner;
public class ScannerEx {
	public static void main(String[] args) {
		System.out.println("2015152030 ���ر�");
		System.out.println("�̸� ���� ���� ü�� ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���");
		Scanner scan=new Scanner(System.in);
		String name=scan.next();
		String city=scan.next();
		int age=scan.nextInt();
		double weight=scan.nextDouble();
		boolean single=scan.nextBoolean();
		System.out.println("�̸��� "+name+" ���ô� "+city+" ���̴� "+age+" ü���� "+weight+" ���� ���δ� "+single);
		
		
		
	}
}
