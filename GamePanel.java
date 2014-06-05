import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * 
 */

/**
 * @author sue
 *
 */
public class GamePanel extends JPanel implements ActionListener {
	
	// x- und y-Position für zu zeichnende Objekte
	private int x = 0, y = 0;
	// Timer der alle 10 Millisekunden ein Ereignis auslöst
	// Der Event-Handler ist dieses Objekt
	private Timer timer = new Timer(10, this);
	
	public void paint(Graphics gr) {
		super.paint(gr);

		gr.setColor(Color.red);
		gr.fillOval(x, y, 60, 60);
	}
	
	public void move(int dx, int dy) {
		x = x + dx;
		y = y + dy;
		repaint();  // der Zustand hat sich geändert -> neu zeichnen
	}
	
	public void actionPerformed(ActionEvent arg0) {
		// Wird aufgerufen, wenn der Timer abläuft.
		
		// TODO Ergänzen Sie hier zyklische Änderungen, wenn nötig
		
		// Starte Timer neu
		timer.start();
	}

	public void start() {
		// Oben links geht es los
		x = 0;
		y = 0;
		
		timer.start();
	}

	//@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Ergänzen Sie hier Ihren Kode um den Kreis mit der Tastatur zu steuern
		
	}

	//@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Ergänzen Sie hier Ihren Kode um den Kreis mit der Tastatur zu steuern
		
	}

	//@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Ergänzen Sie hier Ihren Kode um den Kreis mit der Tastatur zu steuern
		
	}

}
