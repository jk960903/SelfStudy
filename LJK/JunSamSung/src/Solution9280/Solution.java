package Solution9280;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	public static int testcase;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		testcase = scan.nextInt();
		for (int i = 1; i <= testcase; i++) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			int[] R=new int[n];
			int[] W=new int[m];
			for(int j=0; j<n; j++) {
				R[j]=scan.nextInt();
			}
			for(int j=0; j<m; j++) {
				W[j]=scan.nextInt();
			}
			ArrayList<Integer> list=new ArrayList<Integer>();
			boolean[] parking=new boolean[n];
			int temparea=-1;
			int[] parkarea=new int[n];
			for(int j=0; j<m*2; j++) {
				list.add(scan.nextInt());
			}
			int result=0;
			ArrayList<Integer> wait=new ArrayList<Integer>();
			for(int j=0; j<list.size(); j++) {
				if(list.get(j)>0) {
					for(int k=0; k<n; k++) {
						if(parking[k]) {
							parking[k]=false;
							parkarea[k]=list.get(j);
							break;
						}
						else {
							wait.add(j);
						}
					}
				}
				else {
					for(int k=0; k<n; k++) {
						if(list.get(j)==parkarea[k]*-1) {
							result=result+W[(list.get(j)*-1)]*R[j];
							list.remove(j);
							parking[k]=true;
						}
					}
				}
			}
		}
	}
}
