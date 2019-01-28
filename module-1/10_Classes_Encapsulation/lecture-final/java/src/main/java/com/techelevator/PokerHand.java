
package com.techelevator;

import com.techelevator.PlayingCard.CardValue;

public class PokerHand  extends CardHand {
	public final int NUMBERCARDSINHAND = 5;

	public static enum PokerHandRanking {
		NOTRANKED, HIGHCARD, PAIR, TWOPAIR, THREEOFAKIND, STRAIGHT, FLUSH, FULLHOUSE, FOUROFAKIND, STRAIGHTFLUSH, ROYALSTRAIGHTFLUSH
	};

	private PokerHandRanking handRank;

	public PokerHandRanking gethandRank() {
		return handRank;
	}

	public PokerHand() {
	//	aHand = new CardHand(NUMBERCARDSINHAND);
		handRank = PokerHandRanking.NOTRANKED;
	}

	public void clearHand() {
		super.emptyHand();
	}

	public void show() {
		super.show();
	}
	public void dealHand(CardDeck aDeck) {
		for (int i=0; i < NUMBERCARDSINHAND; i++ ) {
			super.aHand.add(aDeck.dealCard());
		}			
	}
		
	private boolean hasOnePair() {
		for (int i = 0; i < NUMBERCARDSINHAND - 1; i++) {
			PlayingCard currentCard = new PlayingCard();
			currentCard = getHand().get(i);
			if (currentCard.getValue() == getHand().get(i + 1).getValue()) {
				return true;
			}
		}
		return false;
	}

	private boolean hasTwoPair() {
		for (int i = 0; i < NUMBERCARDSINHAND - 1; i++) {
			PlayingCard currentCard = new PlayingCard();
			currentCard = getHand().get(i);
			if ((currentCard.getValue() == getHand().get(i + 1).getValue())) {
				for (int j = i + 2; j < NUMBERCARDSINHAND - 1; j++) {
					currentCard = getHand().get(j);
					if ((currentCard.getValue() == getHand().get(j + 1).getValue())) {
						return true;
					}
				}
			}
		}
		return false;
	}

	private boolean hasThreeOfAKind() {
		for (int i = 0; i < NUMBERCARDSINHAND - 2; i++) {
			PlayingCard currentCard = new PlayingCard();
			currentCard = getHand().get(i);
			if ((currentCard.getValue() == getHand().get(i + 1).getValue())
					&& (currentCard.getValue() == getHand().get(i + 2).getValue())) {
				return true;
			}
		}
		return false;
	}

	private boolean hasFourOfAKind() {
		for (int i = 0; i < NUMBERCARDSINHAND - 3; i++) {
			PlayingCard currentCard = new PlayingCard();
			currentCard = getHand().get(i);
			if ((currentCard.getValue() == getHand().get(i + 1).getValue())
					&& (currentCard.getValue() == getHand().get(i + 2).getValue())
					&& (currentCard.getValue() == getHand().get(i + 3).getValue())) {
				return true;
			}
		}
		return false;
	}

	private boolean hasFlush() {
		if ((getHand().get(0).getSuit() == getHand().get(1).getSuit())
				&& (getHand().get(0).getSuit() == getHand().get(2).getSuit())
				&& (getHand().get(0).getSuit() == getHand().get(3).getSuit())
				&& (getHand().get(0).getSuit() == getHand().get(4).getSuit())) {
			return true;
		}
		else
			return false;
	}

	private boolean hasStraight() {
		if ((getHand().get(1).getIntValue()) == ((getHand().get(0).getIntValue())+1)
		 && (getHand().get(2).getIntValue()  == ((getHand().get(1).getIntValue())+1)
		 && (getHand().get(3).getIntValue()  == ((getHand().get(2).getIntValue())+1)
		 && (getHand().get(3).getIntValue()  == ((getHand().get(4).getIntValue())+1))))) {
			return true;
		}
		else
			return false;
	}
	
	public PokerHandRanking rankHand() {
		this.sortByValue();
		
		handRank = PokerHandRanking.HIGHCARD;
		
		if (hasFourOfAKind()) {
				handRank = PokerHandRanking.FOUROFAKIND;
		}
		else if (hasThreeOfAKind()) {
				if (hasOnePair()) {
					handRank = PokerHandRanking.FULLHOUSE;
				}
				else handRank = PokerHandRanking.THREEOFAKIND;
				}			
			else if (hasTwoPair()) {
				handRank = PokerHandRanking.TWOPAIR;
		}
				else if (hasOnePair()) {
					if (hasThreeOfAKind()) {
			    	handRank = PokerHandRanking.FULLHOUSE;
					}
					else handRank = PokerHandRanking.PAIR;
		}
		
		if (hasFlush()) {
			handRank = PokerHandRanking.FLUSH;
		}
		
		if (hasStraight()) {
			handRank = PokerHandRanking.STRAIGHT;
		}
		return handRank;
	}
}
