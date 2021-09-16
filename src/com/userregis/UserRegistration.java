package com.userregis;

import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
		
		//pattern
		final String FIRST_NAME = "^[A-Z][a-z]{2}[a-z]*";
		final String LAST_NAME = "^[A-Z][a-z]{2}[a-z]*";
		
		
		final String username = "^[A-Za-z][A-Za-z0-9+-]{2}[A-Za-z0-9+-]*([.][A-Za-z0-9]{2}[A-Za-z0-9]*)?";
		final String domain = "\\@[a-z]{3}[a-z]*\\.[a-z]{2}[a-z]*([.][a-z]{2}[a-z]*)?";

		final String EMAIL = username + domain;
		
		String firstName = "Anirudha";
		String lastName = "Mayya";
		String email = "AnirudhaMayya@gmail.com";

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
		
		if (Pattern.matches(EMAIL, email)) { 			// use case 3 : email
			System.out.println("Valid email");
		} else {
			System.out.println("Invalid email");
		}

	}

}
