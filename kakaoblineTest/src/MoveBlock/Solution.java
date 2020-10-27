package MoveBlock;
import java.util.LinkedList;
import java.util.Queue;
public class Solution {
    private int[][] board;
    private static int[][] dir={{0,1},{1,0},{-1,0},{0,-1}};
    private static int[][] ndir= {{-1,1},{1,-1},{-1,-1},{1,1}};
    public int solution(int[][] board) {
        int answer = 0;
        answer=bfs(board);
        return answer;
    }
    private int bfs(int[][] board) {
    	Queue<Robot> queue=new LinkedList<>();
        queue.add(new Robot(0,0,0,0));
        boolean[][][] visit=new boolean[board.length][board.length][4];
        visit[0][0][0]=true;
        while(!queue.isEmpty()) {
        	Robot robot=queue.poll();
        	int x=robot.x;
        	int y=robot.y;
        	int direction=robot.dir;
        	int time=robot.time;
        	int otherx=x+dir[robot.dir][0];
        	int othery=y+dir[robot.dir][1];
        	if(isFinish(x,y,board)||isFinish(otherx,othery,board)) return time;
        	for(int i=0; i<4; i++) {
        		int tempx=x+dir[i][0];
        		int tempy=y+dir[i][1];
        		int tempotherx=otherx+dir[i][0];
        		int tempothery=othery+dir[i][1];
     
        		if(inbound(tempx,tempy,board)&&inbound(tempotherx,tempothery,board)&&board[tempx][tempy]!=1&&board[tempotherx][tempothery]!=1) {
        			if(!visit[tempx][tempy][direction]) {
        				visit[tempx][tempy][direction]=true;
        				queue.add(new Robot(tempx,tempy,direction,time+1));
        			}
        		}
        	}
        	for(int i=0; i<4;)
        }
        
    }
    private boolean isFinish(int x,int y,int[][] board) {
    	if(x==board.length-1&&y==board.length-1) return true;
    	else return false;
    }
    private boolean inbound(int x,int y,int[][] board) {
    	if(x>=0&&y>=0&&x<board.length&&y<board.length)return true;
    	else return false;
    }
    private class Robot{
        int x;
        int y;
        int dir;
        int time;
        Robot(int x,int y, int dir,int time){
            this.x=x;
            this.y=y;
            this.dir=dir;
            this.time=time;
            
        }
    }
}
