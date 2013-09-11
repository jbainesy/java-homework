// Module 6
// MaximumFinder.java

import java.util.Scanner;

public class MaximumFinder {
	
	// obtain 3 floating point values and locate the maximum value
	public void determineMaximum() {
	
		Scanner input = new Scanner( System.in );
		
		System.out.print( 
			"Enter three floating point values separated by spaces: " );
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		// determine the maximum value
		double result = maximum( number1, number2, number3 );
		
		// display maximum value
		System.out.println("Maximum is: " + result );
	} // end determineMaximum
	
	// returns the maximum of its three input parameters
	public double maximum(double x, double y, double z) {
		
	double maximumValue = x;
		
		if ( y > maximumValue )
			maximumValue = y;
		
		if ( z > maximumValue )
			maximumValue = z;
			
		return maximumValue;
	} // end maximum method
} // end MaximumFinder class