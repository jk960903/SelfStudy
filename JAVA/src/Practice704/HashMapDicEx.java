package Practice704;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDicEx {
	public static void main(String[] args) {
		System.out.println("2015152030 ���ر�");
		HashMap<String,String> dic=new HashMap<>();
		Scanner scan=new Scanner(System.in);
		for(int i=0; i<3; i++) {
			System.out.print("�ܾ �Է��ϼ���");
			String s=scan.next();
			if(s.equals("exit")) {
				break;
			}
			else {
				if(dic.containsKey(s)) {
					System.out.println("�̹� �ִ� �ܾ��Դϴ�.");
					i--;
				}
				else {
					System.out.print("�ѱ��� �Է��ϼ���");
					String korean=scan.next();
					dic.put(s,korean);
				}
			}
		}
	}
}
