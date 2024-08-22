package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindIndexOfElement 
{
	public static int indexOfElement(int arr[], int n, int ele)
	{
		for(int i=0;i<n;i++)
		{
			if(ele == arr[i])
			{
				return i;
			}
		}
		return 0;
	}

	public static void main(String[] args) 
	{
		int array[] = {1,2,3,3,4,5,8,9};
		Scanner sc = new Scanner(System.in);
		System.out.println(Arrays.toString(array));
		System.out.print("Enter element to Find Its Index : ");
		int element = sc.nextInt();
		int index = indexOfElement(array, array.length, element);
		System.out.println("Element "+element+" found at index : " + index );

	}

}
