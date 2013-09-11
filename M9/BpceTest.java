//BpceTest.java


public class BpceTest {
	public static void main(String args[]){
		
		//instantiate Bpce object
		Bpce employee = new Bpce(
			"Sue", "Jones", "222-22-2222", 10000, .06, 300 );
		
		// get commission employee data
		System.out.println(
			"Employee information obtained by get methods: \n" );
		System.out.printf( "%s %s\n", "First name is",
			employee.getFirstName() );
		System.out.printf( "%s %s\n", "Last name is",
			employee.getLastName() );
		System.out.printf( "%s %s\n", "Social security number is",
			employee.getSocialSecurityNumber() );
		System.out.printf( "%s %.2f\n", "Gross sales is",
			employee.getGrossSales() );
		System.out.printf( "%s %.2f\n", "Commission rate is",
			employee.getCommissionRate() );
		System.out.printf( "%s %.2f\n", "Base salary is",
			employee.getBaseSalary() );
		
		employee.setGrossSales( 500 ); // set gross sales
		employee.setCommissionRate( .1 ); // set commission rate
		employee.setBaseSalary(1000);
		
		System.out.printf( "\n%s:\n\n%s\n",
			"Updated employee information obtained by toString", employee );
	} // end main method
} // end CommissionEmployeeTest class