package practice317;
import java.util.InputMismatchException;
import java.util.Scanner;
public class InputException {
	public static void main(String[] args) {
		System.out.println("2015152030 ���ر�");
		Scanner scan=new Scanner(System.in);
		System.out.println("���� 3���� �Է��ϼ���");
		int sum=0,n=0;
		for(int i=0; i<3; i++) {
			System.out.print(i+">>");
			try {
				n=scan.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("������ �ƴմϴ� �ٽ� �Է��ϼ���");
				scan.next();
				i--;
				continue;
			}
			sum+=n;
		}
		System.out.println("���� "+sum);
		scan.close();
	}
}
