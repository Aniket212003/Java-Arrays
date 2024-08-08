package com.arrays;

import java.util.Arrays;

public class UniqueElementsArrays 
{
	public static void uniqueElements(int arr[])
	{
		int[] unique = new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(arr[i]==arr[j])
				{
					unique[i] = arr[i];
				}
			}
		}
		System.out.println("Unique Elements : " + Arrays.toString(unique));
	}
	public static void main(String[] args) 
	{
		int array[] = {0,2,1,3,6,1,3,2,6,4,3};
		uniqueElements(array);
	}

}
