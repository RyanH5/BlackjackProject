package com.skilldistillery.cards.common;

public abstract class Person {

	private Hand hand;
	
	public Person() {};
	
	public Person(Hand hand) {
		hand = new Hand();
	}

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

}
