package com.skilldistillery.cards.common;

public class Player extends Person {

	public Player(String name) {
		this.name = name;
	}

	public Player(Hand hand, String name) {
		super(hand);
		this.name = name;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayCards() {
		System.out.print(name + ":");
		for(Card c : this.getHand().getCards()) {
			System.out.print("\t\t" + c.toString()+",");
		}
		System.out.println("\tTotal: " + this.getHand().getHandValue());
	}
}
