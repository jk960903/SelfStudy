package Practice603;
import util.Point;
public class EqualsEx {
	public static void main(String[] argS) {
		System.out.println("2015152030 ¿Ã¡ÿ±‘");
		Point a = new Point(2,3);
		Point b = new Point(2,3);
		Point c = new Point(3,4);

		if(a == b)
			System.out.println("a==b");
		if(a.equals(b))
			System.out.println("a is equal to b");
		if(a.equals(c))
			System.out.println("a is equal to c");

	}

}
