package OpenKakaoChat;
import java.util.HashMap;
import java.util.ArrayList;
public class Solution {
	public String[] solution(String[] record) {
        String[] answer;
        String[][] splited=new String[record.length][3];
        HashMap<String,String> nick=new HashMap<>();
        ArrayList<String> parsing=new ArrayList<>();
        ArrayList<String> ID=new ArrayList<>();
        for(int i=0; i<record.length; i++) {
        	splited[i]=record[i].split(" ");
        	if(splited[i][0].equals("Enter")) {
        		nick.put(splited[i][1],splited[i][2]);
        		parsing.add("´ÔÀÌ µé¾î¿Ô½À´Ï´Ù.");
        		ID.add(splited[i][1]);
        	}
        	else if(splited[i][0].equals("Leave")) {
        		nick.put(splited[i][1],"0");
        		parsing.add("´ÔÀÌ ³ª°¬½À´Ï´Ù.");
        		ID.add(splited[i][1]);
        	}
        	else if(splited[i][0].equals("Change")) {
        		nick.put(splited[i][1],splited[i][2]);
        	}
        }
        answer=new String[ID.size()];
        for(int i=0; i<parsing.size(); i++) {
        	String tempid=ID.get(i);
        	String order=parsing.get(i);
        	String nickname=nick.get(tempid);
        	answer[i]=nickname+order;
        }
        return answer;
    }
}
