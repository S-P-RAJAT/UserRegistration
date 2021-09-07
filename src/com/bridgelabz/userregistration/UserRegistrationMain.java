package com.bridgelabz.userregistration;


public class UserRegistrationMain {
	
public static void main(String[] args) {
	
	UserRegistration user = new UserRegistration();
	System.out.println("User Registration:");

	user.createNewUser();
	user.setFirstName();
	user.setLastName();
	user.setEmail();
	user.setMobileNumber();
	user.setPassword();
	user.clearRecords();
	UserRegistration.scanner.close();
}
}
