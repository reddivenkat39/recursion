package com.venkat.recursion;

class right_half
{
	int[] arra;
	int size;
	int[] t_arr = new int[size];
	right_half(int[] arr)
	{
		arra = arr;
	}
	public void setsize(int num)
	{
		size = num;
		finding_right_half(arra);
	}
	
	public int[] finding_right_half(int[] arr)
	{
		if(arr.length > size)
		{
		
		int midindex = arr.length/2;
	
		int right_arr_index = midindex+1;
		int j=0;
		if(midindex<size)
		{
			right_arr_index  = arr.length-size;
			
		}
		int[] temp = new int[arr.length - right_arr_index];
		
		for(int i=right_arr_index;i<arr.length;i++)
		{
		
			temp[j] = arr[i];
			j++;
		}
		//if(temp.length <= size)
		{
		t_arr = temp;
		
		}
		return finding_right_half(temp);
		}
		else
			return t_arr;
	}
	public void print()
	{
		for(int i=0;i<t_arr.length;i++)
		{
		System.out.print(" "+ t_arr[i]);
		}
	}
}
public class printing_right_array {

	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
		right_half rh = new right_half(arr);
		rh.setsize(5);
		rh.print();
		
	}
}

