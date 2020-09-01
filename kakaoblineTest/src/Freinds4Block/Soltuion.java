package Freinds4Block;

class Solution {
	public static int[][] dir = {{1,0},{0,1},{1,1}};
	public static void main(String[] args) {
		int m=6;
		int n=6;
		String[] board= {"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"};
		int num=solution(m,n,board);
		System.out.println(num);
	}
    public static int solution(int m, int n, String[] board) {
        int answer = 0;
        char[][] map=new char[m][n];
        boolean finish=true;
        boolean canbreak=false;
        for(int i=0; i<m; i++) {
        	map[i]=board[i].toCharArray();
        }
        while(true) {
            boolean[][] check=new boolean[m][n];
            canbreak=false;
            for(int i=0; i<m-1; i++) {
            	for(int j=0; j<n-1; j++) {
            		int num=1;
            		for(int k=0; k<dir.length; k++) {
            			int tempx=i+dir[k][0];
            			int tempy=j+dir[k][1];
            			if(map[i][j]==map[tempx][tempy]&&map[i][j]!=' ') {
            				num++;
            			}
            		}
            		if(num==4) {
            			check[i][j]=true;
            			for(int k=0; k<dir.length; k++) {
            				int tempx=i+dir[k][0];
            				int tempy=j+dir[k][1];
            				check[tempx][tempy]=true;
            				canbreak=true;
            			}
            		}
            	}
            }
            if(canbreak) {
            for(int i=0; i<m; i++) {
            	for(int j=0; j<n; j++) {
            		if(check[i][j]) {
            			map[i][j]=' ';
            		}
            	}
            }
            for(int i=m-1; i>=0; i--) {
            	for(int j=0; j<n; j++) {
            		if(map[i][j]==' ') {
            			int temp=i;
            			while(true) {
            				temp--;
            				if(temp<0) {
            					break;
            				}
            				if(map[temp][j]!=' ') {
            					map[i][j]=map[temp][j];
            					map[temp][j]=' ';
            					break;
            				}
            			}
            		}
            	}
            }
            }
            if(!canbreak) {
            	finish=false;
            }
            if(!finish) {
            	break;
            }
        }
        for(int i=0; i<m; i++) {
        	for(int j=0; j<n; j++) {
        		if(map[i][j]==' ') {
        			answer++;
        		}
        	}
        }
        return answer;
    }
    
    
}