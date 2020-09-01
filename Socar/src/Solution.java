import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public static void main(String[] args) {
		String[] temp= {"#######","#######","####*##","#*#####","*######","#####*#","#######"};
		char[][] map=new char[temp.length][temp[0].length()];
		for(int i=0; i<map.length; i++) {
			map[i]=temp[i].toCharArray();
		}
		for(int i=0; i<map[0].length; i++) {
			int tempx=i;
			int tempy=0;
		}
	}
	Queue<Integer> dot=new LinkedList<>();
}
