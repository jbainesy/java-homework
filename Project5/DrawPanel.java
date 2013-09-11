/* DrawPanel.java
 * Declaration of class DrawPanel.
 * Program that generates random shapes
 *
 * Adds a statusBar which shows the
 * number of each type of shape
 *
 * Uses MyShape hierarchy to polymorphically
 * draw lines, rectangles and ovals 
 *
 * Jarred Baines ( jbainesy@gmail.com )
 * Project Part 4
 */
 
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class DrawPanel extends JPanel
{
	//POSSIBLY NOT NEEDED
   //private Random randomNumbers = new Random();   
   private MyShape shapes[]; // array of shapes
   private int shapeCount; // to display in status bar
   private int shapeType;
	private MyShape currentShape;
	private Color currentColor;
	private boolean filledShape;
	//NEED TO IMPORT? ALSO POSSIBLY NOT NOW TO DO THIS
	private JLabel statusLabel; 
	
   // constructor, creates a panel with random shapes
   public DrawPanel()
   {
      setBackground( Color.WHITE );
      
	  // prompt user to obtain quantity of desired shapes
	  int quantity = Integer.parseInt(		
		  JOptionPane.showInputDialog("How many shapes, master?"));
	  shapes = new MyShape[ quantity ]; // initialize shapes array
	  
      // CREATE SHAPES
      for ( int count = 0; count < shapes.length; count++ )
      {
	     // choose a random shape; 0 = lines, 1 = rectangles, 2 = ovals
		 int shapeType = randomNumbers.nextInt( 3 );
         
		 // generate random coordinates
         int x1 = randomNumbers.nextInt( 300 );
         int y1 = randomNumbers.nextInt( 300 );
         int x2 = randomNumbers.nextInt( 300 );
         int y2 = randomNumbers.nextInt( 300 );
         
         // generate a random color
         Color color = new Color( randomNumbers.nextInt( 256 ), 
            randomNumbers.nextInt( 256 ), randomNumbers.nextInt( 256 ) );
   
         // generate a random value for filled status
		 // (will be generated for lines but will not be used)
		 // (which seems less CPU intensive than alternative if statement??)
		 boolean filled = randomNumbers.nextBoolean();
   
         // Create the shape object and instantiate it
		 // increment appropriate counter
         switch ( shapeType )
		 {
		    case 0: shapes[ count ] = new MyLine( x1, y1, x2, y2, color );
			        lineCount++;
                    break;
			case 1: shapes[ count ] = new MyRectangle( x1, y1, x2, y2, color, filled );
			        rectangleCount++;
					break;
			case 2: shapes[ count ] = new MyOval( x1, y1, x2, y2, color, filled );
			        ovalCount++;
					break;
		 } // end switch
      } // end for
	  
   } // end DrawPanel constructor

   // for each shape array, draw the individual shapes
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g ); // Call the superclass constructor
      
	  for ( MyShape shape : shapes )
	     shape.draw( g ); // call shapes draw method and draw shapes polymorphically

   } // end method paintComponent
   
   // return status text for use in a JLabel
   public String getStatus()
   {
		return String.format( "%s: %d, %s: %d, %s: %d",
			"Lines", lineCount, 
			"Ovals", ovalCount,
			"Rectangles", rectangleCount);
   } // end method getStatus
   
} // end class DrawPanel