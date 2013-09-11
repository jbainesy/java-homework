// PassArray.java

public class PassArray {

	public static void main(String[] args) {
		
		int array[] = {1, 2, 3, 4, 5};
		
		System.out.println(
			"Effects of passing reference to entire array:\n" +
			"The values of the original array are:" );
			
		// output original array elements
		for ( int value : array )
			System.out.printf("  %d", value);
		
		modifyArray( array ); // pass array reference
		System.out.println( "\n\nThe values of the modified array are:" );
		
		// output modified array elements
		for ( int value : array )
			System.out.printf("  %d", value);
		
		System.out.printf(
			"\n\nEffects of passing array element value:\n" +
			"array[3] before modifyElement: %d\n", array[3] );
		
		modifyElement( array[3] ); // attempt to modify array 3
								   // this will fail as it is passed BY VALUE
								   // instead of BY REFERENCE
		System.out.printf(
			"array[3] after modifyElement: %d\n", array[3] );
	}// end main
	
	// Multiply each element of an array by 2
	public static void modifyArray(int array2[] ) {
		for (int i = 0; i < array2.length; i++)
			array2[i] *= 2;
	}// end method modifyArray
	
	//Multiply argument by 2
	public static void modifyElement(int element) {
		element *= 2;
		System.out.printf(
			"Value of element in modifyElement: %d\n", element );
	}// end method modifyElement
}
