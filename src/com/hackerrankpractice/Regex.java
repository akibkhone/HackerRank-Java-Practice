package com.hackerrankpractice;

import java.util.Scanner;

public class Regex
{
	/*
	 * ^ and $: These are anchors. They signify the start ^ and end $ of the string,
	 * respectively. So, the entire string must match the pattern.
	 * 
	 * (25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?): This part matches one of the four
	 * segments of the IP address. It's designed to ensure that the number is
	 * between 0 and 255.
	 * 
	 * 25[0-5]: Matches numbers between 250 and 255. 2[0-4][0-9]: Matches numbers
	 * between 200 and 249. [01]?[0-9][0-9]?: Matches numbers between 0 and 199. The
	 * ?[0-9] part allows for leading zeros. \\.: This ensures that each segment is
	 * separated by a dot.
	 * 
	 * Repeat the above pattern three times for the four segments of the IPv4
	 * address, separated by dots.
	 * 
	 * In simple terms, this regular expression checks that an IP address:
	 * 
	 * Is made up of four segments separated by dots. Each segment is a number
	 * between 0 and 255. No segment has unnecessary leading zeros.
	 * 
	 * Examples of valid IP addresses:
	 * 
	 * 192.168.1.1 255.255.255.255 0.0.0.0
	 * 
	 * Examples of invalid IP addresses:
	 * 
	 * 256.0.0.1 (because 256 is out of the valid range) 01.1.1.1 (leading zeros are
	 * not allowed)
	 * 
	 * The regular expression captures the structure and range constraints of a
	 * valid IPv4 address.
	 */

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while (in.hasNext())
		{
			String IP = in.next();
			System.out.println(IP.matches(new MyRegex().pattern));
		}

	}

}

class MyRegex
{
	public String pattern =	"^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." 
												+ "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\."
												+ "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." 
												+ "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

}