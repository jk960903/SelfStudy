package Practice401;

public class Circle {
	int radius;
	String name;
	
	public Circle(String name,int radius) {
		this.name=name;
		this.radius=radius;
	}
	
	public double getArea() {
		return 3.14*this.radius*this.radius;
	}
	public static void main(String[] args) {
		System.out.println("2015152030 ���ر�");
		Circle pizza;
		pizza=new Circle("���ر�",30);
		double area=pizza.getArea();
		
		System.out.println(pizza.name+"�� ������ "+area);
		
		Circle donut=new Circle("���ر�",30);
		area=donut.getArea();
		System.out.println(pizza.name+"�� ������ "+area);
		
	}
}
