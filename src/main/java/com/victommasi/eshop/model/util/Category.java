package com.victommasi.eshop.model.util;

public enum Category {

	BASKETBALL(1, "Basketball"),
	CASUAL(2, "Casual"),
	RUNNING(3, "Running"),
	SKATE(4, "Skate"),
	SOCCER(5, "Soccer"),
	TENNIS(6, "Tennis"),
	TREKKING(7, "Trekking"),
	VOLLEY(8, "Volley");
	
	private Integer id;
	private String text;
	
	Category(Integer id, String text){
		this.id = id;
		this.text = text;
	}

	public Integer getId() {
		return id;
	}

	public String getText() {
		return text;
	}
}
