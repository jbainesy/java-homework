// ArcSpiral.java
// Demonstrates using arcs in an array

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class ArcSpiral extends JPanel {
		 
	//CONSTRUCTOR
	public ArcSpiral() {
		setBackground( Color.WHITE ); // set background to white
	}// end Constructor
	
	// Draws a rainbow using concentric arcs
	public void paintComponent( Graphics g ) {
		super.paintComponent(g);
		
		int radius = 20; // radius of arc
		// draw the rainbow near the bottom-center
		int centerX = getWidth() / 2;
		int centerY = getHeight() /2;
		
		//set the color for the current arc
		g.setColor( Color.GREEN );
		
		// draws arcs starting with the innermost
		for (int i = 1; i < 15; i++) {
			//draw the arc from 0 to 180 degrees
			g.drawArc( centerX - i * radius, centerY - i * radius,
				i * radius * 2, i * radius * 2, 0, 180 );

			//draw the arc from 180 to 360 degrees
			g.drawArc( centerX-20 - i * radius, centerY - i * radius,
				i * radius * 2+20, i * radius * 2, 0, -180 );	
		} // end for
	} // end paintComponent method
} // end Rainbow class