// Gradebook Class
// Module 3

public class Gradebook {
	// Constructor, initializes the Gradebook
	public Gradebook(String name) {
		courseName = name;
	} // end constructor Gradebook

	private String courseName;
	

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
		System.out.printf("Welcome to the gradebook for: %s!\n", getCourseName());
	} // end method displayMessage

} // end class Gradebook
