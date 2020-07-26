package Solution7829;
import java.util.Scanner;
public class Solution {
	public static int testcase=0;
	public static int N;
	public static int[] number;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		testcase=scan.nextInt();
		for(int i=1; i<=testcase; i++) {
			int result=0;
			int min=999999999;
			int max=0;
			N=scan.nextInt();
			number=new int[N];
			for(int j=0; j<N; j++) {
				number[j]=scan.nextInt();
				if(number[j]<min) {
					min=number[j];
				}
				if(number[j]>max) {
					max=number[j];
				}
				
			}
			result=min*max;
			System.out.println("#"+i+" "+result);
		}
	}
}
