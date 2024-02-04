package com.hackerrankpractice;

import java.util.Scanner;

public class IntToString
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();

		String s = Integer.toString(n);  //  Integer.toString(n) is used to convert the integer n to a string. 
		//Alternatively, you can use String.valueOf(n)

		if (n == Integer.parseInt(s))
		{
			System.out.println("Good job");
		} else
		{
			System.out.println("Wrong answer.");
		}
	}
}