package com.homeTask2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Launching 
{
	private BufferedReader reader = null;
	private int[] arr = null;   // array
	private int sizeArrays = 0; // size arrays
	private int k = 0;          // index k

	//the task constructor
	public Launching()
	{
		iniArray();                            // method to populate an array
		new PrintArray(arr,"Enter Arrays: "); // the object to be displayed in the console
		new IndexMass(arr,k);                // object which makes sorting and search the index K
	}

	private void iniArray()
	{
		reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter size massiv : ");
		try
		{
			sizeArrays = Integer.parseInt(reader.readLine());
			arr = new int[sizeArrays];
		} catch (Exception e)
		{
			e.printStackTrace();
		}

		System.out.println();

		System.out.print("Enter index K : ");
		try
		{
			k = Integer.parseInt(reader.readLine());
		} catch (Exception e)
		{
			e.printStackTrace();
		}

		System.out.println();


		try
		{
			for (int i = 0; i < arr.length; i++) 
			{
				System.out.print("Enter element arrays : ");
				int enterMasiv = Integer.parseInt(reader.readLine());
				arr[i] = enterMasiv;
			}
		}catch (Exception e)
		{
			e.printStackTrace();
		}

	}
}
