// class to test Invoice.java
// call this InvoiceTest.java

class InvoiceTest {

	public static void main(String[] args) {
		
		Invoice invoice1 = new Invoice();
		Invoice invoice2 = new Invoice();
		Invoice invoice3 = new Invoice();
		Invoice invoice4 = new Invoice(
			"00004321",
			"Hammer",
			1,
			45.00);
			
		invoice1.setPartNumber("10007890");
		invoice1.setPartDesc("9 Inch Nails");
		invoice1.setQuantity(250);
		invoice1.setPrice(0.20);
		
		invoice2.setPartNumber("10007891");
		invoice2.setPartDesc("6 Inch Nails");
		invoice2.setQuantity(-50);
		invoice2.setPrice(0.18);
		
		invoice3.setPartNumber("10007892");
		invoice3.setPartDesc("3 Inch Nails");
		invoice3.setQuantity(200);
		invoice3.setPrice(-0.15);
		
		System.out.printf(
			"partNumber: %s\npartDesc:   %s\nquantity:   %d\nprice:      %.2f\n\nTotal:      %.2f\n\n",
			invoice1.getPartNumber(),
			invoice1.getPartDesc(),
			invoice1.getQuantity(),
			invoice1.getPrice(),
			invoice1.getInvoiceAmount());
		
		System.out.printf(
			"partNumber: %s\npartDesc:   %s\nquantity:   %d\nprice:      %.2f\n\nTotal:      %.2f\n\n",
			invoice2.getPartNumber(),
			invoice2.getPartDesc(),
			invoice2.getQuantity(),
			invoice2.getPrice(),
			invoice2.getInvoiceAmount());
			
		System.out.printf(
			"partNumber: %s\npartDesc:   %s\nquantity:   %d\nprice:      %.2f\n\nTotal:      %.2f\n\n",
			invoice3.getPartNumber(),
			invoice3.getPartDesc(),
			invoice3.getQuantity(),
			invoice3.getPrice(),
			invoice3.getInvoiceAmount());
			
		System.out.printf(
			"partNumber: %s\npartDesc:   %s\nquantity:   %d\nprice:      %.2f\n\nTotal:      %.2f\n\n", 
			invoice4.getPartNumber(),
			invoice4.getPartDesc(),
			invoice4.getQuantity(),
			invoice4.getPrice(),
			invoice4.getInvoiceAmount());
	} // end main

} // end InvoiceTest class
