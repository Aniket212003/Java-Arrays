package com.arrays;

import java.util.Arrays;

public class RotateELementsToRightArrays 
{
	public static void rotateElementsToRight(int arr[], int d)
	{
		int temp[] = new int[arr.length];
		
		int k = 0;
		
		for(int i=arr.length-1;i>arr.length-1-d;i--)
		{
			temp[k] = arr[i];
			k++;
		}
		
		for(int i=0;i<arr.length-d;i++)
		{
			temp[k] = arr[i];
			k++;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = temp[i];
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

	public static void main(String[] args) 
	{
		int array[] = {1,2,3,4,5,6,7,8,9};
		int right = 2;
		rotateElementsToRight(array, right);
	}

}
