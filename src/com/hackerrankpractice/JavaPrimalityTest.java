package com.hackerrankpractice;

import java.io.*;
import java.math.*;

public class JavaPrimalityTest
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String n = bufferedReader.readLine();
		BigInteger number = new BigInteger(n);
		int certainty = 50;
		/*
		 * In the context of primality testing using probabilistic algorithms like the
		 * Miller-Rabin primality test, the certainty parameter determines how many
		 * random tests the algorithm performs to determine if a number is likely prime.
		 * The certainty value is an indication of the desired confidence level in the
		 * primality determination.
		 */
		if (number.isProbablePrime(certainty))
		{
			System.out.println("prime");
		} else
		{
			System.out.println("not prime");
		}
		bufferedReader.close();
	}
}
