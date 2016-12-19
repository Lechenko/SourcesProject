package com.chatIO;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class ChatIO 
{
	private Socket cs = null;
	private DataOutputStream out = null;
	private DataInputStream  in  = null;
	private boolean flag=true;
	private SimpleDateFormat sdf;
	private String login = null;
	private String adress = "127.0.0.1";
	private int port = 7777;

	private ArrayList<ActionListener> lst = new ArrayList<ActionListener>(); 

	public ChatIO() throws UnknownHostException, IOException 
	{
		cs = new Socket(getAdress(),getPort());
		out = new DataOutputStream(cs.getOutputStream());
		in  = new DataInputStream(cs.getInputStream());
		sdf = new SimpleDateFormat("HH:mm:ss");

		InputRead irr = new InputRead();
		
		irr.start();
	}

	public void send(String str) throws IOException
	{
		out.writeUTF("msg:"+sdf.format(new Date())+" "+str);
		out.flush();
	}
	public void login(String str) throws IOException
	{
		out.writeUTF("login:"+sdf.format(new Date())+" "+str);
		out.flush();
	}
	public void exit (String str) throws IOException
	{
		out.writeUTF("exit:"+sdf.format(new Date())+"");
		out.flush();
		cs.close();
		in.close();
		out.close();
		flag=false;
	}
	public void addReceiveListener( ActionListener ee)
	{
		lst.add(ee);
	}

	public String getLogin() {
		return login;
	}
	public void setLogin(String str) {
		this.login = str;
	}
	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
		System.out.println(adress);
	}
	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	private class InputRead extends Thread
	{
		
		@Override
		public void run() 
		{
			try 
			{
				while(flag)
				{
					if( in.available() > 0 )
					{
						String str = in.readUTF();
						for (ActionListener a : lst)
						{
							ActionEvent e = new ActionEvent(ChatIO.this, 1, str);
							a.actionPerformed(e);
						}
					}
					Thread.sleep(50);
				}
			}
			catch (IOException | InterruptedException e) 
			{
				e.printStackTrace();
			}
		}  
	}
}