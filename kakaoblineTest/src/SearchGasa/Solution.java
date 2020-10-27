package SearchGasa;

public class Solution {
	public static void main(String[] args) {
		String[] words= {"frodo", "front", "frost", "frozen", "frame", "kakao"};
		String[] queries= {"fro??", "????o", "?????", "fro???", "pro?"};
		int[] result=solution(words,queries);
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i]+" ");
		}
	}
	 public static int[] solution(String[] words, String[] queries) {
	        int[] answer = new int[queries.length];
	        for(int i=0; i<queries.length; i++) {
	        	int indexofquestionFirst=queries[i].indexOf("?");
	        	int indexofquestionLast=queries[i].lastIndexOf("?");
	        	int nonquestion=-1;
	        	if(indexofquestionFirst==0) {
	        		nonquestion=indexofquestionLast+1;
	        	}
	        	String temp=queries[i].replace("?", "");
	        	for(int j=0; j<words.length; j++) {
	        		if(queries[i].length()==words[j].length()) {
	        			if(words[j].contains(temp)) {
	        				if(indexofquestionFirst==0&&indexofquestionLast==words[j].length()) {
	        					answer[i]++;
	        					continue;
	        				}
	        				int index=words[j].indexOf(temp);
		        			int lastindex=index+temp.length()-1;
		        			if(index<indexofquestionFirst||index>indexofquestionLast) {
		        				answer[i]++;
		        			}
		        			else if(nonquestion!=-1) {
		        				index=words[j].lastIndexOf(temp);
		        				lastindex=index+temp.length()-1;
		        				if(index>indexofquestionLast) {
			        				answer[i]++;
			        			}
		        			}
	        			}
	        			
	        		}
	        	}
	        }
	        
	        return answer;
	    }
}
