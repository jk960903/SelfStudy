package Solution5656;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	public static int testcase, W, H, N;
	public static int[][] array;
	public static int Min=99999;
	public static int init=0;
	public static int count=0;
	public static class dot{
		int x;
		int y;
		dot(int x,int y){
			this.x=x;
			this.y=y;
		}
	}
	public static int[][] dir= {{1,0},{0,1},{-1,0},{0,-1}};
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		testcase = scan.nextInt();
		for (int i = 0; i < testcase; i++) {
			N = scan.nextInt();
			W = scan.nextInt();
			H = scan.nextInt();
			array = new int[H][W];
			for (int j = 0; j < H; j++) {
				for (int k = 0; k < W; k++) {
					array[j][k] = scan.nextInt();
					if(array[j][k]>0) {
						init++;
					}
				}
			}
			LinkedList<Integer> list=new LinkedList<Integer>();
			RePermulation(0,list);
			System.out.println("#"+(i+1)+" "+Min);
			Min=99999;
			init=0;
		}
	}

	public static void RePermulation(int depth,LinkedList<Integer> list) {//중복순열
		if (depth == N) {
			int[][] copy=new int[H][W];
			count=0;
			for(int i=0; i<H; i++) {
				for(int j=0; j<W; j++) {
					copy[i][j]=array[i][j];
				}
			}
			for(int i=0; i<N; i++) {
				for(int j=0; j<H; j++) {
					if(copy[j][list.get(i)]!=0) {
						//벽돌 맞추기
						BFS(j,list.get(i),copy);
						for(int k=0; k<W; k++) {
							for(int l=H-1; l>0; l--) {
								if(copy[l][k]==0) {
									for(int q=l-1; q>=0; q--) {
										if(copy[q][k]!=0) {
											Swap(l,k,q,copy);
											break;
										}
									}
								}
							}
						}
						break;
					}
				}
			}
			if(Min>init-count) {
				Min=init-count;
			}
		} 
		else {
			for (int i = 0; i < W; i++) {
				list.add(i);
				RePermulation(depth+1,list);
				list.removeLast();
			}
		}
	}
	public static void BFS(int x,int y,int[][] array) {//벽돌깨기
		Queue<dot> Q=new LinkedList<dot>();
		Q.add(new dot(x,y));
		boolean[][] visit=new boolean[H][W];
		visit[x][y]=true;
		while(!Q.isEmpty()) {
			dot d=Q.poll();
			x=d.x;
			y=d.y;
			for(int i=1; i<array[x][y]; i++) {
				for(int j=0; j<dir.length; j++) {
					int tempx=x+dir[j][0]*i;
					int tempy=y+dir[j][1]*i;
					if(inbound(tempx,tempy)&&!visit[tempx][tempy]&&array[tempx][tempy]!=0) {//0이 아니라면 들어감
						visit[tempx][tempy]=true;
						Q.add(new dot(tempx,tempy));
					}
				}
			}
			array[x][y]=0;
			count++;
		}
	}
	private static boolean inbound(int tempx,int tempy) {
		if(tempx>=0&&tempy>=0&&tempx<array.length&&tempy<array[0].length ) {
			return true;
		}
		return false;
	}
	private static void Swap(int x,int y,int tx,int [][] array) {
		int temp=0;
		temp=array[x][y];
		array[x][y]=array[tx][y];
		array[tx][y]=temp;	
	}
}
