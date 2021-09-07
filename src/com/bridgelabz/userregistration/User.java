package com.bridgelabz.userregistration;

public class User {
	
	private String firstName;
	private String lastName;
	private String email;
	private String mobileNumber;
	private String password;
	
	public User(String firstName, String lastName, String email, String mobileNumber, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.password = password;
	}
}
