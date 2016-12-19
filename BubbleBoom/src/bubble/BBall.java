package bubble;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;

import javax.swing.JPanel;


public class BBall extends JPanel
{
	int dx = 0;               
	int dy = 0;               
	int wh = 30;           
	Color col = null;   
	public BBall(Point p)   
	{			
		
		setLocation(p);
		
		
		Random r = new  Random();  
		dx = r.nextInt(20) - 10;//
		dy = r.nextInt(20) - 10;//
		col = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
		wh = r.nextInt(50) + 10;
		setSize(wh, wh); 

	}
	@Override
	public void paint(Graphics g) 
	{
		g.setColor(col);
		g.fillOval(1, 1, wh-2, wh-2);
	}
	public void move() //
	{
		Point p = getLocation();
		if( p.x <= 0 || p.x + wh >= getParent().getWidth() )
		{
			dx = -dx;
		}
		if( p.y <= 0 || p.y + wh >= getParent().getHeight() )
		{
			dy = -dy;
		}
		p.translate(dx, dy);
		setLocation(p);
	}
	public void boom()
	 {
	  Point p = getLocation();
	  BBall bb= (BBall) getParent().getComponentAt(p);
	  for (int i = 0; i < 8; i++) 
	  {
		  BBall b=new BBall(p);
	   b.wh=bb.wh/4;
	   b.setSize(b.wh, b.wh);
	   b.col=bb.col;
	   p.translate(dx+b.wh, dy+b.wh);
	   getParent().add(b);
	  }
	  getParent().remove(bb);
	 }
	
}
