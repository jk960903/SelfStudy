package Solution7792;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
public class Main {
	public static int testcase=0;
	public static int N=0;

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		testcase=scan.nextInt();
		for(int i=0; i<testcase; i++) {
			String[] name;
			int[] textnum;
			char[] temp;
			N=scan.nextInt();
			scan.nextLine();
			name=new String[N];
			textnum=new int[N];
			for(int j=0; j<N; j++) {
				name[j]=scan.nextLine();
			}
			Arrays.sort(name);
			int max=0;
			int index=0;
			for(int j=0; j<N; j++) {
				temp=new char[name[j].length()];
				temp=name[j].toCharArray();
				HashSet<Character> set=new HashSet<Character>();
				for(int k=0; k<temp.length; k++) {
					if(temp[k]!=' ') {
						set.add(temp[k]);
					}
				}
				textnum[j]=set.size();	
			}
			for(int k=0; k<N; k++) {
				if(max<textnum[k]) {
					max=textnum[k];
					index=k;
				}
			}
			System.out.println("#"+(i+1)+" "+name[index]);
		}
	}
}
