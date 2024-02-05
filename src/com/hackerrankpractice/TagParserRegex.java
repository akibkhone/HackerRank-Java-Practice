package com.hackerrankpractice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagParserRegex
{
	/*
	 * 
	 * 1. **What is a Regular Expression?** - A regular expression (regex) is a
	 * sequence of characters that defines a search pattern. - It allows you to
	 * match and manipulate text based on specific rules.
	 * 
	 * 
	 * In the code "<([^>]+)>([^<]+)</\\1>", let me break it down for you:
	 * 
	 * <: This means we start looking when we see an opening bracket <.
	 * ([^>]+): Inside the brackets, there can be any bunch of letters, numbers, or symbols,
	 * except for the closing bracket >. 
	 *	The + means there can be one or more of these characters. 
	 * This part is like a secret code to grab what's inside the first set of brackets. 
	 * >: This means we stop when we see the closing bracket >.
	 * ([^<]+): After the first set of brackets, there can be more letters,
	 * numbers, or symbols, but this time we stop when we see the opening bracket <.
	 * Again, the + means there can be one or more of these characters. This part is
	 * like a secret code to grab what's inside the second set of brackets. 
	 * </\\1>: Finally, we want to find the closing tag, which is like the first opening tag
	 * but with a slash / before it.
	 *  The \\1 is like a reminder to match the same thing we found in the first set of brackets.
	 * 
	 * **Example:** - Suppose we have the input: `<h1>Hello World</h1>` - The
	 * pattern matches: - Group 1: `<h1>` - Group 2: `Hello World`
	 * 
	 * **Summary:** - Regular expressions can be complex, but breaking them down
	 * into smaller parts helps understand their functionality. - Practice and
	 * experimentation are key to mastering regex!
	 * 
	 */
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int numLines = scanner.nextInt();
		scanner.nextLine(); // Consume the newline character after reading the integer

		for (int i = 0; i < numLines; i++)
		{
			String line = scanner.nextLine();
			extractValidContent(line);
		}
	}

	public static void extractValidContent(String text)
	{
		String pattern = "<([^>]+)>([^<]+)</\\1>";

		// Create a Pattern object from the regex pattern
		Pattern tagPattern = Pattern.compile(pattern);

		// Create a Matcher object to find all valid matches
		Matcher matcher = tagPattern.matcher(text);

		boolean found = false;
		// Process each match
		while (matcher.find())
		{
			String tagName = matcher.group(1); // Extract the tag name
			String content = matcher.group(2); // Extract the content
			System.out.println(content);
			found = true;
		}

		// If no valid content is found, print "None"
		if (!found)
		{
			System.out.println("None");
		}
	}
}
