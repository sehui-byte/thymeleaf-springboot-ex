package com.example.demo.vo;

import java.util.LinkedList;
import java.util.List;

public class Company {
	
	private String name;
	private String registerNumber;
	private String address;
	private List<Employee> employees;
	private String layoutType;
	
	
	public Company() {
		this.employees = new LinkedList<Employee>();
		this.layoutType = "table";
	
	}
	
	public Company(String name, String registerNumber, String address) {
		this();
		this.name = name;
		this.registerNumber = registerNumber;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegisterNumber() {
		return registerNumber;
	}
	public void setRegisterNumber(String registerNumber) {
		this.registerNumber = registerNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(LinkedList<Employee> employees) {
		this.employees = employees;
	}

	//직원 추가
	public void addEmployee(Employee employee) {
		this.employees.add(employee);
	}

	public String getLayoutType() {
		return layoutType;
	}

	public void setLayoutType(String layoutType) {
		this.layoutType = layoutType;
	}
	
	
}
