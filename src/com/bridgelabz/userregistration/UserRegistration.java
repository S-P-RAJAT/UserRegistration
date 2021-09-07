package com.bridgelabz.userregistration;

import java.util.Scanner;

public class UserRegistration {
	static final Scanner scanner = new Scanner(System.in);

	public boolean isNameValid(String name) {
		return name.matches("[A-Z][a-z]{2,}");
	}
	public void getFirstName() {
		System.out.println("Enter your First Name");
		System.out.println(isNameValid(scanner.nextLine()));
	}
	public void getLastName() {
		System.out.println("Enter your Last Name");
		System.out.println(isNameValid(scanner.nextLine()));
	}
}
