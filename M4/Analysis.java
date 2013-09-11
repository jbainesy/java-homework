// Analysis.java
// Analysis of examination results.
import java.util.Scanner;

public class Analysis {
	public void processExamResults() {
	
		// create Scanner instance
		Scanner input = new Scanner(System.in);
	
		// Init
		int passes = 0;
		int failures = 0;
		int studentCounter = 1;
		int result;
	
		// process 10 students using counter
		while ( studentCounter <= 10 ) {
			// prompt user for input
			System.out.print("Enter result (1= pass, 2= fail): ");
			result = input.nextInt();
			
			//if...else nested in while
			if (result == 1) passes++;
			else failures++;
			
			studentCounter++;
		} // end while
		
		// termination phase
		System.out.printf("Passed %d\nFailed %d\n", passes, failures);
		
		// determine weather more than 8 students passed
		if(passes > 8)
			System.out.println("Raise Tuition");
	} // end processExamResults method
	
} // end Analysis class
