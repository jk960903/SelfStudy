package practice37;
import java.util.Scanner;
public class ArrayAccess {
	public static void main(String[] args) {
		System.out.println("2015152030 ���ر�");
		Scanner scan=new Scanner(System.in);
		
		int[] array=new int[5];
		int max=-1;
		int index=-1;
		System.out.println("��� 5���� �Է��ϼ���");
		for(int i=0; i<5; i++) {
			array[i]=scan.nextInt();
			if(array[i]>max) {
				index=i;
				max=array[i];
			}
		}
		System.out.println("���� ū����"+max+"�̸� "+(index+1)+"��°�� ���� ���Դϴ�.");
		scan.close();
	}
}
