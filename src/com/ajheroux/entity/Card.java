package com.ajheroux.entity;

public class Card implements Comparable<Card>{

	private int value;
	private int suit; //0 = club, 1 = diamond, 2 = heart, 3 = spade
	private boolean faceUp;
	
	
	
	public Card(int value, int suit) {
		this(value, suit, false);
	}
	
	public Card(int value, int suit, boolean faceUp) {
		this.value = value;
		this.suit = suit;
		this.faceUp = faceUp;
	}
	
	
	
	public String toString() {
		
		String cardValue;
		String cardSuit;
		
		switch(value) {
			case 1: cardValue = "A";
			break;
			case 11: cardValue = "J";
			break;
			case 12: cardValue = "Q";
			break;
			case 13: cardValue = "k";
			break;
			default: cardValue = String.valueOf(value);
			break;
		}
		
		switch(suit) {
			case 0: cardSuit = "club";
			break;
			case 1: cardSuit = "diamond";
			break;
			case 2: cardSuit = "heart";
			break;
			case 3: cardSuit = "spade";
			break;
			default: cardSuit = "invalid suit";
			break;
		}
		
		
		return cardValue + " of " + cardSuit;
	}
	
	@Override
	public int compareTo(Card o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
