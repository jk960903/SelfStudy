package practice35;
import java.util.Scanner;
public class Continueexample {
	public static void main(String[] args) {
		System.out.println("2015152030 ���ر�");
		Scanner scan=new Scanner(System.in);
		System.out.println("������ 5�� �Է��ϼ���");
		int sum=0;
		for(int i=0; i<5; i++) {
			int n=scan.nextInt();
			if(n<0) {
				sum+=n;
			}else {
				continue;
			}
		}
		System.out.println("������ ����"+sum);
		scan.close();
	}
}
