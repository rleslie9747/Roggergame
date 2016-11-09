import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class RroggerGamePlay extends JFrame {
	
	public RroggerGamePlay(){
		setSize(1000,800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,1));
		add(new Road());
		add(new JLabel("Play"));
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new RroggerGamePlay();

	}

}

