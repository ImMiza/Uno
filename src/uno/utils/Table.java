package uno.utils;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Table extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private int width;
	private int height;
	
	private String player;
	private ArrayList<Carte> cartes;
	
	public Table(String player) {
		this(player, new ArrayList<Carte>());
	}
	
	public Table(String player, ArrayList<Carte> cartes) {
		this(player, cartes, 500, 200);
	}
	
	public Table(String player, ArrayList<Carte> cartes, int width, int height) {
		this.player = player;
		this.cartes = cartes;
		this.width = width;
		this.height = height;
	}
	
	public ArrayList<Carte> getCartes() {
		return cartes;
	}
	
	public String getPlayer() {
		return player;
	}
	
	public int getNbCartes() {
		return this.cartes.size();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		for(int i = 0; i < this.cartes.size(); i++) {
			g.drawImage(this.cartes.get(i).getImage(), (this.width / 2) + (i * 10), this.height / 2, this);
		}
	}
	
}
