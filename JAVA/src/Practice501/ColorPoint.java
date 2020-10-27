package Practice501;

public class ColorPoint extends Point{
	private String color;
	public void setColor(String color) {
		this.color=color;
	}
	public void showColorPoint() {
		System.out.print("»ö:"+this.color+",");
		showPoint();
	}
}
