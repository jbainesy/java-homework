// AccountTest class
// Module 3

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {

		double depositAmount;
		double debitAmount;

		// Create Scanner and 2 Account objects
		Scanner input = new Scanner(System.in);
		Account account1 = new Account(2500.00);
		Account account2 = new Account(105.00);

		// Display initial account values
		System.out.printf("account1 balance: $%.2f\n", account1.getBalance());
		System.out.printf("account2 balance: $%.2f\n", account2.getBalance());

		// Add to Account 1
		System.out.print("\nEnter deposit amound for account1: ");
		depositAmount = input.nextDouble();
		System.out.printf("\nAdding %.2f to account1 balance\n\n", depositAmount);
		account1.credit(depositAmount);
		
		// Display account values
		System.out.printf("account1 balance: $%.2f\n", account1.getBalance());
		System.out.printf("account2 balance: $%.2f\n", account2.getBalance());

		// Add to Account 2
		System.out.print("\nEnter deposit amound for account2: ");
		depositAmount = input.nextDouble();
		System.out.printf("\nAdding %.2f to account2 balance\n\n", depositAmount);
		account2.credit(depositAmount);
		
		// Display account values
		System.out.printf("account1 balance: $%.2f\n", account1.getBalance());
		System.out.printf("account2 balance: $%.2f\n", account2.getBalance());

		// Debit account 2
		System.out.print("\nEnter debit amound for account2: ");
		debitAmount = input.nextDouble();
		System.out.printf("\nSubtracting %.2f from account2 balance\n\n", debitAmount);
		account2.debit(debitAmount);
		
		// Display account values
		System.out.printf("account1 balance: $%.2f\n", account1.getBalance());
		System.out.printf("account2 balance: $%.2f\n", account2.getBalance());
		
	} // end main method

} // end AccountTest class
