package com.hackerrankpractice;

import java.util.Scanner;

public class StringIntroduction
{

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		
		String firstLetterOfA = A.substring(0, 1);
		String firstLetterOfB = B.substring(0, 1);
		
		System.out.println(A.length() + B.length());
		if(A.compareTo(B) > 0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		String capitalized = firstLetterOfA.toUpperCase() + A.substring(1) + " " + firstLetterOfB.toUpperCase()
				+ B.substring(1);
		System.out.println(capitalized);
		

	}
}
