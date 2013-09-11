// Gradebook.java
// Gradebook class using switch to count A, B, C, D and F grades

import java.util.Scanner;

public class GradeBook {
	
	private String courseName;
	private int total, gradeCounter;
	private int aCount, bCount, cCount, dCount, fCount;
	
	// constructor initializes courseName
	// all int variables are 0 by default
	public GradeBook( String courseName ) {
		this.courseName = courseName;
	} // end constructor
	
	public void setCourseName( String courseName ) {
		this.courseName = courseName;
	} // end setCourseName method
	
	public String getCourseName() {
		return courseName;
	} // end getCourseName method
	
	// Display a welcome message to the user
	public void displayMessage() {
		System.out.printf("Welcome to the gradebook for \n%s!\n\n",
			getCourseName());
	} // end displayMessage method
	
	// Input arbitrary number of grades from user
	public void inputGrades() {
		Scanner input = new Scanner( System.in );
		
		int grade; // grade entered by user
		
		System.out.printf( "%s\n%s\n  %s\n  %s\n",
			"Enter the integer grades in the range 0-100.",
			"Type the end-of-file indicator to terminate input:",
			"On UNIX/Linux/Mac OS X type <Ctrl> + d then press <Enter>",
			"On Windows type <Ctrl> + z then press <Enter>");
		
		// loop until user enters the end-of-file indicator
		while (input.hasNext()) {
			grade = input.nextInt(); // read grade
			total += grade; // add grade to total
			++gradeCounter; // increment number of grades
			
			// call method to increment appropriate counter
			incrementLetterGradeCounter( grade );
		} // end while
	} // end inputGrades method
	
	// Add 1 to appropriate counter for specified grade
	public void incrementLetterGradeCounter( int grade ) {
		
		// determine which grade was entered
		switch ( grade / 10) {
			case 9: // grade was between 90
			case 10: // and 100
				++aCount; //increment aCount
				break; // necessary to exit switch
			
			case 8: // grade was between 80 and 89
				++bCount;
				break;
				
			case 7: // grade was between 70 and 79
				++cCount;
				break;
				
			case 6: // grade was between 60 and 69
				++dCount;
				break;
			
			default: // grade was less than 60
				++fCount;		
		} // end switch
		
	} // end incrementLetterGradeCounter method
	
	// display a report based on the grades entered by user
	public void displayGradeReport() {
		System.out.println( "\nGrade Report:" );
		
		// if user entered at least one grade...
		if (gradeCounter != 0) {
			// calculate average of all grades entered
			double average = (double) total / gradeCounter;
		
			// output summary of results
			System.out.printf( "Total of the %d grades entered is %d\n",
				gradeCounter, total );
			System.out.printf( "Class average is %.2f\n", average );
			System.out.printf( "%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n",
				"Number of students who received each grade:",
				"A: ", aCount,  // display number of A grades
				"B: ", bCount,  // display number of B grades
				"C: ", cCount,  // display number of C grades
				"D: ", dCount,  // display number of D grades
				"F: ", fCount); // display number of F grades		
		} // end if
		else // no grades were entered, so output appropriate message
			System.out.println( "No grades were entered" );	
	} // end displayGradeReport method
} // end GradeBook class