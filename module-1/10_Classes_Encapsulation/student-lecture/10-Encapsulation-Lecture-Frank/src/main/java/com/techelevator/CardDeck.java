package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
	
	private List<PlayingCard> deck = new ArrayList<PlayingCard>();
	
	public CardDeck() {
		for (int value = 1; value <= 13; value++) {
			for (String suit : new String[] {"Clubs", "Spades", "Hearts", "Diamonds"}) {
				deck.add(new PlayingCard(suit, value));
			}
		}	
	}
	public void ShowDeck() {
		System.out.println("Number of cards in deck: " + deck.size() + "\n");
		for(PlayingCard aCard : deck) {
			System.out.println(aCard);
		}
	}

	
}


