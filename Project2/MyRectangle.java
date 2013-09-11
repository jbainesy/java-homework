/* MyRectangle.java
 * Declaration of class MyRectangle.
 * Draws a rectangle, given points, 
 * a color and a 'filled' status.
 * 
 * Jarred Baines ( jbainesy@gmail.com )
 * Project Part 2
 */
 
import java.awt.Color;
import java.awt.Graphics;

public class MyRectangle
{
   private int x1; // x-coordinate of first corner
   private int y1; // y-coordinate of first corner
   private int x2; // x-coordinate of second corner
   private int y2; // y-coordinate of second corner
   private Color myColor; // color of this shape
   private boolean filled; // true if this is a filled shape
   
   // constructor with no input values
   public MyRectangle()
   {
      setX1( 0 ); // x-coordinate of first corner
	  setY1( 0 ); // y-coordinate of first corner
	  setX2( 0 ); // x-coordinate of second corner
	  setY2( 0 ); // y-coordinate of second corner
	  setColor( Color.BLACK ); // color of this shape
	  setFilled( false ); // true if this is a filled shape
   } // end MyRectangle constructor
   
   // constructor with input values
   public MyRectangle( int x1, int y1, int x2, int y2,
      Color color, boolean filled )
   {
      setX1( x1 ); // set x-coordinate of first corner
      setY1( y1 ); // set y-coordinate of first corner
      setX2( x2 ); // set x-coordinate of second corner
      setY2( y2 ); // set y-coordinate of second corner
      setColor( color ); // set the color
	  setFilled( filled ); // set 'filled'
   } // end MyRectangle constructor
   
   
   
   public void setX1( int x1 )
   {   
      if ( x1 < 0 ) x1 = 0; // disallow negative values
      this.x1 = x1; // set x1
   } // end setX1

   public void setY1( int y1 )
   {   
      if ( y1 < 0 ) y1 = 0; // disallow negative values
      this.y1 = y1; // set y1
   } // end setY1
	  
   public void setX2( int x2 )
   {   
      if ( x2 < 0 ) x2 = 0; // disallow negative values
	  this.x2 = x2; // set x2
   } // end setX2
	  
   public void setY2( int y2 )
   {   
      if ( y2 < 0 ) y2 = 0; // disallow negative values
	  this.y2 = y2; // set y2
   } // end setY2
	  
   public void setColor( Color myColor )
   {   
      this.myColor = myColor; // set myColor
   } // end setColor
   
   public void setFilled( boolean filled )
   {
      this.filled = filled; // set filled
   } // end setFilled
   
   
   
   // Get the smallest x point of the rectangle
   private int getUpperLeftX()
   {
      if ( x1 < x2 )    // if x1 is smaller
	     return x1;     // return it as the UpperLeftX
	  else return x2;   // if not, return x2 instead
   } // end getUpperLeftX
   
   // Get the smallest y point of the rectangle
   private int getUpperLeftY()
   {
      if ( y1 < y2 )    // if y1 is smaller
	     return y1;     // return it as the UpperLeftY
	  else return y2;   // if not, return y2 instead
   } // end getUpperLeftY

   // Get the width of the rectangle
   private int getWidth()
   {
      return Math.abs( x1 - x2 ); // return the absolute difference between x points
   } // end getWidth

   // Get the height of the rectangle
   private int getHeight()
   {
      return Math.abs( y1 - y2 ); // return the absolute difference between y points
   } // end getHeight
   
   // Get the color of the rectangle
   private Color getColor()
   {
      return myColor; // return the color
   } // end getColor
   
   // Get the filled status of the rectangle
   private boolean getFilled()
   {
      return filled; // return the filled status
   } // end getFilled
   
   
   
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