package com.venkat.recursion;

class half_array
{
	int[] arra;
	int left_arr_size;
	int right_arr_size;
	int mid_index;
	int index_asked;
	int[] t_arr = new int[index_asked];
	half_array(int[] arr)
	{
		arra = arr;
	}
	public void getindex(int number)
	{
		index_asked = number;
		index_calculator(arra);
	}
	public int[] index_calculator(int[] arr)
	{
		if(arr.length > index_asked)
		{
		mid_index = arr.length/2;
		left_arr_size = arr.length - mid_index;
		int[] temp = new int[left_arr_size];
		for(int i=0;i<left_arr_size;i++)
		{
			temp[i] = arr[i];
		}
		t_arr = temp;
		return index_calculator(temp);
		}
		else
			return t_arr;
		
	}
	
	
	public void print()
	{
		for(int i=0;i<t_arr.length;i++)
		{
			System.out.print(t_arr[i]+" ");
		}
	}
}
public class printarra_length {
	public static void main(String[] args)
	{
		int[] arr = {3,4,5,6,7,8,9,10,11,23};
		half_array ha = new half_array(arr);
		ha.getindex(3);
		ha.print();
	}
}
