// PackageDataTest.java

public class PackageDataTest {
	public static void main(String[] args) {
		PackageData packageData = new PackageData();
		
		//output string representation
		System.out.printf( "After instantiation: \n%s\n", packageData );
		
		//change package access data in packageData object
		packageData.number = 77;
		packageData.string = "Goodbye";
		
		//output string representation of packageData
		System.out.printf( "\nAfter changing values:\n%s\n", packageData );
	} // end main method
}// end PackageDataTest class

// Class with package access instance variables
class PackageData {
	int number;
	String string;
	
	//constructor
	public PackageData() {
		number = 0;
		string = "Hello";
	}// end constructor
	
	//return PackageData object String representation
	public String toString() {
		return String.format( "number: %d; string: %s", number, string);
	}// end toString method
} // end PackageData class