package com.qa.arrays;

public class Leader_Number_In_Array {
	
	public static void main(String[] args) {
		int[] arr= {16,17,22,6,4,3,5,2};
		findLeaderNumber(arr);
	}
	
	public static void findLeaderNumber(int[] arr)
	{
		//Leader number is a number which is greater than all numbers to its right side
		//Right most element in an array will always be the leader number
		int leaderNum=arr[arr.length-1];
		
		System.out.print("Leader number is : "+leaderNum+" ");
		for(int i=arr.length-2;i>=0;i--)
		{
			if(arr[i]>leaderNum)
			{
				leaderNum=arr[i];
				System.out.print(leaderNum+" ");
			}
		}
	}

}
