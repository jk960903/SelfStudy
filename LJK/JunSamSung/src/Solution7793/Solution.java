package Solution7793;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Solution {
	public static int testcase,N,M;
	public static char[][] array;
	public static int Gx,Gy,Sx,Sy,dx,dy;
	public static boolean success=false;
	public static int[][] dir= {{1,0},{0,1},{-1,0},{0,-1}};
	public static class dot{
		int x;
		int y;
		int day;
		char type;
		dot(int x,int y,int day,char type){
			this.x=x;
			this.y=y;
			this.day=day;
			this.type=type;
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		testcase=scan.nextInt();
		for(int i=0; i<testcase; i++) {
			success=false;
			N=scan.nextInt();
			M=scan.nextInt();
			scan.nextLine();
			array=new char[N][M];
			for(int j=0; j<N; j++) {
				String s=scan.nextLine();
				array[j]=s.toCharArray();
			}
			LinkedList<Integer> Dx=new LinkedList<Integer>();
			LinkedList<Integer> Dy=new LinkedList<Integer>();
			
			for(int j=0; j<N; j++) {
				for(int k=0; k<M; k++) {
					if(array[j][k]=='D') {
						Gx=j;
						Gy=k;
					}
					else if(array[j][k]=='S') {
						Sx=j;
						Sy=k;
					}
					else if(array[j][k]=='*') {
						Dx.add(j);
						Dy.add(k);
					}
				}
			}
			int result=BFS(Gx,Gy,Sx,Sy,Dx,Dy);
			if(success==true) {
				System.out.println("#"+(i+1)+" "+result);
			}
			else if(N==1&&M==1) {
				System.out.println(0);
			}
			else {
				System.out.println("GAME OVER");
			}
		}
	}
	public static int BFS(int gx,int gy,int sx,int sy,LinkedList<Integer> dx1,LinkedList<Integer> dy1) {
		Queue<dot> Q=new LinkedList<dot>();
		boolean[][] visit=new boolean[N][M];
		int day=0;
		for(int i=0; i<dx1.size(); i++) {
			Q.add(new dot(dx1.get(i),dy1.get(i),day,array[dx1.get(i)][dy1.get(i)]));
			visit[dx1.get(i)][dy1.get(i)]=true;;
		}
		visit[sx][sy]=true;
		Q.add(new dot(sx,sy,day,array[sx][sy]));
		while(!Q.isEmpty()) {
			dot d=Q.poll();
			int x=d.x;
			int y=d.y;
			day=d.day;
			char type=d.type;
			for(int i=0; i<dir.length; i++) {
				int tempx=x+dir[i][0];
				int tempy=y+dir[i][1];
				if(inbound(tempx,tempy)&&!visit[tempx][tempy]&&array[tempx][tempy]!='X') {
					if(type=='S') {
						if(array[tempx][tempy]=='D') {
							success=true;
							day=day+1;
							break;
						}
						Q.add(new dot(tempx,tempy,day+1,type));
						visit[tempx][tempy]=true;
						array[tempx][tempy]=type;
					}
					else if(type=='*'&&array[tempx][tempy]!='D') {
						Q.add(new dot(tempx,tempy,day+1,type));
						array[tempx][tempy]=type;
						visit[tempx][tempy]=true;
					}
				}
			}
			if(success==true) {
				break;
			}
		}
		return day;
	}
	private static boolean inbound(int tempx,int tempy) {
		if(tempx>=0&&tempy>=0&&tempx<array.length&&tempy<array[0].length) {
			return true;
		}
		else return false;
	}
}
