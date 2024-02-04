package com.hackerrankpractice;

import java.util.Scanner;

class UsernameValidator
{
	/*
	 * Write regular expression here.
	 */
	public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}";
	/*
	 * ^: Start of the string. 
	 * [a-zA-Z]: The first character must be a letter either uppercase or lowercase). 
	 * [a-zA-Z0-9_]{7,29}: After the first character, there can be 7 to 29 characters that are either letters (uppercase
	 * or lowercase), digits (0-9), or underscores (_).
	 * 
	 */
}

public class UsernameRegex
{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args)
	{
		int n = Integer.parseInt(scan.nextLine());
		while (n-- != 0)
		{
			String userName = scan.nextLine();

			if (userName.matches(UsernameValidator.regularExpression))
			{
				System.out.println("Valid");
			} else
			{
				System.out.println("Invalid");
			}
		}
	}
}