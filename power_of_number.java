package com.venkat.recursion;

class power
{
	int base ;
	int powe;
	power(int base,int pow)
	{
		this.base = base;
		this.powe = pow;
		System.out.print(pow_calculator(this.base,powe));
	}
	
	public int pow_calculator(int b,int p)
	{
		if(p == 0)
		{
			return 1;
		}
		else
		{
			return b*pow_calculator(b,p-1);
		}
	}
}
public class power_of_number {

	public static void main(String[] args)
	{
		power p = new power(4,3);
	}
}
