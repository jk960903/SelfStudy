package Solution1953;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	public static int testcase = 0;
	public static int N, M, R, C, L;
	public static int[][] array;
	public static boolean[][] visit;
	static class dot {
		int x;
		int y;
		int day;

		dot(int x, int y, int day) {
			this.x = x;
			this.y = y;
			this.day = day;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		testcase = scan.nextInt();
		for (int i = 0; i < testcase; i++) {
			N = scan.nextInt();
			M = scan.nextInt();
			R = scan.nextInt();
			C = scan.nextInt();
			L = scan.nextInt();
			array = new int[N][M];
			visit=new boolean[N][M];
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < M; k++) {
					array[j][k] = 0;
					visit[j][k]=false;
				}
			}
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < M; k++) {
					array[j][k] = scan.nextInt();
				}
			}
			int count=0;
			BFS(R,C);
			for(int j=0; j<N; j++) {
				for(int k=0; k<M; k++) {
					if(visit[j][k]) count++;
				}
			}
			if(L==1)System.out.println("#"+(i+1)+" "+1);
			else System.out.println("#"+(i+1)+" "+count);
		}
	}

	public static void BFS(int x, int y) {
		Queue<dot> Q = new LinkedList<dot>();
		int day = 1;
		dot d = new dot(x, y, day);
		Q.add(d);
		while (!Q.isEmpty() && day != L) {
			d = Q.poll();
			x=d.x;
			y=d.y;
			day=d.day;
			visit[x][y]=true;
			if(day==L) {
				break;
			}
			if (array[d.x][d.y] == 1) {
				int[][] dir= {{1,0},{0,1},{-1,0},{0,-1}};
				for(int i=0; i<dir.length; i++) {
					int tempx=x+dir[i][0];
					int tempy=y+dir[i][1];
					if(inbound(tempx,tempy)&&!visit[tempx][tempy]) {
						if(i==0) {
							if(array[tempx][tempy]==1||array[tempx][tempy]==2||array[tempx][tempy]==4||array[tempx][tempy]==7)
							{
								visit[tempx][tempy]=true;
								Q.add(new dot(tempx,tempy,day+1));
								
							}
						}
						else if(i==1) {
							if(array[tempx][tempy]==1||array[tempx][tempy]==3||array[tempx][tempy]==6||array[tempx][tempy]==7) {
								visit[tempx][tempy]=true;
								Q.add(new dot(tempx,tempy,day+1));
							}
						}else if(i==2) {
							if(array[tempx][tempy]==1||array[tempx][tempy]==2||array[tempx][tempy]==5||array[tempx][tempy]==6) {
								visit[tempx][tempy]=true;
								Q.add(new dot(tempx,tempy,day+1));
							}
						}
						else if(i==3) {
							if(array[tempx][tempy]==1||array[tempx][tempy]==3||array[tempx][tempy]==4||array[tempx][tempy]==5) {
								visit[tempx][tempy]=true;
								Q.add(new dot(tempx,tempy,day+1));
							}
						}
						
					}
				}
			} else if (array[d.x][d.y] == 2) {
				int[][] dir= {{1,0},{-1,0}};
				for(int i=0; i<dir.length; i++) {
					int tempx=x+dir[i][0];
					int tempy=y+dir[i][1];
					if(inbound(tempx,tempy)&&!visit[tempx][tempy]) {
						if(i==1) {
							 {
								if(array[tempx][tempy]==1||array[tempx][tempy]==2||array[tempx][tempy]==5||array[tempx][tempy]==6) {
									visit[tempx][tempy]=true;
									Q.add(new dot(tempx,tempy,day+1));
								}
							}
						}
						else if(i==0) {
							if(array[tempx][tempy]==1||array[tempx][tempy]==2||array[tempx][tempy]==4||array[tempx][tempy]==7)
							{
								visit[tempx][tempy]=true;
								Q.add(new dot(tempx,tempy,day+1));
								
							}
						}
					}
				}
			} else if (array[d.x][d.y] == 3) {
				int[][] dir= {{0,1},{0,-1}};
				for(int i=0; i<dir.length; i++) {
					int tempx=x+dir[i][0];
					int tempy=y+dir[i][1];
					if(inbound(tempx,tempy)&&!visit[tempx][tempy]) {
						if(i==0) {
							if(array[tempx][tempy]==1||array[tempx][tempy]==3||array[tempx][tempy]==6||array[tempx][tempy]==7) {
								visit[tempx][tempy]=true;
								Q.add(new dot(tempx,tempy,day+1));
							}
						}
						else if(i==1) {
							if(array[tempx][tempy]==1||array[tempx][tempy]==3||array[tempx][tempy]==4||array[tempx][tempy]==5) {
								visit[tempx][tempy]=true;
								Q.add(new dot(tempx,tempy,day+1));
							}
						}
					}
				}
			} else if (array[d.x][d.y] == 4) {
				int[][] dir= {{-1,0},{0,1}};
				for(int i=0; i<dir.length; i++) {
					int tempx=x+dir[i][0];
					int tempy=y+dir[i][1];
					if(inbound(tempx,tempy)&&!visit[tempx][tempy]) {
						if(i==0) {
							if(array[tempx][tempy]==1||array[tempx][tempy]==2||array[tempx][tempy]==5||array[tempx][tempy]==6) {
								visit[tempx][tempy]=true;
								Q.add(new dot(tempx,tempy,day+1));
							}
						}
						else if(i==1) {
							if(array[tempx][tempy]==1||array[tempx][tempy]==3||array[tempx][tempy]==6||array[tempx][tempy]==7) {
								visit[tempx][tempy]=true;
								Q.add(new dot(tempx,tempy,day+1));
							}
						}
					}
				}
			} else if (array[d.x][d.y] == 5) {
				int[][] dir= {{1,0},{0,1}};
				for(int i=0; i<dir.length; i++) {
					int tempx=x+dir[i][0];
					int tempy=y+dir[i][1];
					if(inbound(tempx,tempy)&&!visit[tempx][tempy]) {
						if(i==0) {
							if(array[tempx][tempy]==1||array[tempx][tempy]==2||array[tempx][tempy]==4||array[tempx][tempy]==7)
							{
								visit[tempx][tempy]=true;
								Q.add(new dot(tempx,tempy,day+1));
								
							}
						}
						else if(i==1) {
							if(array[tempx][tempy]==1||array[tempx][tempy]==3||array[tempx][tempy]==6||array[tempx][tempy]==7) {
								visit[tempx][tempy]=true;
								Q.add(new dot(tempx,tempy,day+1));
							}
						}
					}
				}
			} else if (array[d.x][d.y] == 6) {
				int[][] dir= {{1,0},{0,-1}};
				for(int i=0; i<dir.length; i++) {
					int tempx=x+dir[i][0];
					int tempy=y+dir[i][1];
					if(inbound(tempx,tempy)&&!visit[tempx][tempy]) {
						if(i==0) {
							if(array[tempx][tempy]==1||array[tempx][tempy]==2||array[tempx][tempy]==4||array[tempx][tempy]==7)
							{
								visit[tempx][tempy]=true;
								Q.add(new dot(tempx,tempy,day+1));
								
							}
						}
						else if(i==1) {
							if(array[tempx][tempy]==1||array[tempx][tempy]==3||array[tempx][tempy]==4||array[tempx][tempy]==5) {
								visit[tempx][tempy]=true;
								Q.add(new dot(tempx,tempy,day+1));
							}
						}
					}
				}
			} else if (array[d.x][d.y] == 7) {
				int[][] dir= {{-1,0},{0,-1}};
				for(int i=0; i<dir.length; i++) {
					int tempx=x+dir[i][0];
					int tempy=y+dir[i][1];
					if(inbound(tempx,tempy)&&!visit[tempx][tempy]) {
						if(i==0) {
							if(array[tempx][tempy]==1||array[tempx][tempy]==2||array[tempx][tempy]==5||array[tempx][tempy]==6)
							{
								visit[tempx][tempy]=true;
								Q.add(new dot(tempx,tempy,day+1));
								
							}
						}
						else if(i==1) {
							if(array[tempx][tempy]==1||array[tempx][tempy]==3||array[tempx][tempy]==4||array[tempx][tempy]==5) {
								visit[tempx][tempy]=true;
								Q.add(new dot(tempx,tempy,day+1));
							}
						}
					}
				}
			}

		}
	}
	private static boolean inbound(int tempx,int tempy) {
		if(tempx>=0&&tempy>=0&&tempx<array.length&&tempy<array[0].length) {
			return true;
		}
		return false;
	}
}
