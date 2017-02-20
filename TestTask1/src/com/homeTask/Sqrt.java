package com.homeTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sqrt 
{
	private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public Sqrt() 
	{
		System.out.print("Enter number: ");
		int n = 0;
		try {
			n = Integer.parseInt(reader.readLine());
		} catch (NumberFormatException | IOException e) 
		{
			e.printStackTrace();
		}
		System.out.println("result: " + function(n));	
	}

	private int function(int y)
	{
		if (y<=0)
			throw new IllegalArgumentException();

		int x1=0;//* Nizhniaja granica diapazona
		int x2=46340; //* Verchniaja granica diapazona
		int x=(x1+x2)/2;
		int y1=x*x;

		do
		{

			if (y-y1>0)
			{
				x1=x;
			}
			else if(y-y1<0)
			{
				x2=x;
			}
			else
			{
				x1=x;
				x2=x;
			}
			x=(x1+x2)/2;
			y1=x*x;
		}
		while(x-x1!=0 && x-x2!=0); 

		return (x);
	}
}
