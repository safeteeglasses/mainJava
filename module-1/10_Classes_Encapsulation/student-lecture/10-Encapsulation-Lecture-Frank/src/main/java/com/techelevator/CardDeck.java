package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDeck {
	
	private List<PlayingCard> deck = new ArrayList<PlayingCard>();
	
	private static int numberOfDecks = 0;
	
	public CardDeck() { //Default Constructor (ctor) 
		for (int value = 1; value <= 13; value++) {
			for (String suit : new String[] {"Clubs", "Spades", "Hearts", "Diamonds"}) {
				deck.add(new PlayingCard(suit, value));
			}
		}	
		numberOfDecks++;
	}
	public static void howManyDecks() {
		System.out.println(" # of Decks is: " + numberOfDecks);
	}

	public void ShowDeck() {
		System.out.println("Number of cards in deck: " + deck.size() + "\n");
		for(PlayingCard aCard : deck) {
			System.out.println(aCard);
			
		}
	}
	public int size() {
		return deck.size();
	}
	
	public void Shuffle() {
		Collections.shuffle(deck);
	}
	
}


