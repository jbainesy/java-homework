// Rectangle.java

public class Rectangle extends Quadrilateral {

	//INSTANCE VARIABLES
	private int width;
	private int height;
	
	//CONSTRUCTOR
	public Rectangle(
		int x0, int y0, int x1, int y1,
		int x2, int y2, int x3, int y3) {
		
		super(x0, y0, x1, y1, x2, y2, x3, y3);
		setWidth();
		setHeight();
		System.out.println("Rectangle area = " + getArea());
	}// end Rectangle constructor
	
	public void setWidth() {
		if (points[0][x] == points[1][x]) {
			width = Math.abs(points[0][x]) - Math.abs(points[2][x]);
		} else {
			width = Math.abs(points[0][x]) - Math.abs(points[1][x]);
		}
	}// end getWidth method
	
	public void setHeight() {
		if (points[0][y] == points[1][y]) {
			height = Math.abs(points[0][y]) - Math.abs(points[2][y]);
		} else {
			height = Math.abs(points[0][y]) - Math.abs(points[1][y]);
		}
	}// end getWidth method
	
	public double getArea() {
		return (double) height * width;
	}// end getArea method
	
}// end Rectangle class