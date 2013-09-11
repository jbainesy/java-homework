// RandomIntegers.java
// shifted and scaled random numbers

import java.util.Random;

public class RandomIntegers {

	public static void main(String[] args) {
	
		Random randomNumbers = new Random();
		int face;
		
		// loop 20 times
		for ( int i=1; i <= 20; i++ ) {
			
			// pick random int from 1 to 6
			face = 1 + randomNumbers.nextInt(6);
			
			System.out.printf( "%d ", face ); // display generated value
			
			// if counter is divisible by 5, start a new line of output
			if ( i % 5 == 0 )
				System.out.println();
		} // end for
		
	} // end main
} // end RandomIntegers class