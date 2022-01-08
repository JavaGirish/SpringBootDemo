package com.example.demo.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.beans.Country;

@Component
public class CountryService {
	
	private static HashMap<Integer, Country> countryMap;
	
	public CountryService() {
		countryMap = new HashMap<>();
		Country c1 = new Country(1, "India", "Delhi");
		Country c2 = new Country(2, "USA", "Washington DC");
		Country c3 = new Country(3, "UK", "London");
				
		countryMap.put(1, c1); 
		countryMap.put(2, c2);
		countryMap.put(3, c3);
		
		
	}
	
	public List getCountries() {
		return new ArrayList<>(countryMap.values());
	}
	
	public Country getCountryById(int id) {
		return countryMap.get(id);
	}
	
	public Country getCountryByName(String name) {
		
		for(Country c: countryMap.values()) {
			if(c.getName().equals(name))
			{
				return c;
			}
			
		}
		return null;
	}
	
	
	
	public Country addCountry(Country country)
	{
		country.setId(getMaxId());
		countryMap.put(getMaxId(), country);
		return country;
	}
	
	public Country updateCountry(Country country)
	{
		if(country.getId()> 0)
		  countryMap.put(country.getId(), country);
		
		return country;
	}
	

	public void deleteCountry(int id)
	{
		countryMap.remove(id);
		System.out.println("Record Deleted: "+id);
	}
	
	
	private static int getMaxId() {
		int max = 0;
		for(int m : countryMap.keySet())
		{
			if(max < m)
			{
				max = m;
			}
		}
		
		return max+1;
		
	}
	

}
