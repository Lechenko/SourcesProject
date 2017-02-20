package com.homeTask2;
/*
 * The class that sorts the array, and is an element of the index K
 */
public class IndexMass 
{
	private int res ;

	public IndexMass(int[]arr,int k)
	{	
		sortArrya(arr);                           // Array sorting method 
		new PrintArray(arr,"Sorted Arrays: ");    
		function(arr,k);
	}

	// cell search method
	private void function(int[]arr,int k) 
	{
		if(arr.length == 0 || arr == null || k == 0 )
		{
			System.out.println("arr == 0 || k == 0");
			throw new NullPointerException();
		}

		k--;
		for (int i = 0; i < arr.length; i++) {
			if(arr[k] == arr[i])
			{
				res = arr[k];
				new PrintArray(res);
			}	
		}
	}
	// sorting method
	private void sortArrya(int[]arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			int temp = arr[i];
			int j =i-1;
			while(j >= 0 && arr[j] > temp)
			{
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}  
	}
}


