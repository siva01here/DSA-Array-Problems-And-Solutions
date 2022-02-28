package com.qa.arrays;

import java.util.HashMap;
import java.util.Map;

public class Find_The_Odd_Occuring_Element {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,1,4,3,2,1,3};
		findTheOddOccuringElementUsingXor(arr);
		findTheOddOccuringElementUsingHashing(arr);
		
	}
	
	//Method 1 using hashing
	static void findTheOddOccuringElementUsingHashing(int[] arr)
	{
		Map<Integer,Integer> freqMap= new HashMap<Integer, Integer>();
		int count=1,result=Integer.MAX_VALUE;
		//Find the frequency of each element using hash map
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
		
		//Iterate thru the key set and get the value and then mod it by 2 to check its frequency is odd or not
		for(int key: freqMap.keySet())
		{
			if((freqMap.get(key)%2)!=0)
			{
				result=key;
			}
		}
		
		if(result!=Integer.MAX_VALUE)
			System.out.println("Odd occuring element in the array "+result);
		else
			System.out.println("There are no odd occuring element in the array");
	}
	
	//method 2 using XOR
	static void findTheOddOccuringElementUsingXor(int[] arr)
	{
		int result=0;
		//Iterate thru the array and XOR with each element
		for(int i:arr)
		{
			result=result^i;
		}
		
		System.out.println("Odd occuring element in the array "+result);
	}

}
