package com.venkat.recursion;

class char_calculator
{
	String str;
	int i=0;
	char[] c;
	int count=0;
	public int getstr(String st)
	{
		str = st;
		
		c = charsequence();
		return recursive_check('h');
	}
	public char[] charsequence()
	{
		char[] c = new char[str.length()];
		for(int i=0;i<str.length();i++)
		{
			c[i] = str.charAt(i);
		}
		return c;
	}
	
	public int recursive_check(char ch)
	{
		if(i<c.length)
		{
			if(ch==c[i])
			{
				count++;
			}
			i++;
			recursive_check(ch);
		}
		return count;
	}
}
public class charachter_occurence {
public static void main(String[] args)
{
	char_calculator c = new char_calculator();
	int number = c.getstr("hehho");
	System.out.print(number);
}
}
