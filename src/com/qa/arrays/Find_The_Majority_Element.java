package com.qa.arrays;

import java.util.HashMap;
import java.util.Map;

public class Find_The_Majority_Element {
	public static void main(String[] args) {
		int[] arr= {1,2,2,4,2,2};
		findMajorityElementMooreVotingAlgo(arr);
	}
	
	//An array is an majority element if that occurs more than n/2 times in array
	//Method 1 using hashing
	static void findMajorityElementUsingHash(int[] arr)
	{
		Map<Integer,Integer> freqMap= new HashMap<Integer,Integer>();
		int count=1, result=Integer.MAX_VALUE;
		
		//calculate the frequency of each element and store it in hash map
		for(int i: arr)
		{
			if(freqMap.containsKey(i))
			{
				freqMap.put(i,freqMap.get(i)+1);
			}
			else
			{
				freqMap.put(i,count);
			}
		}
		
		int n=arr.length/2;
		//Iterate thru the key set to find the element whose frequency > n/2
		for(int num:freqMap.keySet())
		{
			if(freqMap.get(num)>n)
			{
				result=num;
				break;
			}
		}
		
		if(result!=Integer.MAX_VALUE)
			System.out.println("Majority element is "+result);
		else
			System.out.println("There is no majority element in the array");
	}
	
	static void findMajorityElementMooreVotingAlgo(int[] arr)
	{
		int count=1, max_ind=0,freq=0, n=arr.length/2;
		
		//Iterate thru the array and identify index of the element occuring most of the times
		//This is called Moore Voting algorithm
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[max_ind]==arr[i])
			{
				count++;
			}
			else
			{
				count--;
			}
			if(count==0)
			{
				max_ind=i;
				count=1;
			}
		}
		
		//Now we have the majority index and using that find the frequency of element in that particular position
		
		for(int j: arr)
		{
			if(arr[max_ind]==j)
			{
				freq++;
			}
		}
		
		if(freq>n)
			System.out.println("Majority element is "+arr[max_ind]);
		else
			System.out.println("There is no majority element in the array");

	}

}
