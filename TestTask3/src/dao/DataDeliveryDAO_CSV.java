package dao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import com.csvreader.CsvWriter;
import model.DateDelivery;
/*
 *  Class to work with the CSV file
 */

public class DataDeliveryDAO_CSV 
{
	//Variables table
	private  String cipherTab = "Cipher";
	private  String driverCodeTab = "Driver code";
	private  String listCodeTab = "Code waybill";
	private  String dangerousTab = "Dangerous";
	private  String fragileTab = "Fragile";
	private  String tempTab = "Temperature";
	private  String nameTab = "Name";
	private  String fileName = "Cipher.csv";
	private CsvWriter csvOutput ;

	public void saveToCSV(ArrayList<DateDelivery> dd)
	{ 
		try
		{
			// use FileWriter constructor that specifies open for appending
			csvOutput = new CsvWriter(new FileWriter(fileName, false),',');
		


		} 
		catch (IOException e) 
		{
			System.out.println(e.getMessage());
		}
		try 
		{
			csvOutput.write(cipherTab);
			csvOutput.write(driverCodeTab);
			csvOutput.write(listCodeTab);
			csvOutput.write(dangerousTab);
			csvOutput.write(fragileTab);
			csvOutput.write(tempTab);
			csvOutput.write(nameTab);
			csvOutput.flush();
			csvOutput.endRecord();
			for (DateDelivery dateDelivery : dd) 
			{
				csvOutput.write(dateDelivery.getCipher());
				System.out.println(dateDelivery.getCipher());
				csvOutput.write(dateDelivery.getDriverCode());
				csvOutput.write(dateDelivery.getListCode());
				csvOutput.write(dateDelivery.booleanToString(dateDelivery.isDangerous()));
				csvOutput.write(dateDelivery.booleanToString(dateDelivery.isFragile()));
				csvOutput.write(dateDelivery.getTemp());
				csvOutput.write(dateDelivery.getName());
				csvOutput.endRecord();	
				System.out.println(dateDelivery.toString());
			}
			csvOutput.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
