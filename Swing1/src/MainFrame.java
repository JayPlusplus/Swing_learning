import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {
	
	private JTextArea textArea;
	private JButton btn;
	
	public MainFrame() {
		super("Hello World");
		
		//almost everything starts from a new frame
		//JFrame frame = new JFrame("Hello World");
		setSize(600, 500);
		
		setLayout(new BorderLayout());
		
		textArea = new JTextArea();
		btn = new JButton("Click Me!");
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("Hello\n");
			}
			
		});
		
		add(textArea, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
		
		//without default close operation, the program wont stop after close the window
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}	
