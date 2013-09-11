// Dialog1
// Module 3

import javax.swing.JOptionPane; // import class JOptionPane

public class Dialog1 {
	public static void main(String[] args) {
		// Display dialog box with message
		String name =		
		  JOptionPane.showInputDialog("What is your name?");

		// create the message
		String message =
		  String.format("Welcome, %s, to Java Programming!", name);

		// Display message
		JOptionPane.showMessageDialog(null, message);

	} // end main method
} // end Dialog1 class
