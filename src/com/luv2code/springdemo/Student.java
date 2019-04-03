package com.luv2code.springdemo;

import java.util.LinkedHashMap;

public class Student {
	private String name;
	
	private String lastName;
	
	private String country;
	
	private LinkedHashMap<String, String> countryOptions;
	
	private String language;
	
	private String [] oS;
	
	public Student() {
		countryOptions = new LinkedHashMap<String, String>();
		
		countryOptions.put("MX", "Mexico");
		countryOptions.put("US", "USA");
		countryOptions.put("IN", "India");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String languaje) {
		this.language = languaje;
	}

	public String[] getoS() {
		return oS;
	}

	public void setoS(String[] oS) {
		this.oS = oS;
	}
	
	

	
	

}
