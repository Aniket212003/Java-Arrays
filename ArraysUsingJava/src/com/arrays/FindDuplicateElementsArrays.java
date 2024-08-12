package com.arrays;

import java.util.Arrays;

public class FindDuplicateElementsArrays 
{
	public static void findAllDuplicateElements(int arr[])
	{
		int temp[] = new int[arr.length];
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.print(" "+ arr[j]);
				}
			}
		}
		//System.out.println(Arrays.toString(temp));
	}
	
	public static void main(String[] args) 
	{
		int array[] = {2,1,2,8,4,9,4,6,4,7,2,9};
		findAllDuplicateElements(array);
	}
	
}
