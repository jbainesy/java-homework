// SalariedEmployee class extends Employee

public class SalariedEmployee extends Employee {

	private double weeklySalary;
	
	//four argument constructor
	public SalariedEmployee(String first, String last,
		String ssn, double salary) {
		super(first, last, ssn);
		setWeeklySalary( salary );
	}//end SalariedEmployee constructor
	
	//set salary
	public void setWeeklySalary(double salary) {
		weeklySalary = salary < 0.0 ? 0.0 : salary;
	}//end setWeeklySalary method
	
	//return salary
	public double getWeeklySalary() {
		return weeklySalary;
	}//end getWeeklySalary method
	
	//Calculate earnings; implement interface Payable method
	//that was abstract in superclass Employee
	public double getPaymentAmount() {
		return getWeeklySalary();
	}//end method earnings
	
	//return string representation of a SalariedEmployee object
	// this overrides also
	public String toString() {
		return String.format( "Salaried employee: %s\n%s: $%,.2f",
			super.toString(), "Weekly salary", getWeeklySalary());
	}//end toString
}//end SalariedEmployee class