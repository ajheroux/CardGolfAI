package com.ajheroux.service;
import com.ajheroux.entity.*;

public class CardServiceImpl implements CardService {

	
	

	public Deck makeDeck() {
		
		Deck returnDeck = new Deck();
		
		for (int s = 0; s < 4; s++) {
			for (int v = 1; v <= 13; v++) {
				returnDeck.addCard(new Card(v, s));
			}
		}
		returnDeck.addCard(new Card(14,4));
		returnDeck.addCard(new Card(14,4));
		
		
		return returnDeck;
	}

}
