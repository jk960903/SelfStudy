package Solution1;

import java.util.HashMap;
import java.util.HashSet;
public class Solution {
	public static void main(String[] args) {
		String source="mqfsnmygrquczhymvkurxfelpeagkisearktnjrcapbuuawnmcrgsfsnusuprtnnzbuvtoemgiohvicsnkqhbgoomupuvjmfzpqp";
		String target="yelitmysnjcfgvvvezaprgaonzkofyqqhfmxseezencanocepyzxocwivnkbjrhcehqlcwsagrfookhiwsrjguzonapppyyodlqx";
		char[] sourcearray=source.toCharArray();
        char[] targetarray=target.toCharArray();
        int gap[]=new int[sourcearray.length];
        int max=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0; i<sourcearray.length; i++){
            gap[i]=Math.abs(sourcearray[i]-targetarray[i]);
            int othergap=26-Math.abs(gap[i]);
            if(!map.containsKey(gap[i])){
                map.put(gap[i],1);
                set.add(gap[i]);
            }else{
                int num=map.get(gap[i]);
                map.put(gap[i],num+1);
            }
            if(!map.containsKey(othergap)) {
                map.put(othergap,1);
                set.add(othergap);
            }
            else{
                int num=map.get(othergap);
                map.put(othergap,num+1);
            }
        }
        
        for(int i :set){
            int num=map.get(i);
            int tempnum=map.get(26-num);
            if(num+tempnum>max){
                max=num+tempnum;
            }
        }
        int result=0;
        if(map.containsKey(26-max)&&map.containsKey(26)&&map.containsKey(0)){
            result=(sourcearray.length-max-map.get(26-max))*2;
        }else if(map.containsKey(26-max)){
            result=(sourcearray.length-max-map.get(26-max))*2;
        }else{
            result=(sourcearray.length-max)*2;
        }
        int a=0;
        System.out.println(result);
	}
}

