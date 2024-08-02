package com.arrays;

import java.util.Arrays;

public class SortElementsAcendingArrays 
{
	public static void main(String[] args) 
	{
		Integer array[] = {4,3,0,5,4,9,7,6,3,0};
		System.out.println("Array Before Sorting : " + Arrays.toString(array));
		Arrays.sort(array);
		System.out.println("Array After Sorting : " + Arrays.toString(array));
		
	}

}
