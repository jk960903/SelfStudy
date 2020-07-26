package yeonguso;//2바이러스 1벽 0은 빈공간
import java.util.Scanner;
public class Main {
	private class dot{
		int x;
		int y;
		private dot(int x,int y) {
			this.x=x;
			this.y=y;
		}
	}
	private static int[][] map;
	private static int[] combi;
	private static int x;
	private static int y;
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		x=scan.nextInt();
		y=scan.nextInt();
		map=new int[x][y];
		
	}
	private void Combination(int start,int depth) {
		if(depth==3) {//벽 3개를 세움
			int[][] copy=new int[x][y];
			for(int i=0; i<x*y; i++) {
				copy[i/y][i%y]=map[i/y][i%y];
			}
		}
		else {
			for(int i=start; i<x*y; i++) {
				if(map[i/y][i%y]==0) {
					combi[depth]=i;
					Combination(i+1,depth+1);
				}
			}
		}
	}
}
