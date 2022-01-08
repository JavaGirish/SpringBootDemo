package com.example.demo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.beans.Country;
import com.example.demo.services.CountryService;

@RestController
public class CountryController {

	@Autowired
	CountryService countryService;

	// Get All Countries
	@GetMapping("/getcountries")
	public List getAllCountries() {
		return countryService.getCountries();

	}

	// Get Country By ID
	@GetMapping("/getcountries/{id}")
	public Country getCountryById(@PathVariable(value = "id") int id) {
		return countryService.getCountryById(id);
	}

	// Get Country by name
	@GetMapping("/getcountries/countryname")
	public Country getCountryByName(@RequestParam(value = "name") String name) {
		return countryService.getCountryByName(name);
	}
	
	//Add Country	
	@PostMapping("/addcountry")
	public Country addCountry(@RequestBody Country country) {
		return countryService.addCountry(country);
	}

	//Update Country
	@PutMapping("/updatecountry")
	public Country updateCountry(@RequestBody Country country)
	{
		return countryService.updateCountry(country);
	}
	
	//Delete Country
	@DeleteMapping("/deletecountry/{id}")
	public void deleteCountry(@PathVariable(value="id") int id) {
		countryService.deleteCountry(id);
	}
	
}
