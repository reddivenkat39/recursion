package com.venkat.recursion;

class GCD
{
	int num1;
	int num2;
	int quotient;
	int remainder;
	int result;
	GCD(int number1,int number2)
	{
		num1 = number1;
		num2 = number2;
		result = gcd_calculator(num1,num2);
	}
	
	public int  gcd_calculator(int n1,int n2)
	{
		if(n2>n1)
		{
		remainder = n2%n1;
		n2 = n1;
		n1 = remainder;
			
		}
		if(remainder != 0)
		{
			return gcd_calculator(n1,n2);
		}
		else
			return n2;
	}
}
public class GCD_main {
	public static void main(String[] args)
	{
		GCD g = new GCD(1701,3768);
		System.out.print(g.result);
	}
}
