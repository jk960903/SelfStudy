package ifelse2;
import java.util.Scanner;
public class Grading {
	public static void main(String[] args) {
		char grade;
		Scanner scan=new Scanner(System.in);
		System.out.println("2015152030 ���ر�");
		System.out.print("������ �Է��ϼ��� 0~100");
		int score=scan.nextInt();
		if(score>=90) grade='A';
		else if(score>=80)grade='B';
		else if(score>=70)grade='C';
		else if(score>=60)grade='D';
		else grade='F';
		
		System.out.println("������ "+grade+"�Դϴ�.");
		scan.close();
	}
}