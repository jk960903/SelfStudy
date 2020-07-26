package Solution7810;
import java.util.Scanner;
public class Solution {
	public static int testcase=0;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		testcase=scan.nextInt();
		for(int i=1; i<=testcase; i++) {
			int n=scan.nextInt();
			int[] array=new int[n];
			int max=0;
			for(int j=0; j<n; j++) {
				array[j]=scan.nextInt();
				if(max<array[j]) max=array[j];
			}
			int[] count=new int[max+1];
			for(int j=0; j<n; j++) {
				count[array[j]]++;
			}
			int k=n;
			int[] result=new int[max+1];
			for(int j=0; j<=max; j++) {
				result[j]=n;
			}
			for(int j=1; j<=max; j++) {
				result[j]=result[j-1]-count[j-1];
			}
			int index=0;
			for(int j=0; j<=max; j++) {
				if(result[j]<j) {
					index=j;
					break;
				}
			}
			if(index!=0) {
			System.out.println("#"+i+" "+(index-1));
			}
			else {
				System.out.println("#"+i+" "+index);
			}
		}
	}	

}
