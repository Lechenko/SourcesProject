package model;


public class DateDelivery 
{
	private  String cipher;
	private  String driverCode;
	private  String listCode;
	private  boolean dangerous;
	private  boolean fragile;
	private  String temp;
	private  String name;

	public DateDelivery()
	{

	}

	public DateDelivery(String cipher,String driverCode, String listCode, boolean dangerous, boolean fragile, String temp, String name)
	{
		this.cipher = cipher;
		this.driverCode = driverCode;
		this.listCode = listCode;
		this.dangerous = dangerous;
		this.fragile = fragile;
		this.temp = temp;
		this.name = name;
	}

	public String booleanToString(boolean b)
	{
		if (b==true) { return "true";}
		else {return "false";}
	}
	public String getCipher() {
		return cipher;
	}

	public void setCipher(String cipher) {
		this.cipher = cipher;
	}

	public String getDriverCode() {
		return driverCode;
	}

	public void setDriverCode(String driverCode) {
		this.driverCode = driverCode;
	}

	public String getListCode() {
		return listCode;
	}

	public void setListCode(String listCode) {
		this.listCode = listCode;
	}

	public boolean isDangerous() {
		return dangerous;
	}

	public void setDangerous(boolean dangerous) {
		this.dangerous = dangerous;
	}

	public boolean isFragile() {
		return fragile;
	}

	public void setFragile(boolean fragile) {
		this.fragile = fragile;
	}

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}





}
