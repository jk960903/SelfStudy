package Practice505;

public class MethodOverridingEx {
	public static void main(String[] args) {
		System.out.println("2015152030 ¿Ã¡ÿ±‘");
		Line line=new Line();
		paint(line);
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	}
	private static void paint(Shape p) {
		p.draw();
	}
}
