// CommissionEmployee class extends Employee

public class CommissionEmployee extends Employee {

	private double grossSales; // gross weekly sales
	private double commissionRate; // commission percentage
	
	//five argument constructor
	public CommissionEmployee(String first, String last,
		String ssn, double sales, double rate) {
		super(first, last, ssn);
		setGrossSales( sales );
		setCommissionRate( rate );
	}//end CommissionEmployee constructor
	
	//set commission rate
	public void setCommissionRate(double rate) {
		commissionRate = ( rate > 0.0 && rate < 1.0 ) ? rate : 0.0;
	}//end setCommissionRate method
	
	//set gross sales
	public void setGrossSales(double sales) {
		grossSales = ( ( sales >= 0.0 ) ) ? 
			sales : 0.0;
	}//end setGrossSales method
	
	//return commission rate
	public double getCommissionRate() {
		return commissionRate;
	}//end getCommissionRate method
	
	//return Gross Sales
	public double getGrossSales() {
		return grossSales;
	}//end getGrossSales method
	
	//override abstract method earnings in Employee
	public double earnings() {
		return getCommissionRate() * getGrossSales();
	}//end method earnings
	
	//return string representation of a CommissionEmployee object
	// this overrides also
	public String toString() {
		return String.format( "%s: %s\n%s: $%,.2f; %s: %,.2f",
			"Commission employee", super.toString(),
			"Gross sales", getGrossSales(),
			"Commission rate", getCommissionRate() );
	}//end toString
}//end CommissionEmployee class