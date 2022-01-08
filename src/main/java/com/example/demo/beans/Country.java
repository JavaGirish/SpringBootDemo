package com.example.demo.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Country")
public class Country {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name= "name")
	private String name;
	
	@Column(name="capital")
	private String capital;
	
	public Country() {}
	
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
