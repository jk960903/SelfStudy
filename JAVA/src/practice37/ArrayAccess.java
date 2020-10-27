package practice37;
import java.util.Scanner;
public class ArrayAccess {
	public static void main(String[] args) {
		System.out.println("2015152030 이준규");
		Scanner scan=new Scanner(System.in);
		
		int[] array=new int[5];
		int max=-1;
		int index=-1;
		System.out.println("양수 5개를 입력하세요");
		for(int i=0; i<5; i++) {
			array[i]=scan.nextInt();
			if(array[i]>max) {
				index=i;
				max=array[i];
			}
		}
		System.out.println("가장 큰수는"+max+"이며 "+(index+1)+"번째로 들어온 수입니다.");
		scan.close();
	}
}
