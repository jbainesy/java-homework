// Time2Test2.java
// Overloaded constructors used to initialize Time2 objects

public class Time2Test2 {
	public static void main(String[] args) {
		
		Time2 t1 = new Time2(23,58,59);			// 00:00:00
		
		System.out.println( "Testing Time2 Class" );
		System.out.printf( "  %s\n", t1.toUniversalString() );
		System.out.printf( "  %s\n\n\n", t1.toString() );

		for (int i = 0; i < 63; i++){
			t1.tick();
			System.out.println( "Tick!" );
			System.out.printf( "  %s\n", t1.toUniversalString() );
			System.out.printf( "  %s\n\n\n", t1.toString() );
		}
		
	} // end main method
} // end Time2Test Class