package com.example.demo.beans;

public class Country {

	private int id;
	private String name;
	private String capital;
	
	public Country(int id, String name, String capital) {
		super();
		this.id = id;
		this.name = name;
		this.capital = capital;
	}
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setCapital(String capital) {
		this.capital = capital;
	}


	public String getName() {
		return name;
	}
	
	public String getCapital() {
		return capital;
	}
	
	
}
