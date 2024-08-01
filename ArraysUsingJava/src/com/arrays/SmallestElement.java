package com.arrays;

public class SmallestElement 
{
	public static Integer smallestElement(Integer arr[])
	{
		int min = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) 
	{
		Integer array[] = {2,9,3,8,4,8,9,6,4};
		
		int num = smallestElement(array);
		System.out.println("Smallest element : " + num);
	}

}
