package real1;

public class Main {
	public static void main(String[] args) {
		int n=7;
		int[] p= {6,2,1,0,2,4,3};
		int[] c= {3,6,6,2,3,7,6};
		String temp=solution(n,p,c);
		System.out.println(temp);
	}
	public static String solution(int n,int[] p, int[] c) {
		String answer="";
		double result=0;
		int remain=0;
		int cant=0;
		int money=100;
		int index=0;
		for(int i=0; i<c.length; i++) {
			p[i]=remain+p[i];
			if(p[i]>=c[i]) {
				result=result+money*c[i];
				remain=p[i]-c[i];
				money=100;
				cant=0;
			}else {
				remain=p[i];
				cant++;
				money=money/2;
				if(cant==3) {
					index=i;
					break;
				}
			}
		}
	if(index!=0) {
		double ave=result/(index+1);
		answer=String.format("%.2f",ave);
	}else {
		double ave=result/c.length;
		answer=String.format("%.2f",ave);
	}
	return answer;
	}
}
