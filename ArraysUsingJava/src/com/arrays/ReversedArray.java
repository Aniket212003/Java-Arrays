package com.arrays;

import java.util.Arrays;

public class ReversedArray 
{
	public static void reversedArrayWhileLoop(int arr[])
	{
		int temp = 0;
		int i = 0;
		int j = arr.length-1;
		
		while(i<j)
		{
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		System.out.println("Using While Loop : ");
		System.out.println(Arrays.toString(arr));
		System.out.println();
	}
	
	public static void reversedArrayForLoop(int arr[],int n)
	{
		int temp = 0;
		for(int i=0;i < arr.length/2;i++)
		{
			temp = arr[i];
			arr[i] = arr[n-i-1];
			arr[n-i-1] = temp;
		}
		System.out.println("Using For Loop : ");
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) 
	{
		int array[] = {1,2,3,4,5,6};
		reversedArrayForLoop(array,array.length);
		reversedArrayWhileLoop(array);
	}

}
