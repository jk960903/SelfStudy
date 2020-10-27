package Number1;
import java.util.LinkedList;
public class Solution {
	public static void main(String[] args) {
		String id="abcdefghijklmn.p";
		
		String answer=solution(id);
		System.out.println(answer);
	}
	public static String solution(String new_id) {
        String answer = "";
        LinkedList<Character> list=new LinkedList<>();
        LinkedList<Character> list2=new LinkedList<>();
        new_id=new_id.toLowerCase();
        char[] temp=new_id.toCharArray();
        for(int i=0; i<temp.length; i++) {
        	if((temp[i]>='a'&&temp[i]<='z')||temp[i]=='.'||temp[i]=='-'||temp[i]=='_'||(temp[i]>='0'&&temp[i]<='9')) {
        		list.add(temp[i]);
        	}
        }
        for(int i=0; i<list.size(); i++) {
        	if(list.get(i)!='.') {
        		list2.add(list.get(i));
        	}else {
        		list2.add('.');
        		while(list.get(i)=='.') {
        			i++;
        			if(i==list.size()) {
        				break;
        			}
        		}
        		i--;
        	}
        }
        String temp1="";
        if(list2.get(0)=='.') list2.remove(0);
        if(list2.size()!=0&&list2.get(list2.size()-1)=='.')list2.remove(list2.size()-1);
        if(list2.size()==0)list2.add('a');
        if(list2.size()>15) {
        	for(int i=0; i<list2.size(); i++) {
        		if(i>14) {
        			break;
        		}
        		temp1=temp1+list2.get(i);
        		
        	}
        	if(temp1.charAt(temp1.length()-1)=='.') {
    			temp1=temp1.substring(0,temp1.length()-1);
    		}
        }
        else if(list2.size()<=2) {
        	char char1=list2.get(list2.size()-1);
        	while(list2.size()!=3) {
        		list2.add(char1);
        	}
        	for(int i=0; i<list2.size(); i++) {
        		temp1=temp1+list2.get(i);
        	}
        }else {
        	for(int i=0; i<list2.size(); i++) {
        		temp1=temp1+list2.get(i);
        	}
        }
        
        answer=temp1;
        return answer;
    }
}
