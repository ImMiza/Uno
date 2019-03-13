package uno.utils;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Carte {

	private Type type;
	private boolean special;
	private BufferedImage image;
	
	public Carte(Type type) {
		this.type = type;
		this.special = (type.getNumber() == -1) ? true : false;
		
		try {
			this.image = ImageIO.read(this.getClass().getResource(type.getLink()));
			this.image = this.image.getSubimage(type.getLocation1(), 0, (int) (type.getLocation2() - type.getLocation1()), this.image.getHeight());
			System.out.println("Image charger");
		} catch (IOException e) {
			System.err.println("Image non chargée !");
			e.printStackTrace();
		}
	}
	
	public int getNumber() {
		return type.getNumber();
	}
	
	public Type getType() {
		return type;
	}
	
	public boolean isSpecial() {
		return special;
	}
	
	public BufferedImage getImage() {
		return image;
	}
}
