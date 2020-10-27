package APCHUK;

import java.util.ArrayList;

public class Solution {
	public static void main(String[] args) {
		String s="aaaaaaaaaabbb";
		int num=solution(s);
		System.out.println(num);
	}
	 public static int solution(String s) {
		 	if(s.length()==0) return 0;
		 	if(s.length()==1)return 1;
	       	int answer=0;
	       	int min=100000;
	       	for(int i=1; i<=s.length()/2; i++) {
	        	int index=0;
	        	ArrayList<String> list=new ArrayList<>();
	        	String result="";
	        	while(true) {
	        		if(index+i<=s.length()) {
		        		String temp=s.substring(index,index+i);
		        		if(list.isEmpty()) {
		        			list.add(temp);
		        		}else {
		        			String compare=list.get(0);
		        			if(temp.equals(compare)) {
		        				list.add(temp);
		        			}else {
		        				if(list.size()==1) {
		        					result=result+compare;
		        					list=new ArrayList<>();
		        					list.add(temp);
		        				}
		        				else {
		        				int len=list.size();
		        				result=result+Integer.toString(len)+compare;
		        				list=new ArrayList<>();
		        				list.add(temp);
		        				}
		        			}
		        			
		        		}
	        		}
	        		else {
	        			String temp=s.substring(index);
	        			result=result+temp;
	        			break;
	        		}
	        		index=index+i;
	        		
	        	}
	        	int len=list.size();
	        	if(len>1) {
	        		result=result+Integer.toString(len)+list.get(0);
	        	}
	        	else {
	        		result=result+list.get(0);
	        	}
	        	if(result.length()<min) {
	        		min=result.length();
	        	}
	        }
	       	answer=min;
	        return answer;
	 }
}
