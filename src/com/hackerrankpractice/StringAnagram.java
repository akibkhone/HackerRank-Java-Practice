package com.hackerrankpractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Two strings a, and b, are called anagrams if they contain all the same characters in the same frequencies.
 *  For this challenge, the test is not case-sensitive.
 *  For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.
 */
public class StringAnagram
{
	static boolean isAnagram(String a, String b) {
		
    // Complete the function 
		char[] aChars = a.toLowerCase().toCharArray();
		char[] bChars = b.toLowerCase().toCharArray();
		Arrays.sort(aChars);
		Arrays.sort(bChars);
		
		return Arrays.equals(aChars, bChars);
}

public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    String b = scan.next();
    scan.close();
    boolean ret = isAnagram(a, b);
    System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
}
}
