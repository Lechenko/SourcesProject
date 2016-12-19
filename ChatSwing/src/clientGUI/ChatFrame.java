package clientGUI;

import java.awt.Color;
import java.io.IOException;
import java.net.UnknownHostException;

import javax.swing.JFrame;

import com.chatIO.ChatIO;

public class ChatFrame extends JFrame 
{
	private boolean flag = true;
	public ChatFrame() throws UnknownHostException, IOException
	{
		
		setTitle("Frame connect to server");
		setBounds(250, 250, 400, 300);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		ChatIO io = new ChatIO();
		LoginPanel lg = new LoginPanel(io);	

		add(lg);

		setVisible(true);
		while(flag)
		{
			System.out.println();
			if(lg.flag == false)
			{
				remove(lg);
				flag = false;
			}
		}
		ClientPanel cf = new ClientPanel(io);	
		setTitle("Chat client");
		setBounds(250, 250, 800, 600);
		add(cf);
		setVisible(true);	
		flag = true;
		while(flag)
		{
			System.out.println();
			if(cf.flag == false)
			{
				flag = false;
				this.dispose();
			}
		}
	}


}
