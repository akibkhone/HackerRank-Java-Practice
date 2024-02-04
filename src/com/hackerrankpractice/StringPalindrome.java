package com.hackerrankpractice;

import java.util.Scanner;

public class StringPalindrome
{
	 public static void main(String[] args) {
     
     Scanner sc=new Scanner(System.in);
     String A=sc.next();
     /* Enter your code here. Print output to STDOUT. */
     StringBuilder reversedA = new StringBuilder(A).reverse();
     System.out.println(A.equals(reversedA.toString())? "Yes":"No");
 }
}
