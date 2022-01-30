package com.ajheroux.service;

import com.ajheroux.entity.Card;
import com.ajheroux.entity.CardColumn;
import com.ajheroux.entity.PlayerHand;

public class GameRulesServiceImpl implements GameRulesService {

	PlayerHandService playerHandService = new PlayerHandServiceImpl();
	
	
	@Override
	public int scoreHand(PlayerHand hand) {
		
		int returnScore = 0;
		
		for (CardColumn column : hand.getColumn()) {
			if (!playerHandService.isColumnEqual(column)) {
				for (Card card : column.getCards()) {
					returnScore += card.getScoredValue();
				}
			}
		}
				
		return returnScore;
	}

}
