package Solution4008;

import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
	public static int testcase, N;
	public static int[] number;
	public static int[] giho;
	public static int realresult=0;
	public static int Max=-999999999;
	public static int Min=999999999;
	public static int result=0;
	public static LinkedList<Integer[]> list1 = new LinkedList<Integer[]>();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		testcase = scan.nextInt();
		for (int i = 0; i < testcase; i++) {
			giho = new int[4];
			N = scan.nextInt();
			number = new int[N];
			for (int j = 0; j < 4; j++) {
				giho[j] = scan.nextInt();
			}
			for (int j = 0; j < N; j++) {
				number[j] = scan.nextInt();
			}

			int[] temp = new int[N - 1];
			int index = 0;
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < giho[j]; k++) {
					temp[index] = j + 1;
					index++;
				}
			}
			Permulation(number[0],1);
			int bye=Max-Min;
			System.out.println("#"+(i+1)+" "+bye);
			Max=-999999999;
			Min=999999999;
		}
	}

	public static void Permulation(int sum,int index1) {
		if(index1==N){
			if(sum>Max) {
				Max=sum;
			}
			if(sum<Min) {
				Min=sum;
			}
		} else {
			for (int i = 0; i <4; i++) {
				if(giho[i]!=0&&i==0) {
					giho[i]--;
					Permulation(sum+number[index1],index1+1);
					giho[i]++;
				}
				else if(giho[i]!=0&&i==1) {
					giho[i]--;
					Permulation(sum-number[index1],index1+1);
					giho[i]++;
				}
				else if(giho[i]!=0&&i==2) {
					giho[i]--;
					Permulation(sum*number[index1],index1+1);
					giho[i]++;
				}
				else if(giho[i]!=0&&i==3) {
					giho[i]--;
					Permulation(sum/number[index1],index1+1);
					giho[i]++;
				}
			}
		}
	}
}
