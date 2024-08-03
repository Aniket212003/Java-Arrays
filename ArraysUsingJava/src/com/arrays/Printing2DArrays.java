package com.arrays;

import java.util.Arrays;

public class Printing2DArrays 
{
	//using For-Loop
	public static void print2DForLoop(int matrix[][])
	{
		System.out.println("-------Using For-Loop-------");
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[i].length;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
		}
		System.out.println();
	}
	
	//using For-each
	public static void print2DForeach(int matrix[][])
	{
		System.out.println();
		System.out.println("-------Using For-each-------");
		for(int[] row : matrix)
		{
			for(int num : row)
			{
				System.out.print(num + " ");
			}
		}
		System.out.println();
	}
	
	//using toString
	public static void print2DToString(int matrix[][])
	{
		System.out.println();
		System.out.println("-------Using toString-------");
		for(int[] row : matrix)
		{
			System.out.println(Arrays.toString(row));
		}
	}
	
	public static void main(String[] args) 
	{
		int matrix[][] = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		
		print2DForLoop(matrix);
		print2DForeach(matrix);
		print2DToString(matrix);
	}

}
