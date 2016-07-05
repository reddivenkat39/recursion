package com.venkat.recursion;

class replace_string
{
	String str;
	char[] c;
	int i=0;
	String st = "";
	public void getstr(String st)
	{
		str = st;
		c = chararr(str);
		append();
	}
	public char[] chararr(String st)
	{
		char[] ch = new char[st.length()];
		for(int i=0;i<st.length();i++)
		{
			ch[i] = st.charAt(i);
		}
		return ch;
	}
	public void append()
	{
		if(i<c.length-1)
		{
		String check = ""+c[i]+c[i+1];
		
		if(check.equals("pi"))
		{
			st=st+"3.14";
			i=i+2;
			append();
		}
		}
		if(i<c.length)
		{
			
		st = st+c[i];
		i++;
		append();
		}
		
	}
	
	public void print()
	{
	System.out.println(st);
	}
	
}
public class change_string {
	public static void main(String[] args)
	{
		replace_string rs = new replace_string();
		rs.getstr("xyzzepi");
		rs.print();
	}
}
