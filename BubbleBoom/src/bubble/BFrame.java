package bubble;

import javax.swing.JFrame;

public class BFrame extends JFrame
{

	public BFrame() 
	{
		setTitle("Bubble_Boom");
		setBounds(10, 10, 1200, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new BPanel());
		setVisible(true);
	}

}
