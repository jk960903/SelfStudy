package Solution7194;
import java.util.Scanner;
public class Solution {
	public static int testcase;
	public static long min=99999999;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		testcase=scan.nextInt();
		for(int i=1; i<=testcase; i++) {
			min=999999999;
			long s=scan.nextInt();
			long t=scan.nextInt();
			long a=scan.nextInt();
			long b=scan.nextInt();
			if(b==1) {
				long result=t-s;
				if(result%a==0) {
					min=result/a;
				}
			}
			else {
				DFS(s,t,a,b,0);
			}
			if(min==999999999)System.out.println("#"+i+" "+-1); 
			else System.out.println("#"+i+" "+min);
		}
	}
	public static void DFS(long s,long t,long a,long b,int day) {
		if(s==t) {
			if(min>day) {
				min=day;
			}
			return;
		}
		else if(s>t){
			return;
		}else {
			DFS(s+a,t,a,b,day+1);
			DFS(s*b,t,a,b,day+1);
		}
	}
}
