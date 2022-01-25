package com.ajheroux.controller;

import com.ajheroux.entity.Card;
import com.ajheroux.entity.Deck;
import com.ajheroux.service.CardService;
import com.ajheroux.service.CardServiceImpl;

public class GameController {

	public static void main(String[] args) {
		
		CardService cardService = new CardServiceImpl();
		
		Deck gameDeck = cardService.makeDeck();
		
		for (Card cards : gameDeck.getCards()) {
			System.out.println(cards.toString());
		}

	}

}
