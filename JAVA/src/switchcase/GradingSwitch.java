package switchcase;
import java.util.Scanner;
public class GradingSwitch {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		char grade;
		System.out.println("2015152030 이준규");
		System.out.print("점수를 입력하세요 (0~100): ");
		int score=scan.nextInt();
		
		switch(score/10) {
			case 10:
			case 9:
				grade='A';
				break;
			case 8:
				grade='B';
				break;
			case 7:
				grade='C';
				break;
			case 6:
				grade='D';
				break;
			default:
				grade='F';
				
		}
		System.out.println("학점은 "+grade+" 입니다.");
		scan.close();
	}
}
