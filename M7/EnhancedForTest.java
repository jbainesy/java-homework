/*  Jarred Baines
 *  Initialising Arrays
 *  display initialising of an array
 * 
 * 
 *  Call this InitArray.java
 */
 
public class EnhancedForTest {
	public static void main(String[] args) {
	
		int array[] = { 87, 35, 67, 27, 64, 36, 68, 82, 52, 43 };
		int total = 0;	
	
		// add each element to total
		for ( int number : array )
			total += number;
		
		System.out.printf("Total of array elements %d\n", total );
	
	}	
}