package com.ajheroux.entity;

import java.util.List;

public class PlayerHand {

	List<CardColumn> column;

	public PlayerHand(List<CardColumn> column) {
		this.column = column;
	}

	public List<CardColumn> getColumn() {
		return column;
	}

	public void setColumn(List<CardColumn> column) {
		this.column = column;
	}
	
	
	
}
