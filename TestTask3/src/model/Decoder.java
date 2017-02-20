package model;

import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import dao.CodeMOCK;
/*
 *  The class that parses the code
 */
public class Decoder
{
	private String cipherCode = "([a-zA-Z]{4})+.*((R|r)+?([\\w]{4})([a-zA-Z]{4})?((\\+|\\-)[0-9]{3})?([0-9]*))";// regular expression
	private CodeMOCK codeList = null;
	private ArrayList<DateDelivery> arrDD = null;
	private DateDelivery dd = null;

	public Decoder()
	{
		codeList = new CodeMOCK();
		arrDD = new ArrayList<DateDelivery>();
	}

	public ArrayList<DateDelivery> decoder(String[]codeList)
	{
		for(String code : codeList)
		{
			arrDD.add(matcher(code));
		}
		return arrDD;
	}

	private DateDelivery matcher(String code)
	{
		String g1,g3,g4,g6,g7,g8;
		Pattern p = Pattern.compile(cipherCode);  
		Matcher m = p.matcher(code);
		dd = new DateDelivery();
		dd.setCipher(code);// we write the code
		if(m.find())
		{
			//driver code
			if(m.group(1) != null && m.group(2) != null)
			{
				g1 = m.group(1);
				dd.setDriverCode(g1);


				//Code list
				if(m.group(3) != null && m.group(4) != null)
				{

					g3 = m.group(3);
					g4 = m.group(4);
					g3 += g4;

					dd.setListCode(g3);

					//dangerous cargo
					if(g4.contains("d"))
					{
						dd.setDangerous(true);
					}
					else 
					{
						dd.setDangerous(false);
					}
					//Fragile cargo
					if(g4.contains("f")) 
					{
						dd.setFragile(true);
					} 
					else 
					{
						dd.setFragile(false);
					}
				}

				// Temperature
				if(m.group(6) != null && m.group(7) != null) 
				{

					g6 = m.group(6);
					g7 = m.group(7);
					g7+=g6;
					dd.setTemp(g7);

					if(m.group(7) != null)
					{
						g8 = m.group(7);
					}
				} 
				else
				{
					dd.setTemp("");
				}

				// Name
				if(m.group(8) != null) {
					g8 = parseWord(m.group(8));
					dd.setName(g8);
				}

			}
		}
		return dd;
	}

	//ASCII cod for name
	public String parseWord(String cipherNumber) {

		String[] c = cipherNumber.split("(?<=\\G.{3})");

		c = checkWorkCode(c);

		String word = "";

		for(int i=0; i <= c.length-1;i++) {
			if(c[i].length() == 3) {
				int oct = Integer.valueOf(c[i], 8);
				char ch = (char) oct;
				word += ch;
			}
		}

		return word;
	}

	public String[] checkWorkCode(String[] Array) {

		int index = 0;

		String[] newArray = new String[Array.length-1];

		for(int i=0;i<Array.length-1;i++) {
			if(Array[i].length() == 3) {
				newArray[index] = Array[i];
				index++;
			}
		}

		return newArray;
	}
}
