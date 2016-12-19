package clientGUI;



import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.chatIO.ChatIO;


public class ClientPanel extends JPanel
{
	JTextArea txtArea = null;
	JTextField txt = null;
	JButton btnSend = null;
	JButton btnExit = null;
	JLabel lbl = null;
	JLabel lbl1 = null;
	JLabel lbl2 = null;

	public  boolean flag = true;

	public ClientPanel(ChatIO io) throws UnknownHostException, IOException
	{
		
		setLayout(null);
		setBackground(Color.BLACK);
		
		lbl = new JLabel("Chat Echo");
		lbl.setBounds(10, 10, 770, 20);
		lbl.setForeground(Color.LIGHT_GRAY);

		txtArea = new JTextArea();
		txtArea.setBounds(10, 30, 770, 350);
		txtArea.setBackground(Color.WHITE);

		lbl1 = new JLabel("Write your message in the box below");
		lbl1.setBounds(10, 400, 770, 20);
		lbl1.setForeground(Color.RED);
		
		
		lbl2 = new JLabel("login => \"" + io.getLogin() + "\"");
		lbl2.setBounds(500, 10, 100, 20);
		lbl2.setForeground(Color.RED);

		txt = new JTextField();
		txt.setBounds(10, 440, 770, 30);


		btnSend = new JButton("Send");
		btnSend.setBounds(50, 500, 100, 30);
		btnSend.setBackground(Color.WHITE);


		btnExit = new JButton("Exit");
		btnExit.setBounds(600, 500, 100, 30);
		btnExit.setBackground(Color.WHITE);

		add(lbl);
		add(txtArea);
		add(txt);
		add(lbl1);
		add(btnSend);
		add(btnExit);
		add(lbl2);




		io.addReceiveListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e)
			{
				String str = e.getActionCommand();
				txtArea.append(str + "\n");
				txtArea.setCaretPosition(0);		
			}
		} );	

		btnSend.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				try {
					io.send(txt.getText());
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				txt.setText("");
			}
		});   

		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try
				{

					io.exit("exit");
					flag = false;

				} catch (IOException e1) 
				{
					e1.printStackTrace();
				}


			}
		});  


	}


}
