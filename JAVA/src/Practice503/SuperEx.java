package Practice503;
import java.util.Scanner;
public class SuperEx {
	public static void main(String[] args) {
		System.out.println("2015152030 이준규");
		Scanner scan=new Scanner(System.in);
		System.out.print("좌표(x,y)와 색을 입력하세요>>");
		int x=scan.nextInt();
		int y=scan.nextInt();
		String color=scan.next();
		ColorPoint cp=new ColorPoint(x,y,color);
		cp.showColorPoint();
	}
}
