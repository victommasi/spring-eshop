package com.victommasi.eshop.model;

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
	private String description;
	
	Category(Integer id, String description){
		this.id = id;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}
}
