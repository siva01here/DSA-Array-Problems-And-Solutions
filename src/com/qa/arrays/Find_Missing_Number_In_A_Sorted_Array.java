package com.qa.arrays;

public class Find_Missing_Number_In_A_Sorted_Array {
	public static void main(String[] args) {
		int[] arr= {1,2,3,5};
		findTheMissingNumberInASortedArr(arr);
		
	}
	
	public static void findTheMissingNumberInASortedArr(int[] arr)
	{
		//method 1 using formula n*(n+1)/2
		//Here we use (n+1)(n+2) as the length of the array will be added by 1 (including missing number)
		int n=arr.length;
		int sumOfNums= ((n+1)*(n+2))/2;
		for(int i=0;i<arr.length;i++)
		{
			sumOfNums-=arr[i];
		}
		
		System.out.println("Missing number in the array is : "+sumOfNums);
		
		//method 2 using XOR
		int xorArr=0,xorRange=0, startRange=arr[0], endRange=arr[arr.length-1], missing_number=0;
		
		for(int i: arr)
		{
			xorArr=xorArr^i;
		}
		
		for(int j=startRange;j<=endRange;j++)
		{
			xorRange=xorRange^j;
		}
		
		
		missing_number=xorArr^xorRange;
		System.out.println("Missing number in the array is : "+missing_number);
	}


}
