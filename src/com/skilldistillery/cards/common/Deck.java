package com.skilldistillery.cards.common;

import java.util.*;

public class Deck {

	private List<Card> cards;
	public Deck() {
		// TODO Auto-generated constructor stub
	}
	
	{
		cards = new ArrayList<>();		
		for(int s = 0; s < Suit.values().length; s++) {
			for(int r = 0; r < Rank.values().length; r++) {
				cards.add(new Card(Suit.values()[s], Rank.values()[r]));
			}
		}
		
	}
	
	public int checkDeckSize() {
		return cards.size();
	}
	
	public Card dealCard() {
		return cards.remove(0);
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}

}