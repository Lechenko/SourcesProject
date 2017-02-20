package model;

import java.util.ArrayList;
import dao.CodeMOCK;
import dao.DataDeliveryDAO_CSV;

public class Main
{
	public static void main(String[] args)
	{
		ArrayList<DateDelivery> arrDD = new ArrayList<>();      //Declare an array of objects
		CodeMOCK cm = new CodeMOCK();                          //We declare the object with a cipher code	
		Decoder dr = new Decoder();                           //Declare an object that parses the code
		arrDD = dr.decoder(cm.getCodeList());                //Parse the code
		DataDeliveryDAO_CSV cv = new DataDeliveryDAO_CSV(); //We declare the object CSV
		cv.saveToCSV(arrDD);                               //Create a CSV file, and write an array of objects from the disassembled codes to a CSV file
		cm.printMock();	                                  //Console check
	}
}
