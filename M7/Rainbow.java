// Rainbow.java
// Demonstrates using colors in an array

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Rainbow extends JPanel {
	
	// Define constants indigo and violet
	final Color VIOLET = new Color( 128, 0, 128 );
	final Color INDIGO = new Color( 75, 0, 130 );
	
	// colors to use in the rainbow, starting from the innermost
	// the two white entries result in an empty arc in the center
	private Color colors[] =
		{ Color.WHITE, Color.WHITE, VIOLET, INDIGO, Color.BLUE,
		  Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED };
		 
	//CONSTRUCTOR
	public Rainbow() {
		setBackground( Color.WHITE ); // set background to white
	}// end Constructor
	
	// Draws a rainbow using concentric arcs
	public void paintComponent( Graphics g ) {
		super.paintComponent(g);
		
		int radius = 20; // radius of an arc
		
		// draw the rainbow near the bottom-center
		int centerX = getWidth() / 2;
		int centerY = getHeight() - 10;
		
		// draws filled arcs starting with the outermost
		for (int i = colors.length; i > 0; i--) {
			//set the color for the current arc
			g.setColor( colors[i - 1] );
			
			//fill the arc from 0 to 180 degrees
			g.fillArc( centerX - i * radius, centerY - i * radius,
				i * radius * 2, i * radius * 2, 0, 180 );
		} // end for
	} // end paintComponent method
} // end Rainbow class