package Solution17837;
import java.util.Scanner;
public class Main {
	public static void main(String[ ] args) {
		//0 �� 1 �� 2 ��
		Scanner scan=new Scanner(System.in);
		int[][] map;
		int N=scan.nextInt();
		map=new int[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				map[i][j]=scan.nextInt();
			}
		}
	}
	private static boolean inbound(int tempx,int tempy) {
		return true;
	}
}
