// M5PP1
// Call this file MailOrderProcessor.java
import javax.swing.JOptionPane;
public class MailOrderProcessor {

	public static void main(String[] args) {
		double price[] = { 2.98, 4.50, 9.98, 4.49, 6.87 };
		int productNo = 0; // to take users choice	
		int quantity = 0; // to take users choice
		int[] count = new int[5];
		
		while (productNo != -1) {
			
			//obtain users input
			productNo = Integer.parseInt(JOptionPane.showInputDialog(
				"Please enter a product number between\n" +
				"1 and 5 to choose a product or enter\n" +
				"-1 to finish."));
			if (productNo != -1) // skip this if user has selected to exit
				quantity = Integer.parseInt(JOptionPane.showInputDialog(
					"Please enter a quantity or -1\n" +
					"once again to finish"));

			switch ( productNo ) {
				case 1:
					count[0] += quantity;
					break;
				case 2:
					count[1] += quantity;
					break;
				case 3:
					count[2] += quantity;
					break;
				case 4:
					count[3] += quantity;
					break;
				case 5:
					count[4] += quantity;
					break;
				case -1:
					double grandTotal = price[0] * count[0] +
						price[1] * count[1] + price[2] * count[2] +
						price[3] * count[3] + price[4] * count[4];
					String output = String.format(
					"ProductNo. |Price ea |Quantity |Total\n" +     
					"         1 |%9.2f|%9d|%8.2f\n" +
					"         2 |%9.2f|%9d|%8.2f\n" +
					"         3 |%9.2f|%9d|%8.2f\n" +
					"         4 |%9.2f|%9d|%8.2f\n" +
					"         5 |%9.2f|%9d|%8.2f\n" +
					"                    Grand Total|%8.2f \n",
					price[0], count[0], (price[0] * count[0]), 
					price[1], count[1], (price[1] * count[1]),
					price[2], count[2], (price[2] * count[2]),
					price[3], count[3], (price[3] * count[3]),
					price[4], count[4], (price[4] * count[4]),
					grandTotal);
					
					JOptionPane.showMessageDialog(null, output);
					break;
				default:
					break;
			} // end switch
		} // end while

	} // end main
} // end MailOrderProcessor class

/*

}


*/
