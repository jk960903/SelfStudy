package Practice503;
import java.util.Scanner;
public class SuperEx {
	public static void main(String[] args) {
		System.out.println("2015152030 ���ر�");
		Scanner scan=new Scanner(System.in);
		System.out.print("��ǥ(x,y)�� ���� �Է��ϼ���>>");
		int x=scan.nextInt();
		int y=scan.nextInt();
		String color=scan.next();
		ColorPoint cp=new ColorPoint(x,y,color);
		cp.showColorPoint();
	}
}
