package util;

public class Rect {
	int width;
	int height;
	public Rect(int width, int height) {
		this.width = width; 
		this.height = height;
	}
	public boolean equals(Object obj) {
		Rect p = (Rect)obj;
		if (this.width==p.width&&this.height==p.height) {
			return true;
		}else {
			return false;
		}
	}

}
