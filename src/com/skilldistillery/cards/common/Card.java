package com.skilldistillery.cards.common;

public class Card {

	private String suit;
	private int rank;
	
	public Card() {
		// TODO Auto-generated constructor stub
	}
	public Card(Suit suit, Rank rank) {
		this.suit = suit.name();
		this.rank = rank.getValue();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rank;
		result = prime * result + ((suit == null) ? 0 : suit.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (rank != other.rank)
			return false;
		if (suit == null) {
			if (other.suit != null)
				return false;
		} else if (!suit.equals(other.suit))
			return false;
		return true;
	}
	
	public String toString() {
		return rank + " of " + suit;
	}
	
	public int getValue() {
		return rank;
	}

}