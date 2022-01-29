package com.ajheroux.entity;

public class CardColumn extends CardCollection {

	
	public Card getCardAt(int index) {
		return super.cards.get(index);
	}
	
	
}
