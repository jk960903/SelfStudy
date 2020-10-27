package practice35;
import java.util.Scanner;
public class Continueexample {
	public static void main(String[] args) {
		System.out.println("2015152030 이준규");
		Scanner scan=new Scanner(System.in);
		System.out.println("정수를 5개 입력하세요");
		int sum=0;
		for(int i=0; i<5; i++) {
			int n=scan.nextInt();
			if(n<0) {
				sum+=n;
			}else {
				continue;
			}
		}
		System.out.println("음수의 합은"+sum);
		scan.close();
	}
}
