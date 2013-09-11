// Square.java

public class Square extends Quadrilateral {

	//INSTANCE VARIABLES
	private int edgeLength;
	
	//CONSTRUCTOR
	public Square(
		int x0, int y0, int x1, int y1,
		int x2, int y2, int x3, int y3) {
		
		super(x0, y0, x1, y1, x2, y2, x3, y3);
		setEdgeLength();
		System.out.println("Square area = " + getArea());
	}// end Square constructor
	
	public void setEdgeLength() {
		if (points[0][y] == points[1][y]) {
			edgeLength = Math.abs(points[0][y]) - Math.abs(points[2][y]);
		} else {
			edgeLength = Math.abs(points[0][y]) - Math.abs(points[1][y]);
		}
	}// end setEdgeLength method
	
	public double getArea() {
		return (double) edgeLength * edgeLength;
	}// end getArea method
	
}// end Rectangle class