package com.venkat.recursion;

class recursion
{
	public int earcalculator(int number)
	{
		
		if(number>0)
		{
		return	2+earcalculator(number-1);
		}
		else
			return 1;
	}
	
	public int totalears(int number)
	{
		return earcalculator(number);
	}
}
public class bunnyears {
	public static void main(String[] args)
	{
		recursion r = new recursion();
		int number = r.totalears(5);
		System.out.println(number);
		
	}
}
