package com.arrays;

public class UniqueElementsArrays 
{
	public static void uniqueElements(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			while(i < arr.length-1 && arr[i] == arr[i+1])
			{
				i++;
				System.out.print(arr[i]+ " ");
			}
			
			
		}
	}
	public static void main(String[] args) 
	{
		int array[] = {0,2,1,3,6,1,3,2,6,4,3};
		uniqueElements(array);
	}

}
