// DeckOfCards.java
// Represents a deck of 52 playing cards

import java.util.Random;

public class DeckOfCards {
	
	private Card deck[]; // array of Card objects
	private int currentCard; // index of next Card to be dealt
	private final int NUMBER_OF_CARDS = 52; // constant number of cards in the deck
	private Random random; // random number generator

	//Constructor fills deck of Cards
	public DeckOfCards() {
		
		String faces[] = { "Ace", "Two", "Three", "Four", "Five", "Six",
			"Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
		String suits[] = { "Hearts", "Diamonds", "Clubs", "Spades" };
		
		deck = new Card[ NUMBER_OF_CARDS ]; // create space for the Card objects
		currentCard = 0;
		random = new Random();
		
		//populate deck with Card Objects
		for ( int count = 0; count < deck.length; count++ )
			deck[ count ] =
				new Card( faces[ count % 13 ], suits[ count / 13 ] );
	} // end DeckOfCard constructor
	
	//Shuffle the deck with a 1-pass algorithm
	public void shuffle() {
		
		//after shuffling dealing should start at index[0] again
		currentCard = 0;
		
		//for each Card, pick another random card and swap them
		for (int first = 0; first < deck.length; first++) {
			
			//select a random number between 0 and 51
			int second = random.nextInt( NUMBER_OF_CARDS );
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		} //end for
	} // end Shuffle Method
	
	//Deal one card
	public Card dealCard() {
		//determine weather there are still cards in the pack
		if (currentCard < deck.length)
			return deck[currentCard++]; // return current card, THEN increment it
		else
			return null; // return null to indicate that all cards were dealt
	} // end dealCard method
	
}// end DeckOfCards class