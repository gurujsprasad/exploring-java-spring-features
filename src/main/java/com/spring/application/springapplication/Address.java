package com.spring.application.springapplication;

public class Address {

	private int id;
	private String address1;
	private String city;
	private String country;
	public Address(int id, String address1, String city, String country) {
		
		this.id = id;
		this.address1 = address1;
		this.city = city;
		this.country = country;
	}
	
	
	@Override
	public String toString() {
		return "Address [id=" + id + ", address1=" + address1 + ", city=" + city + ", country=" + country + "]";
	}
	
}
