// Gradebook.java
// Gradebook class using switch to count A, B, C, D and F grades

public class GradeBook {
	
	private String courseName; // name of course this GradeBook represents
	private int grades[][]; // array of student grades
	
	// constructor initializes courseName and grades array
	public GradeBook( String courseName, int grades[][] ) {
		this.courseName = courseName; // initialize courseName
		this.grades = grades; // initialize grades array
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
	
	// Perform various operations on the data
	public void processGrades() {
		
		//output grades array
		outputGrades();
		
		//call methods getMinimum and getMaximum
		System.out.printf( "\n%s %d\n%s %d\n\n",
			"Lowest grade in the GradeBook is ", getMinimum(),
			"Highest grade in the GradeBook is ", getMaximum() );
			
		//call barChart to print grade distribution chart
		barChart();
	} // end processGrades method
	
	// Find the minimum grade
	public int getMinimum() {
		int lowGrade = grades[0][0];
		
		//loop through rows of grades array
		for (int student[] : grades) {
		
			//loop through columns of the current row
			for (int grade : student) {
				//if grade is lower than lowGrade, assign it to lowGrade
				if (grade < lowGrade)
					lowGrade = grade; // new lowest grade
			}//end inner for
		}//end outer for
		
		return lowGrade; // return lowest grade
	} // end getMinimum method
	
	// Find the maximum grade
	public int getMaximum() {
		int highGrade = grades[0][0];
		
		//loop through rows of grades array
		for (int student[] : grades) {
		
			//loop through columns of the current row
			for (int grade : student) {
				//if grade is higher than highGrade, assign it to highGrade
				if (grade > highGrade)
					highGrade = grade; // new highest grade
			}//end inner for
		}//end outer for
		
		return highGrade; // return highest grade
	}// end getMaximum method
	
	// Find the average grade for a particular set of grades
	// (calculate a particular students semester average)
	public double getAverage(int student[]) {
		int total = 0;
		// sum of this students grades
		for (int grade : student)
			total += grade;
		// return average of grades
		return (double) total / student.length;
	}// end getAverage method
	
	// Output a bar chart
	public void barChart() {
		System.out.println("Overall grade distribution:");
		
		//stores frequency of grades in each range of 10 grades
		int frequency[] = new int[11];
		
		//for each grade increment the appropriate frequency
		for (int student[] : grades) {
			for (int grade : student)
				++frequency[grade / 10]; // ie. grades are 1-10, 11-20 etc
		}//end outer for
		
		//for each grade frequency, print bar in chart
		for ( int i = 0; i < frequency.length; i++ ) {
			//output bar label ("00-09:", "10-19:" ... etc)
			if (i == 10)
				System.out.printf( "%5d: ", 100 );
			else
				System.out.printf( "%02d-%02d: ",
					i * 10, i * 10 + 9 );
			
			//print bar of asterisks
			for ( int stars = 0; stars < frequency[i]; stars++ )
				System.out.print("*");
			
			System.out.println(); // start the next line of output
		} // end outer for loop
	}// end barChart method
	
	// Output the contents of the grades array
	public void outputGrades() {
		System.out.println("The grades are:\n");
		System.out.print("            "); // align column heads
		
		//create a column heading for each of the tests
		for ( int test = 0; test < grades[0].length; test++ )
			System.out.printf ("Test %d  ", test + 1);
		
		System.out.println( "Average" ); // student average column heading
		
		//create rows/columns of text representing array grades
		for (int student = 0; student < grades.length; student++) {
			System.out.printf( "Student %2d", student + 1);
		
			for (int test : grades[ student ] ) // output student's grades
				System.out.printf( "%8d", test );
			//call method getAverage to calculate student's average grade;
			//pass row of grades as the argument to getAverage
			double average = getAverage(grades[student]);
			System.out.printf("%9.2f\n", average);
		
		}//end outer for
		
	}//end outputGrades
} // end GradeBook class