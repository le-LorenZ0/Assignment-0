package apppackage;

public class Rectangle {
	
	private int length;
	private int width;
	
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getLen() {
		return length;
	}
	public int getWidth() {
		return width;
	}
	///te
	public int getArea() {
		return length * width;
	}
	
}
