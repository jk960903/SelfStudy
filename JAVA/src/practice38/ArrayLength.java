package practice38;
import java.util.Scanner;
public class ArrayLength {
	public static void main(String[] args) {
		System.out.println("2015152030 이준규");
		Scanner scan=new Scanner(System.in);
		int sum=0;
		int[] array=new int[5];
		System.out.print(array.length+"개의 정수를 입력하십시오>>");
		for(int i=0; i<array.length; i++) {
			array[i]=scan.nextInt();
			sum+=array[i];
			
		}
		System.out.println("평균은 "+(double)sum/array.length);
		scan.close();
	}
}
