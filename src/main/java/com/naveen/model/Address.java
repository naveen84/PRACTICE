package com.naveen.model;

public class Address {
	
	private String city;
	private String nation;
	
	public Address() {
		super();
	}

	public Address(String city, String nation) {
		super();
		this.city = city;
		this.nation = nation;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", nation=" + nation + "]";
	}
	
}
