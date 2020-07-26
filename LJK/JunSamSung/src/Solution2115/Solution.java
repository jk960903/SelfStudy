package Solution2115;

import java.util.Scanner;

public class Solution {
	public static int testcase, N, M, C;
	public static int[][] array;
	public static int[] combix;
	public static int[] combiy;
	public static int max1=0;
	public static int max2=0;
	public static int realmax=0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		testcase = scan.nextInt();
		for (int i = 0; i < testcase; i++) {
			N = scan.nextInt();
			M = scan.nextInt();
			C = scan.nextInt();
			array=new int[N][N];
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					array[j][k] = scan.nextInt();
				}
			}
			combix = new int[M];
			combiy = new int[M];
			Combi(0);
			System.out.println("#"+(i+1)+" "+realmax);
			realmax=0;
			max1=0;
			max2=0;
		}
	}

	public static void Combi(int start) {
		if (combix[M - 1] != 0) {
			boolean check=true;
			for(int i=start; i<N*N; i++) {
				check=true;
				for(int j=i+1; j<i+M; j++) {
					if(j/N!=(j-1)/N) {
						check=false;
					}
				}
				if(check) {
					for(int j=0; j<M; j++) {
						combiy[j]=array[i/N][i%N+j];
					}
					combi3(0,0,combiy,0,0);
				}
			}
		} else {
			boolean check = true;
			for (int i = 0; i < N * N - 2 * M + 1; i++) {
				check=true;
				for (int j = i + 1; j < i + M; j++) {
					if (j / N != (j - 1) / N) {
						check = false;
					}
				}
				if (check) {
					for (int j = 0; j < M; j++) {
						// 두개의 몫이 다르면 안된다.
						combix[j] = array[i / N][i % N + j];
					}
					combi2(0,0,combix,0,0);
					Combi(i+M);
					if(realmax<max1+max2) {
						realmax=max1+max2;
					}
					max1=0;
					max2=0;
				}
			}
		}
	}
	public static void combi2(int start,int depth,int[] array,int count,int index) {
		if(depth<=C&&depth!=0) {
			count=count+(array[index]*array[index]);
			if(count>max1) {
				max1=count;
			}
		}
		else if(depth>C) {
			return;
		}
		for(int i=start; i<array.length; i++) {
				depth=depth+array[i];
				combi2(i+1,depth,array,count,i);
				depth=depth-array[i];
			}
	}
	public static void combi3(int start,int depth,int[] array,int count,int index) {
		if(depth<=C&&depth!=0) {
			count=count+(array[index]*array[index]);
			if(count>max2) {
				max2=count;
			}
		}
		else if(depth>C){
			return;
		}
		for(int i=start; i<array.length; i++) {
				depth=depth+array[i];
				combi3(i+1,depth,array,count,i);
				depth=depth-array[i];
			}
	}

	public static int inbound(int check) {
		if (check < array[0].length) {
			return 1;
		} else
			return 0;
	}
}
