package Practice703;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
	public static void main(String[] args) {
		System.out.println("2015152030 이준규");
		ArrayList<String> a=new ArrayList<String>();
		Scanner scan=new Scanner(System.in);
		for(int i=0; i<4; i++) {
			System.out.print("이름을 입력하세요 >>");
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
		System.out.println("가장 긴이름은 "+a.get(longest)+"이며 "+(longest+1)+"번째로 들어왔고 가장 짧은 이름은 "+a.get(shortest)+"이고 "+(shortest+1)+"번째로 들어왔습니다.");
	}
}
