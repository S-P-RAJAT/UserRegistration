package com.bridgelabz.userregistration;

import java.util.Scanner;

public class UserRegistration {
	
	User user;
	static final Scanner scanner = new Scanner(System.in);

	public void createNewUser() {
		this.user = new User();
		
	}
	public boolean isNameValid(String name) {
		return name.matches("[A-Z][a-z]{2,}");
	}
	public void setFirstName() {
		System.out.print("\nEnter your First Name: ");
		String inputString = scanner.nextLine();
		if(isNameValid(inputString)) {
			this.user.setFirstName(inputString);
		} else {
			System.out.println("Invalid format");
		}
	}
	public void setLastName() {
		System.out.print("\nEnter your Last Name: ");
		String inputString = scanner.nextLine();
		if(isNameValid(inputString)) {
			this.user.setLastName(inputString);
		} else {
			System.out.println("Invalid format");
		}
	}
	public void setEmail() {
		System.out.print("\nEnter your Email: ");
		String inputString = scanner.nextLine();
		if(inputString.matches("^[a-z]+([.]?[a-z0-9_+-]+)?@[a-z1-9]+[.][a-z]{2,}([.][a-z]{2,})?$")) {
			this.user.setEmail(inputString);
		} else {
			System.out.println("Invalid format");
		}
		
	}
	public void setMobileNumber() {
		System.out.print("\nEnter your Mobile Number: ");
		String inputString = scanner.nextLine();
		if(inputString.matches("^\\d{2} \\d{10}$")) {
			this.user.setMobileNumber(inputString);
		} else {
			System.out.println("Invalid format");
		}
	}
	public void setPassword() {
		System.out.println("\nRules to follow while creating a password: ");
		System.out.println("Rule 1: Minimum 8 characters");
		System.out.println("Rule 2: Atleast one uppercase character");
		System.out.println("Rule 3: Atleast one digit");
		System.out.println("Rule 4: Has exactly one special case character");

		System.out.print("\nEnter your Password: ");
		String inputString = scanner.nextLine();
		if(inputString.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.{8,})[0-9a-zA-Z]*[^0-9a-zA-Z][0-9a-zA-Z]*$")) {
			this.user.setPassword(inputString);
		} else {
			System.out.println("Invalid format");
			
		}
	}
	
}
