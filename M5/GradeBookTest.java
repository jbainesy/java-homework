// GradeBookTest.java
// class to test GradeBook

public class GradeBookTest {

	public static void main(String[] args) {
		
		// create GradeBook object and pass coursename to constructor
		GradeBook myGradeBook = new GradeBook(
			"CS101 Introduction to Java Programming" );
		
		myGradeBook.displayMessage(); // display welcome message
		myGradeBook.inputGrades(); // read grades from user
		myGradeBook.displayGradeReport(); // display report
	} // end main

} // end GradeBookTest class