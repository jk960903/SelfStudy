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
		System.out.println("2015152030 ���ر�");
		System.out.println(">>");
		int width=scan.nextInt();
		int height=scan.nextInt();
		Rectangle rect=new Rectangle(width,height);

		int Area=rect.getArea();
		System.out.println("�簢���� ������ "+Area);
		int sx=scan.nextInt();
		Square square=new Square(sx);
		Area=square.getArea(square.x);
		System.out.println("���簢���� ������ "+Area);
		
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
