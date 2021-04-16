package com.example.demo.vo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
	
	private String name;
	private String number;
	private String phoneNumber;
	private String enteredDate;
	
	public Employee() {
		SimpleDateFormat dateFormant = new SimpleDateFormat("yyyy-MM-dd");
		Date today = new Date();
		String date = dateFormant.format(today);
		this.enteredDate = date;
	}
	
	public Employee(String name, String number, String phoneNumber) {
		this();
		this.name = name;
		this.number = number;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEnteredDate() {
		return enteredDate;
	}

	public void setEnteredDate(String enteredDate) {
		this.enteredDate = enteredDate;
	}	
}
