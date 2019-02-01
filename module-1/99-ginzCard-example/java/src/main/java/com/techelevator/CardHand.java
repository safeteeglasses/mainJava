package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CardHand {

	int       numCardsInHand;
	protected ArrayList<PlayingCard> aHand;
	
	public CardHand() {
		numCardsInHand = 5;
		aHand = new ArrayList<PlayingCard>(numCardsInHand);
	}

	public CardHand(int numCards) {
		numCardsInHand = numCards;
		aHand = new ArrayList<PlayingCard>(numCardsInHand);
	}

	public ArrayList<PlayingCard> getHand() {
		return aHand;
	}

	public void addCard(PlayingCard aCard) {
		aHand.add(aCard);
	}

	public void emptyHand() {
		aHand.clear();
	}

	public void show() {
		for (PlayingCard aCard : aHand)
		{
			System.out.println(aCard);
		}
			return;
	}

	public void sortByValue() {
		Collections.sort(aHand, new valueSort());
	}

	public void sortByColor() {
		Collections.sort(aHand, new colorSort());
	}

	public void sortBySuit() {
		Collections.sort(aHand, new suitSort());
	}

	public class valueSort implements Comparator<PlayingCard> {
		public int compare(PlayingCard Card1, PlayingCard Card2) {
			return Card1.getIntValue() - Card2.getIntValue();
		}
	}

	public class suitSort implements Comparator<PlayingCard> {
		public int compare(PlayingCard Card1, PlayingCard Card2) {
			return Card1.getSuit().ordinal() - Card2.getSuit().ordinal();
		}
	}

	public class colorSort implements Comparator<PlayingCard> {
		public int compare(PlayingCard Card1, PlayingCard Card2) {
			return Card1.getColor().ordinal() - Card2.getColor().ordinal();
		}
	}
}
