// BasePlusCommissionEmployee.java

public class BasePlusCommissionEmployee extends CommissionEmployee {
	
	private double baseSalary; // base salary per week
	
	//six argument constructor
	public BasePlusCommissionEmployee(String first, String last,
		String ssn, double sales, double rate, double salary ) {
		
		super(first, last, ssn, sales, rate);
		setBaseSalary(salary);
	}// end constructor
	
	public void setBaseSalary(double salary) {
		baseSalary = ( salary < 0.0 ) ? 0.0 : salary; //if non-negative
	}// end method setBaseSalary
	
	//return base salary
	public double getBaseSalary() {
		return baseSalary;
	}// end method getBaseSalary
	
	//calculate earnings; override method in CommissionEmployee
	public double earnings() {
		return getBaseSalary() + super.earnings();
	}// end earnings method
	
	//return string representation
	public String toString() {
		return String.format( "%s %s; %s: $%,.2f",
			"Base-salaried", super.toString(),
			"Base salary", getBaseSalary() );
	}// end toString method
	
}// end BasePlusCommissionEmployee class