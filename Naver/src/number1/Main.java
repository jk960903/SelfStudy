package number1;
import java.util.LinkedList;
public class Main {
	static int[] can= {6,2,5,5,4,5,6,3,7,6};
	static long result=0;
	static LinkedList<Integer> list;
	public static void main(String[] args) {
		list=new LinkedList<>();
		int k=11;
		dfs(k);
		System.out.println(result);
		String s="sssssssssss";
		
	}
	public static void dfs(int remain) {
		if(list.size()>1&&list.get(0)==0) {
			return;
		}
		if(list.size()>=1&&list.get(0)!=0&&remain>=0&&remain<=6) {
			if(remain==0) {
				result++;
				return;
			}
			if(remain==1) {
				return;
			}else if(remain==2) {
				result++;
				return;
			}else if(remain==3) {
				result++;
				return;
			}else if(remain==4) {
				result=result+3;
				return;
			}else if(remain==5) {
				result=result+5;
				return;
			}else if(remain==6) {
				result=result+6;
				return;
			}else if(remain==7) {
				result=result+13;
				return;
			}
			else if(remain==8) {
				result=result+19;
				return;
			}
		}
		
		for(int i=0; i<10; i++) {
			list.add(i);
			remain=remain-can[i];
			if(list.get(0)==0&&remain!=0) {
				remain=remain+can[i];
				list.removeLast();
			}
			else if(remain<0) {
				remain=remain+can[i];
				list.removeLast();
			}
			else{
				dfs(remain);
				remain=remain+can[i];
				list.removeLast();
			}
		}
	}
}

