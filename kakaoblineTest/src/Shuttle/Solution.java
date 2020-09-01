package Shuttle;

import java.util.Arrays;
import java.util.LinkedList;
public class Solution {
	public String solution(int n, int t, int m, String[] timetable) {
        String answer = "";
        String[][] time=new String[timetable.length][2];
        int[] shuttle=new int[n];
        int[] crew=new int[timetable.length];
        for(int i=0; i<n; i++) {
        	shuttle[i]=540+(i*t);
        }
        for(int i=0; i<timetable.length; i++) {
        	time[i]=timetable[i].split(":");
        	crew[i]=Integer.parseInt(time[i][0])*60+Integer.parseInt(time[i][1]);
        }
        Arrays.sort(crew);
        LinkedList<Integer> queue=new LinkedList<>();
        int index=0;
        int Last=shuttle[shuttle.length-1];
        for(int i=0; i<crew.length; i++) {
        	if(crew[i]<=Last) {
        		queue.add(crew[i]);
        	}
        }
        int temp=0;
        for(int i=0; i<n; i++) {//¼ÅÆ² ½Ã°£ÀÌ µÊ
        	if(i==n-1) {
        		if(queue.size()<m) {
        			temp=Last;
        		}
        		else if(queue.size()==m){
        			int num=queue.getLast();
        			temp=num-1;
        		}
        		else {
        			int num=queue.get(m-1);
        			temp=num-1;
        		}
        	}
        	for(int j=0; j<m; j++) {
        		if(!queue.isEmpty()) {
            		int num=queue.get(0);
            		if(num<=shuttle[i]) {
            			queue.remove(0);
            		}
        		}
        	}
        	
        }
        int hour=temp/60;
        int minute=temp%60;
        String temphour;
        String tempminute;
        if(hour<10) {
        	temphour="0"+Integer.toString(hour);
        }
        else {
        	temphour=Integer.toString(hour);
        }
        if(minute<10) {
        	tempminute="0"+Integer.toString(minute);
        }
        else {
        	tempminute=Integer.toString(minute);
        }
        answer=temphour+":"+tempminute;
        return answer;
    }
}
