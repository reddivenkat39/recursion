package com.venkat.recursion;

// given an array construct its in-order array. 

// The array can be constructed for only balanced tree since the condition is not written for 
// unbalanced arrays
//pow(2,n)-1 is supported
class construct_tree
{
	int[] arra;
	int[] rootarr;
	
	int index = 0;
	construct_tree(int[] arr)
	{
		arra = arr;
		rootarr = new int[arra.length];
		System.out.println(rootarr.length);
		tree(arra);
	}
	
	public void tree(int[] arr)
	{
		
		rootarr[index] = arr[0];
			index++;
		if(arr.length>1)
		{

		int j=0;
		int k=0;
		int mid = (arr.length-1)/2;
		int leftindex = 1;
		int rightindex = mid+1;
		int[] leftarr = new int[rightindex-leftindex];
		int[] rightarr = new int[arr.length-(leftarr.length)-1];
		
		for(int i= leftindex;i<rightindex;i++)
		{
			leftarr[k] = arr[i];
			k++;
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
	
		tree(left);
		tree(right);
	}

	
}

public class test {

	public static void main(String[] args)
	{
		int[] arr = {1,2,3};
		construct_tree tr = new construct_tree(arr);
		int[] arra = tr.rootarr;
		for(int i=0;i<arra.length;i++)
		{
			System.out.print(arra[i]+ " ");
		}
	}
}
