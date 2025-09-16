package apppackage;

public class AppDriver {
	public static void main(String[] args) {
		
		Rectangle den = new Rectangle();
		den.setLength(5);
		den.setWidth(10);
		int temp= den.getLen();
		int tempw= den.getWidth();
		
		System.out.println(tempw);
		
		
		System.out.println(den.getArea());
	}
}
