package practice312;

public class ReturnArray {
	public static void main(String[] args) {
		System.out.println("2015152030 ¿Ã¡ÿ±‘");
		int[] array=makearray();
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	public static int[] makearray() {
		int[] temp=new int[4];
		for(int i=0; i<temp.length; i++) {
			temp[i]=i+1;
		}
		return temp;
	}
}
