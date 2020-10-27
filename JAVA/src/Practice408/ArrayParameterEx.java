package Practice408;

public class ArrayParameterEx {
	static void replaceSpace(char[] a) {
		for(int i=0; i<a.length; i++) {
			
			if(a[i]==' ') {
				a[i]=',';
			}
			if(a[i]==',') {
				a[i]='/';
			}else if(a[i]=='i') {
				a[i]='o';
			}
		}
	}
	static void printCharArray(char[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.println("2015152030 ÀÌÁØ±Ô");
		char[] c= {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);
	}
}
