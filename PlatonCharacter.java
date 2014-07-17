import java.awt.Color;


public class PlatonCharacter extends GameCharacter {
	
	public PlatonCharacter(Color color) {
		this.color = color;
	}
	
	public Color color;
	
	/**
	 * velocity in x direction.
	 * 
	 * Geschwindigkeit mit der der rote Kreis sich nach rechts bewegt. Negative
	 * Werte bedeuten in die entgegengesetzte Richtung.
	 */
	private int xVelocity;

	/**
	 * velocity in y direction.
	 * 
	 * Geschwindigkeit mit der der rote Kreis sich nach unten bewegt. Negative
	 * Werte bedeuten in die entgegengesetzte Richtung.
	 */
	private int yVelocity;

	public int getXVelocity() {
		return xVelocity;
	}

	public void setXVelocity(int xVelocity) {
		this.xVelocity = xVelocity;
	}

	public int getyVelocity() {
		return yVelocity;
	}

	public void setyVelocity(int yVelocity) {
		this.yVelocity = yVelocity;
	}

}
