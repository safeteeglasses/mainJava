package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

import com.techelevator.PlayingCard.CardSuit;
import com.techelevator.PlayingCard.CardValue;


public class CardDeck {
	LinkedList<PlayingCard> deckOfCards = new LinkedList<PlayingCard>();
	private int numCardsInDeck = 54;

	public CardDeck() {
		resetDeck(true); // reset deck with jokers
	}

	public void showDeck() {
		System.out.println("Number of Cards in Deck: " + deckOfCards.size());
		for (PlayingCard aCard : deckOfCards) {
			aCard.showCardWithHash();
		}
	}

	public boolean anyCardsInDeck() {
		if (deckOfCards.size() > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	public PlayingCard dealCard() {
		if (deckOfCards.size() > 0) {
			return deckOfCards.remove();
		}
		else {
			 return null;
		}
	}

	public void resetDeck(boolean withJoker) {
		deckOfCards.clear();

		for (int i = 1; i < 14; i++) {
			deckOfCards.add(new PlayingCard(i, PlayingCard.CardSuit.CLUB));
		}
		for (int i = 1; i < 14; i++) {
			deckOfCards.add(new PlayingCard(i, PlayingCard.CardSuit.HEART));
		}
		for (int i = 1; i < 14; i++) {
			deckOfCards.add(new PlayingCard(i, PlayingCard.CardSuit.SPADE));
		}
		for (int i = 1; i < 14; i++) {
			deckOfCards.add(new PlayingCard(i, PlayingCard.CardSuit.DIAMOND));
		}

		if (withJoker) {
			deckOfCards.add(new PlayingCard(CardValue.JOKER, CardSuit.JOKER));
			deckOfCards.add(new PlayingCard(CardValue.JOKER, CardSuit.JOKER));
		}
	}

	public void shuffleDeck() {
		resetDeck(false);
		Collections.shuffle(deckOfCards);
	}

	public int removeJokers() {
		ArrayList<PlayingCard> aJoker = new ArrayList<PlayingCard>();
		aJoker.add(new PlayingCard(CardValue.JOKER, CardSuit.JOKER));
		int numCardsBefore = deckOfCards.size();
		deckOfCards.removeAll(aJoker);
		return numCardsBefore - deckOfCards.size();
	}
}