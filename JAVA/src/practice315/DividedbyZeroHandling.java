package practice315;

import java.util.Scanner;

public class DividedbyZeroHandling {
	public static void main(String[] args) {
		System.out.println("2015152030 ���ر�");
		Scanner scan=new Scanner(System.in);
		while (true) {
			System.out.print("�������� �Է��Ͻÿ�.");
			int diveded=scan.nextInt();
			System.out.print("�������� �Է��Ͻÿ�.");
			int divide=scan.nextInt();
			try {
				System.out.println(diveded+"�� "+divide+"�� ������ ���� " + diveded/divide+"�Դϴ�.");
				break;
			}
			catch(ArithmeticException e) {
				System.out.println("0���� ������ �����ϴ�. �ٽ� �Է��ϼ���");
			}
		}
		scan.close();
	}
	
}
