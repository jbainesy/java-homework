/* MyRectangle.java
 * Declaration of class MyRectangle.
 * Draws a rectangle, given points, 
 * a color and a 'filled' status.
 * 
 * Jarred Baines ( jbainesy@gmail.com )
 * Project Part 4
 */
 
import java.awt.Color;
import java.awt.Graphics;

public class MyRectangle extends MyBoundedShape
{
   private boolean filled; // true if this is a filled shape
   
   // constructor with no input values
   public MyRectangle()
   {
      super();
   } // end MyRectangle constructor
   
   // constructor with input values
   public MyRectangle( int x1, int y1, int x2, int y2,
      Color color, boolean filled )
   {
      super(x1, y1, x2, y2, color, filled);
   } // end MyRectangle constructor
   
   
   // Actually draws the rectangle
   public void draw( Graphics g )
   {
      g.setColor( getColor() ); // set the color for drawing

	  // if this is a filled shape, call .fillRect() method
      if (getFilled()) g.fillRect( getUpperLeftX(), getUpperLeftY(), 
	     getWidth(), getHeight() );
	  // if this is not a filled shape, call .drawRect() method
	  else g.drawRect( getUpperLeftX(), getUpperLeftY(), 
	     getWidth(), getHeight() );
   } // end method draw
   
} // end class MyRectangle