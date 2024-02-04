package com.hackerrankpractice;

import java.util.*;
import java.security.*;

public class SHA
{

	public static void main(String[] args)
	{
		// Reading input from the user
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		scanner.close();

		try
		{
			// Creating a MessageDigest object with SHA-256 algorithm
			MessageDigest md = MessageDigest.getInstance("SHA-256");

			// Updating the digest with the input string
			md.update(inputString.getBytes());

			// Calculating the hash value
			byte[] hashBytes = md.digest();

			// Converting the byte array to a hexadecimal representation
			StringBuilder hexHash = new StringBuilder();
			for (byte b : hashBytes)
			{
				hexHash.append(String.format("%02x", b));
			}

			// Printing the result
			System.out.println(hexHash.toString());
		} catch (NoSuchAlgorithmException e)
		{
			System.err.println("SHA-256 algorithm not available.");
			e.printStackTrace();
		}
	}
}