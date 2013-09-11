/* MyLine.java
 * Declaration of class MyLine.
 * Draws a line, given points and a color.
 * 
 * Jarred Baines ( jbainesy@gmail.com )
 * Project Part 4
 */
 
import java.awt.Color;
import java.awt.Graphics;

public class MyLine extends MyShape
{
   // constructor with no input values
   public MyLine()
   {
      super();
   } // end MyLine constructor
   
   // constructor with input values
   public MyLine( int x1, int y1, int x2, int y2, Color color )
   {
      super(x1, y1, x2, y2, color);
   } // end MyLine constructor
   
   // Actually draws the line
   public void draw( Graphics g )
   {
      g.setColor( getColor() );
      g.drawLine( getX1(), getY1(), getX2(), getY2() );
   } // end method draw
   
} // end class MyLine

