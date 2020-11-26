package Practice604;
import util.Rect;
public class EqualsEx {
	public static void main(String[] args) {
		System.out.println("2015152030 ¿Ã¡ÿ±‘");
		Rect a=new Rect(2,3);
		Rect b=new Rect(3,2);
		Rect c= new Rect(2,3);
		if(a.equals(b))
			System.out.println("a is equal to b");
		if(a.equals(c))
			System.out.println("a is equals to c");
		if(b.equals(c))
			System.out.println("b is equals to c");
	}
}
