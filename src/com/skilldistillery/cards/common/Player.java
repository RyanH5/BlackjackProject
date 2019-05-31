package com.skilldistillery.cards.common;

public class Player extends Person {
	private String name;



	public Player(String name) {
		this.name = name;
	}

	public Player(Hand hand, String name) {
		super(hand);
		this.name = name;
		
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}

	@Override
	public void displayCards() {
		for(Card c : this.getHand().getCards()) {
			System.out.print( name + ": "+ c.toString()+",");
		}
		System.out.println("For a total of " + this.getHand().getHandValue());
		
	}

}
