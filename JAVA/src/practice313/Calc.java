package practice313;

public class Calc{
	public static void main(String[] args) {
		System.out.println("2015152030 ���ر�");
		double sum=0;
		for(int i=0; i<args.length; i++) {
			sum+=Double.parseDouble(args[i]);
		}
		System.out.println("�հ� : "+sum);
	}
}
