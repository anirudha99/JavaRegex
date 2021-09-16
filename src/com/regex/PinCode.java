package com.regex;

import java.util.regex.Pattern;

public class PinCode {
	public static void main(String args[]) {
		
		String pin1 = "400 088";
		String pin2 = "400  088"; //two spaces should be invalid
		String pattern = "^[1-9][0-9]{2}\\s?[0-9]{3}$";
		
		// first digit should be 1-9 followed by 5 digits between 0-9
		// Usecase 1 suits the usecase2 as we made it clear that it should start with digit.

		System.out.println(Pattern.matches(pattern, pin1));
		System.out.println(Pattern.matches(pattern, pin2));
	}
}
