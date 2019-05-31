package com.skilldistillery.cards.common;

public abstract class Person {

	protected Hand hand = new Hand();
	
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
	
	public abstract void displayCards();

}
