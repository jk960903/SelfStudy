package util;

public class Point {
	int x,y;
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public String toString() {
		return "Point(x:"+this.x+", y:"+this.y+")";
	}
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			return true;
		}else return false;
	}
}
