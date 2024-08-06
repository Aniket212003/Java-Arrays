package com.arrays;

import java.util.Arrays;

public class MoveAllZeroToEndArrays 
{
	public static void allZerosToEnd(int arr[], int arraySize)
	{
		int cnt = 0;
		for(int i=0;i<arraySize;i++)
		{
			if(arr[i] != 0)
			{
				arr[cnt++]=arr[i];
			}
		}
		while(cnt < arraySize)
		{
			arr[cnt++] = 0;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) 
	{
		int array[] = {1,0,2,0,9,0,3,8,0};
		allZerosToEnd(array,array.length);
		
	}

}
