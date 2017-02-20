package com.homeTask4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Comparator;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;


public class XPanel extends JPanel implements MouseListener, ActionListener
{

	DrawOval dd=null;
	Point p1 = null;
	JPanel btnPanel = null;
	ArrayList<Point> arrPoint = null;

	public XPanel()
	{
		setLayout(null);
		setBorder(BorderFactory.createLineBorder(Color.blue));
		addMouseListener(this);

		GridBagLayout gridbag1 = new GridBagLayout();
		GridBagConstraints gbc1 = new GridBagConstraints();
		gbc1.fill=GridBagConstraints.BOTH;
		gbc1.insets= new Insets(20, 20, 20, 20);

		JPanel btnPanel1=new JPanel();
		btnPanel1.setBorder(BorderFactory.createLineBorder(Color.blue));
		btnPanel1.setBackground(Color.LIGHT_GRAY);
		btnPanel1.setLayout(gridbag1);
		btnPanel1.add(createButton(gridbag1, gbc1, "DrawLine"));
		btnPanel1.add(createButton(gridbag1, gbc1, "Clear"));

		btnPanel = new JPanel();
		btnPanel.setLayout(new BorderLayout());
		btnPanel.add(btnPanel1, BorderLayout.NORTH);

		arrPoint=new ArrayList<Point>();

	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getActionCommand().equals("DrawLine")==true)
		{
			sortPoints();
			for (int i = 1; i < arrPoint.size(); i++) 
			{
				this.getGraphics().drawLine(arrPoint.get(i-1).x, arrPoint.get(i-1).y, arrPoint.get(i).x, arrPoint.get(i).y);
			}
			this.getGraphics().drawLine(arrPoint.get(arrPoint.size()-1).x, arrPoint.get(arrPoint.size()-1).y, arrPoint.get(0).x, arrPoint.get(0).y);
		}
		if(e.getActionCommand().equals("Clear")==true)
		{
			for (Component c : getComponents())
			{			
				this.remove(c);
			}
			arrPoint.removeAll(arrPoint);
			this.repaint();
		}
	}
	@Override
	public void mousePressed(MouseEvent e) 
	{
		p1 = e.getPoint();
		Point p2=new Point(p1.x+10, p1.y+10);
		arrPoint.add(p2);
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
		if(getComponentAt(e.getPoint())==this && e.getButton()==1)
		{
			add(new DrawOval(p1));	
			repaint();
		}
	}

	@Override
	public void mouseClicked(MouseEvent e){}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	
	

	private JButton createButton (GridBagLayout gridbag, GridBagConstraints gbc, String title)
	{
		JButton button = new JButton(title);
		button.addActionListener(this);
		gridbag.setConstraints(button,gbc);
		return button;
	}
	/*
	 * Sort coordinate
	 */
	private void sortPoints ()
	{
		int IndexMedium = (int)(arrPoint.size()/2);
		arrPoint.sort(new SortPointsByYUp());
		ArrayList<Point> tmp = new ArrayList<Point>();
		for (int i = 0; i < IndexMedium; i++) 
		{
			tmp.add(arrPoint.get(i));
		}
		tmp.sort(new SortPointsByXUp());
		ArrayList<Point> tmp2 = new ArrayList<Point>();
		for (int i = IndexMedium; i < arrPoint.size(); i++) 
		{
			tmp2.add(arrPoint.get(i));
		}
		tmp2.sort(new SortPointsByXDown());
		for (int i = 0; i < tmp2.size(); i++) 
		{
			tmp.add(tmp2.get(i));
		}
		arrPoint=tmp;
	}

	class SortPointsByXUp implements Comparator<Point> 
	{
		@Override
		public int compare(Point p1, Point p2) 
		{
			int result = p2.x-p1.x;
			if(result != 0) return (int)(result/Math.abs(result));
			return 0;
		}  
		
	}
	class SortPointsByXDown implements Comparator<Point> 
	{
		@Override
		public int compare(Point p1, Point p2) 
		{
			int result = p1.x-p2.x;
			if(result != 0) return (int)(result/Math.abs(result));
			return 0;
		}  	
	}
	class SortPointsByYUp implements Comparator<Point> 
	{
		@Override
		public int compare(Point p1, Point p2) 
		{
			int result = p2.y-p1.y;
			if(result != 0) return (int)(result/Math.abs(result));
			return 0;
		}  	
	}
}
		