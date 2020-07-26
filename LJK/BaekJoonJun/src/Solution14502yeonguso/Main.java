package Solution14502yeonguso;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Main {
	public static class dot{
		int x;
		int y;
		public dot(int x,int y) {
			this.x=x;
			this.y=y;
		}
	}
	public static int N=0;
	public static int M=0;
	public static int[][] array;
	public static int[] combi;
	public static int[][] dir= {{1,0},{0,1},{-1,0},{0,-1}};
	public static int Max=0;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		N=scan.nextInt();
		M=scan.nextInt();
		array=new int[N][M];
		combi=new int[3];
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				array[i][j]=scan.nextInt();
			}
		}
		DFS(0,0);
		System.out.println(Max);
	}
	public static void DFS(int start,int depth) {
		if(depth==3) {
			int[][] copyarray=new int[N][M];
			for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					copyarray[i][j]=array[i][j];
				}
			}
			copyarray[combi[0]/M][combi[0]%M]=1;
			copyarray[combi[1]/M][combi[1]%M]=1;
			copyarray[combi[2]/M][combi[2]%M]=1;
			BFS(0,0,copyarray);
			return;
		}
		for(int i=start; i<N*M; i++) {
			if(array[i/M][i%M]==0) {
				combi[depth]=i;
				DFS(i+1,depth+1);
			}
		}
	}
	public static void BFS(int x,int y,int[][] array) {	
		Queue<dot> Q=new LinkedList<dot>();
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(array[i][j]==2) {
					Q.add(new dot(i,j));
				}
			}
		}
		boolean[][] visit=new boolean[N][M];
		while(!Q.isEmpty()) {
			dot d=Q.poll();
			x=d.x;
			y=d.y;
			visit[x][y]=true;
			
			for(int i=0; i<dir.length; i++) {
				int tempx=x+dir[i][0];
				int tempy=y+dir[i][1];
				if(inbound(tempx,tempy)&&array[tempx][tempy]==0&&!visit[tempx][tempy]) {
					visit[tempx][tempy]=true;
					array[tempx][tempy]=2;
					Q.add(new dot(tempx,tempy));
				}
			}
		}
		int count=0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(array[i][j]==0) {
					count++;
				}
			}
		}
		if(count>Max) {
			Max=count;
		}
		
	}
	private static boolean inbound(int tempx,int tempy) {
		if(tempx>=0&& tempy>=0&&tempx<array.length&&tempy<array[0].length) {
			return true;
		}
		return false;
	}
}
