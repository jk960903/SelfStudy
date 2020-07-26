package Solution17141연구소2;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Main {
	public static int N,M;
	public static int[][] array;
	public static int[] combi;
	public static int countwall;
	public static int count=0;
	public static int Min=99999;
	public static boolean check=false;
	public static int[][] dir= {{1,0},{0,1},{-1,0},{0,-1}};
	public static class dot{
		int x;
		int y;
		int day;
		dot(int x,int y,int day){
			this.x=x;
			this.y=y;
			this.day=day;
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		N=scan.nextInt();
		M=scan.nextInt();
		array=new int[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				array[i][j]=scan.nextInt();
				if(array[i][j]==1) {
					countwall++;
				}
			}
		}
		combi=new int[M];
		DFS(0,0);
		if(check){
		System.out.println(Min);
		}
		else {
			System.out.println(-1);
		}
		
	}
	public static void DFS(int start,int depth) {
		if(depth==M) {
			int[][] copyarray=new int[N][N];
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if(array[i][j]==1) {
						copyarray[i][j]=-1;
					}
				}
			}
			BFS(copyarray);
			return;
		}
		for(int i=start; i<N*N; i++) {
			if(array[i/N][i%N]==2) {
				combi[depth]=i;
				DFS(i+1,depth+1);
			}
		}
	}
	public static void BFS(int[][] copyarray) {
		Queue<dot> Q=new LinkedList<dot>();
		int day=1;
		boolean[][] visit=new boolean[N][N];
		count=M;
		for(int i=0; i<M; i++) {
			copyarray[combi[i]/N][combi[i]%N]=-2;
			Q.add(new dot(combi[i]/N,combi[i]%N,day));
			visit[combi[i]/N][combi[i]%N]=true;
			copyarray[combi[i]/N][combi[i]%N]=day;
		}
		while(!Q.isEmpty()) {
			if(count==N*N-countwall&&day==1) {
				check=true;
				if(day<Min) {
					Min=0;
				}
				break;
			}
			dot d=Q.poll();
			int x=d.x;
			int y=d.y;
			day=d.day;
			for(int i=0; i<dir.length; i++) {
				int tempx=x+dir[i][0];
				int tempy=y+dir[i][1];
				if(inbound(tempx,tempy)&&!visit[tempx][tempy]&&copyarray[tempx][tempy]!=-1) {
					visit[tempx][tempy]=true;
					copyarray[tempx][tempy]=day+1;
					Q.add(new dot(tempx,tempy,day+1));
					count++;
				}
			}
			if(count==N*N-countwall) {
				check=true;
				if(day<Min) {
					Min=day;
				}
				break;
			}
		}
		
	}
	private static boolean inbound(int tempx,int tempy) {
		if(tempx>=0&&tempy>=0&&tempx<array.length&&tempy<array[0].length) {
			return true;
		}
		else return false;
	}
}
