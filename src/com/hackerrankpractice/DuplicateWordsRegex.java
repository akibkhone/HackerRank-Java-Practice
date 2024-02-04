package com.hackerrankpractice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWordsRegex
{
	/*
	 * 
	 * Certainly! Let's break down the regular expression pattern used in the code:
	 * 
	 * java Copy code String regex = "\\b(\\w+)(\\b\\W+\\b\\1\\b)*"; \\b: Word
	 * Boundary
	 * 
	 * \b is a word boundary anchor. It asserts a position at the start or end of a
	 * word (where a word is defined as a sequence of word characters, which are
	 * typically letters, digits, or underscores). (\\w+): Capturing Group for Word
	 * 
	 * \\w+ is a capturing group that matches one or more word characters. It
	 * captures the first occurrence of a word. 
	 * 
	 * (\\b\\W+\\b\\1\\b)*: Non-Capturing Group for Duplicate Words
	 * 
	 * ( ... )* is a non-capturing group that matches zero or more occurrences of
	 * the contained pattern. 
	 * \\b: Word boundary to ensure the duplicate word is not
	 * part of a longer word. 
	 * \\W+: Matches one or more non-word characters (such as
	 * spaces or punctuation), ensuring there is some separation between words. 
	 * \\b: Word boundary to further ensure separation. 
	 * \\1: Backreference to the first capturing group, which repeats the matched word. 
	 * \\b: Word boundary to ensure  the end of the duplicate word. 
	 * 
	 * This regular expression pattern is designed to
	 * identify words in a string. Specifically, it captures the first occurrence of
	 * a word using (\\w+), and then the non-capturing group (\\b\\W+\\b\\1\\b)*
	 * checks for zero or more subsequent occurrences of the same word, separated by
	 * non-word characters.
	 * 
	 * In the context of the program, this pattern helps identify duplicate words in
	 * a sentence. The replacement logic then removes all subsequent occurrences of
	 * each duplicate word, resulting in the expected output.
	 */

	public static void main(String[] args)
	{

		String regex = "\\b(\\w+)(\\b\\W+\\b\\1\\b)*";
		Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

		Scanner in = new Scanner(System.in);
		int numSentences = Integer.parseInt(in.nextLine());

		while (numSentences-- > 0)
		{
			String input = in.nextLine();

			Matcher m = p.matcher(input);

			// Check for subsequences of input that match the compiled pattern
			while (m.find())
			{
				input = input.replaceAll("\\b" + Pattern.quote(m.group(0)), m.group(1));
			}

			// Prints the modified sentence.
			System.out.println(input);
		}

		in.close();
	}
}
