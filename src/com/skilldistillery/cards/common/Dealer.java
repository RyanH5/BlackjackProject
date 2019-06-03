package com.skilldistillery.cards.common;

import java.util.*;

public class Dealer extends Person {
	private String name;
	private boolean midHand;


	private List<String> celebrityWashUps = new ArrayList<>();

	public Dealer() {
		celebrityWashUps.add("Calista Flockhart");
		celebrityWashUps.add("Jonathan Taylor Thomas");
		celebrityWashUps.add("Coolio");
		celebrityWashUps.add("Brendan Fraser");
		celebrityWashUps.add("Ricki Lake");
		celebrityWashUps.add("Jim Carey");
		celebrityWashUps.add("Paris Hilton");
		celebrityWashUps.add("Sarah Michelle Gellar");
		celebrityWashUps.add("Lindsay Lohan");
		celebrityWashUps.add("Ja Rule");
		celebrityWashUps.add("Renee Zellwegger");
		celebrityWashUps.add("Megan Fox");
		celebrityWashUps.add("Hulk Hogan");
	
		int num = (int)(Math.random() * celebrityWashUps.size());
		this.name = "Washed up " + celebrityWashUps.get(num);
		this.midHand = true;
	}

	public Dealer(Hand hand) {
		super(hand);
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void displayCards() {
		List<Card> dCards = this.getHand().getCards();
		System.out.print("Dealer: ");
		for (int i = 0; i < dCards.size(); i++) {
			if (i == 0  && midHand) {
				System.out.print("\t" + "**HIDDEN CARD**,");
			}	else {
				System.out.print("\t"+ dCards.get(i)+",\t");
			}
		}
		if (!midHand) {
			System.out.print("\tTotal: " + this.getHand().getHandValue());
		}
	}

	public boolean isMidHand() {
		return midHand;
	}
	
	public void setMidHand(boolean midHand) {
		this.midHand = midHand;
	}
}
