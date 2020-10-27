package Number5;

public class Solution {
	public static void main(String[] args) {
		String play="99:59:59";
		String adv="25:00:00";
		String[] log= {"69:59:59-89:59:59", "01:00:00-21:00:00", "79:59:59-99:59:59", "11:00:00-31:00:00"};
		String time=solution(play,adv,log);
	}
	 public static String solution(String play_time, String adv_time, String[] logs) {
	        String answer = "";
	        int sametime=0;
	        String[] play=play_time.split(":");
	        int runtime=Integer.parseInt(play[0])*3600+Integer.parseInt(play[1])*60+Integer.parseInt(play[2]);
	        int[] time=new int[runtime];
	        String[] adv=adv_time.split(":");
	        int advruntime=Integer.parseInt(adv[0])*3600+Integer.parseInt(adv[1])*60+Integer.parseInt(adv[2]);
	        if(advruntime==runtime) {
	        	return "00:00:00";
	        }
	        String[][] log=new String[logs.length][2];
	        int[] start=new int[logs.length];
	        int[] end=new int[logs.length];
	        for(int i=0; i<logs.length; i++) {
	        	log[i]=logs[i].split("-");
	        	String[] starttime=log[i][0].split(":");
	        	String[] endtime=log[i][1].split(":");
	        	int starting=Integer.parseInt(starttime[0])*3600+Integer.parseInt(starttime[1])*60+Integer.parseInt(starttime[2]);
	        	int ending=Integer.parseInt(endtime[0])*3600+Integer.parseInt(endtime[1])*60+Integer.parseInt(endtime[2]);
	        	start[i]=starting;
	        	end[i]=ending;
	        }
	        int max=99999999;
	        int starttime=0;
	        int maxtime=0;
	        int pretime=0;
	        for(int i=0; i<time.length-advruntime; i++) {
	        	int endadv=i+advruntime;
	        	int count=0;
	        	int result=0;
	        	for(int j=0; j<logs.length; j++) {
	        		if(endadv>=start[j]&&endadv<=end[j]) {
	        			result=result+endadv-start[j];
	        		}else if(endadv>=end[j]&&i<=start[j]) {
	        			result=result+endadv-(end[j]-start[j]);
	        		}
	        	}
	        	if(result>=maxtime) {
	        		if(maxtime==result) {
	        			if(starttime<i) {
	        				maxtime=result;
	    	        		starttime=i;
	        			}
	        			else {
	        				continue;
	        			}
	        		}
	        		
	        		
	        	}
	        }
	        int hour=starttime/3600;
	        int minute=(starttime/60)%60;
	        int second=starttime%60;
	        String temphour;
	        String tempminute;
	        String tempsecond;
	        if(hour<10)
	        answer=Integer.toString(hour)+":"+Integer.toString(minute)+":"+Integer.toString(second);
	        return answer;
	    }
}
