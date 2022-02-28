package com.qa.arrays;

public class Replace_Every_Element_With_Greatest_From_Right {
	
	public static void main(String[] args) {
		int[] arr= {1,2,0,1,5,2,-1,1};
		replaceEveryElementWithGreatestFromRight(arr);
	}
	
	static void replaceEveryElementWithGreatestFromRight(int[] arr)
	{
		
		//Assumption in this case is array size is greater than or equal 2
		//Store the right most value in a variable and assume it to be max
		int maxFromRight=arr[arr.length-1];
		
		//Greatest element after the right most element will be -1
		arr[arr.length-1]=-1;
		
		for(int i=arr.length-2;i>=0;i--)
		{
			//Store the array element in a temp variable
			int temp=arr[i];
			
			//assign the max element to the array
			arr[i]=maxFromRight;
			
			//Replace max with another max element in the array
			if(maxFromRight<temp)
			{
				maxFromRight=temp;
			}
		}
		
		//Print the array
		for(int j: arr)
		{
			System.out.print(j+" ");
		}
	}

}
