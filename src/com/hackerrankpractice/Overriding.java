package com.hackerrankpractice;

/*
 * 
 * Object Oriented Programming    
 * Java Method Overriding
 */
class Sports
{

	String getName()
	{
		return "Generic Sports";
	}

	void getNumberOfTeamMembers()
	{
		System.out.println("Each team has n players in " + getName());
	}
}

class Soccer extends Sports
{
	@Override
	String getName()
	{
		return "Soccer Class";
	}

	// Write your overridden getNumberOfTeamMembers method here
	

	@Override
	void getNumberOfTeamMembers()
	{
		System.out.println("Each team has 11 players in Soccer Class");
	}


}

public class Overriding
{

	public static void main(String[] args)
	{
		Sports c1 = new Sports();
		Soccer c2 = new Soccer();
		System.out.println(c1.getName());
		c1.getNumberOfTeamMembers();
		System.out.println(c2.getName());
		c2.getNumberOfTeamMembers();
	}
}
