package Practice403;

public class Circle {
	int radius;
	String name;
	public Circle(int radius,String name) {
		this.radius=radius;
		this.name=name;
	}
	public Circle() {
		radius=1;
		name="";
	}
	double getArea() {
		return 3.14*this.radius*this.radius;
	}
	public static void main(String[] args) {
		System.out.println("2015152030 ���ر�");
		Circle pizza=new Circle(10,"�ڹ�����");
		System.out.println(pizza.name+"�� ������ "+pizza.getArea());
		Circle donut=new Circle();
		donut.name="��������";
		System.out.println(donut.name+"�� ������ "+donut.getArea());
		Circle name=new Circle(30,"���ر�");
		System.out.println(name.name+"�� ������ "+ name.getArea());
		
	
	}
}
