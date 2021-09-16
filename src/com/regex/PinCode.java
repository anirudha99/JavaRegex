package com.regex;

import java.util.regex.Pattern;

public class PinCode {
	public static void main(String args[]) {

		String pin = "400088";
		String pattern = "^[1-9][0-9]{5}"; // first digit should be 1-9 followed by 5 digits between 0-9

		System.out.println(Pattern.matches(pattern, pin));

	}
}
