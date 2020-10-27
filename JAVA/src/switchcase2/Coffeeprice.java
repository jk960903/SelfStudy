package switchcase2;
import java.util.Scanner;
public class Coffeeprice {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("2015152030 이준규");
		System.out.print("무슨 커피를 드릴까요? ");
		String order=scan.next();
		int price=0;
		switch(order) {
			case "에스프레소":
			case "카푸치노":
			case "카페라떼":
				price=3500;
				break;
			case "아메리카노":
				price=2000;
				break;
			default:
				System.out.println("메뉴에 없습니다.");
		}
		if(price!=0)System.out.println(order+"는 "+price+" 원입니다.");
		
		scan.close();
	}
}
