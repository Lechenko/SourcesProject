package com.client;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Scanner;

import com.chatIO.ChatIO;

public class ClientJob 
{
	private String login = null;
	private ChatIO io =null;
	public ClientJob() throws UnknownHostException, IOException 
	{
	
		io = new ChatIO();
		
		io.addReceiveListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e)
			{
				System.out.println( e.getActionCommand() );	
			}
		} );
		
		
		 Scanner sc = new Scanner(System.in);

		  System.out.println("Input login:");
		  String login = sc.nextLine();
		  io.login(login);
		  
		  while(sc.hasNext())
		  {
		   String str = sc.nextLine();
		   //   System.out.println(str);
		   if (str.equalsIgnoreCase("exit"))
		   {
		    io.exit("exit");
		   }
		   else
		   {
		    io.send(str);
		   }
		  }
	}
}
