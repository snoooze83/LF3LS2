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
	private GamePanel jpnlCenter;
	private JPanel jpnlSouth;
	
	private JButton jbtnStart;
	private JButton jbtnConfigure;
	private JButton jbtnInfo;
	private JButton jbtnExit;
	
	private JMenuBar jmbMenu;
	private JMenuItem jmiNew;
	/* prepared menu for loading and saving
	private JMenuItem jmiOpen;
	private JMenuItem jmiSave;
	private JMenuItem jmiSaveAs;
	*/
	private JMenuItem jmiExit;
	private JButton jtbbtnNew;
	private JButton jtbbtnInformation;
	
	public JumpAndRun(String title) {
		super(title);
		
		// The program shall be closed, if the user presses the
		// close button in the window title bar.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 300);
		
		// Use the border layout manager in the content pane.
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		
		// Create a panel in the center of the frame. This is
		// the area were the game screen will appear.
		jpnlCenter = new GamePanel();
		jpnlCenter.setLayout(null);
		jpnlCenter.setDoubleBuffered(true);
		cp.add(BorderLayout.CENTER, jpnlCenter);
		
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
		JMenu jmuFile = new JMenu("File");
		jmbMenu.add(jmuFile);
		
		jmiNew = new JMenuItem("New");
		jmuFile.add(jmiNew);
		jmiNew.addActionListener(this);

		/* Prepared menu for loading and saving, but not used yet
		jmiOpen = new JMenuItem("Open...");
		jmuFile.add(jmiOpen);
		jmuFile.add(new JSeparator());
		jmiSave = new JMenuItem("Save");
		jmuFile.add(jmiSave);
		jmiSaveAs = new JMenuItem("Save As...");
		jmuFile.add(jmiSaveAs);
		*/
		
		jmuFile.add(new JSeparator());
		jmiExit = new JMenuItem("Exit");
		jmuFile.add(jmiExit);
		jmiExit.addActionListener(this);
	}

	
	public static void main(String[] args) {
		JumpAndRun f = new JumpAndRun("Jump and Run");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jbtnStart || e.getSource() == jmiNew
				|| e.getSource() == jtbbtnNew) {
			startGame();
		}
		
		if (e.getSource() == jbtnConfigure) {
			configure();
		}
		
		if (e.getSource() == jbtnInfo || e.getSource() == jtbbtnInformation) {
			information();
		}
		
		if (e.getSource() == jbtnExit || e.getSource() == jmiExit) {
			exit();
		}
		
	}

	/**
	 * This method starts the game.
	 */
	private void startGame() {
		jpnlCenter.start();
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

		// TODO Fügen Sie hier einen Dialog zum Anzeigen eines Informationsdialogs ein.
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
