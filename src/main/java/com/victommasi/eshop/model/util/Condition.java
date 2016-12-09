package com.victommasi.eshop.model.util;

public enum Condition {
	
	NEW(1, "New"),
	USED(2, "Used");
	
	private Integer id;
	private String text;
	
	Condition(Integer id, String text){
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
