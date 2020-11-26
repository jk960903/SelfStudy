import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        int numberOfAttributes=scan.nextInt();
        float supportThreshold=scan.nextFloat();
        int numberofRows=scan.nextInt();
        String[] dataset=new String[numberofRows];
        HashMap<String,Integer>[] map=new HashMap[6];
        HashSet<String>[] set=new HashSet[6];
        HashSet<String>[] resultset=new HashSet[6];
        for(int i=0; i<6; i++) {
        	map[i]=new HashMap<String,Integer>();
            set[i]=new HashSet<>();
            resultset[i]=new HashSet<>();
        }
        scan.nextLine();
        for(int i=0; i<numberofRows; i++){
            dataset[i]=scan.nextLine();
            String[] temp=dataset[i].split(",");
            for(int j=0; j<temp.length; j++){
                String[] key=temp[j].split("=");
                
                set[j].add(key[1]);
                if(!map[j].containsKey(key[1])) map[j].put(key[1],1);
                else{
                    int num=map[j].get(key[1]);
                    map[j].put(key[1],num+1);
                }
            }
        }

        for(int i=0; i<6; i++){
            for (String s : set[i]){
                int num=map[i].get(s);
                float cal=(float)num/(float)numberofRows;
                if(cal>=supportThreshold){
                    resultset[i].add(s);
                }
            }
        }
        int a=0;
	}
}
