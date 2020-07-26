package Solution2161;
import java.util.LinkedList;
import java.util.Scanner;
public class Main {
	public static LinkedList<Integer> list=new LinkedList<Integer>();
	public static int N=0;
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		N=scan.nextInt();
		for(int i=1; i<=N; i++) {
			list.add(i);
		}
		while(list.size()!=1) {
			System.out.print(list.get(0)+" ");
			list.remove(0);
			list.add(list.get(0));
			list.remove(0);
		}
		System.out.print(list.get(0));
		
	}
	public static void swap(int x,int y) {
		int temp=x;
		x=y;
		y=temp;
	}
}
