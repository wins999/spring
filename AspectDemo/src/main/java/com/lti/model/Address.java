package com.lti.model;

import java.io.Serializable;

public class Address implements Serializable{

	private String streetName;
	private String city;
    private String pincode;
	public Address() {
		super();
	}
	public Address(String streetName, String city, String pincode) {
		super();
		this.streetName = streetName;
		this.city = city;
		this.pincode = pincode;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", city=" + city + ", pincode=" + pincode + "]";
	}	
    
    
    
}
