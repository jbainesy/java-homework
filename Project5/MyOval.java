/* MyOval.java
 * Declaration of class MyOval.
 * Draws an oval, given points, 
 * a color and a 'filled' status.
 * 
 * Jarred Baines ( jbainesy@gmail.com )
 * Project Part 4
 */
 
import java.awt.Color;
import java.awt.Graphics;

public class MyOval extends MyBoundedShape
{
   private boolean filled; // true if this is a filled shape
 
   // constructor with no input values
   public MyOval()
   {
      super();
   } // end MyOval constructor
 
   // constructor with input values
   public MyOval( int x1, int y1, int x2, int y2,
      Color color, boolean filled )
   {
      super(x1, y1, x2, y2, color, filled);
   } // end MyOval constructor
   
   
   // Actually draws the oval
   public void draw( Graphics g )
   {
      g.setColor( getColor() ); // set the color for drawing

	  // if this is a filled shape, call .fillOval() method
      if (getFilled()) g.fillOval( getUpperLeftX(), getUpperLeftY(), 
	     getWidth(), getHeight() );
	  // if this is not a filled shape, call .drawOval() method
	  else g.drawOval( getUpperLeftX(), getUpperLeftY(), 
	     getWidth(), getHeight() );
   } // end method draw
} // end class MyOval