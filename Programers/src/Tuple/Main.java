package Tuple;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
public class Main {
	public static void main(String[] args) {
		String s="{{20,111},{111}}";
		HashMap<Integer,Integer> hash=new HashMap<>();
		String[] temp=s.split("}");
		for(int i=0; i<temp.length; i++) {
			temp[i]=temp[i].replace('{',' ');
			temp[i]=temp[i].replace(" ","");
			if(temp[i].indexOf(",")==0) {
				temp[i]=temp[i].substring(1);
			}
			String[] result=temp[i].split(",");
			int length=result.length;
			hash.put(length, i+1);
		}
		HashSet<Integer> set=new HashSet<>();
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=1; i<=hash.size(); i++) {
			int index=hash.get(i);
			String[] result=temp[index-1].split(",");
			for(int j=0; j<result.length; j++) {
				if(!set.contains(Integer.parseInt(result[j]))) {
					list.add(Integer.parseInt(result[j]));
					set.add(Integer.parseInt(result[j]));
				}
				
			}
		}
		int[] arr=new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			arr[i]=list.get(i);
		}
		
		
		
	}
}