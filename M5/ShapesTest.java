// ShapesTest.java
// class to test Shapes.java

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapesTest {

	public static void main(String[] args) {
	
		// obtain users choice
		String input = JOptionPane.showInputDialog(
			"Enter 1 to draw rectangles\n" +
			"Enter 2 to draw ovals\n" +
			"Enter 3 to draw concentric ovals" );
		
		int choice = Integer.parseInt( input ); // convert input to int
		
		// create the panel with the user's input
		Shapes panel = new Shapes( choice );
		
		JFrame application = new JFrame(); // creates a new JFrame
		
		application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		application.add( panel ); // add the panel to the frame
		application.setSize( 300, 300 ); // set the desired size
		application.setVisible( true ); // show the frame
	} // end main method

} // end ShapesTest class
