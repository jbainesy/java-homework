// QuadrilateralTest.java

public class QuadrilateralTest {

	public static void main(String args[]) {
		Rectangle rectangle = new Rectangle(
			0, 0, 0, 10, 20, 10, 20, 0);
		Square square = new Square(
			0, 0, 0, 15, 15, 15, 15, 0);
		Trapezoid trapezoid = new Trapezoid(
			0, 0, 50, 0, 40, 25, 10, 25);
		//System.out.println("base1 = " + trapezoid.base1 + ", base2 = " +
			//trapezoid.base2 + ", height = " + trapezoid.height);
		Parallelogram parallelogram = new Parallelogram(
			0, 0, 40, 0, 50, 25, 10, 25);
			
	}
}