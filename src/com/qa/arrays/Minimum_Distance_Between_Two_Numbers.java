package com.qa.arrays;

public class Minimum_Distance_Between_Two_Numbers {
	
	public static void main(String[] args) {
		int[] arr= {3,4,5,6,6,7,3,6,6,2,3};
		int x=3, y=6;
		findMinDistanceBetweenGivenNumbers(arr, x, y);
	}
	
	public static void findMinDistanceBetweenGivenNumbers(int[] arr, int x, int y)
	{
		
		int i=0, min_distance=Integer.MAX_VALUE,previous=-1;
		
		//Iterate thru the array to get the first index which has either x or y
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==x || arr[i]==y)
			{
				previous=i;
				break;
			}
		}
		
		//Now iterate over rest of the array to find the minimum distance between the given numbers
		for(;i<arr.length;i++)
		{
			if(arr[i]==x || arr[i]==y)
			{
				/*Check either x or y is not the same as previous value
				 * In that case find the distance between them
				 * assign it to min_distance*/
				if(arr[i]!=arr[previous] && (i-previous)<min_distance)
				{
					min_distance=(i-previous);
					previous=i;
				}
				else
				{
					previous=i;
				}
			}
		}
		if(min_distance==Integer.MAX_VALUE)
			System.out.println("Minimum Distance between 3 and 6 is :"+ "-1");
		else
			System.out.println("Minimum Distance between "+x+" and "+y+" is : "+min_distance);
	}

}
