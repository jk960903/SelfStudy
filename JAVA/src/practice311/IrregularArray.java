package practice311;
import java.util.ArrayList;
public class IrregularArray {
	public static void main(String[] args) {
		int[] A= {3,3,4,4};
		int num=solution(A);
		System.out.println(num);
	}
	public static int solution(int[] A) {
        // write your code in Java SE 8
        int[] N=new int[A.length];
        for(int i=0; i<N.length; i++){
            N[A[i]-1]++;
        }
        ArrayList<Integer> listnumindex=new ArrayList<>();
        ArrayList<Integer> listnum=new ArrayList<>();
        ArrayList<Integer> list0index=new ArrayList<>();
        for(int i=0; i<N.length; i++){
            if(N[i]>1){
                listnumindex.add(i);
                listnum.add(N[i]);
            }
            else if(N[i]==0){
                list0index.add(i);
            }
        }
        int result=0;
        int zerosize=list0index.size();
        int index=0;
        for(int i=0; i<listnumindex.size(); i++){
            for(int j=0; j<listnum.get(i)-1; j++){
                int empty=list0index.get(index);
                int listindex=listnumindex.get(i);
                result=result+Math.abs(empty-listindex);
                if(result>1000000000){
                    return -1;
                }
            }
        }
        return result;
    }
}
