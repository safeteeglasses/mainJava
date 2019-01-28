package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDeck {

	// class variables - identified by static keyword - static = only one
	//                   only one regardless of the number of objects
	//                   all objects share the one copy
	
	private static 	int numberOfDecks = 0;
	
	
	// instance variables - one copy for each instance of an object
	
	private List<PlayingCard> deck = new ArrayList<PlayingCard>();  // Hold cards in the deck
   

	// methods
	
	public CardDeck() {   // Default ctor - instantiate a standard deck with no jokers
		for (int value = 1; value <= 13; value++) {
			for (String suit : new String[] {"Clubs", "Spades", "Hearts", "Diamonds"}) {
				deck.add(new PlayingCard(suit, value));
			}
		}
		numberOfDecks++;  // Count the new deck
	}
	
	public static void howManyDecks() {  // static method allows the method to run without an object
		                                 //  allows the class name to be used to run method
		System.out.println("# of Decks is: " + numberOfDecks);
	}
	
	public void showDeck() {  // Display the contents of a deck
		System.out.println("Number of cards in deck: " + deck.size() + "\n");
		for(PlayingCard aCard : deck) {
			System.out.println(aCard);
		}
	}
	public int size() {      // return the current number of cards in a deck
		return deck.size();
	}
	
	public PlayingCard dealACard() {  // return the first card in a deck
		return deck.remove(0);
	}
	
	
	public void shuffle()    // shuffle the deck
	{
		Collections.shuffle(deck);  // invoke the Collection class shuffle method which randomizes the data in a Collection
	}
}


