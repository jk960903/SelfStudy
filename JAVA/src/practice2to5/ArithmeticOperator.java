package practice2to5;
import java.util.Scanner;
public class ArithmeticOperator {
	public static void main(String[] args) {
		System.out.println("2015152030 ���ر�");
		Scanner scan=new Scanner(System.in);
		System.out.print("������ �����ϼ���");
		int time=scan.nextInt();
		int second=time%60;
		int minute=(time/60)%60;
		int hour=time/60/60;
		
		System.out.println(time+"�ʴ� "+hour+"�ð�, "+ minute+"��, "+second+"���Դϴ�");
		scan.close();
	}
}

