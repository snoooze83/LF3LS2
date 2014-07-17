import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Timer;


public class GameController implements ActionListener, KeyListener {

	// game panel where the game is displayed
	private GamePanel panel = new GamePanel();
	
	
	private CircleCharacter reddy = new CircleCharacter(Color.red);
	private RectCharacter bluey = new RectCharacter(Color.blue); 

	
	private void loop() {
		reddy.moveWithBorderCollision(panel.getWidth(), panel.getHeight());
		if (reddy.intersectsWith(bluey)) {
			// bang
			panel.remove(reddy); // do not display reddy anymore
		}
		panel.repaint();
	}
	
	public GamePanel getPanel() {
		return panel;
	}

	public void setPanel(GamePanel panel) {
		this.panel = panel;
	}

	public void start() {
		reddy.setX(0);
		reddy.setY(0);
		reddy.setXVelocity(2);
		reddy.setyVelocity(2);
		panel.add(reddy);
		
		bluey.setWidth(10);
		bluey.setHeight(100);
		bluey.setX(panel.getWidth()/2 - bluey.getWidth());
		bluey.setY(panel.getHeight() - bluey.getHeight());
		panel.add(bluey);
		
		timer.start();
	}

	
	// Timer der alle 20 Millisekunden ein Ereignis auslöst
	// Der Event-Handler ist dieses Objekt
	private Timer timer = new Timer(20, this);
	
	
	public void actionPerformed(ActionEvent arg0) {
		// Wird aufgerufen, wenn der Timer abläuft.
		
		loop();
		
		// Starte Timer neu
		timer.start();
	}


	//@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Ergänzen Sie hier Ihren Kode um die Spielfigur mit der Tastatur zu steuern
		
	}

	//@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Ergänzen Sie hier Ihren Kode um die Spielfigur mit der Tastatur zu steuern
		
	}

	//@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Ergänzen Sie hier Ihren Kode um die Spielfigur mit der Tastatur zu steuern
		
	}

}
