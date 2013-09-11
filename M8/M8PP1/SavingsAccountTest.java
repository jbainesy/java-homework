//SavingsAccountTest.java

public class SavingsAccountTest {
	public static void main(String[] args) {
		
		SavingsAccount saver1 = new SavingsAccount(2000.00);
		SavingsAccount saver2 = new SavingsAccount(3000.00);

		System.out.println("\n\nInitial Balance:\n");
		System.out.println("saver1 " + saver1);
		System.out.println("saver2 " + saver2);
		
		SavingsAccount.modifyInterestRate(.04);
		
		double s1Interest = saver1.calculateMonthlyInterest();
		double s2Interest = saver2.calculateMonthlyInterest();
		
		System.out.println("\n\nAfter 1 month of %4 interest:\n");
		System.out.println("saver1 interest is: " + s1Interest);
		System.out.println("saver1 " + saver1);
		System.out.println("saver2 interest is: " + s2Interest);
		System.out.println("saver2 " + saver2);

		SavingsAccount.modifyInterestRate(.05);
		
		s1Interest = saver1.calculateMonthlyInterest();
		s2Interest = saver2.calculateMonthlyInterest();
		
		System.out.println("\n\nAfter second month at %5 interest:\n");
		System.out.println("saver1 interest is: " + s1Interest);
		System.out.println("saver1 " + saver1);
		System.out.println("saver2 interest is: " + s2Interest);
		System.out.println("saver2 " + saver2);
		
	}
}