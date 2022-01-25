package com.ajheroux.entity;

import java.util.ArrayList;

public abstract class CardCollection {

	private ArrayList<Card> cards = new ArrayList<Card>();
	
	public boolean addCard(Card newCard) {
		
		this.cards.add(newCard);
		
		return true;
	}

	public ArrayList<Card> getCards() {
		return cards;
	}

	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}
	
	
	
}
