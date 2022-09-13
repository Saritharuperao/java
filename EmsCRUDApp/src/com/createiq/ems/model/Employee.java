package com.createiq.ems.model;

public class Employee {
	private int id;
	private String name;
	private double Salary;
	private String Email;
	
	
	public Employee() {
		
}


	public Employee(int id, String name, double salary, String email) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
		Email = email;
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


	public double getSalary() {
		return Salary;
	}


	public void setSalary(double salary) {
		Salary = salary;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Salary=" + Salary + ", Email=" + Email + "]";
	}
	
}