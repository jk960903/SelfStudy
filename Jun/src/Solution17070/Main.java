package Solution17070;
import java.util.Scanner;
public class Main {
	public static int result=0;
	public static int[][] array;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		array=new int[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				array[i][j]=scan.nextInt();
			}
		}
		dfs(0,1,0);
		System.out.println(result);
	}
	protected static void dfs(int x,int y,int direction) {
		if(x==array.length-1&&y==array[0].length-1) {
			result++;
		}
		else {
			if(direction!=2&&inbound(x,y+1)&&array[x][y+1]==0) {
				dfs(x,y+1,0);
			}
			if(direction!=0&&inbound(x+1,y)&&array[x+1][y]==0) {
				dfs(x+1,y,2);
			}
			if(inbound(x+1,y+1)&&array[x+1][y]==0&&array[x][y+1]==0&&array[x+1][y+1]==0) {
				dfs(x+1,y+1,1);
			}
		}
	}
	private static boolean inbound(int x,int y) {
		if(x>=0&&y>=0&&x<array.length&&y<array[0].length) {
			return true;
		}
		else return false;
	}
}
