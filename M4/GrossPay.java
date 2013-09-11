// Module 4 Programming Practice 1
// Call this GrossPay.java

import java.util.Scanner;

public class GrossPay {

	public static void main(String[] args) {
	
	Scanner input = new Scanner( System.in );
	
	String[] employee = new String[3];
	double[] hours = new double[3];
	double[] rate = new double[3];
	double[] grossPay = new double[3];
	int i = 0;
	
	System.out.print("\n\n");
	
	for(i=0; i < employee.length; i++) {
		System.out.printf("Enter employee %d name: ", i+1);
		employee[i] = input.nextLine();
		System.out.printf("Enter employee %d hours worked: ", i+1);
		hours[i] = input.nextDouble();
		System.out.printf("Enter employee %d rate of pay: ", i+1);
		rate[i] = input.nextDouble();
		input.nextLine();
		if (hours[i] <= 38)
			grossPay[i] = hours[i] * rate[i];
		else
			grossPay[i] = ((38 * rate[i])
			+ (hours[i] - 38) * rate[i] * 1.5);
		System.out.println(); 
	} // end for loop
	
	i = 0;

	for(i=0; i < employee.length; i++) {
		System.out.printf("Employee %d name:         %s\n", i+1, employee[i]);
		System.out.printf("Employee %d hours worked: %.2f\n", i+1, hours[i]);
		System.out.printf("Employee %d rate of pay:  %.2f\n", i+1, rate[i]);
		System.out.printf("Employee %d gross pay:    %.2f\n", i+1, grossPay[i]);
		System.out.println(); 
	} // end for loop
	
	} // end main
} // end GrossPay class
