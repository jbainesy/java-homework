//Bpce.java
//(BasePlusCommissionEmployee)

public class Bpce extends CommissionEmployee {

	private double baseSalary;

	//six argument constructor
	public Bpce( String first, String last, String ssn,
		double sales, double rate, double salary ) {
		
		//explicit call to superclass CommissionEmployee constructor
		super( first, last, ssn, sales, rate );
		
		setBaseSalary( salary ); // validate and store base salary
	}// end constructor
	
	public void setBaseSalary(double salary) {
		baseSalary = (salary < 0.0) ? 0.0 : salary;
	}// end setBaseSalary method
	
	//return base salary
	public double getBaseSalary() {
		return baseSalary;
	}// end getBaseSalary method
	
	//calculate earnings
	public double earnings() {
		return getBaseSalary() + super.earnings() ;
	}// end method earnings
	
	//return String representation of Bpce
	public String toString() {
		return String.format(
			"%s %s\n%s: %.2f", "base-salaried",
			super.toString(), "base salary", getBaseSalary() );
			
	}// end toString method
}// end Bpce class