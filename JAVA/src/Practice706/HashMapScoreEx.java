package Practice706;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapScoreEx {
	public static void main(String[] args) {
		System.out.println("2015152300 ���ر�");
		HashMap<String,Integer> javaScore=new HashMap<>();
		Scanner scan=new Scanner(System.in);
		for(int i=0; i<5; i++) {
			System.out.print("�̸��� ������ �Է��ϼ���");
			String name=scan.next();
			int score=scan.nextInt();
			if(javaScore.containsKey(name)) {
				System.out.println("�̹� �Է��� �̸��Դϴ�. �ٽ��Է��Ͻʽÿ�");
				i--;
			}else {
				javaScore.put(name,score);
			}
		}
		System.out.println("HashMap ����� ���� : "+javaScore.size());
		Set<String> keys=javaScore.keySet();
		Iterator<String> it=keys.iterator();
		while(it.hasNext()) {
			String name=it.next();
			int score=javaScore.get(name);
			System.out.println(name + " : " + score);
		}
	}
}
