// Time1Test.java
// Use Time1 Object in application

import com.deitel.jhtp7.ch08.Time1;

public class Time1Test {
	public static void main(String[] args) {
		
		// because we imported 'time1' package we can use it's simple name here
		// instead of a fully qualified name
		Time1 time = new Time1();			// 00:00:00
		
		//output string representations of the time
		System.out.print( "The initial universal time is: " );
		System.out.println( time.toUniversalString() );
		System.out.print( "The initial standard time is: " );
		System.out.println( time.toString() );
		System.out.println();
		
		//change the time and output updated time
		time.setTime(13, 27, 6);
		System.out.print( "Universal time after setTime is: " );
		System.out.println( time.toUniversalString() );
		System.out.print( "Standard time after setTime is: " );
		System.out.println( time.toString() );
		System.out.println();
		
		//set the time with invalid values; output updated time
		time.setTime(99, 99, 99);
		System.out.println( "After attempting invalid settings" );
		System.out.print( "Universal time: " );
		System.out.println( time.toUniversalString() );
		System.out.print( "Standard time: " );
		System.out.println( time.toString() );
		System.out.println();
		
	} // end main method
} // end Time1Test Class