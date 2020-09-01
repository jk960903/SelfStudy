package Hotel;
import java.util.ArrayList;
import java.util.HashMap;
public class Main {
		public static HashMap<Long,Long> map=new HashMap<>();
		public static void main(String[] args) {
			long k=10;
			long[] room= {1,3,4,1,3,1};
			long[] result=new long[room.length];
			result=solution(k,room);
			for(int i=0; i<result.length; i++) {
				System.out.print(result[i]+" ");
			}
		}
	    public static long[] solution(long k, long[] room_number) {
	        long[] answer = {};
	        answer=new long[room_number.length];
	        
	        for(int i=0; i<room_number.length; i++){
	        		answer[i]=findroom(room_number[i]);
	        	
	        }
	        return answer;
	   }
	   private static long findroom(long room) {
		   if(!map.containsKey(room)) {
			   map.put(room,room+1);
			   return room;
		   }
		   else {
			   long nextroom=map.get(room);
			   long emptyroom=findroom(nextroom);
			   map.put(room, emptyroom);
			   return emptyroom;
		   }
	   }
}

