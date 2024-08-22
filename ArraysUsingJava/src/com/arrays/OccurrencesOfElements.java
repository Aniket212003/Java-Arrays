package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class OccurrencesOfElements 
{
	public static int findOccurrenceOfElement(int arr[], int n, int ele)
	{
		int cnt = 0;
		for(int i=0;i<n;i++)
		{
			if(arr[i] == ele)
			{
				cnt++;
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) 
	{
		int array[] = {1,2,4,8,9,4,8,3,9,5,9};
		Scanner sc = new Scanner(System.in);
		System.out.println(Arrays.toString(array));
		System.out.print("Enter element to Find Its Occurrence : ");
		int element = sc.nextInt();
		int occurrence = findOccurrenceOfElement(array, array.length, element);
		System.out.println("Element "+element+" Occurrence is : " + occurrence);
	}

}
