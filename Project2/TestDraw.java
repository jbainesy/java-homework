/* TestDraw.java
 * Declaration of class TestDraw.
 * Used to test drawing application. 
 *
 * Jarred Baines ( jbainesy@gmail.com )
 * Project Part 2
 */
 
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;



public class TestDraw
{
   public static void main( String args[] )
   {
      DrawPanel panel = new DrawPanel(); // create an instance of our DrawPanel
	  JFrame application = new JFrame(); // create an instance of JFrame to hold our DrawPanel

	  // create an instance of JLabel and pass the 'status text' as an argument
      JLabel statusBar = new JLabel(panel.getStatus());
	        
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); // set the default close operation
      application.add( panel ); // add our DrawPanel to the JFrame
      application.add( statusBar, BorderLayout.SOUTH); // add our JLabel to the JFrame, SOUTH region 
	  application.setSize( 300, 300 ); // specify the size of the JFrame
      application.setVisible( true ); // set JFrame as 'visible'
   } // end main
} // end class TestDraw
