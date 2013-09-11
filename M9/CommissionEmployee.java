//CommissionEmployee.java

public class CommissionEmployee extends Object {
	
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private double grossSales; // gross weekly sales
	private double commissionRate; // commission percentage
	
	//five argument constructor
	public CommissionEmployee( String first, String last,
		String ssn, double sales, double rate ) {
		
		//implicit call to object constructor occurs here
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
		setGrossSales( sales );
		setCommissionRate( rate );
	} // end constructor
	
	//set first name
	public void setFirstName(String first) {
		firstName = first;
	}// end setFirstName method
	
	//return first name
	public String getFirstName() {
		return firstName;
	}// end getFirstName method
	
	//set last name
	public void setLastName(String last) {
		lastName = last;
	}// end setLastName
	
	//return last name
	public String getLastName() {
		return lastName;
	} // end getLastName
	
	//set social security number
	public void setSocialSecurityNumber(String ssn) {
		socialSecurityNumber = ssn;
	}// end setSocialSecurityNumber method
	
	//return social security number
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}// end getSocialSecurityNumber method
	
	//set gross sales amount
	public void setGrossSales(double sales) {
		grossSales = ( sales < 0.0 ) ? 0.0 : sales;
	}// end setGross Sales
	
	//get gross sales amount
	public double getGrossSales() {
		return grossSales;
	}// end getGrossSales method
	
	//set commission rate
	public void setCommissionRate(double rate) {
		commissionRate = ( rate > 0.0 && rate < 1.0 ) ? rate : 0.0;
	}// end setCommissionRate method
	
	//return commission rate
	public double getCommissionRate() {
		return commissionRate;
	}// end getCommissionRate method
	
	//calculate earnings
	public double earnings() {
		return commissionRate * grossSales;
	}// end earnings method
	
	//return String representation of CommissionEmployee object
	public String toString() {
		return String.format( "%s: %s %s\n%s: %s\n%s %.2f\n%s: %.2f",
			"commission employee", firstName, lastName,
			"social security number", socialSecurityNumber,
			"gross sales", grossSales,
			"commission rate", commissionRate );
	}// end toString method
	
} // end CommissionEmployee class