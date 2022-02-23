package com.qa.arrays;

public class Union_Of_Two_Sorted_Arrays {
	
	public static void main(String[] args) {
		int[] arr1= {1,3,5,7};
		int[] arr2= {10,14,16,18};
		unionOfTwoSortedArrays(arr1, arr2);
		
	}
	
	public static void unionOfTwoSortedArrays(int[] arr1, int[] arr2)
	{
		int i=0, j=0;
		
		//Go thru the array and print the smallest number from each one until either of the indices are less than array length
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]==arr2[j])
			{
				System.out.println(arr1[i]+" ");
				i++;
				j++;
			}
			else if(arr1[i]<arr2[j])
			{
				System.out.print(arr1[i]+" ");
				i++;
			}
			else
			{
				System.out.print(arr2[j]+" ");
				j++;
			}
		}
		
		//Either of the indices should have reached array length so iterate over rest of array elements in both arrays
		while(i<arr1.length)
		{
			System.out.print(arr1[i]+" ");
			i++;
		}
		
		while(j<arr2.length)
		{
			System.out.print(arr2[j]+" ");
			j++;
		}
	}

}
