//Invoice.java
//Invoice class implements Payable

public class Invoice implements Payable {
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;
	
	// four argument constructor
	public Invoice( String part, String description, int count,
		double price ) {
		partNumber = part;
		partDescription = description;
		setQuantity( count ); // validate and store quantity
		setPricePerItem( price ); // validate and store price per item
	} // end Invoice constructor
	
	// set part number
	public void setPartNumber( String part ) {
		partNumber = part;
	} // end method setPartNumber
	
	// get part number
	public String getPartNumber() {
		return partNumber;
	}// end method getPartNumber
	
	//set description
	public void setDescription( String description ) {
		partDescription = description;
	}// end method setDescription
	
	//get description
	public String getDescription() {
		return partDescription;
	}// end method get description
	
	//set quantity
	public void setQuantity( int count ) {
		quantity = ( count < 0 ) ? 0 : count; //quantity cannot be negative
	}// end method setQuantity
	
	//get quantity
	public int getQuantity() {
		return quantity;
	}// end method getQuantity
	
	//set price per item
	public void setPricePerItem( double price ) {
		pricePerItem = ( price < 0.0 ) ? 0.0 : price; // validate price
	}// end method setPricePerItem
	
	//get price per item
	public double getPricePerItem() {
		return pricePerItem;
	}// end method getPricePerItem
	
	//return string representation of Invoice object
	public String toString() {
		return String.format( "%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f",
			"invoice", "part number", getPartNumber(), getDescription(),
			"quantity", getQuantity(), "price per item", getPricePerItem() );
	}// end toString method
	
	//method required to carry out contract with interface Payable
	public double getPaymentAmount() {
		return getQuantity() * getPricePerItem(); // calculate total cost
	}// end method getPaymentAmount
	
} // end Invoice class