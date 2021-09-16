package com.userregis;

import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
		
		//pattern
		final String FIRST_NAME = "^[A-Z][a-z]{2}[a-z]*";
		final String LAST_NAME = "^[A-Z][a-z]{2}[a-z]*";
		
		String firstName = "Anirudha";
		String lastName = "Mayya";

		if (Pattern.matches(FIRST_NAME, firstName)) { // use case 1 : first name
			System.out.println("Valid first name");
		} else {
			System.out.println("Invalid");
		}
		
		if (Pattern.matches(LAST_NAME, lastName)) { // use case 2 : last name
			System.out.println("Valid last name");
		} else {
			System.out.println("Invalid last name");
		}

	}

}
