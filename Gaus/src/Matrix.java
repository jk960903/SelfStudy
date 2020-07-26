import java.util.Scanner;
public class Matrix {
	private int m, n;
	double[][] matrix = null;
	double[][] inverse = null;

	public Matrix(int m, int n) {
		this.m = m;
		this.n = n;
	}
	public Matrix(int order) {
		this.n = this.m = order;
	}
	public Matrix() {
		this.m = this.n = 2;
	}

	public boolean createMatrix() {
		if(m != 0 && n != 0) {
			matrix = new double[m][n];
			return true;
		}
		return false;
	}
	private boolean isMatrixCreated() {
		return matrix != null;
	}
	
	public void fillMatrix() {
			if(!isMatrixCreated()) createMatrix();
			Scanner scan=new Scanner(System.in);
			for(int i = 0; i < matrix.length; i++) {
				for(int j = 0; j < matrix[i].length; j++) {
					matrix[i][j]=scan.nextDouble();
				}
			}
		
	}
	public void printMatrix() {
		for(int i=0; i<matrix.length; i++) {
			System.out.print(matrix[i][i]);
			System.out.println();
		}
	}
	private boolean reduceRow(double[] r1, double[] r2, int pos) {
		
			if(r1.length != r2.length) return false;

			double factor = r2[pos] / r1[pos];
			for(int i = pos; i < r1.length; i++) {
				r2[i] -= factor * r1[i];
			}
			return true;
		
	}
	public void process() {
		fillMatrix();
		try {
			if(!isMatrixCreated()) createMatrix();

			// k ÇÇ¹þ
			int k;
			
			double[] swapTemp;

			for(int i = 0; i < matrix.length; i++) {
				k = i;
				for(int j = i + 1; j < matrix.length; j++) {
					if(matrix[j][i] > matrix[k][i]) {
						k = j;
					}
				}

				// Swap
				swapTemp = matrix[i];
				matrix[i] = matrix[k];
				matrix[k] = swapTemp;

				// Iterate over all subsequent rows
				for(int j = 0; j < matrix.length; j++) {
					// Reduce row by row
					if(i != j && !reduceRow(matrix[i], matrix[j], i)) {
						System.out.println("\n----- Error -----");
						System.exit(0);
					}
				}
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) throws Exception {
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		Matrix m = new Matrix(size);
		m.process();
		m.printMatrix();
	}
}