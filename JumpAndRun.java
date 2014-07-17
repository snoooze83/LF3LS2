import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JToolBar;

/**
 * This class implements the main window and game control.
 * 
 * @author B. Suessmann
 *
 */
public class JumpAndRun extends JFrame implements ActionListener {

	// attributes
	private GameController controller = new GameController();
	private JPanel jpnlSouth;
		
	private JMenuBar jmbMenu;
	private JMenuItem jmiStart;
	private JMenuItem jmiHighScore;
	private JMenuItem jmiAbout;
	private JMenuItem jmiExit;
	
	public JumpAndRun(String title) {
		super(title);
		
		// The program shall be closed, if the user presses the
		// close button in the window title bar.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 600);
		
		// Use the border layout manager in the content pane.
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		
		// Add the game panel in the center of the frame. This is
		// the area were the game screen will appear.	
		cp.add(BorderLayout.CENTER, controller.getPanel());
		
		// Create a menu bar in the frame.
		createMenuBar();
		
		// Display the frame on the screen. This method should
		// always be called *after* all components are added to the
		// frame. Otherwise, some components may not be visible or
		// may appear only after moving the mouse over them.
		setVisible(true);
		
	}


	/**
	 * Create a menu bar for the program.
	 */
	private void createMenuBar() {
		// Create the container for the main menu entries.
		jmbMenu = new JMenuBar();
		setJMenuBar(jmbMenu);
		
		// Create the File menu.
		JMenu jmuGame = new JMenu("Game");
		jmbMenu.add(jmuGame);
		
		jmiStart = new JMenuItem("Start");
		jmuGame.add(jmiStart);
		jmiStart.addActionListener(this);

		jmuGame.add(new JSeparator());
		jmiHighScore = new JMenuItem("High scores");
		jmuGame.add(jmiHighScore);
		
		jmuGame.add(new JSeparator());
		jmiExit = new JMenuItem("Exit");
		jmuGame.add(jmiExit);
		jmiExit.addActionListener(this);

		// Create the Help menu.
		JMenu jmuHelp = new JMenu("Help");
		jmbMenu.add(jmuHelp);
		jmiAbout = new JMenuItem("About");
		jmuHelp.add(jmiAbout);
		jmiAbout.addActionListener(this);

	}

	
	public static void main(String[] args) {
		JumpAndRun f = new JumpAndRun("Jump and Run");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jmiStart) {
			startGame();
		}
		
		if (e.getSource() == jmiAbout) {
			information();
		}
		
		if (e.getSource() == jmiExit) {
			exit();
		}
		
	}

	/**
	 * This method starts the game.
	 */
	private void startGame() {
		controller.start();
	}

	/**
	 * Terminate the game. 
	 * 
	 * This method displays a dialog asking the user to confirm
	 * the termination of the program.
	 */
	private void exit() {
		
		// TODO Ergänzen Sie hier das Programm, so dass es nur nach einer Sicherheitsabfrage beendet wird.
		System.exit(0);
	}

	/**
	 * Display an information dialog.
	 */
	private void information() {
		JOptionPane.showMessageDialog(this,
				"This magnificent game was brought to you by DerSuessmann.\n\n Copyleft, 2014 DerSuessmann", 
				"About", JOptionPane.INFORMATION_MESSAGE);
	}

	/**
	 * Configure the program.
	 */
	private void configure() {
		JOptionPane.showMessageDialog(this,
				"This dialog still needs to be implemented.", 
				"Warning", JOptionPane.WARNING_MESSAGE);
	}

}
