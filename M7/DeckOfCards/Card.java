// Card.java
// Represents a playing card

public class Card {

	private String face; // 'number' of card (1-10, J, Q, K, ...)
	private String suit; // suit of card (Hearts, Diamonds, ...)
	
	//Constructor, initializes face and suit
	public Card(String face, String suit) {
		this.face = face; //initialize face of card
		this.suit = suit; //initialize suit of card
	}// end Card Constructor
	
	//return String representation of this card
	public String toString() {
		return face + " of " + suit;
	}//end toString method
	
}// end Card class