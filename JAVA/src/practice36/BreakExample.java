package practice36;
import java.util.Scanner;
public class BreakExample {
	public static void main(String[] args) {
		System.out.println("2015152030 ���ر�");
		Scanner scan=new Scanner(System.in);
		System.out.println("exit�� �Է��ϸ� �����մϴ�.");
		while(true) {
			System.out.print(">>");
			String text=scan.nextLine();
			if(text.equals("exit")) {
				System.out.println("�����մϴ�....");
				break;
			}
		}
		scan.close();
	}
}
