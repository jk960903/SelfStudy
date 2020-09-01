package ErrorRate;
import java.util.HashMap;
public class Solution {
	public int[] solution(int N, int[] stages) {
        int[] answer =new int[N];
        HashMap<Integer,Double> errorrate=new HashMap<>();
        HashMap<Integer,Integer> arrive=new HashMap<>();
        HashMap<Integer,Integer> cantclear=new HashMap<>();
        for(int i=1; i<=N+1; i++) {
        	arrive.put(i,0);
        	cantclear.put(i,0);
        	errorrate.put(i,0);
        }
        for(int i=0; i<stages.length; i++) {
        	int stage=stages[i];
        	for(int j=1; j<=stage; j++) {
        		arrive.put(j,arrive.get(j)+1);
        	}
        	if(stage==N+1) {
        		
        	}else {
        		cantclear.put(stage,cantclear.get(stage)+1);
        	}
        }
        for(int i=1; i<=N; i++) {
        	int tempcantclear=cantclear.get(i);
        	int temparrive=arrive.get(i);
        	errorrate.put(i,(double)tempcantclear/temparrive);
        }
        for(int i=1; i<=N; i++) {
        	double temperror=errorrate.get(i);
        }
        return answer;
    }
}
