package com.hackerrankpractice;

import java.util.Calendar;

public class DateAndTime
{
	public static String findDay(int month, int day, int year)
	{
		// Create a Calendar instance and set the specified date
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month - 1, day); // Month is zero-based, so subtract 1

		// Get the day of the week
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

		// Convert the day of the week to a string
		String[] days =
		{ "", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };
		return days[dayOfWeek];
	}

	public static void main(String[] args)
	{
		// Example usage
		int month = 8;
		int day = 5;
		int year = 2015;
		System.out.println(findDay(month, day, year)); // Output: WEDNESDAY
	}
}
