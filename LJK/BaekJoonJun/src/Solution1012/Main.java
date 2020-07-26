package Solution1012;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Main {
	public static class dot{
		int x;
		int y;
		
		public dot(int x,int y){
			this.x=x;
			this.y=y;
		}
	}
	public static int[][] array;
	public static int[][] dir= {{1,0},{0,1},{-1,0},{0,-1}};
	public static int testcase;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		testcase=scan.nextInt();
		for(int i=1; i<=testcase; i++) {
			int M=scan.nextInt();
			int N=scan.nextInt();
			int K=scan.nextInt();
			array=new int[N][M];
			for(int j=0; j<K; j++) {
				int x=scan.nextInt();
				int y=scan.nextInt();
				array[y][x]=1;
			}
			BFS();
		}
	}
	public static void BFS() {
		Queue<dot> q=new LinkedList<dot>();
		boolean[][] visit=new boolean[array.length][array[0].length];
		int result=0;
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[0].length; j++) {
				if(array[i][j]==1&&!visit[i][j]) {
					q.add(new dot(i,j));
					while(!q.isEmpty()) {
						dot d=q.poll();
						int x=d.x;
						int y=d.y;
						visit[x][y]=true;
						for(int k=0; k<dir.length; k++) {
							int tempx=x+dir[k][0];
							int tempy=y+dir[k][1];
							if(inbound(tempx,tempy)&&!visit[tempx][tempy]&&array[tempx][tempy]==1) {
								q.add(new dot(tempx,tempy));
								visit[tempx][tempy]=true;
							}
						}
					}
					result++;
				}
			}
		}
		System.out.println(result);
	}
	private static boolean inbound(int tempx,int tempy) {
		if(tempx>=0&&tempy>=0&&tempx<array.length&&tempy<array[0].length) {
			return true;
		}
		else return false;
	}
}
