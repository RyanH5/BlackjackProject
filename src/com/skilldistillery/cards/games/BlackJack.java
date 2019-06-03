package com.skilldistillery.cards.games;

import com.skilldistillery.cards.CardGame;
import com.skilldistillery.cards.common.*;

import java.io.IOException;
import java.util.*;

public class BlackJack extends CardGame {

	private Deck deck;
	private boolean endOfRound = false;
	private int tableLength = 65;

	public BlackJack(Deck deck, String userName, Scanner sc, List<Person> rounders) {
		this.deck = deck;
		List<Person> players = new ArrayList<>();
		players.add(new Dealer());
		players.add(new Player(userName));
		this.setRounders(players);

	}

	public void playGame(Scanner sc, List<Person> players) {
		while (!endOfRound) {
			System.out.println("Let's play!");
			deck.shuffle();
			System.out.println();
			dealCards();
			displayPlayerCards();
			try {
				hitOrStand(sc);
				determineWinner(rounders);
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;

		}
	}
	
	public String printTable() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < tableLength; i++) {
			sb.append("=");
		}
		return sb.toString();
	}

	public void displayPlayerCards() {
		System.out.println(printTable());
		for (Person p : rounders) {
			p.displayCards();
			System.out.println();
		}
		System.out.println(printTable());
	}

	public void dealCards() {
		for (Person p : rounders) {
			p.getHand().addCard(deck.dealCard());
			p.getHand().addCard(deck.dealCard());
		}
	}

	public void hitOrStand(Scanner sc) throws IOException {
		boolean playerRefuseCard = false;
		boolean playerBusted = false;
		while (!playerRefuseCard && !playerBusted) {
			System.out.println();
			System.out.println("Dealer: Would you like another card? (Y/N)");
			String anotherCard = sc.next().toUpperCase();
			if (anotherCard.equals("Y")) {
				System.out.println("********** HIT **********");
				System.out.println();
				rounders.get(1).getHand().addCard(deck.dealCard());
				tableLength += 24;
				displayPlayerCards();
				playerBusted = playerBustCheck(rounders.get(1).getHand().getHandValue());
			} else if (anotherCard.contentEquals("N")) {
				playerRefuseCard = true;
			} else {
				System.out.println("INVALID ENTRY!");
				hitOrStand(sc);
			}
		}
	}
	
	public boolean playerBustCheck(int cardsTotal) {
		if(cardsTotal > 21) {
			System.out.println("Dealer: You busted.  Better luck next time!");
			System.out.println();
			return true;
		}	else if (cardsTotal > 17) {
			System.out.println("Dealer: Whew!  Good luck!");
		}	else if (cardsTotal > 12) {
			System.out.println("Dealer: Ok! Ok! Living dangerously");
		}	else {
			System.out.println("Dealer: Smart play!");
		}
		return false;
	}
	
	public void determineWinner(List<Person> rounders) {
		((Dealer)rounders.get(0)).setMidHand(false);
		
		if (rounders.get(0).getHand().getHandValue() < rounders.get(rounders.size()-1).getHand().getHandValue() &&
				rounders.get(1).getHand().getHandValue() <= 21) {
			displayPlayerCards();
			System.out.println(rounders.get(1).getName() + " wins!");
		}	else {
			displayPlayerCards();
			System.out.println(rounders.get(1).getName() + ": Did I really just lose to " + rounders.get(0).getName() + "?");
			System.out.println("Hey would you sign my T-shirt?");
			System.out.println(rounders.get(0).getName() + ": get out!");
		}
	}

}
