package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import logik.Person;

public class VDialog extends JDialog
{

	JTextField  d_Id      = null;
	JTextField  d_FName   = null;
	JTextField  d_LName   = null;
	JTextField  d_Age     = null;
//	JTextField  d_Num     = null;
	
	JButton     ok        = null;
	JButton     cancel    = null;

	JLabel      lbl_id    = null;
	JLabel      lbl_LName = null;
	JLabel      lbl_FName = null;
	JLabel      lbl_Age   = null;
//	JLabel      lbl_Num   = null;

	private String dStr   = null;

	public VDialog()
	{
		setLayout(null);
		setTitle("From Person");
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setBounds(300, 300, 300, 300);

		d_Id    = new JTextField();	
		d_FName = new JTextField();
		d_LName = new JTextField();
		d_Age   = new JTextField();
   //     d_Num   = new JTextField();
        
		ok      = new JButton("Ok");
		cancel  = new JButton("Cancel");

		lbl_id  = new JLabel("Form ID");
		lbl_FName  = new JLabel("Form FNAME");
		lbl_LName  = new JLabel("Form LNAME");
		lbl_Age  = new JLabel("Form AGE");
	//	lbl_Num  = new JLabel("Form TelNumber");
		

		d_Id.setBounds(30, 30, 120, 20);
		d_FName.setBounds(30, 80, 120, 20);
		d_LName.setBounds(30, 130, 120, 20);
		d_Age.setBounds(30, 180, 120, 20);
//		d_Num.setBounds(30, 230, 120, 20);
		
		ok.setBounds(160, 30, 100, 25);
		ok.setBackground(Color.WHITE);

		cancel.setBounds(160, 70, 100, 25);
		cancel.setBackground(Color.WHITE);

		lbl_id.setBounds(30, 10, 120, 10);
		lbl_FName.setBounds(30, 60, 120, 10);
		lbl_LName.setBounds(30, 110, 120, 10);
		lbl_Age.setBounds(30, 160, 120, 10);
	//	lbl_Num.setBounds(30, 210, 120, 10);

				
		add(d_Id);
		add(d_FName);
		add(d_LName);
		add(d_Age);
	//	add(d_Num);

		add(ok);
		add(cancel);

		add(lbl_id);
		add(lbl_FName);
		add(lbl_LName);
		add(lbl_Age);
	//	add(lbl_Num);


		ok.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				setdStr("Ok");
				setVisible(false);
			}
		});

		cancel.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				setdStr("Cancel");
				setVisible(false);
			}
		});

	}
	public void setPerson(Person p)
	{
		d_Id.setText(""+p.getId());
		d_FName.setText(p.getFname());
		d_LName.setText(p.getLname());
		d_Age.setText(""+p.getFname());
	//	d_Num.setText(""+p.getNum());

	}

	public Person getPerson()
	{
		Person p = new Person();
		//		p.id = Integer.parseInt(d_Id.getText());
		//		p.fname = d_FName.getText();
		//		p.lname = d_LName.getText();
		//		p.age = Integer.parseInt(d_Age.getText());
		p.setId(Integer.parseInt(d_Id.getText()));
		p.setFname(d_FName.getText());
		p.setLname(d_LName.getText());
		p.setAge(Integer.parseInt(d_Age.getText()));
	//	p.setNum(Integer.parseInt(d_Age.getText()));

		return p;
	}
	public String getdStr() {
		return dStr;
	}
	public void setdStr(String dStr) {
		this.dStr = dStr;
	}

}
