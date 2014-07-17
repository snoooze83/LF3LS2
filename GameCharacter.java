import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 * Super class for all game characters. You should inherit this class and
 * override the paint method in your sub class.
 * 
 * Oberklasse für alle Spielfiguren. Sie sollten ihre Spielfigur-Klassen von 
 * dieser Klasse erben lassen und in Ihren Unterklassen die paint-Methode
 * überschreiben.
 * 
 * @author B. Suessmann
 *
 */
public class GameCharacter {
	/**
	 * Position of the character. This is the upper left corner of the
	 * displayed bounding rectangle of the character.
	 * 
	 * Position der Spielfigur. Die Position markiert die linke, obere
	 * Ecke des Rechtecks, in dem die Spielfigur dargestellt wird.
	 */
	private int x = 0, y = 0;
	
	/**
	 * Width and height of the displayed bounding rectangle.
	 * 
	 * Breite und Höhe des Rechtecks, in dem die Spielfigur dargestellt 
	 * wird.
	 */
	private int width = 40, height = 40;
	
	/**
	 * Paint the character on the Graphics object gr. This method must be
	 * adapted or overloaded to display a different character.
	 * 
	 * @param gr Graphics object to draw on.
	 * 
	 * Zeichne die Spielfigur auf das Graphics-Objekt gr. Diese Methode muss
	 * überladen werden um eine Spielfigur darzustellen.
	 */
	public void paint(Graphics gr) {
		// Draw nothing.
		// Zeichene nichts.
	}
	
	/**
	 * Move the character dx pixels to the right and dy pixels down.
	 * Negative values indicate left and up accordingly.
	 * 
	 * The character may wander off screen.
	 * 
	 * Bewege die Spielfigur dx Bildpunkte nach rechts und dy Bildpunkte
	 * nach unten. Negative Werte bedeuten nach links beziehungsweise nach oben.
	 * 
	 * Die Spielfigur kann dabei das Spielfeld verlassen.
	 * 
	 * @param dx
	 * @param dy
	 */
	public void move(int dx, int dy) {
		setX(getX() + dx);
		setY(getY() + dy);
	}

	/**
	 * Does this character intersect (collide) with the other character? 
	 */
	public boolean intersectsWith(GameCharacter other) {
		Rectangle r1 = new Rectangle(x, y, width, height);
		Rectangle r2 = new Rectangle(other.getX(), other.getY(), 
				other.getWidth(), other.getHeight());
		return(r1.intersects(r2));
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}
