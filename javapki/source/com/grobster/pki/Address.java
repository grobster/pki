package com.grobster.pki;

import java.io.*;

public class Address implements Serializable {
	private static final long serialVersionUID = 34593873839L;
	private String streetAddress;
	private String city;
	private String stateProvince;
	private String country;
	private String postalCode;
	
	public Address(String streetAddress, String city, String stateProvince, String country, String postalCode) {
		this.streetAddress = streetAddress;
		this.city = city;
		this.stateProvince = stateProvince;
		this.country = country;
		this.postalCode = postalCode;
	}
	
	public Address() {}
	
	// setters
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	//getters
	public String getStreetAddress() {
		return streetAddress;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getStateProvince() {
		return stateProvince;
	}
	
	public String getCountry() {
		return country;
	}
	
	public String getPostalCode() {
		return postalCode;
	}
}