package com.venkat.recursion;

class split
{
	int[] arra;
	split(int[] arr)
	{
		arra = arr;
		break_array(arra);
	}
	
	public void break_array(int[] arr)
	{
	if (arr.length == 1)
	{
		System.out.print(arr[0]);
	}
	else
	{	
		
		int j=0;
		int mid;
		 mid = (arr.length/2);	
		int rightindex = arr.length - mid;
		int[] leftarr = new int[rightindex];
		int[] rightarr = new int[arr.length-leftarr.length];
		for(int i=0;i<rightindex;i++)
		{
			leftarr[i] = arr[i];
		}
		for(int i=rightindex;i<arr.length;i++)
		{
			rightarr[j] = arr[i];
		
			j++;
		}
		function(leftarr,rightarr);
	}
	}
	
	public void function(int[] left,int[] right)
	 {
	  break_array(left);
	  break_array(right);
	  }
	 
	
}
public class split_array {

	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6,7};
		split sp = new split(arr);
		
	}
}
