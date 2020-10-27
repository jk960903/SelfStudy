package practice317;
import java.util.InputMismatchException;
import java.util.Scanner;
public class InputException {
	public static void main(String[] args) {
		System.out.println("2015152030 이준규");
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요");
		int sum=0,n=0;
		for(int i=0; i<3; i++) {
			System.out.print(i+">>");
			try {
				n=scan.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다 다시 입력하세요");
				scan.next();
				i--;
				continue;
			}
			sum+=n;
		}
		System.out.println("합은 "+sum);
		scan.close();
	}
}
