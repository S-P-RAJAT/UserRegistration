package com.bridgelabz.userregistration;


public class UserRegistrationMain {
	
public static void main(String[] args) {
	
	UserRegistration newUser = new UserRegistration();
	System.out.println("User Registration:");

	newUser.getFirstName();
	newUser.getLastName();
	newUser.getEmail();
	UserRegistration.scanner.close();
}
}
