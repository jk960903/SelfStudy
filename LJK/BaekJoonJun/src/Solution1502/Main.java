package Solution1502;
import java.util.Scanner;
public class Main {
	public static int[][] visit;
	public static int[][] dir= {{1,0},{0,1},{-1,0},{0,-1}};
	public static int[][] map;
	public static int n;
	public static int m;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		m=scan.nextInt();
		map=new int[n][m];
		visit=new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				map[i][j]=scan.nextInt();
				visit[i][j]=-1;
			}
		}
		System.out.println(DFS(0,0));
	}
	public static int DFS(int x,int y) {
		if(x==n-1&&y==m-1) {
			return 1;
		}
			if(visit[x][y]>=0) {
				return visit[x][y]; 
			}		
			if(visit[x][y]==-1) {
				visit[x][y]=0;
			}
			for(int i=0; i<dir.length; i++) {
				int tempx=x+dir[i][0];
				int tempy=y+dir[i][1];
				if(tempx>=0&&tempy>=0&&tempx<n&&tempy<m&&map[x][y]>map[tempx][tempy]) {
					visit[x][y]+=DFS(tempx,tempy);
				}
			}
			return visit[x][y];
	}
}
