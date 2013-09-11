// Module 3 Programming Practice 3
// Call this file Invoice.java

public class Invoice {

	private String partNumber, partDesc;
	private int quantity;
	private double price;
	
	Invoice() {
		// default constructor, does no processing
	}
	
	// Constructor, initializes all instance variables
	Invoice(String partNumber,
			String partDesc,
			int quantity,
			double price) {
		
		this.partNumber = partNumber;
		this.partDesc = partDesc;
		this.quantity = quantity;
		this.price = price;
	} // end Invoice constructor
	
	// Set methods for each variable
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	} // end SetPartNumber set method

	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	} // end setPartDesc method

	public void setQuantity(int quantity) {
	if (quantity < 0)
		this.quantity = 0;
	else
		this.quantity = quantity;
	} // end setQuantity method

	public void setPrice(double price) {
		if (price < 0.0)
			this.price = 0;
		else
			this.price = price;
	} // end setPrice method

	// Get methods for each variable
	public String getPartNumber() {
		return partNumber;
	} // end getPartNumber method

	public String getPartDesc() {
		return partDesc;
	} // end getPartDesc method

	public int getQuantity() {
		return quantity;
	} // end getQuantity method

	public double getPrice() {
		return price;
	} // end getPrice method

	public double getInvoiceAmount() {
		return (quantity * price);
	} // end getInvoiceAmount method
	
} // end Invoice class
