package com.bridgelabz.userregistration;

import java.util.Scanner;

public class UserRegistration {
	static final Scanner scanner = new Scanner(System.in);

	public boolean isNameValid(String name) {
		return name.matches("[A-Z][a-z]{2,}");
	}
	public void setFirstName() {
		System.out.print("\nEnter your First Name: ");
		System.out.println(isNameValid(scanner.nextLine()));
	}
	public void setLastName() {
		System.out.print("\nEnter your Last Name: ");
		System.out.println(isNameValid(scanner.nextLine()));
	}
	public void setEmail() {
		System.out.print("\nEnter your Email: ");
		System.out.println(scanner.nextLine().matches("^[a-z]+([.]?[a-z0-9_+-]+)?@[a-z1-9]+[.][a-z]{2,}([.][a-z]{2,})?$"));
		
	}
	public void setMobileNumber() {
		System.out.print("\nEnter your Mobile Number: ");
		System.out.println(scanner.nextLine().matches("^\\d{2} \\d{10}$"));
	}
	public void setPassword() {
		System.out.println("\nRules to follow while creating a password: ");
		System.out.println("Rule 1: Minimum 8 characters");
		System.out.print("\nEnter your Mobile Number: ");
		System.out.println(scanner.nextLine().matches("^.{8,}$"));
	}
}
