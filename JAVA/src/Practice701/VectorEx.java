package Practice701;

import java.util.Scanner;
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		System.out.println("2015152030 ���ر�");
		Vector<Integer> v=new Vector<>(3);
		Scanner scan=new Scanner(System.in);
		for(int i=0; i<4; i++) {
			System.out.print("������ �Է��ϼ���");
			int x=scan.nextInt();
			if(i==3) {
				v.add(2,x);
			}
			else {
				v.add(x);
			}
		}
		System.out.println("���� ���� ��� ��ü �� : "+v.size());
		System.out.println("������ ����뷮 :"+v.capacity());
		for(int i=0; i<v.size(); i++) {
			int n=v.get(i);
			System.out.println(n);
		}
		int sum=0;
		for (int i=0; i<v.size(); i++) {
			int n=v.elementAt(i);
			sum+=n;
		}
		System.out.println("���Ϳ� �ִ� ������ :" +sum);
		
	}
}
