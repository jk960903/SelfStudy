package practice38;
import java.util.Scanner;
public class ArrayLength {
	public static void main(String[] args) {
		System.out.println("2015152030 ���ر�");
		Scanner scan=new Scanner(System.in);
		int sum=0;
		int[] array=new int[5];
		System.out.print(array.length+"���� ������ �Է��Ͻʽÿ�>>");
		for(int i=0; i<array.length; i++) {
			array[i]=scan.nextInt();
			sum+=array[i];
			
		}
		System.out.println("����� "+(double)sum/array.length);
		scan.close();
	}
}
