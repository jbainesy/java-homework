/* TestDraw.java
 * Declaration of class TestDraw.
 * Used to test drawing application. 
 *
 * Jarred Baines ( jbainesy@gmail.com )
 * Project Part 1
 */
 
import javax.swing.JFrame;

public class TestDraw
{
   public static void main( String args[] )
   {
      DrawPanel panel = new DrawPanel(); // create an instance of our DrawPanel
      JFrame application = new JFrame(); // create an instance of JFrame to hold our DrawPanel
      
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); // set the default close operation
      application.add( panel ); // add our DrawPanel to the JFrame
      application.setSize( 300, 300 ); // specify the size of the JFrame
      application.setVisible( true ); // set JFrame as 'visible'
   } // end main
} // end class TestDraw
