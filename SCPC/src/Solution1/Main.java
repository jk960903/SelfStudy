package Solution1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.HashSet;
public class Main {
	public static Long[] A;
	public static Long[] B;
	static int day = 0;
	static int menu = 0;
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int i = 0; i < testcase; i++) {
			long answer = 0;
			menu = sc.nextInt();
			day = sc.nextInt();
			A = new Long[menu];
			B = new Long[menu];
			for (int j = 0; j < menu; j++) {
				A[j] = sc.nextLong();
			}
			for (int j = 0; j < menu; j++) {
				B[j] = sc.nextLong();
			}
			Arrays.sort(A);
			Arrays.sort(B);
			ArrayList<Integer> list = new ArrayList<>();
			HashMap<Long,Long> map=new HashMap<>();
			HashSet<Long> set=new HashSet<>();
			for (int j = 0; j < day; j++) {
				for (int k = 0; k < day; k++) {
					Long num=A[j]+B[k];
					set.add(num);
					if(map.containsKey(num)) {
						map.put(num, map.get(num)+1);
					}
					else {
						map.put(num,(long)1);
					}
				}
			}
			long temp=0;
			Object[] key=new Object[set.size()];
			key=set.toArray();
			for(int j=0; j<set.size(); j++) {
				temp=temp+map.get(key[j]);
				if(temp>day) {
					answer=(long)key[j];
					break;
				}
			}
			System.out.println(answer);
			
			
		}
	}
}
