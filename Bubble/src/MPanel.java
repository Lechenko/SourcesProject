
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.JPanel;

public class MPanel extends JPanel implements MouseListener 
{
	ArrayList<MBubble> bb = new ArrayList<MBubble>();

	public MPanel()
	{
		Timer t = new Timer(30, new xt());
		t.start();

		setLayout(null);
		setBounds(10, 10, 500, 500);
		setBackground(Color.BLACK);

		addMouseListener(this);
		setVisible(true);				
	}
	@Override
	public void mousePressed(MouseEvent e) 
	{
		bb.add(new MBubble(e.getX(), e.getY(), this));
		repaint();
	}
	@Override
	public void paint(Graphics g) 
	{
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		for (MBubble b : bb) 
		{
			b.paint(g2);
		}

	}
	@Override
	public void mouseClicked(MouseEvent e) {}	
	@Override
	public void mouseReleased(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}	
	class xt implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			for (MBubble b : bb) 
			{
				b.moveBubble();
			}
			repaint();
		}	
	}
}
