package clientGUI;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.UnknownHostException;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import com.chatIO.ChatIO;



public class LoginPanel extends JPanel
{
	public boolean flag = true;
	JLabel lblD = null;
	JLabel lbl = null;
	JLabel lb2 = null;
	JLabel lb3 = null;
	JTextField txt = null;
	JTextField txt2 = null;
	JTextField txt3 = null;
	JButton btn = null;
	JButton btnSave = null;
	
	public LoginPanel(ChatIO io) throws UnknownHostException, IOException
	{

		setLayout(null);
        setBackground(Color.BLACK);

        lblD = new JLabel("defaul server address 127.0.0.1,port 7777");
        lblD.setBounds(100, 10, 300, 20);
        lblD.setForeground(Color.RED);
        
		lbl = new JLabel("Enter Login");
		lbl.setBounds(100, 40, 200, 20);
		lbl.setForeground(Color.RED);
		
		txt = new JTextField();
		txt.setBounds(100, 60, 200, 20);
		
		btn = new JButton("Connect to Server");
		btn.setBounds(100, 90, 200, 20);
		btn.setBackground(Color.WHITE);

		lb2 = new JLabel("Enter ip server");
		lb2.setBounds(100, 130, 200, 20);
		lb2.setForeground(Color.RED);
		
		txt2 = new JTextField();
		txt2.setBounds(100, 150, 200, 20);
		
		lb3 = new JLabel("Enter port server");
		lb3.setBounds(100, 180, 200, 20);
		lb3.setForeground(Color.RED);
		
		txt3 = new JTextField();
		txt3.setBounds(100, 200, 200, 20);

		btnSave = new JButton("Save seting");
		btnSave.setBounds(100, 230, 200, 20);
		btnSave.setBackground(Color.WHITE);
		
		add(lblD);
		add(lbl);
		add(lb2);
		add(lb3);
		add(txt);
		add(txt2);
		add(txt3);
		add(btn);
		add(btnSave);


		

		btn.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				try 
				{
					char str = ' ';
					
                    if(txt.getText().length() < 2 )
                    {
                    	JOptionPane.showMessageDialog(null, "enter login!");
                    }else
                    {
                    	for (int i = 0; i < txt.getText().length(); i++)
                    	{
                    		
                    		if(txt.getText().charAt(i) != str)
                    		{
                    			
                            	io.setLogin(txt.getText());
            					io.login(txt.getText());
            		
            					flag = false;
            					break;
                    		}else{
                    			JOptionPane.showMessageDialog(null, "enter login without spaces");
                    		}
							
						}
                    }
                    
				} catch (UnknownHostException e1) 
				{
					e1.printStackTrace();
				} catch (IOException e1)
				{
					e1.printStackTrace();
				}


			}
		});   
		btnSave.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				int port = Integer.parseInt(txt3.getText());
				io.setAdress(txt2.getText());
				io.setPort(port);
			}
		});   

	}


}
