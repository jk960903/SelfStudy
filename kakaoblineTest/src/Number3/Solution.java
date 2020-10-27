package Number3;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.HashSet;
public class Solution {
	public static void main(String[] args) {
		String[] info= {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
		String[] query= {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","java and - and senior and - 100","- and - and - and - 150"};
		int[] num=solution(info,query);
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
	}
	public static int[] solution(String[] info, String[] query) {
        int[] answer = new int [query.length];
        HashMap<String,LinkedList<Integer>> language=new HashMap<>();
        HashMap<String,LinkedList<Integer>> end=new HashMap<>();
        HashMap<String,LinkedList<Integer>> type=new HashMap<>();
        HashMap<String,LinkedList<Integer>> soulfood=new HashMap<>();
        HashMap<Integer,LinkedList<Integer>> score=new HashMap<>();
        HashSet<Integer> scoreset=new HashSet<>();
        LinkedList<Integer> minuslist=new LinkedList<>();
        for(int i=0; i<info.length; i++) {
        	String[] temp=info[i].split(" ");
        	int tempscore=Integer.parseInt(temp[4]);
        	if(language.containsKey(temp[0])) {
        		LinkedList<Integer> lantemp=language.get(temp[0]);
        		lantemp.add(i);
        		language.put(temp[0],lantemp);
        	}else {
        		LinkedList<Integer> lantemp=new LinkedList<>();
        		lantemp.add(i);
            	language.put(temp[0],lantemp);
        	}
        	if(end.containsKey(temp[1])) {
        		LinkedList<Integer> endtemp=end.get(temp[1]);
        		endtemp.add(i);
        		end.put(temp[1],endtemp);
        	}else {
        		LinkedList<Integer> endtemp=new LinkedList<>();
        		endtemp.add(i);
        		end.put(temp[1],endtemp);
        	}
        	if(type.containsKey(temp[2])) {
        		LinkedList<Integer> typetemp=type.get(temp[2]);
        		typetemp.add(i);
        		type.put(temp[2],typetemp);
        	}else {
        		LinkedList<Integer> typetemp=new LinkedList<>();
        		typetemp.add(i);
        		type.put(temp[2], typetemp);
        	}
        	if(soulfood.containsKey(temp[3])) {
        		LinkedList<Integer> soultemp=soulfood.get(temp[3]);
        		soultemp.add(i);
        		soulfood.put(temp[3],soultemp);
        	}else {
        		LinkedList<Integer> soultemp=new LinkedList<>();
        		soultemp.add(i);
        		soulfood.put(temp[3],soultemp);
        	}
        	if(score.containsKey(tempscore)){
        		LinkedList<Integer> tempscorelist=score.get(tempscore);
        		tempscorelist.add(i);
        		score.put(tempscore,tempscorelist);
        	}else {
        		LinkedList<Integer> tempscorelist=new LinkedList<>();
        		scoreset.add(tempscore);
        		tempscorelist.add(i);
        		score.put(tempscore,tempscorelist);
        	}
        	minuslist.add(i);

        }
        for(int i=0; i<query.length; i++) {
        	String[] temp=query[i].split(" ");
        	LinkedList<Integer> lanlist=new LinkedList<>();
        	LinkedList<Integer> endlist=new LinkedList<>();
        	LinkedList<Integer> typelist=new LinkedList<>();
        	LinkedList<Integer> soullist=new LinkedList<>();
        	LinkedList<Integer> scorelist=new LinkedList<>();
        	LinkedList<Integer> prelist=new LinkedList<>();
        	HashSet<Integer> preset=new HashSet<>();
        	HashSet<Integer> preset2=new HashSet<>();
        	if(!temp[0].equals("-")) {
        		lanlist=language.get(temp[0]);
        		preset=new HashSet<>(lanlist);
        	}
        	else {
        		lanlist=minuslist;
        		preset=new HashSet<>(lanlist);
        	}
        	if(!temp[2].equals("-")) {
        		endlist=end.get(temp[2]);
        		if(lanlist!=minuslist) {
        			for(int j=0; j<endlist.size(); j++) {
        				if(preset.contains(endlist.get(j))) {
        					preset2.add(endlist.get(j));
        				}
        			}
        		}else {
        			preset2=new HashSet<>(endlist);
        		}
        	}else {
        		if(lanlist==minuslist) {
        			preset2=preset;
        			endlist=minuslist;
        		}else {
        			endlist=null;
        			preset2=new HashSet<>(lanlist);
        		}
        	}
        	if(!temp[4].equals("-")) {
        		typelist=type.get(temp[4]);
        		preset=new HashSet<>();
        		if(endlist!=null) {
        			for(int j=0; j<typelist.size(); j++) {
        				if(preset2.contains(typelist.get(j))) {
        					preset.add(typelist.get(j));
        				}
        			}
        		}else {
        			preset=preset2;
        		}
        	}
        	else {
        		if(lanlist==null&&endlist==null) {
        			typelist=minuslist;
        		}else {
        			typelist=null;
        			preset=preset2;
        		}
        	}
        	if(!temp[6].equals("-")) {
        		soullist=soulfood.get(temp[6]);
        		preset2=new HashSet<>();
        		if(typelist!=null) {
        			for(int j=0; j<soullist.size(); j++) {
        				if(preset.contains(soullist.get(j))) {
        					preset2.add(soullist.get(j));
        				}
        			}
        		}else {
        			preset2=new HashSet<>(soullist);
        		}
        	}else {
        		preset2=preset;
        	}
        	LinkedList<Integer> array=new LinkedList<>();
        	int j=0;
        	int comparescore=Integer.parseInt(temp[7]);
        	for(int score1 : scoreset) {
        		if(score1>=comparescore) {
        			array.add(score1);
        		}
        	}

        	int size=preset2.size();
        	int count=0;
        	for(int k=0; k<array.size(); k++) {
        		scorelist=score.get(array.get(k));
        			for(int l=0; l<scorelist.size(); l++) {
        				if(preset2.contains(scorelist.get(l))) {
        					preset2.remove(scorelist.get(l));
        					count++;
        			}
        		}
        		
        	}
        	int last=count;
        	
        	answer[i]=last;
        	
        }
        
        return answer;
    }
}
