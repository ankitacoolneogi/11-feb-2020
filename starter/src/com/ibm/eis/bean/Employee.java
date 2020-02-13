package com.ibm.eis.bean;

public class Employee {
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary
				+ ", ins_scheme=" + ins_scheme + "]";
	}

	private int id;
	private String name, designation;
	private float salary;
	
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}

	private char ins_scheme;
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
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public char getIns_scheme() {
		return ins_scheme;
	}
	public void setIns_scheme(char ins_scheme) {
		this.ins_scheme = ins_scheme;
	}
	public Employee(int id, String name, String designation, char ins_scheme) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.ins_scheme = ins_scheme;
	}
	
	public Employee() {
		//default constructor
	}
	

}
