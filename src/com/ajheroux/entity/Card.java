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
	
	
	public int getScoredValue() {
		
		int scoredValue;
		
		switch(this.value) {
			case 11: scoredValue = 10;
			break;
			case 12: scoredValue = 10;
			break;
			case 13: scoredValue = 10;
			break;
			case 14: scoredValue = -3;
			break;
			default: scoredValue = this.value;
			break;
		}
		
		
		return scoredValue;
	}
	
	
	public String toString() {
		
		String cardValue;
		String cardSuit;
		String returnString;
		
		switch(this.value) {
			case 1: cardValue = "A";
			break;
			case 11: cardValue = "J";
			break;
			case 12: cardValue = "Q";
			break;
			case 13: cardValue = "k";
			break;
			case 14: cardValue = "Joker";
			break;
			default: cardValue = String.valueOf(value);
			break;
		}
		
		switch(this.suit) {
			case 0: cardSuit = "club";
			break;
			case 1: cardSuit = "diamond";
			break;
			case 2: cardSuit = "heart";
			break;
			case 3: cardSuit = "spade";
			break;
			case 4: cardSuit = "joker";
			break;
			default: cardSuit = "invalid suit";
			break;
		}
		
		if (this.value == 14) {
			returnString = cardValue;
		}
		else {
			returnString = cardValue + " of " + cardSuit; 
		}
		return returnString;
	}
	
	
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getSuit() {
		return suit;
	}

	public void setSuit(int suit) {
		this.suit = suit;
	}

	public boolean isFaceUp() {
		return faceUp;
	}

	public void setFaceUp(boolean faceUp) {
		this.faceUp = faceUp;
	}

	@Override
	public int compareTo(Card o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
