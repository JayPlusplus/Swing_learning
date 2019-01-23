import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {
	
	private TextPanel textPanel;
	//private JTextArea textArea;
	private JButton btn;
	private Toolbar toolbar;
	private FormPanel formPanel;
	
	public MainFrame() {
		super("Hello World");
		
		//almost everything starts from a new frame
		//JFrame frame = new JFrame("Hello World");
		setSize(600, 500);
		
		setLayout(new BorderLayout());
		
		toolbar = new Toolbar();
		textPanel = new TextPanel();
		formPanel = new FormPanel();
		
		toolbar.setStringListener(new StringListener() {
			@Override
			public void textEmitted(String text) {
				textPanel.appendText(text);
			}
		});
		
		// toolbar.setTextPanel(textPanel);
		
		add(formPanel, BorderLayout.WEST);
		add(toolbar, BorderLayout.NORTH);
		add(textPanel, BorderLayout.CENTER);
		
		//without default close operation, the program wont stop after close the window
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}	
