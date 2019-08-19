package com.amdocs;

public class Employee {

	private String name;
	private String designation;
	private String department;
	
	private Address data = new Address();
	public static void main(String[] args) {
		

	}
	public Employee(String name, String designation, String department, String doorNo) {
		super();
		this.name = name;
		this.designation = designation;
		this.department = department;
		this.data.doorNo = doorNo;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
