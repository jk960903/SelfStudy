package Number1;
import java.util.Scanner;
public class Main {
	public static int testcase=0;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		testcase=scan.nextInt();
		for(int i=0; i<testcase; i++) {
			int first=0;
			int second=0;
			int price=0;
			first=scan.nextInt();
			second=scan.nextInt();
			if(first==1) {
				price+=5000000;
			}
			else if(first>1&&first<=3) {
				price+=3000000;
			}
			else if(first>3&&first<=6) {
				price+=2000000;
			}
			else if(first>6&&first<=10) {
				price+=500000;
			}
			else if(first>10&&first<=15) {
				price+=300000;
			}
			else if(first>15&&first<=21) {
				price+=100000;
			}
			if(second==1){
				price+=5120000;
			}
			else if(second>1&&second<=3) {
				price+=2560000;
			}
			else if(second>3&&second<=7) {
				price+=1280000;
			}
			else if(second>7&&second<=15) {
				price+=640000;
			}
			else if(second>15&&second<=31) {
				price+=320000;
			}
			System.out.println(price);
		}
	}
}
