// GradebookTest Class
// Module 3

//import java.util.Scanner;

public class GradebookTest {
    public static void main(String[] args){

	// Create 2 instances of Gradebook
	Gradebook gradebook1 = new Gradebook("Class 101");
	Gradebook gradebook2 = new Gradebook("Class 102");

        // Display courseName for each Gradebook
        System.out.printf("Gradebook 1 Course Name is: %s\n\n",
		gradebook1.getCourseName());
	System.out.printf("Gradebook 2 Course Name is: %s\n\n",
		gradebook2.getCourseName());

    } // end main method
} // end GradebookTest class
