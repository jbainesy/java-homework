// Shapes.java
// Demonstrates drawing different shapes

import java.awt.Graphics;
import javax.swing.JPanel;

public class Shapes extends JPanel {

	private int choice; // user's choice of which shape to draw
	
	// constructor sets the user's choice
	public Shapes( int userChoice ) {
		choice = userChoice;
	} // end constructor
	
	// draw a cascade of shapes starting from top left corner
	public void paintComponent( Graphics g) {
		super.paintComponent( g ); // call the super method
		
		for ( int i = 0; i < 10; i++ ) {
			switch ( choice ) {
				case 1: // draw rectangles
					g.drawRect( 10 + i * 10, 10 + i * 10,
						50 + i * 10, 50 + i * 10);
					break;
				case 2: // draw ovals
					g.drawOval( 10 + i * 10, 10 + i * 10,
						50 + i * 10, 50 + i * 10);
					break;
				case 3: // draw concentric ovals
					g.drawOval( 100 - 10 * i, 100 - 10 * i,
						50 + i * 20, 50 + i * 20);
					break;
				default:
					System.out.println("Incorrect input detected");
			} // end switch
		} // end for
		
	} // end paintComponent method
	
} // end Shapes class
