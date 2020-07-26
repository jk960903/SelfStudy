import java.util.Scanner;
public class Main {
	private static int sizex,sizey;
	public static double[][] matrix;
	public static double[][] inverse;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("행 열 사이즈 입력:");
		
		sizex=scan.nextInt();
		sizey=scan.nextInt();
		matrix=new double[sizex][sizey];
		for(int i=0; i<sizex; i++) {
			for(int j=0; j<sizey; j++) {
				matrix[i][j]=scan.nextDouble();
			}
		}
		guass_jordan();
		for(int i=0; i<sizex; i++) {
			for(int j=0; j<sizey; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void guass_jordan() {
		int k;
		double[] temp;
		for(int i=0; i<sizex; i++) {
			k=i;
			for(int j=i+1; j<sizex; j++) {
				if(matrix[j][i]>matrix[k][i]) {
					k=j;
				}
			}
			if(matrix[k][i]==0) {
				System.out.println("Error");
				return;
			}
			
			temp=matrix[i];
			matrix[i]=matrix[k];
			matrix[k]=temp;
			
			for(int j=0; j<matrix.length; j++) {
				if(i!=j && !reduceRow(matrix[i],matrix[j],i)) {
					System.out.println("Error");
				}
			}
		}
		
	}
	public static boolean reduceRow(double[] r1,double[] r2,int pos) {
		if(r1.length!=r2.length)return false;
		double factor=r2[pos]/r1[pos];
		for(int i=pos; i<r1.length; i++) {
			r2[i]-=factor*r1[i];
			
		}
		return true;
	}
}
