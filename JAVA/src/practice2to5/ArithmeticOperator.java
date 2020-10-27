package practice2to5;
import java.util.Scanner;
public class ArithmeticOperator {
	public static void main(String[] args) {
		System.out.println("2015152030 이준규");
		Scanner scan=new Scanner(System.in);
		System.out.print("정수를 집력하세요");
		int time=scan.nextInt();
		int second=time%60;
		int minute=(time/60)%60;
		int hour=time/60/60;
		
		System.out.println(time+"초는 "+hour+"시간, "+ minute+"분, "+second+"초입니다");
		scan.close();
	}
}

