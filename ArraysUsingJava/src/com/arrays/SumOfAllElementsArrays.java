package com.arrays;

public class SumOfAllElementsArrays 
{
	public static Integer sumOfAllElements(Integer arr[])
	{
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			sum = sum + arr[i];
		}
		return sum;
	}
	
	public static void main(String[] args) 
	{
		Integer array[] = {4,8,6,5,8,3,0,9,3,6};
		Integer sum = sumOfAllElements(array);
		System.out.println("Sum of all Elements in Array : " + sum);
	}
}
