package bubble;



import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;


public class BPanel extends JPanel implements MouseListener
{
	public BPanel()
	{
		setLayout(null);
		addMouseListener(this);
		setBackground(Color.BLACK);
		BAction xtr=new BAction();
		xtr.start();
	}
	class BAction extends Thread 
	{
		public void run() 
		{
			try 
			{
				while(true) 
				{
					Thread.sleep(50);
					for (Component c : getComponents())
					{
						BBall b = (BBall) c;
						Point p=b.getLocation();
						p.translate(b.wh/2, b.wh/2);
						for (Component c2 : getComponents()) 
						{
							BBall b2 = (BBall) c2;
							Point p2=b2.getLocation();
							p2.translate(b2.wh/2, b2.wh/2);
							if(b.equals(b2)==false)
							{
								if (Math.sqrt(Math.pow((p2.x-p.x), 2) + Math.pow((p.y-p2.y), 2)) <= b.wh/2 + b2.wh/2)
								{
									  b2.dx=-b2.dx;
							          b2.dy=-b2.dy;
							          b2.move();
								}
							}
						}
						b.move();   				
					}
				}
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) 
	{
		if(e.getButton()==1&&getComponentAt(e.getPoint())==this)
		{
			add( new BBall(e.getPoint()));
			repaint();
		}
		else if(e.getButton()==1&&getComponentAt(e.getPoint())!=this)
		{
			remove(getComponentAt(e.getPoint()));
			repaint();
		}
		if(e.getButton()==3&&getComponentAt(e.getPoint())!=this)
		{
			BBall b = (BBall) getComponentAt(e.getPoint());
			b.boom();
			repaint();
		}

	}

	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}


	@Override
	public void mouseReleased(MouseEvent e) {}

}
