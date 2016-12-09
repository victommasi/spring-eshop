package com.victommasi.eshop.model.util;

public enum Size {

	T4("34"), T5("35"),	T6("36"), T7("37"),
	T8("38"), T9("39"), F0("40"), F1("41"),
	F2("42"), F3("43"), F4("44"), F5("45"),
	F6("46");
	
	private String text;
	
	Size(String text){
		this.text = text;
	}
	
	public String getText(){
		return this.text;
	}
}
