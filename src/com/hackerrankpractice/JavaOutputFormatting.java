package com.hackerrankpractice;

import java.util.Scanner;

public class JavaOutputFormatting
{

	public static void main(String[] args)
	{
	  Scanner sc=new Scanner(System.in);
    System.out.println("================================");
    for(int i=0;i<3;i++){
        String s1=sc.next();
        int x=sc.nextInt();
        System.out.printf("%-15s%03d%n", s1, x);
        
//        %-15s: This is a placeholder for a string with a width of 15 characters. 
//        				The minus sign (-) denotes left-justification.
//
//        %03d: This is a placeholder for an integer with a width of 3 characters, 
//        			and %03d ensures that leading zeros are added if the number is less than three digits.
//
//        %n: This is a platform-independent newline character.
    }
    System.out.println("================================");

	}

}
