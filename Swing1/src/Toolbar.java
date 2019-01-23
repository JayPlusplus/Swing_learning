import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel  implements ActionListener {
	
	private JButton helloButton;
	private JButton goodbyeButton;
	
	private StringListener textListener;
	//private TextPanel textPanel;
	
	public Toolbar() {
		setBorder(BorderFactory.createEtchedBorder());
		helloButton = new JButton("Hello");
		goodbyeButton = new JButton("Goodbye");
		
		helloButton.addActionListener(this);
		goodbyeButton.addActionListener(this);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(helloButton);
		add(goodbyeButton);
	}
	

	public void setStringListener(StringListener stringListener) {
		this.textListener = stringListener;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clicked = (JButton) e.getSource();
		
		if (clicked == helloButton) {
			//textPanel.appendText("Hello\n");
			if(textListener != null) {
				textListener.textEmitted("Hello\n");
			}
			System.out.println("Hello");
		} else {
			//textPanel.appendText("GoodBye\n");
			if(textListener != null) {
				textListener.textEmitted("Goodbye\n");
			}
			System.out.println("Goodbye");
		}
	}
}
