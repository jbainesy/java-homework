// DeckOfCardsTest.java
// Demonstrates card shuffling and dealing

public class DeckOfCardsTest {

	public static void main(String[] args) {
		DeckOfCards myDeck = new DeckOfCards();
		myDeck.shuffle(); // place cards in random order
		
		// print all 52 cards in the order in which they are dealt
		for (int i = 0; i < 13; i++) {
			//deal and print 4 cards
			System.out.printf( "%-20s%-20s%-20s%-20s\n",
				myDeck.dealCard(), myDeck.dealCard(),
				myDeck.dealCard(), myDeck.dealCard() );
		}//end for
	}//end main
}//end DeckOfCardsTest