package Solution8104;

import java.util.Scanner;

public class Solution {
	public static int testcase = 0;
	public static int N = 0;
	public static int M = 0;
	public static int[][] array;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		testcase = scan.nextInt();
		for (int i = 0; i < testcase; i++) {
			int temp=1;
			N = scan.nextInt();
			M = scan.nextInt();
			array = new int[M][N];
			for (int j = 0; j < N; j++) {
				if (j % 2 == 0) {
					for (int k = 0; k < M; k++) {
						array[k][j]=temp;
						temp++;
					}
				}
				else if(j%2==1) {
					for(int k=M-1; k>=0; k--) {
						array[k][j]=temp;
						temp++;
					}	
				}
			}
			System.out.print("#"+(i+1)+" ");
			for(int j=0; j<M; j++) {
				int result=0;
				for(int k=0; k<N; k++) {
					result=result+array[j][k];
				}
				System.out.print(result+" ");
			}
			System.out.println();
		}
	}
}
