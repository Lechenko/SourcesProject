package view;
import java.awt.Color;

import javax.swing.JFrame;
public class VFrame extends JFrame
{
 public VFrame()
 {
	 setBounds(200, 200, 800, 500);
	 setTitle("Person V1");
	 setDefaultCloseOperation(EXIT_ON_CLOSE);
	 add(new VPanel() );
	 setVisible(true);
 }
}
