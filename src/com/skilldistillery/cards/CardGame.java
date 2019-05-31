package com.skilldistillery.cards;

import java.util.*;

import com.skilldistillery.cards.common.*;
import com.skilldistillery.cards.games.*;

public class CardGame implements Play{

	protected List<Person> rounders;
	public CardGame() {}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Deck deck = new Deck();

		CardGame game = new CardGame();
		game.launchGame(sc, deck);
	}

	public void launchGame(Scanner sc, Deck deck) {
		System.out.println("Would you like to play BlackJack? ");
		String response = sc.next().toUpperCase();
		switch (response) {
		case "Y":
			CardGame currentGame = new BlackJack(deck);
			currentGame.play();
			break;

		default:
			currentGame = new BlackJack(deck);
			currentGame.play();
		}
	}

	@Override
	public void play() {}

}
