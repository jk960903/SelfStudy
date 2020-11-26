package Practice702;

import java.util.Scanner;
import java.util.Vector;

class Point{
	private int x, y;
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
		
	}
	public String toString() {
		return "Point("+x+","+y+")";
	}
}
public class PointVectorEx {
	public static void main(String[] args) {
		System.out.println("2015152030 이준규");
		Scanner scan=new Scanner(System.in);
		Vector<Point> v=new Vector<Point>();
		for(int i=0; i<3; i++) {
			System.out.print("x,y를 입력하세요");
			int x=scan.nextInt();
			int y=scan.nextInt();
			Point p=new Point(x,y);
			v.add(p);
			
		}
		v.remove(1);
		for(int i=0; i<v.size(); i++) {
			Point p=v.get(i);
			System.out.println(p.toString());
		}
	}
}
