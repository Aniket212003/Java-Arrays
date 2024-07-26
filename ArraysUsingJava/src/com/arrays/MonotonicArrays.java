package com.arrays;

public class MonotonicArrays 
{
	public static boolean isMonotonic(int arr[])
	{
		boolean increasing = true;
		boolean decreasing = true;
		for(int i = 0 ; i < arr.length-1;i++)
		{
			if(arr[i] > arr[i+1])
			{
				increasing = false;
			}
			else if(arr[i] < arr[i+1])
			{
				decreasing = false;				
			}
		}		
		return increasing || decreasing;
	}
	
	public static void main(String args[])
	{
		int arr[] = {3,2,2,1};
		Boolean result = isMonotonic(arr);
		if(result == true)
			System.out.println("Array is Monotonic Array !!");
		else
			System.out.println("Array is Not Monotonic Array !!");
	}

}
