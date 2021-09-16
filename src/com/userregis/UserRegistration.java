package com.userregis;

import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
		
		final String FIRST_NAME = "^[A-Z][a-z]{2}[a-z]*";

		String firstName = "Anirudha";

		if (Pattern.matches(FIRST_NAME, firstName)) { // USECASE1
			System.out.println("Valid first name");
		} else {
			System.out.println("Invalid");
		}

	}

}
