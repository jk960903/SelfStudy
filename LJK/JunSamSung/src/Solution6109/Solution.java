package Solution6109;
import java.util.Scanner;
public class Solution {
	public static int testcase;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		testcase=scan.nextInt();
		for(int i=1; i<=testcase; i++) {
			int num=scan.nextInt();
			String s=scan.next();
			int[][] array=new int[num][num];
			for(int j=0; j<num; j++) {
				for(int k=0; k<num; k++) {
					array[j][k]=scan.nextInt();
				}
			}
			
		}
	}
	private static void Function(int[][] array,String s) {
		if(s=="up") {
			for(int i=0; i<array[0].length; i++) {
				for(int j=0; j<array.length-1; j++) {
					if(array[i][j]==array[i][j+1]) {
						array[i][j]=array[i][j]+array[i][j+1];
						array[i][j+1]=0;
					}
				}
			}
			for(int i=0; i<array[0].length; i++) {
				for(int j=0; j<array.length-1; j++) {
					if(array[i][j]==array[i][j+1]) {
						array[i][j]=array[i][j]+array[i][j+1];
						array[i][j+1]=0;
					}
				}
			}
		}
		else if(s=="down") {
			
		}
		else if(s=="right") {
			
		}
		else if(s=="left") {
			
		}
	}

}
