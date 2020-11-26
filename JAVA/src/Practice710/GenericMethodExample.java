package Practice710;

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
public class GenericMethodExample {
	public static <T> void reverse(GStack<T> a) { 	
		GStack<T> s = new GStack<T>(); 
		while (true) {
			T tmp; 
			tmp = a.pop();
			if (tmp==null) 
				break;
			else 
				s.push(tmp); 
		}
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
		return;
	}
	public static void main(String[] args) {
		System.out.println("2015152030 이준규");
		GStack<Double> gs = new GStack<Double>(); 
		Scanner scan=new Scanner(System.in);
		for (int i=0; i<5; i++) { 
			System.out.print("실수 입력 :");
			double d=scan.nextDouble();
			gs.push(Double.valueOf(d)); 
		}
		reverse(gs);
		
	}

}
