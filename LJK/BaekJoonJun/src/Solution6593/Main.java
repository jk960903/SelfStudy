package Solution6593;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Main {
	public static int[] dirx= {1,-1,0,0,0,0};
	public static int[] diry= {0,0,1,-1,0,0};
	public static int[] dirz= {0,0,0,0,1,-1};
	public static class dot{
		int x;
		int y;
		int z;
		int day;
		dot(int x,int y,int z,int day){
			this.x=x;
			this.y=y;
			this.z=z;
			this.day=day;
		}
	}
	public static char[][][] map;
	static int L;
	static int R;
	static int C;
	static int[][][] result;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(true) {
			L=scan.nextInt();
			R=scan.nextInt();
			C=scan.nextInt();
			if(L==0&&R==0&&C==0) break;
			scan.nextLine();
			int rx=-1;
			int ry=-1;
			int rz=-1;
			int sx=0;
			int sy=0;
			int sz=0;
			map=new char[L][R][C];
			for(int i=0; i<L; i++) {
				for(int j=0; j<R; j++) {
					String s=scan.nextLine();
					char[] temp=s.toCharArray();
					for(int k=0; k<C; k++) {
						map[i][j][k]=temp[k];
						if(map[i][j][k]=='E') {
							rz=i;
							rx=j;
							ry=k;
						}
						if(map[i][j][k]=='S') {
							sz=i;
							sx=j;
							sy=k;
						}
					}
				}
				scan.nextLine();
			}
			BFS(sx,sy,sz);
			if(result[rz][rx][ry]==0) {
				System.out.println("Trapped!");
			}
			else if(rx>-1&&ry>-1&&rz>-1) {
				System.out.println("Escaped in"+" "+result[rz][rx][ry]+" "+"minute(s)");
			}
			
		}
	}
	public static void BFS(int x,int y,int z) {
		Queue<dot> q=new LinkedList<>();
		dot d=new dot(x,y,z,0);
		boolean[][][] visit=new boolean[L][R][C];
		result=new int[L][R][C];
		q.add(d);
		while(!q.isEmpty()) {
			d=q.poll();
			for(int i=0; i<dirx.length; i++) {
				int tempx=d.x+dirx[i];
				int tempy=d.y+diry[i];
				int tempz=d.z+dirz[i];
				if(inbound(tempx,tempy,tempz)&&map[tempz][tempx][tempy]!='#'&&!visit[tempz][tempx][tempy]) {
					q.add(new dot(tempx,tempy,tempz,d.day+1));
					visit[tempz][tempx][tempy]=true;
					result[tempz][tempx][tempy]=d.day+1;
				}
			}
		}
	}
	private static boolean inbound(int tempx,int tempy,int tempz) {
		if(tempx<0||tempy<0||tempz<0||tempx>=R||tempy>=C||tempz>=L) {
			return false;
		}
		else return true;
	}
}
