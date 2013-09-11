/*  Jarred Baines
 *  Module 6 Programming Practice 2
 *  Multiplication game for kids
 *
 *  Call this MultiplicationGame.java
 */

import java.util.Random;
import javax.swing.JOptionPane;

public class MultiplicationGame {
	public static void main(String[] args) {
	
		Random r = new Random();
		boolean exit = false;
		boolean newQuestion = false;
		
		//prompt user for maximum value
		int maxInt = Integer.parseInt(JOptionPane.showInputDialog(
			"Welcome to Jazz's Multiplication Game!\n\n" +
			"What is the maximum number you would like\n" +
			"to use for multiplications in the game?"));
		
		while (exit == false) {
			
			//generate 2 random numbers and their product
			int a = 1 + r.nextInt(maxInt);
			int b = 1 + r.nextInt(maxInt);
			int product = a*b;
			newQuestion = false;
			
			while (newQuestion == false) {
				
				//prompt the user for the product of the two numbers
				int usersAnswer = Integer.parseInt(JOptionPane.showInputDialog(
					"What is " + a + " times " + b + "?"));
				
				//if user is correct
				if (usersAnswer == product) { //display "correct!" with option to play again or exit
					newQuestion = true;
					int n = JOptionPane.showConfirmDialog(null,
						"Correct! Would you like to play again?", 
						"Correct!", 
						JOptionPane.YES_NO_OPTION); 
					exit = (n == JOptionPane.YES_OPTION)?false:true;
				
				//if user is incorrect
				} else {//display "incorrect" with option to try again, new question or exit
					Object[] options = {"Try again", "New question", "Exit"};
					int n = JOptionPane.showOptionDialog(null,
						"Incorrect, would you like to try again?",
						"Incorrect",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null,
						options,
						options[2]);
					// Try again
					// (n == JOptionPane.YES_OPTION)
					// New Question
					newQuestion = (n == JOptionPane.NO_OPTION)?true:false;
					// Exit
					exit = (n == JOptionPane.CANCEL_OPTION)?true:false;
					
				} // end loop - start a new question
			}
		} // end loop - exit has been pressed
	
	} // end main

} // end MultiplicationGame.java