package uno.debug;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class Panel extends JPanel{

	private static final long serialVersionUID = 1L;
	private BufferedImage image;
	
	public Panel(BufferedImage image) {
		this.image = image;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(image, 300, 300,this);
	}
}
