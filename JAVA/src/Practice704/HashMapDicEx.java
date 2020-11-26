package Practice704;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDicEx {
	public static void main(String[] args) {
		System.out.println("2015152030 이준규");
		HashMap<String,String> dic=new HashMap<>();
		Scanner scan=new Scanner(System.in);
		for(int i=0; i<3; i++) {
			System.out.print("단어를 입력하세요");
			String s=scan.next();
			if(s.equals("exit")) {
				break;
			}
			else {
				if(dic.containsKey(s)) {
					System.out.println("이미 있는 단어입니다.");
					i--;
				}
				else {
					System.out.print("한글을 입력하세요");
					String korean=scan.next();
					dic.put(s,korean);
				}
			}
		}
	}
}
