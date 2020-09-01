package Clustering;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
public class Solution {
	public static void main(String[] args) {
		String str1="E=M*C^2";
		String str2="e=m*c^2";
		int answer=solution(str1,str2);
		System.out.println(answer);
	}
	public static int solution(String str1, String str2) {
		int answer=0;
		ArrayList<String> union=new ArrayList<>();
		ArrayList<String> intersaction=new ArrayList<>();
		HashMap<String,Integer> map1=new HashMap<String,Integer>();
		HashMap<String,Integer> map2=new HashMap<String,Integer>();
		HashSet<String> key=new HashSet<>();
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		for(int i=0; i<str1.length()-1; i++) {
			char first=str1.charAt(i);
			char second=str1.charAt(i+1);
			String tempkey=first+""+second;
			if(first>='a'&&first<='z'&&second>='a'&&second<='z') {
				key.add(tempkey);
				if(map1.containsKey(tempkey)) {
					int temp=map1.get(tempkey);
					map1.put(tempkey, temp+1);
				}
				else {
					map1.put(tempkey, 1);
				}
				
			}
		}
		for(int i=0; i<str2.length()-1; i++) {
			char first=str2.charAt(i);
			char second=str2.charAt(i+1);
			String tempkey=first+""+second;
			if(first>='a'&&first<='z'&&second>='a'&&second<='z') {
				key.add(tempkey);
				if(map2.containsKey(tempkey)) {
					int temp=map2.get(tempkey);
					map2.put(tempkey, temp+1);
				}
				else {
					map2.put(tempkey, 1);
				}
			}
		}
		for(String s:key) {
			if(map1.containsKey(s)&&map2.containsKey(s)) {
				int num1=map1.get(s);
				int num2=map2.get(s);
				if(num1>=num2) {
					for(int i=0; i<num2; i++) {
						intersaction.add(s);
					}
					for(int i=0; i<num1; i++) {
						union.add(s);
					}
				}else {
					for(int i=0; i<num1; i++) {
						intersaction.add(s);
					}
					for(int i=0; i<num2; i++) {
						union.add(s);
					}
				}
			}
			else if(map1.containsKey(s)&&!map2.containsKey(s)) {
				int num1=map1.get(s);
				for(int i=0; i<num1; i++) {
					union.add(s);		
				}
			}
			else if(!map1.containsKey(s)&&map2.containsKey(s)) {
				int num2=map2.get(s);
				for(int i=0; i<num2; i++) {
					union.add(s);
				}
			}
		}
		double jakard=0;
		if(union.size()==0) {
			jakard=1;
		}
		else{
			jakard=(double)intersaction.size()/union.size();
		}
		return (int)(jakard*65536);
	}
}
