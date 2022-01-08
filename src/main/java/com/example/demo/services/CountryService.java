package com.example.demo.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.example.demo.beans.Country;
import com.example.demo.repository.CountryRepository;

@Component
@Service
public class CountryService {
	
	@Autowired
	CountryRepository countryRepository; 
	
	public List getCountries() {
		return countryRepository.findAll();
	}
	
	public Country getCountryById(int id) {
		return countryRepository.findById(id).get();
		
	}
	
	public Country getCountryByName(String name) {
		List<Country> countries = countryRepository.findAll();
		Country con = null;
		for(Country c: countries) {
			if(c.getName().equals(name))
			{
				con= c;
				break;
			}
		}
		
		return con;
	}
	
	
	
	public Country addCountry(Country country)
	{
		country.setId(getMaxId());
		return countryRepository.save(country);
	}
	
	public Country updateCountry(Country country)
	{
		countryRepository.save(country);
		return country;
	}
	

	public void deleteCountry(int id)
	{
		countryRepository.deleteById(id);
	}
	
	
	public int getMaxId() {
		
		return countryRepository.findAll().size() + 1;
		
	}
	

}
