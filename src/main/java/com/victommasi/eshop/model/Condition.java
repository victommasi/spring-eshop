package com.victommasi.eshop.model;

public enum Condition {
	
	NEW(1, "New"),
	USED(2, "Used");
	
	private Integer id;
	private String description;
	
	Condition(Integer id, String description){
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
