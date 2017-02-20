package com.homeTask4;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
/*
 * The object point
 */
public class DrawOval extends JPanel 
{
	private int x,y;

	public DrawOval(Point p1)
	{
		setLocation(p1);
		setSize(20,20);

	}

	@Override
	public void paint(Graphics g) 
	{
		super.paint(g);
		Graphics2D gr = (Graphics2D)g;

		Dimension d = getSize();
		BasicStroke str=new BasicStroke(1);
		gr.setColor(Color.RED);
		gr.setStroke(str);

		gr.drawOval(2, 2, d.width-4, d.height-4);
		gr.fillOval(2, 2, d.width-4, d.height-4);
	}
}