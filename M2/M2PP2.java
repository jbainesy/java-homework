// Module 2 Programming Practice 1
// Call this file M2PP1.java

import java.util.Scanner;

public class M2PP2 {
	public static void main(String[] args){

		int a, b;
		Scanner input = new Scanner(System.in);

		System.out.println(
			"Give me 2 numbers and I will tell you which is larger!\n");
		System.out.print("Please enter first integer: ");
		a = input.nextInt();

		System.out.print("Please enter second integer: ");
		b = input.nextInt();
		
		System.out.println();
		if ( a > b)
			System.out.println("The first integer is larger by " + (a - b));
		else if ( a < b)
			System.out.println("The second integer is larger by " + (b - a));
		else if ( a == b)
			System.out.println("These numbers are equal");

	
	} // end main method
} // end M2PP1 class
