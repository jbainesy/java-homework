/* MyBoundedShape.java
 * Declaration of class MyBoundedShape.
 * Contains points and 'filled' flag to
 * use when drawing a shape.
 * 
 * Jarred Baines ( jbainesy@gmail.com )
 * Project Part 4
 */
 
import java.awt.Color;
import java.awt.Graphics;

public abstract class MyBoundedShape extends MyShape
{
   private boolean filled; // true if this is a filled shape
   
   // constructor with no input values
   public MyBoundedShape()
   {
      super(); // call superclass no-argument constructor
	  filled = false; // set filled flag
   } // end MyBoundedShape constructor
   
   // constructor with input values
   public MyBoundedShape( int x1, int y1, int x2, int y2,
      Color color, boolean filled )
   {
      super( x1, y1, x2, y2, color ); // call superclass constructor
	  this.filled = filled; // set filled flag
   } // end MyBounedShape constructor
   
   
   // set filled status
   public void setFilled( boolean filled )
   {
      this.filled = filled; // set filled
   } // end setFilled
   
   // Get the filled status of the shape
   public boolean getFilled()
   {
      return filled; // return the filled status
   } // end getFilled
   
   
   // Get the smallest x point of the shape
   public int getUpperLeftX()
   {
      if ( getX1() < getX2() )    // if x1 is smaller
	     return getX1();     // return it as the UpperLeftX
	  else return getX2();   // if not, return x2 instead
   } // end getUpperLeftX
   
   // Get the smallest y point of the shape
   public int getUpperLeftY()
   {
      if ( getY1() < getY2() )    // if y1 is smaller
	     return getY1();     // return it as the UpperLeftY
	  else return getY2();   // if not, return y2 instead
   } // end getUpperLeftY

   // Get the width of the shape
   public int getWidth()
   {
      return Math.abs( getX1() - getX2() ); // return the absolute difference between x points
   } // end getWidth

   // Get the height of the shape
   public int getHeight()
   {
      return Math.abs( getY1() - getY2() ); // return the absolute difference between y points
   } // end getHeight
   
   
   // Actually draws the bounded shape
   // Abstract here, must be declared in subclass
   public abstract void draw( Graphics g );
   
} // end class MyBoundedShape