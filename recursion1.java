package com.venkat.recursion;

class factorial
{
	int number;
	public factorial()
	{
	
	}
	
	public int factorial_r(int number)
	{
		if(number==1)
		{
			return 1;
		}
		return number*factorial_r(number-1);
	}
}

public class recursion1 {

	public static void main(String[] args)
	{
		factorial f = new factorial();
		int n = f.factorial_r(5);
		System.out.println(n);
	}
}
