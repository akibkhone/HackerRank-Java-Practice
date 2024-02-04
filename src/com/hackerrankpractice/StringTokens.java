package com.hackerrankpractice;

import java.io.*;
import java.util.*;

public class StringTokens
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String string = scan.nextLine();
		// Write your code here.
		String[] tokens = string.trim().split("[ !,?._'@]+");
		if (string.trim().isEmpty())
		{
			System.out.println("0");
		} else
		{
			System.out.println(tokens.length);
			for (String token : tokens)
			{
				System.out.println(token);
			}
		}
		scan.close();
	}
}
