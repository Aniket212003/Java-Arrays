package com.arrays;

import java.util.Arrays;

public class RotateElementsToLeftArrays 
{
	public static void rotateToLeftByDposition(int arr[],int d)
	{
		int temp[] = new int[arr.length];
		
		int k = 0;
		
		for(int i=d;i<arr.length;i++)
		{
			temp[k] = arr[i];
			k++;
		}
		
		for(int i=0;i<d;i++)
		{
			temp[k] = arr[i];
			k++;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = temp[i];
		}
		
		System.out.println("Array Rotated First Two elements : " + Arrays.toString(arr));
	}
	
	public static void main(String[] args) 
	{
		int array[] = {3,1,0,9,8,2,4};
		int d = 2;
		
		rotateToLeftByDposition(array, d);
	}

}
