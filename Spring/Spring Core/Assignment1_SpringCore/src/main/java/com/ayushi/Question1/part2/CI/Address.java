package com.ayushi.Question1.part2.CI;

public class Address {
	 private String street;
	 private String city;
	 private String state;
	 private int zip;
	 private String country;
	
	public Address(String street, String city, String state, int zip, String country) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", zip=" + zip + ", country="
				+ country + "]";
	}
	
	 
	
	

}
