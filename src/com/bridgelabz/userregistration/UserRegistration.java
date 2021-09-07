package com.bridgelabz.userregistration;

import java.util.Scanner;

public class UserRegistration {
	static final Scanner scanner = new Scanner(System.in);

	public boolean isNameValid(String name) {
		return name.matches("[A-Z][a-z]{2,}");
	}
	public void getFirstName() {
		System.out.print("\nEnter your First Name: ");
		System.out.println(isNameValid(scanner.nextLine()));
	}
	public void getLastName() {
		System.out.print("\nEnter your Last Name: ");
		System.out.println(isNameValid(scanner.nextLine()));
	}
	public void getEmail() {
		System.out.print("\nEnter your Email: ");
		System.out.println(scanner.nextLine().matches("^[a-z]+([.]?[a-z0-9_+-]+)?@[a-z1-9]+[.][a-z]{2,}([.][a-z]{2,})?$"));
		
	}
}
