/*  Jarred Baines
 *  Initialising Arrays
 *  display initialising of an array
 * 
 * 
 *  Call this InitArray.java
 */
 
 import java.util.Random;
 
public class InitArray {
	public static void main(String[] args) {
	
	Random random = new Random();
	int rating[] = new int[11]; // declare an array named array1
	int sum = 0;	
	// output each array element's value
	System.out.printf( "\n\nSummary of results: ");
		for ( int i = 1; i <= 40; i++ ) {
			++rating[1+random.nextInt(10)];
		}
		
		for ( int i = 1; i <= 10; i++ ) {
			System.out.print("\n#" + i + " Votes: ");
			for ( int j = 1; j <= rating[i]; j++) {
				System.out.print("*"); 
			}
		}
	}	
}