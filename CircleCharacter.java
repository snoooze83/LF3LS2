import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;


public class CircleCharacter extends PlatonCharacter {
	
	
	public CircleCharacter(Color color) {
		super(color);
	}

	@Override
	public void paint(Graphics gr) {
		// Primitive character (red oval in the bounding box)
		// Einfache Spielfigur (rote Ellipse im durch x, y, width und height
		// beschriebenen Rechteck)
		
		gr.setColor(color);
		gr.fillOval(getX(), getY(), getWidth(), getHeight());
	}

	
	/**
	 * Move the character xVelocity pixels in x direction and yVelocity 
	 * pixels in y direction. The character reverses if it touches a border 
	 * defined by panelWidth and panelHeight.
	 * 
	 * Bewege die Spielfigur xVelocity Bildpunkte in x-Richtung und 
	 * yVelocity Bildpunkte in y-Richtung.
	 * 
	 * @param panelWidth
	 * @param panelHeight
	 */
	public void moveWithBorderCollision(int panelWidth, int panelHeight) {
		int newX = getX() + getXVelocity();
		if (newX < 0) {
			// Collision with left border
			// Kollision mit linkem Rand
			newX = -newX;
			setXVelocity(-getXVelocity());
		}
		if (newX + getWidth() >= panelWidth) {
			// Collision with right border
			// Kollision mit rechtem Rand
			newX = 2 * panelWidth - (newX + 2 * getWidth());
			setXVelocity(-getXVelocity());
		}

		setX(newX);

		int newY = getY() + getyVelocity();
		if (newY < 0) {
			// Collision with upper border
			// Kollision mit oberem Rand
			newY = -newY;
			setyVelocity(-getyVelocity());
		}
		if (newY + getHeight() >= panelHeight) {
			// Collision with lower border
			// Kollision mit unterem Rand
			newY = 2 * panelHeight - (newY + 2 * getHeight());
			setyVelocity(-getyVelocity());
		}

		setY(newY);

	}
}
