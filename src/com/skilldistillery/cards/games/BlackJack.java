package com.skilldistillery.cards.games;

import com.skilldistillery.cards.CardGame;
import com.skilldistillery.cards.common.*;
import java.util.*;

public class BlackJack extends CardGame{

	private Deck deck;
	private boolean endOfRound = false;
	
	
	public BlackJack(Deck deck, String userName) {
		this.deck = deck;
		List<Person> players = new ArrayList<>();	
		players.add(new Player(userName));
		players.add(new Dealer());	
		this.setRounders(players);
		
	}

	
	public void play() {
		while (!endOfRound) {
			System.out.println("Let's play!");			
			deck.shuffle();
			System.out.println("PSSHHHHH *CARDS SHUFFLING SOUND* ");
			System.out.println();
			dealCards();
			displayPlayerCards();
			break;
			
		}
	}
	
	public void displayPlayerCards() {
		for(Person p: rounders) {
			p.displayCards();
			System.out.println();
		}
	}
	
	public void dealCards() {
		for(Person p: rounders) {
			p.getHand().addCard(deck.dealCard());
			p.getHand().addCard(deck.dealCard());
		}
	}
	
	

	
}
