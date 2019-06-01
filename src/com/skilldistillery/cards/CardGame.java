package com.skilldistillery.cards;

import java.util.*;

import com.skilldistillery.cards.common.*;
import com.skilldistillery.cards.games.*;

public class CardGame implements Play{

	protected List<Person> rounders;
	

	public CardGame() {
		rounders = new ArrayList<>();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Deck deck = new Deck();

		CardGame game = new CardGame();
		game.launchGame(sc, deck);
		sc.close();
	}

	public void launchGame(Scanner sc, Deck deck) {
		System.out.println("Would you like to play BlackJack? ");
		String response = sc.next().toUpperCase();
		
		System.out.println("Enter your name: ");
		String userName = sc.next();
		switch (response) {
		case "Y":
			CardGame currentGame = new BlackJack(deck, userName, sc, rounders);
			currentGame.playGame(sc, rounders);
			break;
			
		default:
			currentGame = new BlackJack(deck, userName, sc, rounders);
			currentGame.playGame(sc, rounders);
		}
	}
	
	public List<Person> getRounders() {
		return rounders;
	}
	
	public void setRounders(List<Person> rounders) {
		this.rounders = rounders;
	}
	
	public void addRounder(Person player) {
		rounders.add(player);
	}
	

	@Override
	public void playGame(Scanner sc, List<Person> players) {
		// TODO Auto-generated method stub
		
	}




}
