package practice601;
import util.Point;
public class ObjectPropertyEx {
	public static void print(Object obj) {
		System.out.println(obj.getClass().getName());
		System.out.println(obj.hashCode()); 
		System.out.println(obj.toString()); 
		System.out.println(obj); 
	}
	public static void main(String [] args) {
		System.out.println("2015152030 ¿Ã¡ÿ±‘");
		Point p = new Point(2,3);
		print(p);
	}

}
