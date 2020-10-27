package practice36;
import java.util.Scanner;
public class BreakExample {
	public static void main(String[] args) {
		System.out.println("2015152030 이준규");
		Scanner scan=new Scanner(System.in);
		System.out.println("exit를 입력하면 종료합니다.");
		while(true) {
			System.out.print(">>");
			String text=scan.nextLine();
			if(text.equals("exit")) {
				System.out.println("종료합니다....");
				break;
			}
		}
		scan.close();
	}
}
