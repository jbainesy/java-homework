// Module 2 Programming Practice 1
// Call this file M2PP1.java

import java.util.Scanner;

public class M2PP1 {
	public static void main(String[] args){

		int a, b;
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter first integer: ");
		a = input.nextInt();

		System.out.print("Please enter second integer: ");
		b = input.nextInt();
		System.out.println();
		System.out.println("a + b = " + (a+b));
		System.out.println("a - b = " + (a-b));
		System.out.println("a * b = " + (a*b));
		System.out.println("a / b = " + (a/b));

	} // end main method
} // end M2PP1 class
