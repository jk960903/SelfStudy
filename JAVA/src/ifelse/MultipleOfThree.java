package ifelse;

import java.util.Scanner;

public class MultipleOfThree {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("2015152030 ���ر�");
		System.out.print("���� �Է��Ͻÿ�: ");
		int number=scan.nextInt();
		
		if(number%3==0) {
			System.out.println("3�� ����Դϴ�");
		}else {
			System.out.println("3�� ����� �ƴմϴ�.");
		}
		scan.close();
	}
}
