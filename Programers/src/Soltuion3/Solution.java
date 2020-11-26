package Soltuion3;
import java.util.Queue;
import java.util.LinkedList;
public class Solution {
		
	 	public static int[][] dir={{1,0},{0,1},{-1,0},{0,-1}};
	    public static boolean[][] visit;
	    public static void main(String[] args) {
	    	int[][] v= {{0,0,1,1},{1,1,1,1},{2,2,2,1},{0,0,0,2}};
	    	int[] answer=solution(v);
	    	for(int i=0; i<3; i++) {
	    		System.out.println(answer[i]);
	    	}
	    }
	    public static int[] solution(int[][] v)
	    {
	        int[] answer = new int[3];
	        visit=new boolean[v.length][v[0].length];
	        for(int i=0; i<v.length; i++){
	            for(int j=0; j<v[0].length; j++){
	                if(!visit[i][j]){
	                    if(v[i][j]==0){
	                        BFS(i,j,v,visit,0);
	                        answer[0]++;
	                    }else if(v[i][j]==1){
	                        BFS(i,j,v,visit,1);
	                        answer[1]++;
	                    }else{
	                        BFS(i,j,v,visit,2);
	                        answer[2]++;
	                    }
	                }
	            }
	        }
	        return answer;
	    }
	    public static void BFS(int x,int y,int[][] v,boolean[][] visit,int type){
	        Queue<dot> queue=new LinkedList<>();
	        queue.add(new dot(x,y));
	        visit[x][y]=true;
	        while(!queue.isEmpty()){
	            dot d=queue.poll();
	            int dx=d.x;
	            int dy=d.y;
	            for(int i=0; i<dir.length; i++){
	                int tempx=dx+dir[i][0];
	                int tempy=dy+dir[i][1];
	                if(inbound(tempx,tempy,v)&&!visit[tempx][tempy]&&type==v[tempx][tempy]){
	                    visit[tempx][tempy]=true;
	                    queue.add(new dot(tempx,tempy));
	                }
	            }
	        }
	    }
	    public static boolean inbound(int x,int y,int[][] v){
	        if(x<0||x>=v.length||y<0||y>=v[0].length) return false;
	        else return true;
	    }
	    static class dot{
	        int x;
	        int y;
	        dot(int x,int y){
	            this.x=x;
	            this.y=y;
	        }
	    }
}

