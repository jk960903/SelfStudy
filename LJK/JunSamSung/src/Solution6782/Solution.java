package Solution6782;
import java.util.ArrayList;
import java.util.Scanner;
public class Solution {
	public static int testcase=0;
	public static void main(String [] args) {
		Scanner scan=new Scanner(System.in);
		testcase=scan.nextInt();
		long k=2;
		ArrayList<Long> list=new ArrayList<Long>();
		while(true) {
			
			long result=k*k;
			if(k==1000001) break;
			list.add(result);
			k++;
		}
		for(int i=1; i<=testcase; i++) {
			Long N=scan.nextLong();	
			Long result=(long)0;
			for(int j=0; j<list.size(); j++){
				if(N==2) break;
				if(N<=list.get(j)) {
					result+=list.get(j)-N;
					result++;
					N=(long) Math.sqrt(list.get(j));
					j=-1;
					if(N==2) break;
				}
			}
			System.out.println("#"+i+" "+result);
		}
	}
}
