package com.hackerrankpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SubstringComparisons
{
	public static String getSmallestAndLargest(String s, int k)
	{
		String smallest = "";
		String largest = "";

		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'

		ArrayList<String> substrings = new ArrayList<>();
		for (int start = 0; start <= s.length()-k; start++)
		{
			int end = start + k;
			String substring = s.substring(start, end);
			substrings.add(substring);
		}
		smallest = Collections.min(substrings);
		largest = Collections.max(substrings);
		return smallest + "\n" + largest;
	}

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}
}
