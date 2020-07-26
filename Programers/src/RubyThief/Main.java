package RubyThief;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class Main {
	public static void main(String[] args) {
		int[] s= {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		String hand="left";
		String result;
		result=solution(s,hand);
		System.out.println(result);
	}
		public static String solution(int[] numbers, String hand) {
	        String answer = "";
	        int left=10;
	        int right=12;
	        ArrayList<Character> list=new ArrayList<>();
	        if(hand=="right"){
	            for(int i=0; i<numbers.length; i++){
	                if(numbers[i]==0){
	                    numbers[i]=11;
	                }
	                if(numbers[i]%3==1){
	                    left=numbers[i];
	                    list.add('L');
	                }
	                else if(numbers[i]%3==0){
	                    right=numbers[i];
	                    list.add('R');
	                }
	                else if(numbers[i]%3==2){
	                	int leftindex=Math.abs(numbers[i]-left)/3+Math.abs(numbers[i]-left)%3;
	                    int rightindex=Math.abs(numbers[i]-right)/3+Math.abs(numbers[i]-right)%3;
	                    if(rightindex==leftindex){
	                        list.add('R');
	                        right=numbers[i];
	                    }
	                    else if(rightindex<leftindex){
	                        list.add('R');
	                        right=numbers[i];
	                    }
	                    else{
	                        list.add('L');
	                        left=numbers[i];
	                    }
	                
	                }
	            }
	        }
	        else{
	            for(int i=0; i<numbers.length; i++){
	                if(numbers[i]==0){
	                    numbers[i]=11;
	                }
	                if(numbers[i]==0){
	                    numbers[i]=11;
	                }
	                if(numbers[i]%3==1){
	                    left=numbers[i];
	                    list.add('L');
	                }
	                else if(numbers[i]%3==0){
	                    right=numbers[i];
	                    list.add('R');
	                }
	                else if(numbers[i]%3==2){
	                	int leftindex=Math.abs(numbers[i]-left)/3+Math.abs(numbers[i]-left)%3;
	                    int rightindex=Math.abs(numbers[i]-right)/3+Math.abs(numbers[i]-right)%3;
	                    if(rightindex==leftindex){
	                        list.add('L');
	                        right=numbers[i];
	                    }
	                    else if(rightindex<leftindex){
	                        list.add('R');
	                        right=numbers[i];
	                    }
	                    else{
	                        list.add('L');
	                        left=numbers[i];
	                    }
	                
	                }
	            }
	        }
	        StringBuilder sb=new StringBuilder();
	        for(int i=0; i<list.size(); i++){
	            sb.append(list.get(i));
	        }
	        answer=sb.toString();
	        return answer;
	    }
}

