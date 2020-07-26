package Soulution1759;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static int L=0;
	public static int C=0;
	public static char[] array;
	public static char[] combi;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		L=scan.nextInt();
		C=scan.nextInt();
		combi=new char[L];
		array=new char[C];
		scan.nextLine();
		String s=scan.nextLine();
		for(int i=0; i<C; i++) {
			array[i]=s.charAt(2*i);
		}
		Arrays.sort(array);
		DFS(0,0);
	}
	public static void DFS(int start,int depth) {
		if(depth==L) {
			int jaum=0;
			int moum=0;
			for(int i=0; i<L; i++) {
				if(combi[i]=='a'||combi[i]=='e'||combi[i]=='o'||combi[i]=='u'||combi[i]=='i') {
					moum++;
				}
				else {
					jaum++;
				}
				if(moum>=1&&jaum>=2) {
					break;
				}
			}
			if(moum<1||jaum<2) {
				return;
			}
			System.out.println(combi);
			return;
		}
		for(int i=start; i<C; i++) {
			combi[depth]=array[i];
			DFS(i+1,depth+1);
		}
	}
}
