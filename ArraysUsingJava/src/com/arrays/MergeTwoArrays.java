package com.arrays;

import java.util.Arrays;

public class MergeTwoArrays 
{
	private static int[] mergeTwoSameArrays(int arr[]) 
	{
		int len = arr.length;
		int temp[] = new int[len*2];
		
		for(int i=0;i<len;i++)
		{
			temp[i] = arr[i];
		}
		for(int i=0;i<len;i++)
		{
			temp[len+i] = arr[i];
		}
		
		return temp;
	}
	private static int[] mergeTwoArrays(int arr1[],int arr2[])
	{
		int len_arr1 = arr1.length;
		int len_arr2 = arr2.length;
		
		int temp[] = new int[len_arr1+len_arr2];
		
		for(int i=0;i<arr1.length;i++)
		{
			temp[i] = arr1[i];
		}
		for(int i=0;i<arr2.length;i++)
		{
			temp[len_arr1 + i] = arr2[i];
		}
		return temp;
	}
	

	public static void main(String[] args) 
	{
		int array1[] = {1,2,1};
		int array2[] = {2,8,2,2,1};
		int result1[] = mergeTwoSameArrays(array1);
		int result2[] = mergeTwoArrays(array1, array2);
		System.out.println("Resulted Array : " + Arrays.toString(result1));
		System.out.println("=============================================");
		System.out.println("Resulted Array : " + Arrays.toString(result2));
	}

}
