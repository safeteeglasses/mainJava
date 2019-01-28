package com.techelevator;

public class PlayingCard {
	public static enum CardColor { 
		BLACK, RED
	};

	public static enum CardSuit {
		SPADE, CLUB, HEART, DIAMOND, JOKER
	};

	public static enum CardValue {
		JOKER, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
	};

	protected static final CardValue DEFAULTCARDVALUE = CardValue.JOKER;
	protected static final CardColor DEFAULTCOLOR     = CardColor.BLACK;
	protected static final CardSuit  DEFAULTSUIT      = CardSuit.JOKER;

	protected CardValue value;
	protected CardColor color;
	protected CardSuit suit;

	public PlayingCard() 
	{
		value = DEFAULTCARDVALUE;
		suit = DEFAULTSUIT;
		setColor(suit);
	} // End of PlayingCard()

	public PlayingCard(CardValue value, CardSuit suit) {
		this.value = value;
		setColor(suit);
		this.suit = suit;
	}

	public PlayingCard(int value, CardSuit suit) {
		this.value = setValue(value);
		setColor(suit);
		this.suit = suit;
	}

	public CardValue getValue() {
		return value;
	}

	public int getIntValue() {
		return value.ordinal();
	}

	public CardValue setValue(int ivalue) {
		switch (ivalue) {
		case 1:
			return CardValue.ONE;
		case 2:
			return CardValue.TWO;
		case 3:
			return CardValue.THREE;
		case 4:
			return CardValue.FOUR;
		case 5:
			return CardValue.FIVE;
		case 6:
			return CardValue.SIX;
		case 7:
			return CardValue.SEVEN;
		case 8:
			return CardValue.EIGHT;
		case 9:
			return CardValue.NINE;
		case 10:
			return CardValue.TEN;
		case 11:
			return CardValue.JACK;
		case 12:
			return CardValue.QUEEN;
		case 13:
			return CardValue.KING;
		default:
			return CardValue.JOKER;
		}
	}

	public CardColor getColor() {
		return color;
	}

	private void setColor(CardSuit suit) {
		switch (suit) {
		case SPADE:
		case CLUB:
			this.color = CardColor.BLACK;
			break;
		case DIAMOND:
		case HEART:
			this.color = CardColor.RED;
			break;
		default:
			this.color = DEFAULTCOLOR;
		}
	}

	public CardSuit getSuit() {
		return suit;
	}

	public void setSuit(CardSuit suit) {
		this.suit = suit;
	}

	public String toString() {
		StringBuffer stringCard = new StringBuffer();

		int firstColumnSize = 16;

		stringCard.append("Value: " + value);
		stringCard.append(" (" + getIntValue() + ")");
		if (stringCard.length() < firstColumnSize) {
			stringCard.append("\t");
		}
		stringCard.append("\tSuit: " + suit);
		stringCard.append("\tColor: " + color);
		return stringCard.toString();
	}

	public void showCard() {
		System.out.println(this.toString());
	}

	public void showCardWithHash() {
		System.out.println(this.toString() + "\thashCode: " + hashCode());
	}

	public boolean equals(Object otherObject) {
		boolean areEqual = false;

		if (otherObject == this) {
			areEqual = true;
		}

		if ((otherObject instanceof PlayingCard)) {
			PlayingCard otherCard = (PlayingCard) otherObject;
			if (this.value == otherCard.value && this.color == otherCard.color && this.suit == otherCard.suit)
				areEqual = true;
		}
		return areEqual;
	}

	public int hashCode() {
		int hashValue = 17;
		int primeMultipler = 59;

		hashValue = hashValue * primeMultipler + value.ordinal();
		hashValue = hashValue * primeMultipler + suit.ordinal();
		hashValue = hashValue * primeMultipler + color.ordinal();

		return hashValue;
	}

}
