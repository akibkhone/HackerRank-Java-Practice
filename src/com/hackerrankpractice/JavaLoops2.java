package com.hackerrankpractice;

import java.util.Scanner;

class JavaLoops2
{
	public static void main(String[] argh)
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++)
		{
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			int term = a;
			for (int j = 0; j < n; j++)
			{
				term = term + (int) (Math.pow(2, j) * b);
				System.out.print(term + " ");
			}

			System.out.println(); // Newline after each series

		}
		in.close();
	}
}
