package com.venkat.recursion;

class fibnocci
{
	int initial1=0;
	int initial2 = 1;
	int fibnocci;
	int asked_fibnocci=0;
	int flag=0;
	fibnocci(int number)
	{
		asked_fibnocci = number;
		recursive_fibnocci(asked_fibnocci);
	}
	public void recursive_fibnocci(int number)
	{
		
		if(flag==0)
		{
			System.out.println(initial1);
			System.out.println(initial2);
		}
		 flag = 1;
	 fibnocci = initial1+initial2;
	 initial1 = initial2;
	 initial2 = fibnocci;
	 System.out.println(fibnocci);
	 if(fibnocci!=asked_fibnocci)
	 {
		 recursive_fibnocci(fibnocci);
	 }
	}
}
public class fibnocci_recursion {
	public static void main(String[] args)
	{
		fibnocci f = new fibnocci(8);
		
	}
}
