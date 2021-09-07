package com.bridgelabz.userregistration;

import java.util.Scanner;

public class UserRegistration {
	static final Scanner scanner = new Scanner(System.in);

	public boolean isNameValid(String name) {
		return name.matches("[A-Z][a-z]{2,}");
	}
	public void getFirstName() {
		String inputString = "";
		System.out.println("User Registration:");
		System.out.println("Enter your First Name");
		inputString = scanner.nextLine();
		System.out.println(isNameValid(inputString));
	}
}
