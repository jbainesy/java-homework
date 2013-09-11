// Employee abstract superclass
// implements Payable

public abstract class Employee implements Payable {
	
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	
	//three argument constructor
	public Employee(String firstName, 
		String lastName, String socialSecurityNumber) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}// end Employee constructor
	
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}// end setFirstName method
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}// end setLastName method
	
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}// end setSocialSecurityNumber method
	
	
	public String getFirstName() {
		return firstName;
	}// end getFirstName method
	
	public String getLastName() {
		return lastName;
	}// end getLastName method
	
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}// end getSocialSecurityNumber method
	
	
	public String toString() {
		return String.format("%s %s\nsocial security number: %s",
			getFirstName(), getLastName(), getSocialSecurityNumber());
	}// end toString method
	
	// abstract method overridden by subclasses
	//public abstract double earnings(); // no implementation here
	//NOTE: We are not implementing payable method getPaymentAmount here
	//as this is an abstract class and it will be implemented in the subclasses
	
}// end Employee abstract class