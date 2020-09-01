package Traffic;
import java.util.*;
public class Main {
	public int solution(String[] lines) {
        int answer = 0;
        int[] start_times=new int[lines.length];
        int[] end_times=new int[lines.length];
        for(int i=0; i<lines.length; i++){
            String[] log=lines[i].split(" ");
            String[] response=log[1].split(":");
            int processingTime=(int)Double.parseDouble((log[2].substring(0,log[2].length()-1)));
            int start=0;
            int end=0;
            end+=Integer.parseInt(response[0])*60*60*1000;
            end+=Integer.parseInt(response[1])*60*1000;
            end+=(int)Double.parseDouble(response[2])*1000;
            start=end-processingTime+1;
            
            start_times[i]=start;
            end_times[i]=end;
            
        }
        int max=0;
        for(int i=0; i<lines.length; i++) {
        	int count=0;
        	int end=start_times[i]+1000;
        	int start=start_times[i];
        	for(int j=0; j<lines.length; j++) {
        		if(start_times[j]>=start&&start_times[j]<end) {
        			count++;
        		}
        		else if(end_times[j]>=start&&end_times[j]<end) {
        			count++;
        		}
        		else if(start_times[j]<start&end_times[j]>=end) {
        			count++;
        		}
        	}
        	if(count>max) {
        		max=count;
        	}
        }
        return max;
    }
}
