package com.hackerrankpractice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagParserRegex
{
	/*
	 * 
	 * 1. **What is a Regular Expression?** 
	 * - A regular expression (regex) is a sequence of characters that defines a search pattern. 
	 * - It allows you to match and manipulate text based on specific rules.
	 * 
	 * 2. **Components of the Regular Expression:** 
	 * - In the pattern `(<tag>)([^<]+)(</tag>)`, we have three main components: 
	 * - `<tag>`: This matches an opening tag (e.g., `<h1>`). 
	 * - `([^<]+)`: This captures the content between the opening and closing tags (excluding any `<` characters). 
	 * - `</tag>`: This matches a closing tag (e.g., `</h1>`).
	 * 
	 * 3. **Explanation of Each Component:** 
	 * - `<tag>`: The angle brackets (`<` and `>`) denote an opening or closing tag. For example, `<h1>` is an opening `<h1>` tag.
	 * - `([^<]+)`: Let's break this down further: 
	 * - `[^<]`: The `^` inside square brackets means "not." So `[^<]` matches any character except
	 * `<`. - `+`: This means "one or more." So `[^<]+` matches one or more characters that are not `<`. 
	 * - Overall, `([^<]+)` captures the content between the tags. - `</tag>`: This matches a closing tag. For example,
	 * `</h1>` is a closing `</h1>` tag.
	 * 
	 * 4. **How It Works:** 
	 * - The entire pattern `(<tag>)([^<]+)(</tag>)` looks for a valid pair of opening and closing tags. 
	 * - It captures the content between the tags (if any) and ensures that the opening and closing tags have the same
	 * name (e.g., `<h1>` and `</h1>`).
	 * 
	 * 5. **Example:** - Suppose we have the input: `<h1>Hello World</h1>` 
	 * - The pattern matches: - Group 1: `<h1>` - Group 2: `Hello World`
	 * 
	 * 6. **Summary:** - Regular expressions can be complex, but breaking them down
	 * into smaller parts helps understand their functionality. 
	 * - Practice and  experimentation are key to mastering regex!
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

		// Process each match
		while (matcher.find())
		{
			String tagName = matcher.group(1); // Extract the tag name
			String content = matcher.group(2); // Extract the content
			System.out.println(content);
		}

		// If no valid content is found, print "None"
		if (!matcher.matches())
		{
			System.out.println("None");
		}
	}
}
