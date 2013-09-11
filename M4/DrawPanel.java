// DrawPanel.java
// Draws lines on a panel
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {
	
	// draws a simple X from corners of the panel
	public void paintComponent(Graphics g) {
		
		// call paintComponent from superclass
		super.paintComponent(g);
		
		int width = getWidth();
		int height = getHeight();
		int x = 0;
		int y = 0;
		
		
		//draw lines
		//g.drawLine( 0, 0, width, height );
		//g.drawLine( 0, height, width, 0 );
		
		//draw design 1
		while (x < 500) {
		g.drawLine( 0, x, x, 500 );
		g.drawLine( x, 0, 500, x );
		g.drawLine( 0, x, (500 - x), 0 );
		g.drawLine( x, 500, 500, (500 - x) );
		x += 10;
		}
		
		
		/*
		//draw design 2
		while (x < 500) {
		g.drawLine( 0, 0, (500 - x), x);
		g.drawLine( 500, 0, x, x);
		g.drawLine( 0, 500, (500 - x), (500 - x) );
		g.drawLine( 500, 500, x, (500 - x) );
		x += 10;
		}
		*/
		
	} // end paintComponent method
} // end DrawPanel subclass
