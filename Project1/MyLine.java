/* MyLine.java
 * Declaration of class MyLine.
 * Draws a line, given points and a color.
 * 
 * Jarred Baines ( jbainesy@gmail.com )
 * Project Part 1
 */
 
import java.awt.Color;
import java.awt.Graphics;

public class MyLine
{
   private int x1; // x-coordinate of first endpoint
   private int y1; // y-coordinate of first endpoint
   private int x2; // x-coordinate of second endpoint
   private int y2; // y-coordinate of second endpoint
   private Color myColor; // color of this shape

   // constructor with no input values
   public MyLine()
   {
      setX1( 0 ); // x-coordinate of first corner
	  setY1( 0 ); // y-coordinate of first corner
	  setX2( 0 ); // x-coordinate of second corner
	  setY2( 0 ); // y-coordinate of second corner
	  setColor( Color.BLACK ); // color of this shape
   } // end MyLine constructor
   
   // constructor with input values
   public MyLine( int x1, int y1, int x2, int y2, Color color )
   {
      setX1( x1 ); // set x-coordinate of first corner
      setY1( y1 ); // set y-coordinate of first corner
      setX2( x2 ); // set x-coordinate of second corner
      setY2( y2 ); // set y-coordinate of second corner
      setColor( color ); // set the color
   } // end MyLine constructor

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
   
   

   // Get the x1 value
   private int getX1()
   {
      return x1;
   } // end get method

   // Get the y1 value
   private int getY1()
   {
      return y1;
   } // end get method
   
   // Get the x2 value
   private int getX2()
   {
      return x2;
   } // end get method
   
   // Get the y2 value
   private int getY2()
   {
      return y2;
   } // end get method
   
   // Get the color of the line
   private Color getColor()
   {
      return myColor; // return the color
   } // end getColor
   
   
   
   // Actually draws the line
   public void draw( Graphics g )
   {
      g.setColor( getColor() );
      g.drawLine( getX1(), getY1(), getX2(), getY2() );
   } // end method draw
} // end class MyLine

