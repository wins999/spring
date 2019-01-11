package com.model;

public class Customer {
	private int id;
	private String name;
	private String email;
	private double creditAllowed;
	
	public Customer() {
		super();
	}
	public Customer(int id, String name, String email, double creditAllowed) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.creditAllowed = creditAllowed;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getCreditAllowed() {
		return creditAllowed;
	}
	public void setCreditAllowed(double creditAllowed) {
		this.creditAllowed = creditAllowed;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", creditAllowed=" + creditAllowed + "]";
	}
	
	
	
}
