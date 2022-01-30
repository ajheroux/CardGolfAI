package com.ajheroux.service;

import com.ajheroux.entity.Card;
import com.ajheroux.entity.CardColumn;

public class PlayerHandServiceImpl implements PlayerHandService {

	
	
	public boolean isColumnEqual(CardColumn column) {

		boolean returnValue = true;

		if (!column.getCards().isEmpty()) {
			for (Card card : column.getCards()) {
				if (card.getValue() != column.getCardAt(0).getValue()) {
					returnValue = false;
					break;
				}
			}
		}

		return returnValue;
	}

}
