// DrawBullseye.java
// Demonstrates filled shapes

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;


public class DrawBullseye extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Random random = new Random();
		
		for (int i = 5; i < 115; i += 5 ) {
			// generate a random color
			Color color = new Color( random.nextInt( 256 ), 
				random.nextInt( 256 ), random.nextInt( 256 ) );
			
			// draw the bullseye
			g.setColor(color);
			g.fillOval( (i), (i), (2 * (125 - i) ), (2 * (125 - i) ));
		} // end for
		
	} // end paintComponent method
} // end DrawBullseye class