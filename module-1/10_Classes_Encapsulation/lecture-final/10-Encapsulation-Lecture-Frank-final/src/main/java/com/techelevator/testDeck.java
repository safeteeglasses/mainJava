package com.techelevator;

import java.util.Collections;

public class testDeck {

	public static void main(String[] args) {
		
		CardDeck.howManyDecks();          // Class name may be used to run static methods
		                                  //     even when no objects of the class exist
		
		CardDeck aDeck = new CardDeck();  // Instantiate a CardDeck object
		
		aDeck.howManyDecks();             // Objects of the class may be used to run static methods
		
		System.out.println("# cards in deck: " + aDeck.size());
		
		aDeck.showDeck();                 // Object is the class are required to run non-static methods 
		
		aDeck.shuffle();                  // Object is the class are required to run non-static methods 
		
		aDeck.howManyDecks();             // Objects of the class may be used to run static methods

		CardDeck aDeck2 = new CardDeck(); // Instantiate a CardDeck object
		
		aDeck.howManyDecks();	          // Objects of the class may be used to run static methods
		
		CardDeck aDeck3 = new CardDeck(); 
		CardDeck.howManyDecks();          // Class name may be used to run static methods
		
		
		
		for (int i = 0; i < 5; i++) {     // Deal 5 
			System.out.println("Card #" + i + ": " + aDeck.dealACard());
		}
	}
}
