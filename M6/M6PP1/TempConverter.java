// Temperature Converter
// Call this TempConverter.java

import javax.swing.JOptionPane;

public class TempConverter {

	public static void main(String[] args) {
	
		double userAmount;
		double conversion;
		boolean exit;
		
		exit = false;
		Object[] options = {" \u00B0C to \u00B0F ",
			" \u00B0F to \u00B0C ",
			" Exit "};
        //Loop until exit button is clicked
		while (exit == false) {
			int n = JOptionPane.showOptionDialog(null,
				"Which conversion would you like to make?",
				"Temperature Converter",
			JOptionPane.YES_NO_CANCEL_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			null,
			options,
			options[2]);
			
			// if Celsius to Fahrenheit button is clicked
			if (n == JOptionPane.YES_OPTION) {
			
				//promt user for an amount in degrees C
				userAmount = Double.parseDouble(
					JOptionPane.showInputDialog(
						"Please enter an amount in degrees celsius"));
				
				//calculate and display the result
				conversion = celToFh(userAmount);
				String output = userAmount + " degrees celsius = " + 
					conversion + " degrees fahrenheit";
				JOptionPane.showMessageDialog(null, output,
				"Conversion", JOptionPane.INFORMATION_MESSAGE);
					
				//perform another conversion?
				int n2 = JOptionPane.showConfirmDialog(
                    null, "Would you like to perform another conversion?",
                    "Temperature Converter",
                    JOptionPane.YES_NO_OPTION);
                if (n2 == JOptionPane.YES_OPTION) {
                    exit = false;
                } else exit = true;
			
			// if Fahrenheit to Celsius button is clicked
			} else if (n == JOptionPane.NO_OPTION) {
				
				//promt user for an amount in degrees F
				userAmount = Double.parseDouble(
					JOptionPane.showInputDialog(
						"Please enter an amount in degrees fahrenheit"));
				
				//calculate and display the result
				conversion = fhToCel(userAmount);
				JOptionPane.showMessageDialog(null, 
					userAmount + " degrees fahrenheit = " + 
					conversion + " degrees celsius",
				"Conversion", JOptionPane.INFORMATION_MESSAGE);
				
				//perform another conversion?
				int n2 = JOptionPane.showConfirmDialog(
                    null, "Would you like to perform another conversion?",
                    "Temperature Converter",
                    JOptionPane.YES_NO_OPTION);
                if (n2 == JOptionPane.YES_OPTION) {
                    exit = false;
                } else exit = true;
			
			// if Exit button is clicked
			} else exit = true;
		} // end of program
		
		JOptionPane.showMessageDialog(null, "Goodbye!");
	} // end main method
	
	// Convert Celsius to Fahrenheit
	private static double celToFh(double cel) {
		return (9.0 / 5.0 * cel + 32);
	} // end celToFh method
	
	// Convert Fahrenheit to Celcius
	private static double fhToCel(double fh) {
		return (5.0 / 9.0 * (fh - 32));
	} // end celToFh method
	
} // end TempConverter class