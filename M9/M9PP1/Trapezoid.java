// Trapezoid.java

public class Trapezoid extends Quadrilateral {

	//INSTANCE VARIABLES
	public int base1;
	public int base2;
	public int height;
	
	//CONSTRUCTOR
	public Trapezoid(
		int x0, int y0, int x1, int y1,
		int x2, int y2, int x3, int y3) {
		
		super(x0, y0, x1, y1, x2, y2, x3, y3);
		setBases();
		setHeight();
		System.out.println("Trapezoid area = " + getArea());
	}// end Trapezoid constructor
	
	public void setBases() {
		if (points[0][y] == points[3][y]) {
			base1 = Math.abs(points[0][x] - points[3][x]);
			base2 = Math.abs(points[1][x] - points[2][x]);
		} else {
			base1 = Math.abs(points[0][x] - points[1][x]);
			base2 = Math.abs(points[2][x] - points[3][x]);
		}
	}// end getWidth method
	
	public void setHeight() {
		if (points[0][y] == points[1][y]) {
			height = Math.abs(points[0][y] - points[2][y]);
		} else {
			height = Math.abs(points[0][y] - points[1][y]);
		}
	}// end getWidth method
	
	public double getArea() {
		return (double) (base1 + base2) * height / 2;
	}// end getArea method
	
}// end Rectangle class