package Solution8888;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Solution {
	public static int testcase;
	public static void main(String[] args) throws Exception{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     testcase = Integer.parseInt(br.readLine());
		for(int i=1; i<=testcase; i++) {
			int N,T,P;//사람 문제수 지학이 번호
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s, " ");
			N = Integer.parseInt(st.nextToken());
			T = Integer.parseInt(st.nextToken());
			P = Integer.parseInt(st.nextToken());
			int[][] board=new int[N][T];
			for(int j=0; j<N; j++) {
				s=br.readLine();
				st=new StringTokenizer(s," ");
				for(int k=0; k<T; k++) {
					board[j][k]=Integer.parseInt(st.nextToken());
				}
			}
			int[] solve=new int [T];
			for(int j=0; j<T; j++) {
				int count=0;
				for(int k=0; k<N; k++) {
					if(board[k][j]==0) {
						count++;
					}
				}
				solve[j]=count;
				
			}
			int[] score=new int[N];
			int[] solvenum=new int[N];
			for(int j=0; j<N; j++) {
				for(int k=0; k<T; k++) {
					if(board[j][k]==1) {
						score[j]+=solve[k];
						solvenum[j]++;
					}
				}
			}
			int check=score[P-1];
			int number=1;
			
			for(int j=0; j<N; j++) {
				
				if(score[j]>check) {
					number++;
				}
				if(score[j]==check&&solvenum[j]>solvenum[P-1]) {
					number++;
				}
				if(score[j]==check&&solvenum[j]==solvenum[P-1]&&j<P-1) {
					number++;
				}
			}
			System.out.println("#"+i+" "+score[P-1]+" "+number);
		}
	}
}
