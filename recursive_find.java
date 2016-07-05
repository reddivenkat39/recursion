package com.venkat.recursion;

class array_recursive
{
	int[] arra;
	int number;
	int index =0;
	int distinctive=0;
	public void getarr(int[] arr)
	{
		arra = arr;
		number = find_elements();
	}
	public int  find_elements()
	{	
		if(index<arra.length)
		{
			if(arra[index] == 11)
			{
			 distinctive++;	
			}
			index++;
			find_elements();
		}
		
		return distinctive;
	}
}
public class recursive_find {
	public static void main(String[] args)
	{
		int[] arr ={11,3,5,6,21,11,22,11};
		array_recursive ar = new array_recursive();
		ar.getarr(arr);
		System.out.print(ar.number);
	}
}
