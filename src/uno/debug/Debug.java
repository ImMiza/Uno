package uno.debug;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import uno.utils.Carte;
import uno.utils.Table;
import uno.utils.Type;

public class Debug{

	private static BufferedImage image;
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Debug");
		frame.setVisible(true);
		frame.setSize(800, 800);
		frame.setAlwaysOnTop(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Carte carte = new Carte(Type.RED_2);
		image = carte.getImage();
		
		if(image != null) {
			Panel panel = new Panel(image);
			frame.setContentPane(panel);
		}
	}
	
}
