package Solution3456;
import java.util.Arrays;
import java.util.Scanner;
public class Solution {
	public static int testcase;
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		testcase=scan.nextInt();
		for(int i=1; i<=testcase; i++) {
			int[] num=new int[3];
			for(int j=0; j<3; j++) {
				num[j]=scan.nextInt();
			}
			Arrays.sort(num);
			int square=(num[0]+num[1])*2;
			for(int j=0; j<3; j++) {
				square=square-num[j];
			}
			System.out.println("#"+i+" "+square);
		}
	}
}	
