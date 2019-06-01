package com.skilldistillery.cards.games;

import java.util.List;
import java.util.Scanner;

import com.skilldistillery.cards.common.Person;

public interface Play {

	public void playGame(Scanner sc, List<Person> players);
}
