package com.homeTask4;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class XFrame extends JFrame 
{
	public XFrame() 
	{
		XPanel xpanel=new XPanel();
		setTitle("Point & Line Panel");
		setBounds(100, 100, 600, 600);
		add(xpanel.btnPanel, BorderLayout.SOUTH);   //add the panel buttons
		add(xpanel, BorderLayout.CENTER);          //add the panel for points
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
