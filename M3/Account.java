// Account class
// Module 3

public class Account {
	
	private double balance;

	public Account(double initialBalance) {
		if (initialBalance >= 0.0)
			balance = initialBalance;
	} //end Account constructor

	public void credit(double amount) {
		balance = balance + amount;
	} // end credit method

	public void debit(double amount) {
		balance = balance + amount;
	} // end debit method

	public double getBalance() {
		return balance;
	}

} // end Account class

