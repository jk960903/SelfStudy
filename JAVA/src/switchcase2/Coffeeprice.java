package switchcase2;
import java.util.Scanner;
public class Coffeeprice {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("2015152030 ���ر�");
		System.out.print("���� Ŀ�Ǹ� �帱���? ");
		String order=scan.next();
		int price=0;
		switch(order) {
			case "����������":
			case "īǪġ��":
			case "ī���":
				price=3500;
				break;
			case "�Ƹ޸�ī��":
				price=2000;
				break;
			default:
				System.out.println("�޴��� �����ϴ�.");
		}
		if(price!=0)System.out.println(order+"�� "+price+" ���Դϴ�.");
		
		scan.close();
	}
}
