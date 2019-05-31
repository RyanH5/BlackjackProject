package com.skilldistillery.cards.common;

import java.util.*;

public class Dealer extends Person {

	public Dealer() {
		// TODO Auto-generated constructor stub
	}

	public Dealer(Hand hand) {
		super(hand);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayCards() {
		List<Card> dCards = this.getHand().getCards();
		for (int i = 0; i < dCards.size(); i++) {
			if (i < 1) {
				System.out.print(this.getClass().getSimpleName() + ": " + "**HIDDEN CARD**");
			}	else {
				System.out.print(" "+ dCards.get(i)+",");
			}
		}
//		System.out.println("For a total of " + this.getHand().getHandValue());
		
	}

}
