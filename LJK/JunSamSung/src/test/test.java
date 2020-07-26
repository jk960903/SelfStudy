package test;

public class test {
	public static void main(String[] args) {
		int[][][] threelayer;
		int[] onelayer;
		threelayer=new int[12][31][24];
		onelayer=new int[12*31*24];
		for(int i=0; i<12; i++) {
			for(int j=0; j<31; j++) {
				for(int k=0; k<24; k++) {
					threelayer[i][j][k]=1000;
				}
			}
		}
		int temp=6535;
		for(int i=0; i<12*31*24; i++) {
			onelayer[i]=999;
		}
		System.out.println(6535%12);
		System.out.println(6535%31);
		System.out.println(6535/24);
		if(threelayer[(temp%12)-1][(temp%31)-1][(temp%24)-1]==onelayer[temp-1]) {
			System.out.println("true");
		}
	}
}
