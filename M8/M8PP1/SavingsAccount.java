// SavingsAccount.java

//IMPORTS

//CLASS DECLARATION
public class SavingsAccount {

	//FIELDS
	private static double annualInterestRate;
	private double savingsBalance;
	
	//CONSTRUCTOR
	public SavingsAccount(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}// end constructor
	
	//SET METHODS
	public static void modifyInterestRate(double newRate) {
		annualInterestRate = newRate;
	}// end modifyInterestRate method

	//GET METHODS
	public double calculateMonthlyInterest() {
		double thisMonthInterest = ((annualInterestRate * savingsBalance) / 12);
		savingsBalance += thisMonthInterest;
		return thisMonthInterest;
	}// end calculateMonthlyInterest method
	
	public String toString() {
	return String.format("account balance is: %.2f", savingsBalance);
	}
}// end SavingsAccount class