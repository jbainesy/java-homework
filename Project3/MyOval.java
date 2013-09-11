/* MyOval.java
 * Declaration of class MyOval.
 * Draws an oval, given points, 
 * a color and a 'filled' status.
 * 
 * Jarred Baines ( jbainesy@gmail.com )
 * Project Part 3
 */
 
import java.awt.Color;
import java.awt.Graphics;

public class MyOval extends MyShape
{
   private boolean filled; // true if this is a filled shape
 
   // constructor with no input values
   public MyOval()
   {
      super();
	  setFilled( false ); // true if this is a filled shape
   } // end MyOval constructor
 
   // constructor with input values
   public MyOval( int x1, int y1, int x2, int y2,
      Color color, boolean filled )
   {
      super(x1, y1, x2, y2, color);
	  setFilled( filled ); // set filled
   } // end MyOval constructor
   
   
   //set filled flag
   public void setFilled( boolean filled )
   {
      this.filled = filled; // set filled
   } // end setFilled
   
   
   // Get the smallest x point of the oval
   private int getUpperLeftX()
   { 
      if ( getX1() < getX2() )    // if x1 is smaller
	     return getX1();     // return it as the UpperLeftX
	  else return getX2();   // if not, return x2 instead
   } // end getUpperLeftX
   
   // Get the smallest y point of the oval
   private int getUpperLeftY()
   {
      if ( getY1() < getY2() )    // if y1 is smaller
	     return getY1();     // return it as the UpperLeftY
	  else return getY2();   // if not, return y2 instead
   } // end getUpperLeftY

   // Get the width of the oval
   private int getWidth()
   {
      return Math.abs( getX1() - getX2() ); // return the absolute difference between x points
   } // end getWidth

   // Get the height of the oval
   private int getHeight()
   {
      return Math.abs( getY1() - getY2() ); // return the absolute difference between y points
   } // end getHeight
   
   // Get the filled status of the oval
   private boolean getFilled()
   {
      return filled; // return the filled status
   } // end getFilled
   
   
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