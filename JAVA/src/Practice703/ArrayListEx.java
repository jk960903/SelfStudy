package Practice703;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
	public static void main(String[] args) {
		System.out.println("2015152030 ���ر�");
		ArrayList<String> a=new ArrayList<String>();
		Scanner scan=new Scanner(System.in);
		for(int i=0; i<4; i++) {
			System.out.print("�̸��� �Է��ϼ��� >>");
			String s=scan.next();
			a.add(s);
		}
		for(int i=0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}
		int longest=0;
		int longestlen=0;
		int shortest=0;
		int shortestlen=999;
		for(int i=0; i<a.size(); i++) {
			if(a.get(i).length()>longestlen) {
				longest=i;
				longestlen=a.get(i).length();
			}
			if(a.get(i).length()<shortestlen) {
				shortest=i;
				shortestlen=a.get(i).length();
			}
		}
		System.out.println("���� ���̸��� "+a.get(longest)+"�̸� "+(longest+1)+"��°�� ���԰� ���� ª�� �̸��� "+a.get(shortest)+"�̰� "+(shortest+1)+"��°�� ���Խ��ϴ�.");
	}
}
