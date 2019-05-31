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
		System.out.print("Dealer: ");
		for (int i = 0; i < dCards.size(); i++) {
			if (i == 0) {
				System.out.print("\t" + "**HIDDEN CARD**,");
			}	else {
				System.out.print("\t"+ dCards.get(i)+",");
			}
		}
//		System.out.println("For a total of " + this.getHand().getHandValue());
		
	}

}
