import javax.swing.JFrame;

public class MFrame extends JFrame
{
	MFrame(){
	setLayout(null);
	setBounds(300, 10, 550, 600); 
	setTitle("Bubble");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	add(new MPanel() );
	setVisible(true);
	}
}
