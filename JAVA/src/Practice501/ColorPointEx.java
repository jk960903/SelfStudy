package Practice501;
import java.util.Scanner;
public class ColorPointEx {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Point p=new Point();
		System.out.println("2015152030 ���ر�");
		System.out.print("x y �Է� >>");
		int x=scan.nextInt();
		int y=scan.nextInt();
		p.set(x, y);
		p.showPoint();
		scan.nextLine();
		System.out.print("color �Է�>>");
		String color=scan.nextLine();
		ColorPoint cp=new ColorPoint();
		cp.set(x, y);
		cp.setColor(color);
		cp.showColorPoint();
	}
}
