package Practice402;

import java.util.Scanner;

public class Rectangle {
	int width;
	int height;
	
	Rectangle(int width,int height){
		this.width=width;
		this.height=height;
	}
	
	public int getArea() {
		return this.width*this.height;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("2015152030 이준규");
		System.out.println(">>");
		int width=scan.nextInt();
		int height=scan.nextInt();
		Rectangle rect=new Rectangle(width,height);

		int Area=rect.getArea();
		System.out.println("사각형의 면적은 "+Area);
		int sx=scan.nextInt();
		Square square=new Square(sx);
		Area=square.getArea(square.x);
		System.out.println("정사각형의 면적은 "+Area);
		
	}
	static class Square{
		int x;
		
		public Square(int x) {
			this.x=x;
		}
		public int getArea(int x) {
			return this.x*this.x;
		}
		
	}
}
