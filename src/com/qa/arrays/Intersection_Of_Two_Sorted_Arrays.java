package com.qa.arrays;

public class Intersection_Of_Two_Sorted_Arrays {
	public static void main(String[] args) {
		int[] arr1= {1,3,5,7};
		int[] arr2= {10,14,16,18};
		findCommonElementsBetweenSortedArrays(arr1, arr2);
	}
	
	public static void findCommonElementsBetweenSortedArrays(int[] arr1, int[]arr2)
	{
		int i=0, j=0, matchingElementCount=0;
		
		/*
		 * Iterate over the arrays and print when there is a matching element between them
		 * If there is no match then increment the index of array with smaller element
		 */
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]== arr2[j])
			{
				System.out.print(arr1[i]+" ");
				i++;
				j++;
				matchingElementCount++;
			}
			else if(arr1[i]<arr2[j])
			{
				i++;
			}
			else
			{
				j++;
			}
		}
		
		if(matchingElementCount==0)
		{
			System.out.println("There is no common element(s) between given arrays");
		}
	}

}
