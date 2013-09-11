/* DrawPanel.java
 * Declaration of class DrawPanel.
 * Program that uses classes MyLine,
 * MyRectangle and MyOval to draw 
 * random shapes.
 *
 * Jarred Baines ( jbainesy@gmail.com )
 * Project Part 1
 */
 
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class DrawPanel extends JPanel
{
   private Random randomNumbers = new Random();   
   private MyLine lines[]; // array on lines
   private MyRectangle rectangles[]; // array on rectangles
   private MyOval ovals[]; // array on ovals
   
   
   // constructor, creates a panel with random shapes
   public DrawPanel()
   {
      setBackground( Color.WHITE );
      
	  // create 3 arrays of length 1 to 5
      lines = new MyLine[ 1 + randomNumbers.nextInt( 5 ) ]; 
      rectangles = new MyRectangle[ 1 + randomNumbers.nextInt( 5 ) ];
	  ovals = new MyOval[ 1 + randomNumbers.nextInt( 5 ) ];
	  
	  
      // CREATE LINES
      for ( int count = 0; count < lines.length; count++ )
      {
         // generate random coordinates
         int x1 = randomNumbers.nextInt( 300 );
         int y1 = randomNumbers.nextInt( 300 );
         int x2 = randomNumbers.nextInt( 300 );
         int y2 = randomNumbers.nextInt( 300 );
         
         // generate a random color
         Color color = new Color( randomNumbers.nextInt( 256 ), 
            randomNumbers.nextInt( 256 ), randomNumbers.nextInt( 256 ) );
   
         // add the shape to the list of shapes to be displayed
         lines[ count ] = new MyLine( x1, y1, x2, y2, color );
      } // end for
	  
	  // CREATE RECTANGLES
      for ( int count = 0; count < rectangles.length; count++ )
      {
         // generate random coordinates
         int x1 = randomNumbers.nextInt( 300 );
         int y1 = randomNumbers.nextInt( 300 );
         int x2 = randomNumbers.nextInt( 300 );
         int y2 = randomNumbers.nextInt( 300 );
         
         // generate a random color
         Color color = new Color( randomNumbers.nextInt( 256 ), 
            randomNumbers.nextInt( 256 ), randomNumbers.nextInt( 256 ) );
         
		 // generate a random value for filled status
		 boolean filled = randomNumbers.nextBoolean();
		 
         // add the shape to the list of shapes to be displayed
         rectangles[ count ] = new MyRectangle( x1, y1, x2, y2, color, filled );
      } // end for
	  
	  // CREATE OVALS
      for ( int count = 0; count < ovals.length; count++ )
      {
         // generate random coordinates
         int x1 = randomNumbers.nextInt( 300 );
         int y1 = randomNumbers.nextInt( 300 );
         int x2 = randomNumbers.nextInt( 300 );
         int y2 = randomNumbers.nextInt( 300 );
         
         // generate a random color
         Color color = new Color( randomNumbers.nextInt( 256 ), 
            randomNumbers.nextInt( 256 ), randomNumbers.nextInt( 256 ) );
         
		 // generate a random value for filled status
		 boolean filled = randomNumbers.nextBoolean();
		 
         // add the shape to the list of shapes to be displayed
         ovals[ count ] = new MyOval( x1, y1, x2, y2, color, filled );
      } // end for
	  
   } // end DrawPanel constructor

   // for each shape array, draw the individual shapes
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g ); // Call the superclass constructor
      
      // draw the lines
      for ( MyLine line : lines )
         line.draw( g );
	  // draw the rectangles
      for ( MyRectangle rectangle : rectangles )
         rectangle.draw( g );
	  // draw the lines
      for ( MyOval oval : ovals )
         oval.draw( g );
   } // end method paintComponent
} // end class DrawPanel

