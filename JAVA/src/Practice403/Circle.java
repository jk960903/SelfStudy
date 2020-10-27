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
		System.out.println("2015152030 이준규");
		Circle pizza=new Circle(10,"자바피자");
		System.out.println(pizza.name+"의 면적은 "+pizza.getArea());
		Circle donut=new Circle();
		donut.name="도넛피자";
		System.out.println(donut.name+"의 면적은 "+donut.getArea());
		Circle name=new Circle(30,"이준규");
		System.out.println(name.name+"의 면적은 "+ name.getArea());
		
	
	}
}
