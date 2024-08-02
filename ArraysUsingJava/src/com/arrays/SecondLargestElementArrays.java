package com.arrays;

public class SecondLargestElementArrays 
{
	public static Integer secondLargestElement(Integer arr[])
	{
		int max = Integer.MIN_VALUE;
		int secondLargest = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] < max && arr[i] > secondLargest)
			{
				secondLargest = arr[i];
			}
		}
		return secondLargest;
	}

	public static void main(String[] args) 
	{
		Integer arr[] = {8,3,9,10,10,4,3,8,2,5,7,4};
		Integer result = secondLargestElement(arr);

		System.out.println("Second Largest Element of Array is : " + result);
	}

}
