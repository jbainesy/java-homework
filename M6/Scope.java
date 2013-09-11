// Scope.java
// demonstrates field and local variable scopes

public class Scope {
	
	// FIELD that is accessible to all methods in this class
	private int x = 1;
	
	// method begin creates and initializes local variable x
	// and calls method useLocalVariable and useField
	public void begin() {
		
		int x = 5; //this LOCAL variable SHADOWS field x
		
		System.out.printf( "local x in method begin is %d\n", x );
		
		useLocalVariable(); // has a local x value
		useField(); // uses Scope class's field x
		useLocalVariable(); // re-initializes local x value
		useField(); // Scope class's field x retains its value
		System.out.printf( "\nlocal x in method begin is %d\n", x );
	} // end begin method
	
	
	// create and initialize local variable x during each call
	public void useLocalVariable() {
		int x = 25;
		System.out.printf(
			"\nlocal x on entering method useLocalVariable is %d\n", x );
		++x;
		System.out.printf(
			"local x before exiting method useLocalVariable is %d\n", x );
	} // end useLocalVariable method

	// modify Scope class's field x during each call
	public void useField() {
		System.out.printf(
			"\nfield x on entering method useField is %d\n", x );
		x *= 10;
		System.out.printf(
			"\nfield x on exiting method useField is %d\n", x );
	} // end useField method
	
} // end Scope class