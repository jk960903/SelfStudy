package Solution7338;
import java.util.Scanner;
public class Solution {
	public static int testcase;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		testcase=scan.nextInt();
		for(int i=1; i<=testcase; i++) {
			long Year=scan.nextLong();
			long Month=scan.nextLong();
			long temp=Year-2016;
			temp=temp*12;
			temp=temp+Month;
			long resultY=temp/13;
			resultY=resultY+2016;
			long resultM=temp%13;
			if(resultM==0) {
				System.out.println("#"+i+" "+(resultY-1)+" "+13);
			}else {
			System.out.println("#"+i+" "+resultY+" "+resultM);
			}
		}
	}
}
