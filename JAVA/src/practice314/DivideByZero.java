package practice314;
import java.util.Scanner;
public class DivideByZero {
	public static void main(String[] args) {
		System.out.println("2015152030 ���ر�");
		Scanner scan=new Scanner(System.in);
		int diveded;
		int divide;
		System.out.print("�������� �Է��Ͻÿ�.");
		diveded=scan.nextInt();
		System.out.print("�������� �Է��Ͻÿ�.");
		divide=scan.nextInt();
		System.out.println(diveded+"�� "+divide+"�� ������ ���� " + diveded/divide+"�Դϴ�.");
		scan.close();
		
	}
}
