// Gradebook Class
// Module 4

import java.util.Scanner;

public class GradeBook {

	private String courseName;

	// Constructor, initializes the Gradebook
	
	public GradeBook(String name) {
		courseName = name;
	} // end constructor Gradebook

	// Method to set courseName
	
	public void setCourseName(String name) {
		courseName = name;
	} // end method setCourseName
	
	// Method to get courseName
	
	public String getCourseName() {
		return courseName;
	} // end method getCourseName

	// Method to display welcome message
	
	public void displayMessage() {
		System.out.printf("Welcome to the gradebook for: %s!\n\n", getCourseName());
	} // end method displayMessage

	public void determineClassAverage() {
		
		// create Scanner to get user input
		Scanner input = new Scanner(System.in);
		
		int total; // sum of grades entered
		int gradeCounter; // number of the grade to be entered next
		int grade;
		double average; // average of grades
		
		// initialize
		total = 0;
		gradeCounter = 0;
		
		// process
		System.out.print("Enter grade or -1 to quit: ");
		grade = input.nextInt();
		
		while( grade != -1 ) {
			total += grade;
			gradeCounter++;
			System.out.print("Enter grade or -1 to quit: ");
			grade = input.nextInt();
		} // end while
		
		if(gradeCounter != 0) {
			average = (double) total / gradeCounter;
		
			// display total and average of grades
			System.out.printf("\nTotal of all %d grades is %d\n", gradeCounter, total);
			System.out.printf("Class average is %.2f\n", average);
		} // end if
		else // executes if no grades were entered
			System.out.println("No grades were entered");
	} // end determineClassAverage method
	
} // end class Gradebook
