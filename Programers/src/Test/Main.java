package Test;
import java.util.*;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Main {
	public static List<String> closestStraightCity(List<String> c, List<Integer> x, List<Integer> y, List<String> q) {
	    // Write your code here
	        List<String> resultlist=new ArrayList<>();
	        HashMap<String,Integer> mapx=new HashMap<>();
	        HashMap<String,Integer> mapy=new HashMap<>();
	        HashMap<Integer,Integer> xcount=new HashMap<>();
	        HashMap<Integer,Integer> ycount=new HashMap<>();
	        for(int i=0; i<y.size(); i++){
	            int tempx=x.get(i);
	            int tempy=y.get(i);
	            mapx.put(c.get(i),x.get(i));
	            mapy.put(c.get(i),y.get(i));
	            if(xcount.containsKey(x.get(i))){
	                int num=xcount.get(x.get(i))+1;
	                xcount.put(x.get(i),num);
	            }
	            else{
	                xcount.put(x.get(i),1);
	            }
	            if(ycount.containsKey(y.get(i))){
	                int num=ycount.get(y.get(i))+1;
	                ycount.put(y.get(i),num);
	            }
	            else{
	                ycount.put(y.get(i),1);
	            }
	        }
	        for(int i=0; i<q.size(); i++){
	            String near=q.get(i);
	            int tempx=mapx.get(near);
	            int tempy=mapy.get(near);
	            boolean checkx=false;
	            boolean checky=false;
	            int minx=-1;
	            int miny=-1;
	            if(xcount.get(tempx)!=1){
                    int min=99999999;
	                checkx=true;
	                for(int j=0; j<x.size(); j++){
	                    int tempcal=0;
	                    if(tempx==x.get(j)){
	                            if(tempy!=y.get(j)){
	                                tempcal=Math.abs(tempy-y.get(j));
	                                if(min>tempcal){
	                                min=tempcal;
	                                miny=j;
	                            }
	                        }
	                    }
	                }
	            }
	            if(ycount.get(tempy)!=1){
	                checky=true;
                    int min=99999999;
	                for(int j=0; j<x.size(); j++){
	                    int tempcal=0;
	                    if(tempx!=x.get(j)){
	                        if(tempy==y.get(j)){
	                            tempcal=Math.abs(tempy-x.get(j));
	                            if(min>tempcal){
	                                min=tempcal;
	                                minx=j;
	                            }
	                        }
	                    }
	                }

	            }
	            if(!checkx&&!checky){
	                resultlist.add("NONE");
	            }
	            if(checkx||checky){
	                if(minx!=-1){
	                    resultlist.add(c.get(minx));
	                }
	                else if(miny!=-1){
	                    resultlist.add(c.get(miny));
	                }

	            }
	        }
	        return resultlist;
	    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int cCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> c = IntStream.range(0, cCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        int xCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> x = IntStream.range(0, xCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int yCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> y = IntStream.range(0, yCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int qCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> q = IntStream.range(0, qCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<String> result = closestStraightCity(c, x, y, q);

       System.out.println(result);
    }

}
