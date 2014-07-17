import java.awt.Color;
import java.awt.Graphics;


public class RectCharacter extends PlatonCharacter {

	public RectCharacter(Color color) {
		super(color);
	}

	@Override
	public void paint(Graphics gr) {
		// Primitive character (red oval in the bounding box)
		// Einfache Spielfigur (rote Ellipse im durch x, y, width und height
		// beschriebenen Rechteck)
		
		gr.setColor(color);
		gr.fillRect(getX(), getY(), getWidth(), getHeight());
	}

}
