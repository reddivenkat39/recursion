package com.venkat.recursion;

class arr_print

{
	int[] arra;

	arr_print(int[] arr)
	{
		arra= arr;
		recursive_print(arra);
		
	}
	
	public void recursive_print(int[] arr)
	{
		
		if(arr.length>1)
		{
		
		arr = leftarr(arr);
		recursive_print(arr);
		arr = rightarr(arr);	
		recursive_print(arr);
	System.out.print(arr[0]);
		}
	}
	
	int[] leftarr(int[] arr)
	{
		int[] temp  = new int[(arr.length/2)];
		for(int i=0;i<(arr.length/2);i++)
		{
			temp[i] = arr[i];
		}
		return temp;
	}
	
	int[] rightarr(int[] arr)
	{
		int[] temp = new int[arr.length -(arr.length/2)];
		int j=0;
		for(int i=(arr.length/2)+1;i<arr.length;i++)
		{
		temp[j] =arr[i];	
		}
		return temp;
	}
}
public class recursive_array {
	public static void main(String[] args)
	{
		int[] arr ={1,4,5,8,9,10};
		
		arr_print ap = new arr_print(arr);
	}
}
