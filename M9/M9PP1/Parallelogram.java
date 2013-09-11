// Parallelogram.java

public class Parallelogram extends Quadrilateral {

	//INSTANCE VARIABLES
	public int base;
	public int height;
	
	//CONSTRUCTOR
	public Parallelogram(
		int x0, int y0, int x1, int y1,
		int x2, int y2, int x3, int y3) {
		
		super(x0, y0, x1, y1, x2, y2, x3, y3);
		setBase();
		setHeight();
		System.out.println("Parallelogram area = " + getArea());
	}// end Parallelogram constructor
	
	public void setBase() {
		if (points[0][y] == points[3][y]) {
			base = Math.abs(points[0][x] - points[3][x]);
		} else {
			base = Math.abs(points[0][x] - points[1][x]);
		}
	}// end getWidth method
	
	public void setHeight() {
		if (points[0][y] == points[1][y]) {
			height = Math.abs(points[0][y] - points[2][y]);
		} else {
			height = Math.abs(points[0][y] - points[1][y]);
		}
	}// end getHeight method
	
	public double getArea() {
		return (double) base * height;
	}// end getArea method
	
}// end Parallelogram class