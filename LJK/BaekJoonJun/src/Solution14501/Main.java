package Solution14501;
import java.util.Scanner;
public class Main {
	public static int N;
	public static int[] workday;
	public static int[] price;
	public static int max=0;
	public static int price1=0;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		N=scan.nextInt();
		workday=new int[N];
		price=new int[N];
		for(int i=0; i<N; i++) {
			workday[i]=scan.nextInt();
			price[i]=scan.nextInt();
		}
		DFS(0,0,0);
		System.out.println(max);
	}
	public static void DFS(int start,int depth,int price2) {
		if(depth<=N) {
			if(max<price2) {
				max=price2;
			}
		}
		else if(depth>N||start>N) {
			return;
		}
		for(int i=start; i<N; i++) {
			price2=price2+price[i];
			DFS(depth+workday[i],depth+workday[i],price2);
			price2=price2-price[i];
			depth=depth+1;
			DFS(i+1,depth,price2);
		}
	}
}