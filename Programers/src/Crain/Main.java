package Crain;
import java.util.ArrayList;
public class Main {
	public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> pocket=new ArrayList<>();
        for(int i=0; i<moves.length; i++) {
        	int temp=moves[i];
        	for(int j=0; j<board.length; j++) {
        		if(board[j][temp-1]!=0) {
        			pocket.add(board[j][temp-1]);
        			board[j][temp-1]=0;
        			break;
        		}
        	}
        	if(pocket.size()>1) {
        		if(pocket.get(pocket.size()-1)==pocket.get(pocket.size()-2)){
        			answer++;
        			pocket.remove(pocket.size()-1);
        			pocket.remove(pocket.size()-1);
            	
        		}
        	}
        }
        return answer*2;
    }


	public static void main(String[] args) {
		int[][] board= {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves= {1,5,3,5,1,2,1,4};
		int result=solution(board,moves);
		System.out.println(result);
	}
}
	
