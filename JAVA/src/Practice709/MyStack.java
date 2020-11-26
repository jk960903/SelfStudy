package Practice709;

import java.util.Scanner;

class GStack<T> {
	int tos; 
	Object [] stck;
	public GStack() {
		tos = 0; 
		stck = new Object [5];
	}
	public void push(T item) {
		if(tos == 5)
			return; 
		stck[tos] = item;
		tos++;
	}
	public T pop() {
		if(tos == 0)
			return null;
		tos--; 
		return (T)stck[tos]; 
	}
	public boolean isFull() {
		if(tos==5) {
			return true;
		}else {
			return false;
		}
	}
	public boolean isEmpty() {
		if(tos==0) {
			return true;
		}else {
			return false;
		}
	}
}
public class MyStack {
	public static void main(String[] args) {
		GStack<String> stringStack = new GStack<String>();
		System.out.println("2015152030 이준규");
		Scanner scan=new Scanner(System.in);
		while(!stringStack.isFull()) {
			System.out.print("문자열 입력");
			String s=scan.next();
			if(s.equals("exit")) {
				break;
			}
			stringStack.push(s);
		}
		while(!stringStack.isEmpty()) {
			System.out.println(stringStack.pop());
		}
	}
	
}
