import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;

public class MBubble 
{
	final Random random = new Random();
	int x;
	int y;
	int r;
	int dx = random.nextInt( 21 ) - 10 ;
	int dy = random.nextInt( 21 ) - 10 ;
	MPanel bp = null;
	Color colors[] = {Color.BLUE, Color.GREEN, Color.MAGENTA, Color.RED, 
			Color.CYAN, Color.DARK_GRAY, Color.ORANGE, Color.YELLOW, Color.RED};
	int pos = random.nextInt(colors.length);
	
	public MBubble (int x, int y, MPanel bp)
	{
		this.x = x;
		this.y = y;
		this.bp = bp;
		r = ( random.nextInt( 20 ) + 5 ) ;
	}
	public void moveBubble()
	{
		if(x <= 0 || x + r >= bp.getWidth())
			dx = -dx;
		if(y <= 0 || y + r >= bp.getHeight())
			dy = -dy;
		
		x += dx;
		y += dy;
	}

	public void paint(Graphics2D g) 
	{
			Graphics2D gr = (Graphics2D) g;
			gr.setColor(colors[pos]);
			gr.fillOval(x, y, r, r);
	}
}
