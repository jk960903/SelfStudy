package Solution406;

class Circle{
	int radius;
	String name;
	public Circle(int radius) {
		this.radius=radius;
	}
	double getArea() {
		return 3.14*this.radius*this.radius;
	}
}
public class CircleArray {
	public static void main(String[] args) {
		System.out.println("2015152030 ¿Ã¡ÿ±‘");
		Circle[] c;
		c=new Circle[5];
		for(int i=0; i<c.length; i++){
			c[i]=new Circle(i);
			System.out.println((int)c[i].getArea());
		}
	}
}
