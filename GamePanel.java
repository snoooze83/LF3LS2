import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * This class implements a game panel. The game panel implements
 * the main game functionality. 
 * 
 * @author B. Suessmann
 *
 */
public class GamePanel extends JPanel {
	
	// Background image of the game panel. If this attribute is null the background
	// is empty.
	private Image background = null;

	// ArrayList of all game characters to be displayed on the game panel. 
	private ArrayList<GameCharacter> characters = new ArrayList<GameCharacter>();

	public GamePanel() {
		super();
		background = loadImage("background.png");
	}
		
	public Image loadImage(String resource) {
		// Verwende Toolkit, um Bild zu laden
		Toolkit tool = Toolkit.getDefaultToolkit();
		// Das Bild soll aus der Resource (Datei im Projekt)
		// resource geladen werden.
		Image img = tool.getImage(GamePanel.class.getResource(resource));
		// Der MediaTracker lädt die Datei in das Image
		MediaTracker tracker = new MediaTracker(this);
		tracker.addImage(img, 1);
		try {
			// Mediendateien können groß sein, also wird asynchron
			// geladen. Wir warten hier einfach darauf, dass der
			// MediaTracker fertig ist.
			tracker.waitForID(1);
		}
		catch (InterruptedException exc) {
			// Das Laden der Datei kann auch unterbrochen werden.
			// Wir geben in diesem Fall eine Meldung auf der Konsole aus.
			System.out.println("Loading background failed");
		}
		return img;		
	}
	
	/**
	 * Add a game character to the game panel. All game characters on the panel will be
	 * displayed.
	 * 
	 * @param c new game character
	 */
	public void add(GameCharacter c)
	{
		characters.add(c);
	}
	
	public boolean remove(GameCharacter c) {
		return(characters.remove(c));
	}

	public void paint(Graphics gr) {
		super.paint(gr);

		if (background != null) {
			gr.drawImage(background, 0, 0, getWidth(), getHeight(), null);
		}
		
		// Iterate with iterator over all game characters and paint each on the
		// graphics context gr.
		// Iteriere in einer Schleife über alle Spielfiguren, um sie im Graphikkontext
		// gr zu zeichnen.
		for (Iterator<GameCharacter> i = characters.iterator(); i.hasNext();)
		{
			i.next().paint(gr);	
		}
		
	}

}
