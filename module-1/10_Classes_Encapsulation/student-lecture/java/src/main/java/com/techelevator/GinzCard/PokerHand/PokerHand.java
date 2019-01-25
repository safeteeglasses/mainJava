
package PokerHand;

import CardHand.CardHand;
import PlayingCard.PlayingCard;
import PlayingCard.PlayingCard.CardValue;

public class PokerHand extends CardHand {
	public final int NUMBERCARDSINHAND = 5;

	public static enum PokerHandRanking {
		NOTRANKED, HIGHCARD, PAIR, TWOPAIR, THREEOFAKIND, STRAIGHT, FLUSH, FULLHOUSE, FOUROFAKIND, STRAIGHTFLUSH, ROYALSTRAIGHTFLUSH
	};

	private CardHand aPokerHand;
	private PokerHandRanking handRank;
	private CardValue rankCard; // card value from ranking

	public CardValue getRankCard() {
		return rankCard;
	}

	public PokerHand() {
		aPokerHand = new CardHand(NUMBERCARDSINHAND);
		handRank = PokerHandRanking.NOTRANKED;
	}

	public void clearHand() {
		super.emptyHand();
	}

	public void show() {
		super.show();
	}

	private boolean hasOnePair() {
		for (int i = 0; i < NUMBERCARDSINHAND - 1; i++) {
			PlayingCard currentCard = new PlayingCard();
			currentCard = getHand().get(i);
			if (currentCard.getValue() == getHand().get(i + 1).getValue()) {
				rankCard = currentCard.getValue();
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

	private boolean hasFLUSH() {
		if ((getHand().get(0).getSuit() == getHand().get(1).getSuit())
				&& (getHand().get(0).getSuit() == getHand().get(2).getSuit())
				&& (getHand().get(0).getSuit() == getHand().get(3).getSuit())
				&& (getHand().get(0).getSuit() == getHand().get(4).getSuit())) {
			return true;
		}
		else
			return false;
	}

	public PokerHandRanking rankHand() {
		this.sortByValue();
		if (handRank == null) {
			handRank = PokerHandRanking.NOTRANKED;
		}
		if (hasOnePair()) {
			handRank = PokerHandRanking.PAIR;
		}
		if (hasTwoPair()) {
			handRank = PokerHandRanking.TWOPAIR;
		}
		if (hasThreeOfAKind()) {
			handRank = PokerHandRanking.THREEOFAKIND;
		}
		if (hasFourOfAKind()) {
			handRank = PokerHandRanking.FOUROFAKIND;
		}
		// if(hasOnePair()
		// && hasThreeOfAKind()) {
		//    handRank = PokerHandRanking.FULLHOUSE;
		// }
		// if(hasSTRAIGHT())  {
		//    handRank = PokerHandRanking.STRAIGHT;
	    // }

		// this.SortBySuit();
		if (hasFLUSH()) {
			handRank = PokerHandRanking.FLUSH;
		}
		return handRank;
	}
}
