package com.server;



import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;




public class ServerJob 
{
	ArrayList<ClientCon> cc = new ArrayList<ClientCon>();
	private SimpleDateFormat sdf;

	public ServerJob() throws IOException
	{
		ServerSocket ss = new ServerSocket(7777);
		InputRead irr = new InputRead();
		sdf = new SimpleDateFormat("HH:mm:ss");
		saveLog("", false);

		irr.start();

		while(true)
		{
			cc.add( new ClientCon(ss.accept()));
		}
	}

	class InputRead extends Thread
	{
		@Override
		public void run() 
		{
			try 
			{
				while(true)
				{
					for (int i = 0; i < cc.size(); i++)
					{
						if( cc.get(i).in.available() > 0 )
						{
							String [] ar = cc.get(i).in.readUTF().split(":", 2); 
							String str = "";
							if (ar[1].length()>9)
							{
								str = ar[1].substring(9);
							}
							String cltData=ar[1].substring(0, 8);
							String cmd = ar[0];
							String srvData=sdf.format(new Date());      

							String logInClient= "from Client "+ cc.get(i).login+" Client date:" + cltData+" Server date:" +srvData +" Command:" + cmd+" Message:" +str;
							saveLog(logInClient, true);

							System.out.println(logInClient);
							switch (cmd)
							{
							case "login":
								cc.get(i).login=str;
								srvData=sdf.format(new Date());
								for (int j = 0; j < cc.size(); j++)
								{
									String logOutServer="from Server:"+cc.get(i).login+" to:"+cc.get(j).login+" Server date:"+srvData+" Command:"+cmd+" Message:has jast connected";
									saveLog(logOutServer, true);
									System.out.println(logOutServer);
									cc.get(j).out.writeUTF( "from "+cc.get(i).login+" has jast connected");
									cc.get(j).out.flush();
								}
								break;
							case "msg":
								srvData=sdf.format(new Date());
								for (int j = 0; j < cc.size(); j++)
								{
									String logOutServer="from Server:"+cc.get(i).login+" to:"+cc.get(j).login+" Server date:"+srvData+" Command:"+cmd+" Message:"+str;
									saveLog(logOutServer, true);
									System.out.println(logOutServer);
									cc.get(j).out.writeUTF( "from "+cc.get(i).login+" "+cmd+": " + str);
									cc.get(j).out.flush();
								}
								break;
							case "exit":
								srvData=sdf.format(new Date());
								for (int j = 0; j < cc.size(); j++)
								{
									String logOutServer="from Server:"+cc.get(i).login+" to:"+cc.get(j).login+" Server date:"+srvData+" Command:"+cmd+" Message:has jast disconnected";
									saveLog(logOutServer, true);
									System.out.println(logOutServer);
									cc.get(j).out.writeUTF( "from "+cc.get(i).login+" has jast disconnected");
									cc.get(j).out.flush();
								}
								cc.remove(i);
								break;
							}

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
	private static final String newLine = System.getProperty("line.separator");
	private synchronized void saveLog(String log, boolean flag)   
	{
		String fileName = "D:\\logChat.txt";
		PrintWriter printWriter = null;
		File file = new File(fileName);
		try 
		{
			if (!file.exists()) file.createNewFile();
			printWriter = new PrintWriter(new FileOutputStream(fileName, flag));
			printWriter.write(newLine + log);
		} 
		catch (IOException ioex) 
		{
			ioex.printStackTrace();
		}
		finally 
		{
			if (printWriter != null) 
			{
				printWriter.flush();
				printWriter.close();
			}
		}
	}

	class ClientCon
	{
		DataOutputStream out = null;
		DataInputStream  in  = null;
		Socket cs = null;
		private String login="new Client connection";

		public ClientCon(Socket cs) throws IOException 
		{
			this.cs = cs;
			out = new DataOutputStream(cs.getOutputStream());
			in  = new DataInputStream(cs.getInputStream());
		}
	}
}