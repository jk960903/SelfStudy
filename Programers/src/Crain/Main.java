package Crain;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
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
		int answer=-1;
		HashMap<Integer,Integer> map=new HashMap<>();
		HashMap<Integer,HashSet<Integer>> human=new HashMap<>();
		HashSet<Integer> set=new HashSet<>();
		int[] score= {1300000000, 700000000, 668239490, 618239490, 568239490, 568239486, 518239486, 157658638, 157658634, 100000000, 100};
		for(int i=1; i<score.length; i++) {
			int key=score[i]-score[i-1];
			if(map.containsKey(key)){
				HashSet<Integer> tempset=new HashSet<>();
				tempset=human.get(key);
				tempset.add(i-1);
				tempset.add(i);
				map.put(key,map.get(key)+1);
				human.put(key,tempset);
			}else {
				HashSet<Integer> tempset=new HashSet<>();
				set.add(key);
				map.put(key,1);
				tempset.add(i);
				tempset.add(i-1);
				human.put(key,tempset);
			}
		}
		int hack=0;
		HashSet<Integer> list=new HashSet<>();
		for(int key : set) {
			int temp=map.get(key);
			if(temp>=2) {
				HashSet<Integer> tempset=new HashSet<>();
				tempset=human.get(key);
				for(int i:tempset) {
					list.add(i);
				}
			}
		}
		System.out.println(score.length-list.size());
	}
}
	
