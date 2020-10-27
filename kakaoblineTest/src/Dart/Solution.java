package Dart;
import java.util.ArrayList;
public class Solution {
	public static void main(String[] args) {
		int answer=solution("1S*2T*3S");
		System.out.println(answer);
	}
	public static int solution(String dartResult) {
        int answer = 0;
        char[] array=dartResult.toCharArray();
        ArrayList<Integer> listnum=new ArrayList<>();
        ArrayList<Character> listscore=new ArrayList<>();
        for(int i=0; i<array.length; i++) {
        	if(array[i]>='0'&&array[i]<='9'){
        		if(array[i]=='1'&&array[i+1]=='0') {
        			listnum.add(10);
        			i++;
        		}
        		else {
        			listnum.add(array[i]-'0');
        		}
        	}
        	else if(array[i]=='S'||array[i]=='D'||array[i]=='T') {
        		listscore.add(array[i]);
        	}
        	else if(array[i]=='*'||array[i]=='#') {
        		if(listscore.size()==0&&array[i]=='*') {
        			listscore.add(array[i]);
        		}
        		else if(listscore.size()!=0&&array[i]=='*') {
        			if(listscore.size()==1) {
            			listscore.add('*');
        			}
        			else {
        			listscore.add(listscore.size()-1,'*');
        			listscore.add('*');
        			}
        		}
        		else if(listscore.size()==0&&array[i]=='#') {
        			listscore.add('#');
        		}
        		else if(listscore.size()!=0&&array[i]=='#') {
        			listscore.add('#');
        		}
        	}
        }
        int index=0;

        for(int i=0; i<listnum.size(); i++) {
        	int num=listnum.get(i);
        	char score=listscore.get(index);
            ArrayList<Character> giho=new ArrayList<>();
        	if(score=='S') {
        		index++;
        		if(index==listscore.size()) {
        			answer=num+answer;
        			break;
        		}
        		while(true) {
        			if(listscore.get(index)=='*') {
        				giho.add('*');
        				index++;
        			} else if(listscore.get(index)=='#') {
        				giho.add('-');
        				index++;
        			}else {
        				giho.add('+');
        				break;
        			}
        			if(index==listscore.size()) {
        				break;
        			}
        		}
        		for(int j=0; j<giho.size(); j++) {
        			char tempgiho=giho.get(j);
        			if(tempgiho=='-') {
        				num=num*(-1);
        			} else if(tempgiho=='*') {
        				num=num*2;
        			}
        		}
        		answer=answer+num;
        	}
        	else if(score=='D') {
        		index++;
        		num=num*num;
        		if(index==listscore.size()) {
        			answer=num+answer;
        			break;
        		}
        		while(true) {
        			if(listscore.get(index)=='*') {
        				giho.add('*');
        				index++;
        			} else if(listscore.get(index)=='#') {
        				giho.add('-');
        				index++;
        			}else {
        				giho.add('+');
        				break;
        			}
        			if(index==listscore.size()) {
        				break;
        			}
        		}
        		for(int j=0; j<giho.size(); j++) {
        			char tempgiho=giho.get(j);
        			if(tempgiho=='-') {
        				num=num*(-1);
        			} else if(tempgiho=='*') {
        				num=num*2;
        			}
        		}
        		answer=answer+num;
        	}
        	else if(score=='T') {
        		index++;
        		num=num*num*num;
        		if(index==listscore.size()) {
        			answer=num+answer;
        			break;
        		}

        		while(true) {
        			if(listscore.get(index)=='*') {
        				giho.add('*');
        				index++;
        			} else if(listscore.get(index)=='#') {
        				giho.add('-');
        				index++;
        			}else {
        				giho.add('+');
        				break;
        			}
        			if(index==listscore.size()) {
        				break;
        			}
        		}
        		for(int j=0; j<giho.size(); j++) {
        			char tempgiho=giho.get(j);
        			if(tempgiho=='-') {
        				num=num*(-1);
        			} else if(tempgiho=='*') {
        				num=num*2;
        			}
        		}
        		answer=num+answer;
        	}
        	
        }
        return answer;
    }
}
