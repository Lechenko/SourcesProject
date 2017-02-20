package com.homeTask2;
/*
 * Class which outputs the result to the console
 */

public class PrintArray 
{
	public PrintArray(int[]arr,String s)
	{
		if(arr == null || arr.length == 0)
		{
			throw new NullPointerException();
		}

		System.out.println(s);

		for(int x : arr)
		{
			System.out.print(x + " ");
		}
		System.out.println();
	}

	public PrintArray(int res)
	{
		System.out.println("result : " + res );
	}

}
