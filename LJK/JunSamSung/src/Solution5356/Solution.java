package Solution5356;
import java.util.Scanner;
public class Solution {
	public static int testcase =0;
	public static String[] s;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		testcase= scan.nextInt();
		scan.next();
		for(int i=1; i<=testcase; i++) {
			s=new String[5];
			for(int j=0; i<5; j++) {
				s[j]=scan.nextLine();
			}
			
		}
	}
}
