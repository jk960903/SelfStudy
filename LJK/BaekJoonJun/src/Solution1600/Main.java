package Solution1600;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Main {
	public static class dot{
		int x;
		int y;
		dot(int x,int y){
			x=this.x;
			y=this.y;
		}
	}
	public static int[][] dir1 = {{-2,1},{-2,-1},{-1,-2},{1,-2},{2,-1},{2,1},{1,2},{-1,2}};
	public static int[][] dir2= {{1,0},{0,1},{-1,0},{0,-1}};
	public static int[][] map;
	public static int k;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();
		map=new int[x][y];
		k=scan.nextInt();
		
	}
	public static void BFS(int x,int y) {
		Queue<dot> q=new LinkedList<dot>();
		q.add(new dot(x,y));
		while(!q.isEmpty()) {
			dot d=q.poll();
			int tempx=d.x;
			int tempy=d.y;
			if(day<=k) {//나이트 처럼 움직임
				for(int i=0; i<dir1.length; i++) {
					
				}
			}
			else {
				for(int i=0; i<dir2.length; i++) {
					
				}
				
			}
			}
	}
	private static boolean inbound(int tempx,int tempy) {
		if(tempx>=0&&tempy>=0&&tempx<map.length&&tempy<map[0].length) {
			return true;
		}
		else return false;
	}
}
