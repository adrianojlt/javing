package pt.adrz.myjavatutorial.designPatterns.observer;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample {

	private JFrame frame;
	private JButton button;
	
	public SwingObserverExample() {
		
		frame = new JFrame();
		button = new JButton("should i do it????");
		
		// make Devil and Angel objects listeners (observers) of the button
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		
		// window settings
		frame.getContentPane().add(BorderLayout.CENTER,button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(150, 70);
		frame.setVisible(true);
	}
}






/**
 * Class definition for the observers
 * @author adriano
 */
class AngelListener implements ActionListener {
	// rather than update this method is called when the state in the 
	// subject (in this case the button) changes
	public void actionPerformed(ActionEvent event) {
		System.out.println("Don't do it, you might regret it ...");
	}
}

/**
 * Class definition for the observers
 * @author adriano
 */
class DevilListener implements ActionListener {
	public void actionPerformed(ActionEvent event) {
		System.out.println("Come on, do it ...");
	}
}