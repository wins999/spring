package com.lti.model;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee implements Serializable  {
	
	 private int id;
	 private String name;
	 private int raisedSalary;
	private Address add;
	 private Department depart;
	public Employee() {
		super();
	}
	public Employee(int id, String name, Address add, Department depart) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
		this.depart = depart;
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
	 public int getRaisedSalary() {
			return raisedSalary;
		}
		public void setRaisedSalary(int raisedSalary) {
			this.raisedSalary = raisedSalary;
		}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	public Department getDepart() {
		return depart;
	}
	public void setDepart(Department depart) {
		this.depart = depart;
	}
	@PostConstruct
	public void init()
	{
		System.out.println("Employee been initialized");
		
	}
	
	//@PreDestroy
	public void destroy()
	{

		System.out.println("Employee been destroyed");	
		
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", add=" + add + ", depart=" + depart + "]";
	}
	 
	
	

}
