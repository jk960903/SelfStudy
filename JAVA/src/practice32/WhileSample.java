package practice32;
import java.util.Scanner;
public class WhileSample {
	public static void main(String[] args) {
		System.out.println("2015152030이준규");
		int count=0;
		int sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
		int n=scan.nextInt();
		while(n!=-1) {
			sum+=n;
			count++;
			n=scan.nextInt();
		}
		if(count==0) System.out.println("입력된 수가없습니다.");
		else {
			System.out.print("정수의 개수는"+ count+"개이며 ");
			System.out.println("평균은 "+(double)sum/count+"입니다.");
		}
		scan.close();
		
	}
}
