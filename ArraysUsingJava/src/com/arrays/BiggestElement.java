package com.arrays;

public class BiggestElement 
{
	public static Integer greatestElement(Integer arr[])
	{
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) 
	{
		Integer array[] = {2,6,1,9,1,4};
		Integer num = greatestElement(array);
		System.out.println("Biggest Element : " + num);
	}
}
