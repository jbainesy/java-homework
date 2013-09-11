// ArcSpiral.java
// Demonstrates using arcs in an array

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class LineSpiral extends JPanel {
		 
	//CONSTRUCTOR
	public LineSpiral() {
		setBackground( Color.WHITE ); // set background to white
	}// end Constructor
	
	// Draws a rainbow using concentric arcs
	public void paintComponent( Graphics g ) {
		super.paintComponent(g);
		
		int xPoints[] = {0,  0, -1, -1, 1, 1, -2, -2, 2, 2, -3, -3, 3, 3, -4, -4};
		int yPoints[] = {0,  1,  1, -1, -1, 2, 2, -2, -2, 3, 3, -3, -3, 4, 4, -4};
		int step = 40; // radius of arc
		// draw the rainbow near the bottom-center
		int centerX = getWidth() / 2;
		int centerY = getHeight() /2;
		
		//set the color for the current arc
		g.setColor( Color.RED );
		
		// draws arcs starting with the innermost
		for (int i = 1; i < xPoints.length; i++) {
			//draw the spiral using lines
			g.drawLine( centerX + xPoints[i-1] * step, centerY + yPoints[i-1] * step,
				centerX + xPoints[i] * step, centerY + yPoints[i] * step );	
		} // end for
		
	} // end paintComponent method
} // end Rainbow class