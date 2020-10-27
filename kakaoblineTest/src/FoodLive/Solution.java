package FoodLive;

public class Solution {
	public int solution(int[] food_times, long k) {
        int answer = 0;
        int min=100000001;
        if(k<food_times.length) {
        	return (int)k;
        }
        int index=-1;
        int present_time=0;
        int all_eat=0;
        while(true) {
        	for(int i=0; i<food_times.length; i++) {
        		if(food_times[i]<min&&food_times[i]>0) {
        			min=food_times[i];
        			index=i;
        		}
        	}
        	if(present_time+min*food_times.length>k) {
        		
        	}
        	else {
        		for(int i=0; i<food_times.length; i++) {
        			if(food_times[i]!=0) {
        				food_times[i]=food_times[i]-min;
        			}
        			if(food_times[i]<=0) {
        				all_eat++;
        			}
        		}
        		present_time=min*food_times.length;
        		min=1000000001;
        	}
        }
        return answer;
    }
}	
