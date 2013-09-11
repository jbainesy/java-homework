// HourlyEmployee class extends Employee

public class HourlyEmployee extends Employee {

	private double wage; // wage per hour
	private double hours; // hours worked for week
	
	//four argument constructor
	public HourlyEmployee(String first, String last,
		String ssn, double hourlyWage, double hoursWorked) {
		super(first, last, ssn);
		setWage( hourlyWage );
		setHours( hoursWorked );
	}//end HourlyEmployee constructor
	
	//set wage
	public void setWage(double hourlyWage) {
		wage = ( hourlyWage < 0.0 ) ? 0.0 : hourlyWage;
	}//end setWage method
	
	//set hours
	public void setHours(double hoursWorked) {
		hours = ( ( hoursWorked >= 0.0 ) && ( hoursWorked <= 168 ) ) ? 
			hoursWorked : 0.0;
	}//end setHours method
	
	//return wage
	public double getWage() {
		return wage;
	}//end getWage method
	
	//return hours
	public double getHours() {
		return hours;
	}//end getHours method
	
	//override abstract method earnings in Employee
	public double earnings() {
		double earnt = ( getHours() <= 40.0 ) ?
			(getHours() * getWage()) : (getWage() * 40) + ((getHours() - 40) * getWage() * 1.5);
		return earnt;
	}//end method earnings
	
	//return string representation of a HourlyEmployee object
	// this overrides also
	public String toString() {
		return String.format( "Hourly employee: %s\n%s: $%,.2f; %s: %,.2f",
			super.toString(), "Hourly wage", getWage(),
			"Hours worked", getHours() );
	}//end toString
}//end HourlyEmployee class