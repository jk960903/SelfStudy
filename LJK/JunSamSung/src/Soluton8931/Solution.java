package Soluton8931;
import java.util.Scanner;
import java.util.Stack;
public class Solution {
	public static int testcase;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		testcase=scan.nextInt();
		for(int i=1; i<=testcase; i++) {
			Stack<Integer> stack=new Stack<>();
			int num=scan.nextInt();
			for(int j=0; j<num; j++) {
				int price=scan.nextInt();
				if(price!=0) {
					stack.push(price);
				}
				if(price==0) {
					stack.pop();
				}
			}
			int result=0;
			for(int j=0; j<stack.size(); j++) {
				result+=stack.get(j);
			}
			System.out.println("#" +i+" "+result);
		}
	}
}
