package AlterKey;
import java.util.HashSet;
public class Solution {
	public int solution(String[][] relation) {
        int answer = 0;
        for(int i=0; i<relation[0].length; i++) {
        	for(int j=0; j<relation[0].length; j++) {
        		HashSet<String> set=new HashSet<>();
        		for(int k=0; k<relation[0].length; k++) {
        			if(set.contains(relation[k][j])) {
        				
        			}else {
        				
        			}
        		}
        	}
        }

        
        
        return answer;
    }
}
