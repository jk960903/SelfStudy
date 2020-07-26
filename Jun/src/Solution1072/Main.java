package Solution1072;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double x=scan.nextInt();
		double y=scan.nextInt();
		double z=(y/x)*100;
		x=x+1;
		y=y+1;
		double temp=(y/x)*100;
		System.out.println((int)temp);
	}
}
