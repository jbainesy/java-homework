// Quadrilateral.java

public class Quadrilateral {
	
	//CONSTANTS
	protected static final int x = 0;
	protected static final int y = 1;
	
	//INSTANCE VARIABLES
	protected int points[][];
	
	//CONSTRUCTOR
	public Quadrilateral(
		int x0, int y0, int x1, int y1,
		int x2, int y2, int x3, int y3) {
		
		points = new int[4][2];
		points[0][x] = x0;
		points[0][y] = y0;
		points[1][x] = x1;
		points[1][y] = y1;
		points[2][x] = x2;
		points[2][y] = y2;
		points[3][x] = x3;
		points[3][y] = y3;
	}// end Quadrilateral constructor
	
	
}// end Quadrilateral class