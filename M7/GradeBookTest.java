//GradeBookTest.java
// Test GradeBook.java

public class GradeBookTest {
	public static void main(String[] args) {
		
		int gradesArray[][] = {{75, 86, 97 }, 
							   {82, 69, 88 },
							   {80, 56, 73 },
							   {80, 37, 36 },
							   {85, 73, 75 },
							   {67, 93, 94 },
							   {57, 85, 100 },
							   {87, 38, 54 },
							   {77, 78, 94 },
							   {96, 90, 100 }};
							   
		GradeBook myGradeBook = new GradeBook(
			"CS101 Introduction to Java Programming", gradesArray );
		myGradeBook.displayMessage();
		myGradeBook.processGrades();
	}
}