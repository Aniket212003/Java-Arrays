package com.arrays;

import java.util.Arrays;

public class RotatedArrays 
{
	public static void rotateArray(Integer arr[], int len) 
	{
		int i = 0;
		int j = len-1;
		int temp = 0;
		while(i<j)
		{
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
		System.out.println("Rotated Array : " + Arrays.toString(arr));
	}
	
	public static void main(String[] args) 
	{
		Integer array[] = {1,2,3,4,5,6};
		rotateArray(array, array.length);

	}

}
