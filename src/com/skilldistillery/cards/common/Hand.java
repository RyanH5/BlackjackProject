package com.skilldistillery.cards.common;

import java.util.*;

public class Hand {

	private int handValue;
	private List<Card> cards = new ArrayList<>();
	public Hand() {}
	
	public int getHandValue() {
		return handValue;
	}
	
	public void addCard(Card card) {
		cards.add(card);
		handValue += card.getValue();
	}
	
	public List<Card> getCards() {
		return cards;
	}
	
	public String toString() {
		return "I've got " + handValue; 
	}

}
