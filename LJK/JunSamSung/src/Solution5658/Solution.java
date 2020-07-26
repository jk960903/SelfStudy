package Solution5658;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
public class Solution {
	public static int testcase,N,K;
	public static String s;
	public static char[] array;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		testcase=scan.nextInt();
		for(int i=0; i<testcase; i++) {
			N=scan.nextInt();
			K=scan.nextInt();
			scan.nextLine();
			s=scan.nextLine();
			array=s.toCharArray();
			Set<String> set=new HashSet<String>();
			String original=s;
			for(int j=0; j<array.length/4; j++) {//한칸씩 밀기
					for(int l=0; l<4; l++) {
						String temp=s.substring(0,array.length/4);
						s=s.substring(array.length/4);
						set.add(temp);
					}
					char temp1=array[array.length-1];
					for(int k=array.length-1; k>0; k--) {
						array[k]=array[k-1];
					}
					array[0]=temp1;
					s=new String(array);
			}
			LinkedList<String> list=new LinkedList<String>(set);
			long[] result=new long[list.size()];
			for(int j=0; j<set.size(); j++) {
				String s=list.get(j);
				result[j]=Long.parseLong(s,16);
			}
			Arrays.sort(result);
			long[] result1=new long[result.length];
			for(int j=result.length-1; j>=0; j--) {
				result1[result.length-1-j]=result[j];
			}
			System.out.println("#"+(i+1)+" "+result1[K-1]);
		}
	}
}
