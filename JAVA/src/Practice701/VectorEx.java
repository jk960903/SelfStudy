package Practice701;

import java.util.Scanner;
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		System.out.println("2015152030 이준규");
		Vector<Integer> v=new Vector<>(3);
		Scanner scan=new Scanner(System.in);
		for(int i=0; i<4; i++) {
			System.out.print("정수를 입력하세요");
			int x=scan.nextInt();
			if(i==3) {
				v.add(2,x);
			}
			else {
				v.add(x);
			}
		}
		System.out.println("벡터 내의 요소 객체 수 : "+v.size());
		System.out.println("벡터의 현재용량 :"+v.capacity());
		for(int i=0; i<v.size(); i++) {
			int n=v.get(i);
			System.out.println(n);
		}
		int sum=0;
		for (int i=0; i<v.size(); i++) {
			int n=v.elementAt(i);
			sum+=n;
		}
		System.out.println("벡터에 있는 정수합 :" +sum);
		
	}
}
