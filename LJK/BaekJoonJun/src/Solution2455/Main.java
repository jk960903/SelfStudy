package Solution2455;
import java.util.Scanner;
public class Main {
	public static int[] entrance;
	public static int[] exit;
	public static int max=0;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		entrance=new int[4];
		exit=new int[4];
		int present=0;
		for(int i=0; i<4; i++) {
			exit[i]=scan.nextInt();
			entrance[i]=scan.nextInt();
		}
		present=entrance[0];
		max=present;
		for(int i=1; i<3; i++) {
			present=present-exit[i];
			present=present+entrance[i];
			if(present>10000) {
				present=10000;
			}
			if(max<present) {
				max=present;
			}
		}
		System.out.println(max);
	}
}
