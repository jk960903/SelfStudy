package practice32;
import java.util.Scanner;
public class WhileSample {
	public static void main(String[] args) {
		System.out.println("2015152030���ر�");
		int count=0;
		int sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���.");
		int n=scan.nextInt();
		while(n!=-1) {
			sum+=n;
			count++;
			n=scan.nextInt();
		}
		if(count==0) System.out.println("�Էµ� ���������ϴ�.");
		else {
			System.out.print("������ ������"+ count+"���̸� ");
			System.out.println("����� "+(double)sum/count+"�Դϴ�.");
		}
		scan.close();
		
	}
}
