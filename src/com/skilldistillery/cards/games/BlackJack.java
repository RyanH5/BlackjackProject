package com.skilldistillery.cards.games;

import com.skilldistillery.cards.CardGame;
import com.skilldistillery.cards.common.*;

public class BlackJack extends CardGame{

	private Deck deck;
	private boolean endOfRound = false;
	
	
	public BlackJack(Deck deck) {
		this.deck = deck;
		rounders.add(new Player());
		rounders.add(new Dealer());
	}

	
	public void play() {
		while (!endOfRound) {
			System.out.println("Let's play!");
			deck.shuffle();
			System.out.println("PSSHHHHH *CARDS SHUFFLING SOUND* ");
			break;
			
		}
	}
	

	
}
