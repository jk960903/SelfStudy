package Solution7701;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Solution {
	public static int testcase=0;
	public static ArrayList<String> list[]=new ArrayList[50];
	public static Set<String> set[]=new HashSet[50]; 
	public static int N=0;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		testcase=scan.nextInt();
		for(int i=0; i<testcase; i++) {
			N=scan.nextInt();
			scan.nextLine();
			for(int j=0; j<50; j++) {
				list[j]=new ArrayList<String>();
				set[j]=new HashSet<String>();
			}
			for(int j=0; j<N; j++) {
				String temp=scan.nextLine();
				set[temp.length()-1].add(temp);
			}
			System.out.println("#"+(i+1));
			for(int j=0; j<50; j++) {
				list[j]=new ArrayList(set[j]);
				Collections.sort(list[j]);
				for(int k=0; k<list[j].size(); k++) {
					System.out.println(list[j].get(k));
				}
			}
		}
	}
	
}
