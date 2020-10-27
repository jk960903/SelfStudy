
public class DataStructure {
	public static int[] temp;
	public void permutation(int[] arr,int depth,int start,int n, int r) {
		if(depth==r) {
			print(arr,r);
			return;
		}
		for(int i=depth; i<n; i++) {
			swap(arr,depth,i);
			permutation(arr,depth+1,n,r);
			swap(arr,depth,i);
		}
	}
	public void swap(int[] arr,int depth,int i) {
		int temp=arr[depth];
		arr[depth]=arr[i];
		arr[i]=temp;
	}
	public void Combination(int[] arr,int depth, int n ,int r) {
		if(depth==r) {
			print(arr,r);
		}
		for(int i=depth; i<n; i++) {
			temp[i]=arr
		}
		
	}
}
