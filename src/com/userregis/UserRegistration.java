package com.userregis;

import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
		
		//pattern
		final String FIRST_NAME = "^[A-Z][a-z]{2}[a-z]*";
		final String LAST_NAME = "^[A-Z][a-z]{2}[a-z]*";
		//email
		final String username = "^[A-Za-z][A-Za-z0-9+-]{2}[A-Za-z0-9+-]*([.][A-Za-z0-9]{2}[A-Za-z0-9]*)?";
		final String domain = "\\@[a-z]{3}[a-z]*\\.[a-z]{2}[a-z]*([.][a-z]{2}[a-z]*)?";
		final String EMAIL = username + domain;
		//number
		final String phonepattern = "91 [1-9][0-9]{9}";
		
		String firstName = "Anirudha";
		String lastName = "Mayya";
		String email = "AnirudhaMayya@gmail.com";
		String phone="91 7569862011";

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
		
		if(Pattern.matches(phonepattern, phone)) {
			System.out.println("Valid phone number");
		}
		else {
			System.out.println("Invalid phone number");
		}

	}

}
