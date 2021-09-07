package com.bridgelabz.userregistration;


public class UserRegistrationMain {
	
public static void main(String[] args) {
	
	UserRegistration newUser = new UserRegistration();
	System.out.println("User Registration:");

	newUser.setFirstName();
	newUser.setLastName();
	newUser.setEmail();
	newUser.setMobileNumber();
	newUser.setPassword();
	UserRegistration.scanner.close();
}
}
